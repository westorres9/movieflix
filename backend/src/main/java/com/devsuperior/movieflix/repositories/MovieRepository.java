package com.devsuperior.movieflix.repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Genre,Long>{
	
	@Query("SELECT obj FROM Movie WHERE :genre IS NULL OR oj.genre = :genre")
	Page<Movie> find(Genre genre ,Pageable pageable);
}
