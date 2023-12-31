package dev.assessment.assessment.Movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(reviewService.createReviewBy(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
