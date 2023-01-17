package com.yuhang.backend.dao;

import java.util.List;

import com.yuhang.backend.domain.ArtWork;

public interface AppDao {

	public List<ArtWork> retrieveAllArtWorks();
}
