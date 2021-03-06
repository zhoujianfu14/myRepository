package com.z.domain;

/**
 * TYjb entity. @author MyEclipse Persistence Tools
 */

public class TYjb implements java.io.Serializable {

	// Fields

	private String id;
	private String yjbh;
	private String yjmc;
	private String zjm;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	// Constructors

	/** default constructor */
	public TYjb() {
	}

	/** minimal constructor */
	public TYjb(String id) {
		this.id = id;
	}

	/** full constructor */
	public TYjb(String id, String yjbh, String yjmc, String zjm, String bz1,
			String bz2, String bz3, String bz4) {
		this.id = id;
		this.yjbh = yjbh;
		this.yjmc = yjmc;
		this.zjm = zjm;
		this.bz1 = bz1;
		this.bz2 = bz2;
		this.bz3 = bz3;
		this.bz4 = bz4;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYjbh() {
		return this.yjbh;
	}

	public void setYjbh(String yjbh) {
		this.yjbh = yjbh;
	}

	public String getYjmc() {
		return this.yjmc;
	}

	public void setYjmc(String yjmc) {
		this.yjmc = yjmc;
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