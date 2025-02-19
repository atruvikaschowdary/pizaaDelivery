package com.project.onlinepizzaorderingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.onlinepizzaorderingsystem.model.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
	
	
	
	@Query(value = "SELECT * FROM comments WHERE comments_first_name = ?1", nativeQuery = true)
	public List<Comments> serchUserByName(String comments_name);
	
	// Example of Native Query - SQL
	@Query(value = "SELECT * FROM comments, state WHERE state_id = comments_state", nativeQuery = true)
	public List<Comments> serchUserByState(String comments_state);
	

}
