package com.starsguide.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * stars guide menu
 * 
 * */
@Entity
@Table(name="menu")
public class Menu implements Serializable{
	
	private static final long serialVersionUID = 2327302990159529278L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private Long id;
	
	private String name;
	
	private String action;
	
	@ManyToOne(targetEntity=com.starsguide.pojo.Menu.class,fetch = FetchType.LAZY)
	private Menu parentMenu;
	
	@OneToMany(targetEntity=com.starsguide.pojo.Menu.class,fetch = FetchType.EAGER, mappedBy="parentMenu")
	private List<Menu> subMenus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenu(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}
	
}
