package com.turtlespace.boilerplate.controller;

import com.turtlespace.boilerplate.core.api.HeroDto;
import com.turtlespace.boilerplate.core.api.HeroListDto;
import com.turtlespace.boilerplate.core.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<HeroDto> getHeroes(){
        return heroService.getHeroList();
    }


}