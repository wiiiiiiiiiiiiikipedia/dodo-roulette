package com.example.fortuna.controller;

import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.exception.AlreadyWonException;
import com.example.fortuna.exception.NoAvailablePrizesException;
import com.example.fortuna.form.ParticipantForm;
import com.example.fortuna.service.FortunaService;
import com.example.fortuna.service.ParticipantService;
import com.example.fortuna.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("fortuna")
public class FortunaController {

    private final FortunaService fortunaService;
    private final ParticipantService participantService;
    private final PrizeService prizeService;

    @Autowired
    public FortunaController(
        FortunaService fortunaService,
        ParticipantService participantService,
        PrizeService prizeService
    ) {
        this.fortunaService = fortunaService;
        this.participantService = participantService;
        this.prizeService = prizeService;
    }

    @GetMapping("")
    public ModelAndView renderFortunaPage() {

        return new ModelAndView("main")
                .addObject("winners", fortunaService.allWinners());
    }

    @PostMapping("choose-winner")
    public ModelAndView getWinner(@ModelAttribute("participantForm") ParticipantForm participantForm) {

        PrizeToParticipant prizeToParticipant;

        try {
            prizeToParticipant = fortunaService.chooseWinner(participantForm);
        } catch (NoAvailablePrizesException | AlreadyWonException e) {
            return new ModelAndView("main")
                    .addObject("error", e.getLocalizedMessage());
        }

        return new ModelAndView("main")
                .addObject(
                    "prize",
                    prizeService.findById(prizeToParticipant.getPrizeId())
                )
                .addObject(
                    "participant",
                    participantService.findById(prizeToParticipant.getParticipantId())
                );
    }

    @GetMapping("winners")
    public ModelAndView getAllWinners() {
        return new ModelAndView("winners")
                .addObject("winners", fortunaService.allWinners());
    }
}
