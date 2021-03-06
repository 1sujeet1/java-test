package com.example.javatest.repository;

import com.example.javatest.model.Movie;
import com.example.javatest.model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	Movie findById(int movieId);

	@Query("from Movie m where m.user =:user ")
	Page<Movie> findAllMoviesByUser(User user, Pageable pageable);

	@Query("from Movie m")
	Page<Movie> getAllMovies(Pageable pageable);

}
