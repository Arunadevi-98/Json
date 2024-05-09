package org.data;

import java.util.ArrayList;
import java.util.List;

public class Root1 {
	private String  id;
	private String name;
    private String type;
	private Double ppu;
	private Batters batters;
	public Root1(String id, String name, String type, Double ppu, Batters batters, List<Topping> topping) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}
	private List<Topping> topping;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPpu() {
		return ppu;
	}
	public void setPpu(Double ppu) {
		this.ppu = ppu;
	}
	public Batters getBatters() {
		return batters;
	}
	public void setBatters(Batters batters) {
		this.batters = batters;
	}
	public List<Topping> getTopping() {
		return topping;
	}
	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}
	
}
