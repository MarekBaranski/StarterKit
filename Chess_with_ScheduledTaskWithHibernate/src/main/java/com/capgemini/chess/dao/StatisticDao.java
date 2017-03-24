package com.capgemini.chess.dao;

import java.util.List;

import com.capgemini.chess.service.to.StatisticTO;

public interface StatisticDao {

	public StatisticTO getStatisticById(long userId);
	
	public List <StatisticTO> getRanking();

}
