package com.capgemini.chess.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.chess.dao.StatisticDao;
import com.capgemini.chess.dataaccess.entities.StatisticEntity;
import com.capgemini.chess.service.mapper.StatisticMapper;
import com.capgemini.chess.service.to.StatisticTO;

@Repository
public class StatisticDaoImpl extends AbstractDao<StatisticEntity, Long> implements StatisticDao {

	@Override
	public StatisticTO getStatisticById(long userId) {
		return StatisticMapper.map(findOne(userId));

	}

	@Override
	public List<StatisticTO> getRanking() {
		TypedQuery<StatisticEntity> query = entityManager.createQuery("select statistic from StatisticEntity statistic group by statistic.level desc",
				StatisticEntity.class);
		return StatisticMapper.map2TOs(query.getResultList());
	}
}
