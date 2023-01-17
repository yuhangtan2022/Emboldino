package com.yuhang.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuhang.backend.domain.ArtWork;
import com.yuhang.backend.services.ArtWorkService;

@CrossOrigin("*")
@RestController
@RequestMapping("/artworks")
public class ArtWorkController {
	
	@Autowired
	private ArtWorkService artWorkService;
	
	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ArtWork> getAllArtWorks() {
		return this.artWorkService.getAllArtWorks();
	}

}
