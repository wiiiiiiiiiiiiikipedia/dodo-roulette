package com.example.fortuna.service;

import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.service.crud.CrudService;

public interface PrizeService extends CrudService<Prize, Long> {

    public Prize getRandomPrize();
}
