package com.btphat.spicynoodles.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dish {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dish_id")
	private int dishId;
	
	@Column(name = "dish_name", nullable = false)
	private String softDrinkName;
	
	@Column(name = "price", nullable = false)
	private float price;
	
	@ManyToMany(mappedBy = "dishes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Material> materials;
	
	@OneToOne(mappedBy = "dish")
	private OrderOffline order;
}
