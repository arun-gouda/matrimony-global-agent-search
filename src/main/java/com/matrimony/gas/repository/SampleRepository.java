package com.matrimony.gas.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

    public String info() {
        return "Repository layer ready";
    }
}

