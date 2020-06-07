package com.leon.service;

import com.leon.domain.MetaDatabase;
import com.leon.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MetaDataService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase) {
        metaDatabaseRepository.save(metaDatabase);
    }


    public Iterable<MetaDatabase> getQuery() {
        return metaDatabaseRepository.findAll();
    }
}
