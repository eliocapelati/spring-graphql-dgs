package com.capelati.dsgdemo.data.repository;

import com.capelati.dsgdemo.data.entity.ShowEntity;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface ShowReactiveRepository extends ReactiveSortingRepository<ShowEntity, String> {
}
