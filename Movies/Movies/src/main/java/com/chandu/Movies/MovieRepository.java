package com.chandu.Movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@Repository
public interface MovieRepository extends MongoRepository<com.chandu.Movies.Movie, ObjectId> {
    Optional<com.chandu.Movies.Movie> findMovieByImdbId(String imdbId);
}