package com.z.domain;

import java.math.BigDecimal;

/**
 * TYpb entity. @author MyEclipse Persistence Tools
 */

public class TYpb implements java.io.Serializable {

	// Fields

	private String id;
	private String ypbh;
	private String ypmc;
	private String zjm;
	private String ypzl;
	private String ggxh;
	private String dw;
	private BigDecimal ckj;
	private BigDecimal kc;
	private BigDecimal kcsx;
	private BigDecimal kcxx;
	private String ssyj;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	// Constructors

	/** default constructor */
	public TYpb() {
	}

	/** minimal constructor */
	public TYpb(String id) {
		this.id = id;
	}

	/** full constructor */
	public TYpb(String id, String ypbh, String ypmc, String zjm, String ypzl,
			String ggxh, String dw, BigDecimal ckj, BigDecimal kc,
			BigDecimal kcsx, BigDecimal kcxx, String ssyj, String bz1,
			String bz2, String bz3, String bz4) {
		this.id = id;
		this.ypbh = ypbh;
		this.ypmc = ypmc;
		this.zjm = zjm;
		this.ypzl = ypzl;
		this.ggxh = ggxh;
		this.dw = dw;
		this.ckj = ckj;
		this.kc = kc;
		this.kcsx = kcsx;
		this.kcxx = kcxx;
		this.ssyj = ssyj;
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

	public String getYpbh() {
		return this.ypbh;
	}

	public void setYpbh(String ypbh) {
		this.ypbh = ypbh;
	}

	public String getYpmc() {
		return this.ypmc;
	}

	public void setYpmc(String ypmc) {
		this.ypmc = ypmc;
	}

	public String getZjm() {
		return this.zjm;
	}

	public void setZjm(String zjm) {
		this.zjm = zjm;
	}

	public String getYpzl() {
		return this.ypzl;
	}

	public void setYpzl(String ypzl) {
		this.ypzl = ypzl;
	}

	public String getGgxh() {
		return this.ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public BigDecimal getCkj() {
		return this.ckj;
	}

	public void setCkj(BigDecimal ckj) {
		this.ckj = ckj;
	}

	public BigDecimal getKc() {
		return this.kc;
	}

	public void setKc(BigDecimal kc) {
		this.kc = kc;
	}

	public BigDecimal getKcsx() {
		return this.kcsx;
	}

	public void setKcsx(BigDecimal kcsx) {
		this.kcsx = kcsx;
	}

	public BigDecimal getKcxx() {
		return this.kcxx;
	}

	public void setKcxx(BigDecimal kcxx) {
		this.kcxx = kcxx;
	}

	public String getSsyj() {
		return this.ssyj;
	}

	public void setSsyj(String ssyj) {
		this.ssyj = ssyj;
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