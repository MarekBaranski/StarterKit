package com.capgemini.chess.service.to;

import java.io.Serializable;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.enumerated.ResultMatch;

public class MatchTO extends AbstractTo implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private ResultMatch result;
	private UserEntity user1;
	private UserEntity user2;
	

	public MatchTO() {
		super();
	}
	
	
	public MatchTO(long id, ResultMatch result, UserEntity user1, UserEntity user2) {
		super();
		this.id = id;
		this.result = result;
		this.user1 = user1;
		this.user2 = user2;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ResultMatch getResult() {
		return result;
	}
	public void setResult(ResultMatch result) {
		this.result = result;
	}
	public UserEntity getUser1() {
		return user1;
	}
	public void setUser1(UserEntity user1) {
		this.user1 = user1;
	}
	public UserEntity getUser2() {
		return user2;
	}
	public void setUser2(UserEntity user2) {
		this.user2 = user2;
	}

	

}
