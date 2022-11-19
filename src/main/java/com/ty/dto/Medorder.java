package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medorder {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String details;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Tablets> tablets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public List<Tablets> getTablets() {
		return tablets;
	}
	public void setTablets(List<Tablets> tablets) {
		this.tablets = tablets;
	}
	
	
}
