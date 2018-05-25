package com.itheima.bos.domain;
// Generated 2018-2-24 8:37:32 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * decidedzone generated by hbm2java
 */
public class Decidedzone implements java.io.Serializable {

	private String id;
	private Staff staff;
	private String name;
	private Set subareas = new HashSet(0);

	public Decidedzone() {
	}

	public Decidedzone(String id) {
		this.id = id;
	}

	public Decidedzone(String id, Staff staff, String name, Set subareas) {
		this.id = id;
		this.staff = staff;
		this.name = name;
		this.subareas = subareas;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getSubareas() {
		return this.subareas;
	}

	public void setSubareas(Set subareas) {
		this.subareas = subareas;
	}

}
