package com.example.fortuna.controller;

import com.example.fortuna.db.dto.PrizeToParticipantDto;
import com.example.fortuna.db.dto.WinnerDto;
import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.exception.AlreadyWonException;
import com.example.fortuna.exception.NoAvailablePrizesException;
import com.example.fortuna.service.FortunaService;
import com.example.fortuna.service.ParticipantService;
import com.example.fortuna.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class ApiFortunaController {

    private final FortunaService fortunaService;
    private final ParticipantService participantService;
    private final PrizeService prizeService;

    @Autowired
    public ApiFortunaController(
            FortunaService fortunaService,
            ParticipantService participantService,
            PrizeService prizeService
    ) {
        this.fortunaService = fortunaService;
        this.participantService = participantService;
        this.prizeService = prizeService;
    }

    @GetMapping("winners")
    @ResponseBody
    public Map<String, String> getAllWinners() {
        return fortunaService.allWinners();
    }

    @PostMapping("choose-winner/dto")
    @ResponseBody
    public PrizeToParticipantDto getWinnerDto(@RequestParam(value = "name") String participantName) {

        PrizeToParticipantDto prizeToParticipantDto = new PrizeToParticipantDto();
        PrizeToParticipant prizeToParticipant;

        try {
            prizeToParticipant = fortunaService.chooseWinner(participantName);

        } catch (NoAvailablePrizesException | AlreadyWonException e) {
            prizeToParticipantDto.setErrors(List.of(e.getMessage()));
            return prizeToParticipantDto;
        }
        prizeToParticipantDto
                .setPrize(prizeService.findById(prizeToParticipant.getPrizeId()).get());
        prizeToParticipantDto
                .setParticipant(participantService.findById(prizeToParticipant.getParticipantId()).get());

        return prizeToParticipantDto;
    }

    @PostMapping("choose-winner")
    @ResponseBody
    public WinnerDto getWinner(@RequestParam(value = "name") String participantName) {

        PrizeToParticipant prizeToParticipant;
        WinnerDto winnerDto = new WinnerDto();

        try {
            prizeToParticipant = fortunaService.chooseWinner(participantName);

        } catch (NoAvailablePrizesException | AlreadyWonException e) {
            winnerDto.setError(e.getMessage());
            return winnerDto;
        }

        Prize prize = prizeService.findById(prizeToParticipant.getPrizeId()).get();

        winnerDto.setPrizeNumber(prize.getId());
        winnerDto.setImageURL(prize.getPhotoUrl());
        winnerDto.setWinnerName(participantName);

        return winnerDto;
    }

    @DeleteMapping("clear")
    public String deleteAll() {
        fortunaService.deleteWinnersAndParticipants();
        return "Все победители и все участники удалены";
    }

}
