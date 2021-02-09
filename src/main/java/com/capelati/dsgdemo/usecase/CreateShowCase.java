package com.capelati.dsgdemo.usecase;

import com.capelati.dsgdemo.converter.ShowConverter;
import com.capelati.dsgdemo.data.entity.ShowEntity;
import com.capelati.dsgdemo.data.repository.ShowReactiveRepository;
import com.capelati.dsgdemo.graphql.model.Show;
import org.springframework.stereotype.Service;

@Service
public class CreateShowCase {
    private final ShowReactiveRepository showReactiveRepository;
    private final ShowConverter showConverter;

    public CreateShowCase(ShowReactiveRepository showReactiveRepository, ShowConverter showConverter) {
        this.showReactiveRepository = showReactiveRepository;
        this.showConverter = showConverter;
    }

    private void act(Show show){
        final ShowEntity entity = this.showConverter.convertFromDto(show);
        this.showReactiveRepository.save(entity);
    }
}
