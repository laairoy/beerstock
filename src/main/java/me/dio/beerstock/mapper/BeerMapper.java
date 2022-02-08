package me.dio.beerstock.mapper;

import me.dio.beerstock.dto.BeerDTO;
import me.dio.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    BeerDTO toDTO(Beer beer);
    Beer toModel(BeerDTO beerDTO);
}
