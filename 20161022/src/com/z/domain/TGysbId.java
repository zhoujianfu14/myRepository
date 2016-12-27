package com.z.domain;

/**
 * TGysbId entity. @author MyEclipse Persistence Tools
 */

public class TGysbId implements java.io.Serializable {

	// Fields

	private String id;
	private String TGysbh;
	private String TGysmc;
	private String zjm;
	private String bz1;
	private String bz2;
	private String bz3;
	private String bz4;

	// Constructors

	/** default constructor */
	public TGysbId() {
	}

	/** full constructor */
	public TGysbId(String id, String TGysbh, String TGysmc, String zjm,
			String bz1, String bz2, String bz3, String bz4) {
		this.id = id;
		this.TGysbh = TGysbh;
		this.TGysmc = TGysmc;
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

	public String getTGysbh() {
		return this.TGysbh;
	}

	public void setTGysbh(String TGysbh) {
		this.TGysbh = TGysbh;
	}

	public String getTGysmc() {
		return this.TGysmc;
	}

	public void setTGysmc(String TGysmc) {
		this.TGysmc = TGysmc;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TGysbId))
			return false;
		TGysbId castOther = (TGysbId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getTGysbh() == castOther.getTGysbh()) || (this
						.getTGysbh() != null && castOther.getTGysbh() != null && this
						.getTGysbh().equals(castOther.getTGysbh())))
				&& ((this.getTGysmc() == castOther.getTGysmc()) || (this
						.getTGysmc() != null && castOther.getTGysmc() != null && this
						.getTGysmc().equals(castOther.getTGysmc())))
				&& ((this.getZjm() == castOther.getZjm()) || (this.getZjm() != null
						&& castOther.getZjm() != null && this.getZjm().equals(
						castOther.getZjm())))
				&& ((this.getBz1() == castOther.getBz1()) || (this.getBz1() != null
						&& castOther.getBz1() != null && this.getBz1().equals(
						castOther.getBz1())))
				&& ((this.getBz2() == castOther.getBz2()) || (this.getBz2() != null
						&& castOther.getBz2() != null && this.getBz2().equals(
						castOther.getBz2())))
				&& ((this.getBz3() == castOther.getBz3()) || (this.getBz3() != null
						&& castOther.getBz3() != null && this.getBz3().equals(
						castOther.getBz3())))
				&& ((this.getBz4() == castOther.getBz4()) || (this.getBz4() != null
						&& castOther.getBz4() != null && this.getBz4().equals(
						castOther.getBz4())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getTGysbh() == null ? 0 : this.getTGysbh().hashCode());
		result = 37 * result
				+ (getTGysmc() == null ? 0 : this.getTGysmc().hashCode());
		result = 37 * result
				+ (getZjm() == null ? 0 : this.getZjm().hashCode());
		result = 37 * result
				+ (getBz1() == null ? 0 : this.getBz1().hashCode());
		result = 37 * result
				+ (getBz2() == null ? 0 : this.getBz2().hashCode());
		result = 37 * result
				+ (getBz3() == null ? 0 : this.getBz3().hashCode());
		result = 37 * result
				+ (getBz4() == null ? 0 : this.getBz4().hashCode());
		return result;
	}

}