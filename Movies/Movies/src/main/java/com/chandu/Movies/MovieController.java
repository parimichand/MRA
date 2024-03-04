//package com.chandu.Movies;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//
//public class MovieController {
//
//    @RequestMapping("/api/v1/movies")
//    @Autowired
//    private MovieService service;
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping
//    public ResponseEntity<List<Movie>> getMovies() {
//        return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{imdbId}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
//        return new ResponseEntity<Optional<Movie>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
//    }
//}



package com.chandu.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies") // Specify the base path for all methods in this controller
public class MovieController {

    @Autowired
    private MovieService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping // Specify the mapping path for the getMovies() method
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(service.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
    }
}
