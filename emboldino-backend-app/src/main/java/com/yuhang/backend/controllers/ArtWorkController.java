package com.yuhang.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ArtWork saveArtWork(@RequestBody ArtWork artWork) {
		System.out.println("artWork = " + artWork);
		artWork.setId(0);
		long newId = this.artWorkService.saveNewArtWork(artWork);
		artWork.setId(newId);
		return artWork;
	}

}
