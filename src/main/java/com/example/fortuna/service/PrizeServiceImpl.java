package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.repository.PrizeRepository;
import com.example.fortuna.service.crud.AbstractCrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public class PrizeServiceImpl
    extends AbstractCrudService<Prize,Long>
    implements PrizeService
{
    private final PrizeRepository prizeRepository;

    public PrizeServiceImpl(PrizeRepository prizeRepository) {
        super(prizeRepository);
        this.prizeRepository = prizeRepository;
    }
}
