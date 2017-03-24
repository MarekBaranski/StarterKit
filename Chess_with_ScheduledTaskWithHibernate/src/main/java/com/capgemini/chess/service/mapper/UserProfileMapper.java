package com.capgemini.chess.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.service.to.UserProfileTO;

public class UserProfileMapper {

	public static UserProfileTO map(UserEntity userEntity) {
		if (userEntity != null) {
			UserProfileTO userProfileTO = new UserProfileTO();
			userProfileTO.setLogin(userEntity.getLogin());
			userProfileTO.setEmail(userEntity.getEmail());
			userProfileTO.setAboutMe(userEntity.getAboutMe());
			userProfileTO.setLifeMotto(userEntity.getLifeMotto());
			return userProfileTO;
		}
		return null;
	}

	public static UserEntity map(UserProfileTO userProfileTO) {
		if (userProfileTO != null) {
			UserEntity userEntity = new UserEntity();
			userEntity.setLogin(userProfileTO.getLogin());
			userEntity.setEmail(userProfileTO.getEmail());
			userEntity.setAboutMe(userProfileTO.getAboutMe());
			userEntity.setLifeMotto(userProfileTO.getLifeMotto());
			return userEntity;
		}
		return null;
	}

	public static UserEntity update(UserEntity userEntity, UserProfileTO userProfileTO) {
		if (userProfileTO != null && userEntity != null) {
			userEntity.setLogin(userProfileTO.getLogin());
			userEntity.setEmail(userProfileTO.getEmail());
			userEntity.setAboutMe(userProfileTO.getAboutMe());
			userEntity.setLifeMotto(userProfileTO.getLifeMotto());

		}
		return userEntity;
	}

	public static List<UserProfileTO> map2TOs(List<UserEntity> userEntities) {
		return userEntities.stream().map(UserProfileMapper::map).collect(Collectors.toList());
	}

	public static List<UserEntity> map2Entities(List<UserProfileTO> userTOs) {
		return userTOs.stream().map(UserProfileMapper::map).collect(Collectors.toList());
	}
}
