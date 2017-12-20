package com.rtdback.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rtdback.pojo.Fund;
import com.rtdback.service.FundService;
import com.rtdback.util.Pager;
/**
 * 标（融资）业务逻辑类
 */
@RestController
public class FundController {
	@Autowired
	private FundService fundService;
	
	/**
	 * 添加融资
	 */
	@RequestMapping(value="/fund/add",method=RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Fund fund){
		int count = 0;
		//默认融资信息
		fund.setState("融资中");
		fund.setTime(new Date());
		fund.setTempsum(0);
		//合同模板（原始合同文件+签名的方法）--待解决
		count = fundService.add(fund);
		//count == 0  失败 或 count == 1 成功
		return new ResponseEntity<Integer>(count,HttpStatus.CREATED);
	}
	
	/**
	 * 修改融资
	 */
	@RequestMapping(value="/fund/modify",method=RequestMethod.PUT)
	public ResponseEntity<?> modify(@RequestBody Fund fund){
		int count = 0;
		Fund currentFund = fundService.findById(fund.getId());
		if(currentFund == null){
			//没有找到,返回count==-1
			count = -1;
			return new ResponseEntity<Integer>(count,HttpStatus.NOT_FOUND);
		}
		count = fundService.modify(fund);
		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	}
	
	/**
	 * 展示某标详细信息（根据id查询）
	 * http://127.0.0.1:8080/RTDBackstage/fund/findById/{id}
	 */
	@RequestMapping(value="/fund/findById/{id}",method=RequestMethod.GET)
	public ResponseEntity<Fund> findById(@PathVariable long id){
		Fund fund = fundService.findById(id);
		return new ResponseEntity<Fund>(fund,HttpStatus.OK);
	}
	
	/*public ResponseEntity<fund> findByParam(
			@RequestParam(value="logmin",required=false)String logmin,
			@RequestParam(value="logmax",required=false)String logmax,
			@RequestParam(value="type",required=false)String type,
			@RequestParam(value="firm",required=false)String firm,
			@RequestParam(value="page",required=false)Integer page			
			){
		
	}*/
	
	/**
	 * 查询所有
	 * http://127.0.0.1:8080/RTDBackstage/fund/findAll
	 */
	@RequestMapping(value="/fund/findAll",method=RequestMethod.GET)
	public ResponseEntity<List<Fund>> findAll(HttpServletRequest request){
		HttpSession session = request.getSession();
		List<Fund> funds = fundService.findAll();
		session.setAttribute("funds", funds);
		System.out.println(funds.toString());
		return new ResponseEntity<List<Fund>>(funds,HttpStatus.OK);
	}
	
	/**
	 * (首页显示)
	 * 标类型：净值标,年化率：前3
	 * 标类型：信用标,年化率：前3
	 * 标类型：债权转让,年化率：前4
	 * 状态：投标中
	 * http://127.0.0.1:8080/RTDBackstage/fund/indexShow/{type}
	 */
	@RequestMapping(value="/fund/indexShow/{type}",method=RequestMethod.GET)
	public ResponseEntity<List<Fund>> indexShow(@PathVariable("type")String type){
		List<Fund> funds = new ArrayList<Fund>();
		if("债权转让".equals(type)){
			funds = fundService.indexShowTop4(type);
		}else{
			funds = fundService.indexShowTop3(type);
		}
		return new ResponseEntity<List<Fund>>(funds,HttpStatus.OK);
	}
	
	
	/**
	 * 根据不同的标类型查看此类型下所有标
	 * 根据年化率排行
	 * 分页显示，每页9条
	 * 状态：融资中
	 * http://127.0.0.1:8080/RTDBackstage/fund/findByTypePager/{type}
	 */
	@RequestMapping(value="/fund/findByTypePager/{type}",method=RequestMethod.GET)
	public ResponseEntity<?> findByTypePager(
				@PathVariable("type")String type,
				@RequestParam(value="page",required=false)Integer page
			){
		List<Fund> funds = new ArrayList<Fund>();
		if(StringUtils.isEmpty(page)){
			page = 1;
		}
		Integer row = 9;
		String order = "desc";
		String sort = "annualRate";
		Pager<Fund> pager = fundService.findByTypePager(type,page,row,order,sort);
		return new ResponseEntity<Pager<Fund>>(pager,HttpStatus.OK);
	}

}
