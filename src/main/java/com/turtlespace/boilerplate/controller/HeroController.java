package com.turtlespace.boilerplate.controller;

import com.turtlespace.boilerplate.core.api.HeroListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/heroes")
public class HeroController {

    @GetMapping
    public HeroListDto getHeroes(){
        return new HeroListDto();
    }


}