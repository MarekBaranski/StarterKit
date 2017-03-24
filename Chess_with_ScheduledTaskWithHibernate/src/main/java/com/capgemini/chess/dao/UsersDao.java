package com.capgemini.chess.dao;

import com.capgemini.chess.service.to.UserProfileTO;
import com.capgemini.chess.service.to.UserUpdateTO;

public interface UsersDao {

	public UserProfileTO getProfileById(long id);

	public void updateProfile(UserUpdateTO userUpdateProfile);

}
