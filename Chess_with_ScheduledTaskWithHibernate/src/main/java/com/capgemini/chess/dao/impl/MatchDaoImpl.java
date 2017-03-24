package com.capgemini.chess.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.chess.dao.MatchDao;
import com.capgemini.chess.dataaccess.entities.MatchEntity;
import com.capgemini.chess.service.mapper.MatchMapper;
import com.capgemini.chess.service.to.MatchTO;

@Repository
public class MatchDaoImpl extends AbstractDao<MatchEntity, Long> implements MatchDao {

	@Override
	public MatchTO getMatchById(long matchId) {
		return MatchMapper.map(findOne(matchId));
	}

	@Override
	public List<MatchTO> getHistoryOfMatch() {
		return MatchMapper.map2TOs(findAll());
	}

	

	
}
