package jkml.data.repository;

import java.util.List;

import jkml.data.entity.User;

public interface UserRepositoryCustom {

	void ingest(List<User> users);

}
