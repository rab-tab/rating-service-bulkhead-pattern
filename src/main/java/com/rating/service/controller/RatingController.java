package com.rating.service.controller;

import com.rating.service.dto.ProductRatingDto;
import com.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("{prodId}")
    public ProductRatingDto getRating(@PathVariable int prodId) throws InterruptedException {
        Thread.sleep(3000);
        return this.ratingService.getRatingForProduct(prodId);
    }

}