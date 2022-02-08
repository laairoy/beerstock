package me.dio.beerstock.builder;

import lombok.Builder;
import me.dio.beerstock.dto.BeerDTO;
import me.dio.beerstock.enums.BeerType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private Integer max = 50;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id, name, brand, max, type);
    }
}
