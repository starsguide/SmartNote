package com.starsguide.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entitlement {
	public enum TermUnit {
		DAY, MONTH, YEAR
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private Long id;
	
	private String name;
	
	private String label;
	
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Menu> menus;
	
	private int term;
	
	@Enumerated(EnumType.STRING)
	private TermUnit termUnit;

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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public TermUnit getTermUnit() {
		return termUnit;
	}

	public void setTermUnit(TermUnit termUnit) {
		this.termUnit = termUnit;
	}

	
}
