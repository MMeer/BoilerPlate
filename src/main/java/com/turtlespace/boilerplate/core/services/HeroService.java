package com.turtlespace.boilerplate.core.services;

import com.turtlespace.boilerplate.core.api.HeroDto;
import com.turtlespace.boilerplate.core.api.HeroListDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeroService {

    public List<HeroDto> getHeroList() {
        List<HeroDto> heroes = new ArrayList<>();
        List<String> heroNames = new ArrayList<>(Arrays.asList("Mr. Nice", "Narco", "Bombasto", "Celeritas", "Magneta", "RubberMan", "Dynama", "Dr IQ", "Magma", "Tornado"));
        Long id = 11L;
        for (String heroName : heroNames) {
            HeroDto heroDto = new HeroDto();
            heroDto.setId(id);
            heroDto.setName(heroName);
            heroes.add(heroDto);
            id++;
        }
        return heroes;
    }
}
