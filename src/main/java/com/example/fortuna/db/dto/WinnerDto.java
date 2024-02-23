package com.example.fortuna.db.dto;

public class WinnerDto {

    Long prizeNumber;
    String winnerName;
    String imageURL;
    String error;

    public Long getPrizeNumber() {
        return prizeNumber;
    }

    public WinnerDto setPrizeNumber(Long prizeNumber) {
        this.prizeNumber = prizeNumber;
        return this;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public WinnerDto setWinnerName(String winnerName) {
        this.winnerName = winnerName;
        return this;
    }

    public String getImageURL() {
        return imageURL;
    }

    public WinnerDto setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public String getError() {
        return error;
    }

    public WinnerDto setError(String error) {
        this.error = error;
        return this;
    }
}
