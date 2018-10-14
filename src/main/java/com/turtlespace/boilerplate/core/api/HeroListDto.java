package com.turtlespace.boilerplate.core.api;

import java.util.List;

public class HeroListDto {
    private List<HeroDto> heroes;


    //FIXME: Get lombok working specifically on meer's computer so we dont have to do this
    public List<HeroDto> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<HeroDto> heroes) {
        this.heroes = heroes;
    }
}
