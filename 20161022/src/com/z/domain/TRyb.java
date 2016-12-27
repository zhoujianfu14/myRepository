package com.z.domain;

/**
 * TRyb entity. @author MyEclipse Persistence Tools
 */

public class TRyb implements java.io.Serializable {

	// Fields

	private String id;
	private String rybh;
	private String rymc;
	private String zjm;
	private String mm;
	private String bz1;
	private String bz2;
	private String bz3;

	// Constructors

	/** default constructor */
	public TRyb() {
	}

	/** minimal constructor */
	public TRyb(String id) {
		this.id = id;
	}

	/** full constructor */
	public TRyb(String id, String rybh, String rymc, String zjm, String mm,
			String bz1, String bz2, String bz3) {
		this.id = id;
		this.rybh = rybh;
		this.rymc = rymc;
		this.zjm = zjm;
		this.mm = mm;
		this.bz1 = bz1;
		this.bz2 = bz2;
		this.bz3 = bz3;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRybh() {
		return this.rybh;
	}

	public void setRybh(String rybh) {
		this.rybh = rybh;
	}

	public String getRymc() {
		return this.rymc;
	}

	public void setRymc(String rymc) {
		this.rymc = rymc;
	}

	public String getZjm() {
		return this.zjm;
	}

	public void setZjm(String zjm) {
		this.zjm = zjm;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
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

}