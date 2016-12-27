package com.z.domain;

/**
 * TGysb entity. @author MyEclipse Persistence Tools
 */

public class TGysb implements java.io.Serializable {

	// Fields

	private TGysbId id;

	// Constructors

	/** default constructor */
	public TGysb() {
	}

	/** full constructor */
	public TGysb(TGysbId id) {
		this.id = id;
	}

	// Property accessors

	public TGysbId getId() {
		return this.id;
	}

	public void setId(TGysbId id) {
		this.id = id;
	}

}