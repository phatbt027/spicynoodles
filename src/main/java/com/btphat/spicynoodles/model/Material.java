package com.btphat.spicynoodles.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "material_id")
	private int materialId;
	
	@Column(name = "material_name", nullable = false)
	private String materialName;
	
	@Column(name = "material_category", nullable = false)
	private CategoryMaterial category;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@ManyToMany
	@JoinTable(
	  name = "dish_id", 
	  joinColumns = @JoinColumn(name = "material_id"), 
	  inverseJoinColumns = @JoinColumn(name = "dish_id"))
	private List<Dish> dishes;
	
	@ManyToMany
	@JoinTable(
	  name = "soft_drink_id", 
	  joinColumns = @JoinColumn(name = "material_id"), 
	  inverseJoinColumns = @JoinColumn(name = "soft_drink_id"))
	private List<SoftDrink> softDrinks;
}
