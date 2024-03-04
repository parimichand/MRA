package com.chandu.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private com.chandu.Movies.ReviewService service;
    @CrossOrigin(origins = "http://localhost:3000")

    @PostMapping()
    public ResponseEntity<com.chandu.Movies.Review> createReview(@RequestBody Map<String, String> payload) {

        return new ResponseEntity<com.chandu.Movies.Review>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }
}