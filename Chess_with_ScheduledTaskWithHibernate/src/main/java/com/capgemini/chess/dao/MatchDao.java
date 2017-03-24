package com.capgemini.chess.dao;

import java.util.List;

import com.capgemini.chess.service.to.MatchTO;

public interface MatchDao {

	public MatchTO getMatchById(long matchId);
	
	public List <MatchTO> getHistoryOfMatch ();
	
}
