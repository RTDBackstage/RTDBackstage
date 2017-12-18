package com.rtdback.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
/**
 * 标（融资）实体类
 *
 */
public class Fund implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String logo;
	private String name;
	private String type;
	private String firm;
	private String guarantor;
	private String state;
	@NumberFormat(pattern="############.000")
	private double annualRate;
	private int term;
	@NumberFormat(pattern="############.00")
	private double sum;
	private String credit;
	private String purpose;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;
	private String template;
	@NumberFormat(pattern="############.00")
	private double tempsum;
	
	public Fund(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getTempsum() {
		return tempsum;
	}

	public void setTempsum(double tempsum) {
		this.tempsum = tempsum;
	}
	
	
}
