package com.btphat.spicynoodles.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Storage {
	@EmbeddedId
	private StorageId storageId;
	
	@Column(name = "material_amount", nullable = false)
	private float amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_entry", nullable = false)
	private Date dateOfEntry;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiration_date", nullable = false)
	private Date expirationDate;
}
