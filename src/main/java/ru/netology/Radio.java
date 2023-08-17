package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setRadioStationDownBelowMin() {
        int target = currentRadioStation = 9;
        setCurrentRadioStation(target);

    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }

    }
    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 100){
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume(){
        if (currentVolume < 100){
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }
}











