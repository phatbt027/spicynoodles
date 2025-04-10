package com.btphat.spicynoodles.service;

import java.util.List;

import com.btphat.spicynoodles.dto.MaterialDto;
import com.btphat.spicynoodles.model.Material;

public interface MaterialService {
	public Material save(Material material);
	
	public Material update(MaterialDto materialDto);
	
	void delete(MaterialDto materialDto);
	
	List<MaterialDto> getAll();
}
