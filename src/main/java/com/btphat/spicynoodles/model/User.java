package com.btphat.spicynoodles.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name", nullable = false)
	private String username;
	
	@Column(name = "user_password", nullable = false)
	private String password;
	
	@Column(name = "user_role", nullable = false)
	private UserRole role;
	
	@Column(name = "is_enabled", nullable = false)
	private boolean isEnabled;
	
	@OneToOne(mappedBy = "user")
	private Invoice invoice;
	
	@OneToOne(mappedBy = "user")
	private OrderOffline order;
}
