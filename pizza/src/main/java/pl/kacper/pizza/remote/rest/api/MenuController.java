package pl.kacper.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kacper.pizza.domain.model.SizeType;
import pl.kacper.pizza.remote.rest.dto.response.MenuDto;
import pl.kacper.pizza.remote.rest.dto.response.PizzaDto;
import pl.kacper.pizza.remote.rest.dto.response.SizeDto;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value ="/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuController {

    public ResponseEntity<MenuDto> getMenu(){
        SizeDto sizeDto = new SizeDto(1, SizeType.S, BigDecimal.valueOf(30.00));
        PizzaDto pizzaDto = new PizzaDto(1, "Margerita", List.of(sizeDto));
        MenuDto menuDto = new MenuDto(List.of(pizzaDto));

        return ResponseEntity.ok(menuDto);

    }
}
