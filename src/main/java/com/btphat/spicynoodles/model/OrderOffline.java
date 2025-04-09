package com.btphat.spicynoodles.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderOffline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dish_id", referencedColumnName = "dish_id")
	private Dish dish;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "soft_drink_id", referencedColumnName = "soft_drink_id")
	private SoftDrink softDrink;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;
	
	@Column(name = "amount")
	private int amount;
}
