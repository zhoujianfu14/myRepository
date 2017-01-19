package com.z.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="t_fzxmb")
public class TFzxmb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String xmbh;
	private String xmmc;
	private String zjm;
	private BigDecimal dj;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	public TFzxmb() {
	}

	public TFzxmb(String id) {
		this.id = id;
	}

	public TFzxmb(String id, String xmbh, String xmmc, String zjm,
			BigDecimal dj, String bz1, String bz2, String bz3, String bz4) {
		this.id = id;
		this.xmbh = xmbh;
		this.xmmc = xmmc;
		this.zjm = zjm;
		this.dj = dj;
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

	public String getXmbh() {
		return this.xmbh;
	}

	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}

	public String getXmmc() {
		return this.xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getZjm() {
		return this.zjm;
	}

	public void setZjm(String zjm) {
		this.zjm = zjm;
	}

	public BigDecimal getDj() {
		return this.dj;
	}

	public void setDj(BigDecimal dj) {
		this.dj = dj;
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