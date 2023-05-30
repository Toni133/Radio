package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testDesigner() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void positiveBoundaryValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adventureFrom1Station() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.switching();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adventureFrom8Station() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.switching();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adventureFromBackFrom9Station() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.switchingBack();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adventureBackFrom1Station() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.switchingBack();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryMinimumVolumeValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroVolumeValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void boundaryMaximumVolumeValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maximumVolumeValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseTheVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseTheVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeFrom99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseTheVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseTheVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeReduction();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionFrom99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeReduction();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeReduction();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionFrom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeReduction();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
