package com.matrimony.gas.service;

import com.matrimony.gas.repository.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public String status() {
        return sampleRepository.info();
    }
}


