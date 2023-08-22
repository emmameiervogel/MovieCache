package com.me.movielogger.controller;

import com.me.movielogger.dto.CacheMovie;
import com.me.movielogger.service.MovieCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class MovieController {

    @Autowired
    private MovieCacheService movieCacheService;

    @GetMapping("/search/{title}")
    public CacheMovie searchMovieByTitle(@PathVariable("title") String title) {
        return movieCacheService.findMovieByTitleThroughCache(title);
    }
}