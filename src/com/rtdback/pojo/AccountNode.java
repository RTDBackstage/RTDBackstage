package com.rtdback.pojo;

/**
 * 此表从account 用户表，account_role用户对应角色表，role角色表， role_menu角色对应菜单表，menu后台菜单表
 * 这五个表中提取数据 以此来 获取角色的姓名，职称，管理范围，职称介绍， 并通过此来设置用户的角色
 * 
 * @author Administrator
 *
 */
public class AccountNode {
	private Integer id;
	private String username;
	private String titlesname;
	private String introduced;
	private String menuname;

	public AccountNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitlesname() {
		return titlesname;
	}

	public void setTitlesname(String titlesname) {
		this.titlesname = titlesname;
	}

	public String getIntroduced() {
		return introduced;
	}

	public void setIntroduced(String introduced) {
		this.introduced = introduced;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

}
