package com.rtdback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.rtdback.pojo.Fund;

/**
 * 标（融资）持久层类
 *
 */
@Repository("fundMapper")
public interface FundMapper {
	/**
	 * 添加标
	 */
	@Insert("insert into Fund (id,logo,name,type,firm,guarantor,state,annualRate,term,sum,credit,purpose,template,time,tempsum)"
			+ " values (#{id},#{logo},#{name},#{type},#{firm},#{guarantor},#{state},#{annualRate},#{term},#{sum},#{credit},"
			+ "#{purpose},#{template},#{time},#{tempsum})")
	int add(Fund fund);
	
	/**
	 * 修改标
	 */
	@Update("update Fund set logo = #{logo},name = #{name},type = #{type},firm = #{firm},guarantor = #{guarantor},"
			+ "state = #{state},annualRate = #{annualRate},term = #{term},sum = #{sum},credit = #{credit},"
			+ "purpose = #{purpose},template = #{template},time = #{time},tempsum = #{tempsum} where id = #{id}")
	int modify(Fund fund); 
	
	/**
	 * 查询所有标
	 */
	@Select("select id,logo,name,type,firm,guarantor,state,annualRate,term,sum,credit,purpose,template,time,tempsum from Fund")
	List<Fund> findAll();
	
	/**
	 * 根据id查询
	 */
	@Select("select id,logo,name,type,firm,guarantor,state,annualRate,term,sum,credit,purpose,template,time,tempsum from Fund where id = #{id}")
	Fund findById(@Param("id")long id);
	
	/**
	 * 首页显示的净值标和信用标
	 * 年化率：前3
	 * 状态：投标中
	 */
	List<Fund> indexShowTop3(@Param("type")String type);
	
	/**
	 * 首页显示的债权转让
	 * 年化率：前4
	 * 状态：投标中
	 */
	List<Fund> indexShowTop4(@Param("type")String type);
	
	/**
	 * 根据不同的标类型查看此类型下所有标的总数据条数
	 * 状态：融资中
	 */
	public Long findByTypePagerTotal(@Param("type")String type);
	
	/**
	 * 根据不同的标类型查看此类型下所有标
	 * 根据年化率排行
	 * 分页显示，每页9条
	 * 状态：融资中
	 */
	public List<Fund> findByTypePager(
				@Param("type")String type,
				@Param("page")Integer page,
				@Param("row")Integer row,
				@Param("order")String order,
				@Param("sort")String sort
			);
}
