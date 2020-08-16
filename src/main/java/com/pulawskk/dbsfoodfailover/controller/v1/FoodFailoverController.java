package com.pulawskk.dbsfoodfailover.controller.v1;

import com.pulawskk.dbsfoodfailover.model.BurgerListDto;
import com.pulawskk.dbsfoodfailover.service.FoodFailoverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(FoodFailoverController.FOOD_FAILOVER_BASE_URL)
public class FoodFailoverController {

    public static final String FOOD_FAILOVER_BASE_URL = "/burgers-failover";

    private final FoodFailoverService foodFailoverService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public BurgerListDto getBurgers() {
        return foodFailoverService.getBurgers();
    }
}
