package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String reason;
	@OneToMany
	private List<Branches> branches;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Medorder> medorder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public List<Branches> getBranches() {
		return branches;
	}
	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}
	public List<Medorder> getMedorder() {
		return medorder;
	}
	public void setMedorder(List<Medorder> medorder) {
		this.medorder = medorder;
	}
	
	
}
