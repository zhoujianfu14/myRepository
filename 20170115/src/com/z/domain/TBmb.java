package com.z.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * TBmb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_bmb")
public class TBmb implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String bmbh;
	private String bmmc;
	private String zjm;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	public TBmb() {
	}

	public TBmb(String id) {
		this.id = id;
	}

	public TBmb(String id, String bmbh, String bmmc, String zjm, String bz1,
			String bz2, String bz3, String bz4) {
		this.id = id;
		this.bmbh = bmbh;
		this.bmmc = bmmc;
		this.zjm = zjm;
		this.bz1 = bz1;
		this.bz2 = bz2;
		this.bz3 = bz3;
		this.bz4 = bz4;
	}

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBmbh() {
		return this.bmbh;
	}

	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}

	public String getBmmc() {
		return this.bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}

	public String getZjm() {
		return this.zjm;
	}

	public void setZjm(String zjm) {
		this.zjm = zjm;
	}

	public String getBz1() {
		return this.bz1;
	}

	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	public String getBz2() {
		return this.bz2;
	}

	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}

	public String getBz3() {
		return this.bz3;
	}

	public void setBz3(String bz3) {
		this.bz3 = bz3;
	}

	public String getBz4() {
		return this.bz4;
	}

	public void setBz4(String bz4) {
		this.bz4 = bz4;
	}

}