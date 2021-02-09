package com.capelati.dsgdemo.converter;

import com.capelati.dsgdemo.data.entity.ShowEntity;
import com.capelati.dsgdemo.graphql.model.Show;
import org.springframework.stereotype.Component;

@Component
public class ShowConverter extends Converter<Show, ShowEntity> {

    public ShowConverter(){
        super(ShowConverter::convertToEntity, ShowConverter::convertToDto);
    }

    private static Show convertToDto(ShowEntity entity){
        return new Show(entity.getTitle(), entity.getReleaseYear());
    }

    private static ShowEntity convertToEntity(Show dto){
        return new ShowEntity(dto.getTitle(), dto.getReleaseYear());
    }
}
