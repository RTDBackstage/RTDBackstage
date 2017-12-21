package com.rtdback.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtdback.dao.FundMapper;
import com.rtdback.pojo.Fund;
import com.rtdback.util.Pager;

/**
 * 标（融资）服务类
 *
 */
@Service("fundService")
@Transactional(readOnly=true,propagation=Propagation.NOT_SUPPORTED)
public class FundService {
	@Resource(name="fundMapper")
	private FundMapper fundMapper;
	
	/**
	 * 添加标
	 */
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int add(Fund fund){
		return fundMapper.add(fund);
	}
	
	/**
	 * 修改标
	 */
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int modify(Fund fund){
		return fundMapper.modify(fund);
	}
	
	/**
	 * 查询所有标
	 */
	public List<Fund> findAll(){
		return fundMapper.findAll();
	}
	
	/**
	 * 根据id查询
	 */
	public Fund findById(long id){
		return fundMapper.findById(id);
	}
	
	/**
	 * 首页显示的净值标和信用标
	 * 年化率：前3
	 * 状态：投标中
	 */
	public List<Fund> indexShowTop3(String type){
		return fundMapper.indexShowTop3(type);
	}
	
	/**
	 * 首页显示的债权转让
	 * 年化率：前4
	 * 状态：投标中
	 */
	public List<Fund> indexShowTop4(String type){
		return fundMapper.indexShowTop4(type);
	}
	
	/**
	 * 根据不同的标类型查看此类型下所有标
	 * 根据年化率排行
	 * 分页显示，每页9条
	 * 状态：融资中
	 */
	public Pager<Fund> findByTypePager(String type,Integer page,Integer row,String order,String sort){
		Pager<Fund> pager = new Pager<Fund>();
		pager.setTotal(fundMapper.findByTypePagerTotal(type));
		//总页数
		long pagerNum = (pager.getTotal()%row==0)?pager.getTotal()/row:pager.getTotal()/row+1;
		pager.setPagerNum(pagerNum);
		if(page<=0){
			page = 1;
		}else if(page > pager.getPagerNum()){
			page = (int)pager.getPagerNum();
		}
		page = (page - 1) * row;
		pager.setRows(fundMapper.findByTypePager(type,page,row,order,sort));
		return pager;
	}
	
	public List<Fund> findByParam(String logmin,String logmax,String type,String firm){
		return fundMapper.findByParam(logmin, logmax, type, firm);
		
	}
}
