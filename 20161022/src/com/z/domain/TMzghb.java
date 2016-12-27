package com.z.domain;

import java.math.BigDecimal;

/**
 * TMzghb entity. @author MyEclipse Persistence Tools
 */

public class TMzghb implements java.io.Serializable {

	// Fields

	private String id;
	private String bh;
	private String hzxm;
	private BigDecimal ghf;
	private String xb;
	private String nl;
	private String dw;
	private String zdr;
	private String zdrq;
	private String bmmc;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	// Constructors

	/** default constructor */
	public TMzghb() {
	}

	/** minimal constructor */
	public TMzghb(String id) {
		this.id = id;
	}

	/** full constructor */
	public TMzghb(String id, String bh, String hzxm, BigDecimal ghf, String xb,
			String nl, String dw, String zdr, String zdrq, String bmmc,
			String bz1, String bz2, String bz3, String bz4) {
		this.id = id;
		this.bh = bh;
		this.hzxm = hzxm;
		this.ghf = ghf;
		this.xb = xb;
		this.nl = nl;
		this.dw = dw;
		this.zdr = zdr;
		this.zdrq = zdrq;
		this.bmmc = bmmc;
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

	public String getBh() {
		return this.bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public String getHzxm() {
		return this.hzxm;
	}

	public void setHzxm(String hzxm) {
		this.hzxm = hzxm;
	}

	public BigDecimal getGhf() {
		return this.ghf;
	}

	public void setGhf(BigDecimal ghf) {
		this.ghf = ghf;
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getNl() {
		return this.nl;
	}

	public void setNl(String nl) {
		this.nl = nl;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getZdr() {
		return this.zdr;
	}

	public void setZdr(String zdr) {
		this.zdr = zdr;
	}

	public String getZdrq() {
		return this.zdrq;
	}

	public void setZdrq(String zdrq) {
		this.zdrq = zdrq;
	}

	public String getBmmc() {
		return this.bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
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