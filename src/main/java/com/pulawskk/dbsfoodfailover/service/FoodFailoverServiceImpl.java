package com.pulawskk.dbsfoodfailover.service;

import com.pulawskk.dbsfoodfailover.model.BurgerDto;
import com.pulawskk.dbsfoodfailover.model.BurgerListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FoodFailoverServiceImpl implements FoodFailoverService {
    
    @Override
    public BurgerListDto getBurgers() {

        List<BurgerDto> burgerDtos = new ArrayList<>();

        BurgerDto burgerDto1 = new BurgerDto();
        burgerDto1.setId(111L);
        burgerDto1.setName("TEMPORARY CLASSIC");
        burgerDto1.setPrice("21");
        burgerDto1.setIngredientsJson("wheat, lettuce, well done, tomato, ketchup, mayo");

        BurgerDto burgerDto2 = new BurgerDto();
        burgerDto2.setId(222L);
        burgerDto2.setName("TEMPORARY CLASSIC CHEESE");
        burgerDto2.setPrice("22");
        burgerDto2.setIngredientsJson("wheat, lettuce, well done, tomato, ketchup, mayo, cheese, bacon");

        burgerDtos.add(burgerDto1);
        burgerDtos.add(burgerDto2);

        return new BurgerListDto(burgerDtos);
    }
}
