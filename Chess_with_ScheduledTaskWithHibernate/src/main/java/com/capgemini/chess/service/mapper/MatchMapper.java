package com.capgemini.chess.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.chess.dataaccess.entities.MatchEntity;
import com.capgemini.chess.service.to.MatchTO;

public class MatchMapper {

	public static MatchTO map(MatchEntity matchEntity) {

		if (matchEntity != null) {
			MatchTO matchTO = new MatchTO();
			matchTO.setId(matchEntity.getId());
			matchTO.setResult(matchEntity.getResult());
			matchTO.setUser1(matchEntity.getUser1());
			matchTO.setUser2(matchEntity.getUser2());
			return matchTO;
		}
		return null;
	}

	public static MatchEntity map(MatchTO matchTO) {

		if (matchTO != null) {

			MatchEntity matchEntity = new MatchEntity();
			matchEntity.setId(matchTO.getId());
			matchEntity.setResult(matchTO.getResult());
			matchEntity.setUser1(matchTO.getUser1());
			matchEntity.setUser2(matchTO.getUser2());
			return matchEntity;

		}
		return null;
	}

	public static MatchEntity update(MatchEntity matchEntity, MatchTO matchTO) {
		if (matchTO != null && matchEntity != null) {
			matchEntity.setId(matchTO.getId());
			matchEntity.setResult(matchTO.getResult());
			matchEntity.setUser1(matchTO.getUser1());
			matchEntity.setUser2(matchTO.getUser2());

		}
		return matchEntity;

	}

	public static List<MatchTO> map2TOs(List<MatchEntity> matchEntities) {
		return matchEntities.stream().map(MatchMapper::map).collect(Collectors.toList());
	}

	public static List<MatchEntity> map2Entities(List<MatchTO> matchTOs) {
		return matchTOs.stream().map(MatchMapper::map).collect(Collectors.toList());
	}
}
