package com.yuhang.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhang.backend.dao.AppDao;
import com.yuhang.backend.domain.ArtWork;

@Service
public class ArtWorkServiceImpl implements ArtWorkService {
	
	@Autowired
	private AppDao appDao;

	@Override
	public List<ArtWork> getAllArtWorks() {
//		List<ArtWork> artWorks = Arrays.asList(
//				new ArtWork(11, "Paint #1", "This is paint #1", "European", "Oil paint", 100.0),
//				new ArtWork(12, "Paint #2", "This is paint #2", "European", "Oil paint", 200.0),
//				new ArtWork(13, "Paint #3", "This is paint #3", "Chinese", "Pencil paint", 300.0)
//				);
//		return artWorks;
		return appDao.retrieveAllArtWorks();
	}

}
