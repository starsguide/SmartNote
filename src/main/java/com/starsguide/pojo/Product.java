package com.starsguide.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product implements Serializable{
	
	private static final long serialVersionUID = -5917892095702949306L;
	
	@Id
	private Long num_iid;
	
	private Long cid;
	
	private String approve_status;
	
	private Long num;
	
	private String title;
	private String nick;
	private String type;
	private String price;
	private Boolean has_discount;
	private Boolean has_invoice;
	private Boolean has_warranty;
	private Boolean has_showcase;
	
	private String pic_url;
	
	private Date modified;
	private Date list_time;
	private Date delist_time;
	
	//not record parameter
//	approve_status,props,valid_thru,postage_id,seller_cids,outer_id

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getApprove_status() {
		return approve_status;
	}

	public void setApprove_status(String approve_status) {
		this.approve_status = approve_status;
	}

	public Long getNum_iid() {
		return num_iid;
	}

	public void setNum_iid(Long num_iid) {
		this.num_iid = num_iid;
	}

	public Long getNum() {
		return num;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getList_time() {
		return list_time;
	}

	public void setList_time(Date list_time) {
		this.list_time = list_time;
	}

	public Date getDelist_time() {
		return delist_time;
	}

	public void setDelist_time(Date delist_time) {
		this.delist_time = delist_time;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Boolean getHas_discount() {
		return has_discount;
	}

	public void setHas_discount(Boolean has_discount) {
		this.has_discount = has_discount;
	}

	public Boolean getHas_invoice() {
		return has_invoice;
	}

	public void setHas_invoice(Boolean has_invoice) {
		this.has_invoice = has_invoice;
	}

	public Boolean getHas_warranty() {
		return has_warranty;
	}

	public void setHas_warranty(Boolean has_warranty) {
		this.has_warranty = has_warranty;
	}

	public Boolean getHas_showcase() {
		return has_showcase;
	}

	public void setHas_showcase(Boolean has_showcase) {
		this.has_showcase = has_showcase;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

}
