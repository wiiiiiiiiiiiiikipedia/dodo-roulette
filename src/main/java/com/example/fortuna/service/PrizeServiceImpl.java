package com.example.fortuna.service;

import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.db.repository.PrizeRepository;
import com.example.fortuna.db.repository.PrizeToParticipantRepository;
import com.example.fortuna.service.crud.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrizeServiceImpl
    extends AbstractCrudService<Prize,Long>
    implements PrizeService
{
    private final PrizeRepository prizeRepository;
    private final PrizeToParticipantRepository prizeToParticipantRepository;

    @Autowired
    public PrizeServiceImpl(
            PrizeRepository prizeRepository,
            PrizeToParticipantRepository prizeToParticipantRepository
    ) {
        super(prizeRepository);
        this.prizeRepository = prizeRepository;
        this.prizeToParticipantRepository = prizeToParticipantRepository;
    }

    @Override
    public Prize getRandomPrize() {

        List<Prize> allPrizes = prizeRepository.findAll();
        List<PrizeToParticipant> allPrizeToParticipant = prizeToParticipantRepository.findAll();
        List<Prize> unavailablePrizes = prizeRepository.findAllById(
                allPrizeToParticipant
                    .stream()
                    .map(PrizeToParticipant::getPrizeId)
                    .collect(Collectors.toList())
        );

        List<Prize> availablePrizes = allPrizes.stream()
                .filter(aObject -> ! unavailablePrizes.contains(aObject))
                .collect(Collectors.toList());

        if(availablePrizes.size()==0)
            return null;

        int randomPrizeId = (int) (Math.random() * availablePrizes.size());
        return availablePrizes.get(randomPrizeId);
    }
}
