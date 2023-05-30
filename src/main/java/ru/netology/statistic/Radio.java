package ru.netology.statistic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public void switching() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void switchingBack() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseTheVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void volumeReduction() {
        if (currentVolume != 0) {
            currentVolume--;

        }
    }
}

