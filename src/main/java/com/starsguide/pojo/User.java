package com.starsguide.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * taobao customer user auth info
 * @author 
 *
 */
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 4198639824041345978L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)  
//	private Long id;

	@Id
	private String taobao_user_id;
	
	private String taobao_user_nick;
//	private int w1_expires_in;
//	private int w2_expires_in;
//	private int re_expires_in;
//	private int r2_expires_in;
//	private int r1_expires_in;
//	private int expires_in;

	private String token_type;
	private String refresh_token;
	private String access_token;

	@OneToOne(fetch = FetchType.EAGER)
	private Entitlement entl;
	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getTaobao_user_id() {
		return taobao_user_id;
	}

	public void setTaobao_user_id(String taobao_user_id) {
		this.taobao_user_id = taobao_user_id;
	}

	public String getTaobao_user_nick() {
		return taobao_user_nick;
	}

	public void setTaobao_user_nick(String taobao_user_nick) {
		this.taobao_user_nick = taobao_user_nick;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Entitlement getEntl() {
		return entl;
	}

	public void setEntl(Entitlement entl) {
		this.entl = entl;
	}

}
