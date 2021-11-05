package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.nextChannel();
        int currentChannel = radio.getChannel();
        int expected = 1;

        assertEquals(expected, currentChannel);
    }

    @Test
    void goToZeroChannel() {
        Radio radio = new Radio(100);
        radio.setChannel(99);
        radio.nextChannel();
        int currentChannel = radio.getChannel();
        int expected = 0;

        assertEquals(expected, currentChannel);
    }

    @Test
    void overMaxChannel() {
        Radio radio = new Radio();
        radio.setChannel(10);
        int currentChannel = radio.getChannel();
        int expected = 0;

        assertEquals(expected, currentChannel);
    }

    @Test
    void underMinChannel() {
        Radio radio = new Radio();
        radio.setChannel(-1);
        int currentChannel = radio.getChannel();
        int expected = 0;

        assertEquals(expected, currentChannel);
    }

    @Test
    void previousChannel() {
        Radio radio = new Radio();
        radio.nextChannel();
        radio.previousChannel();
        int currentChannel = radio.getChannel();
        int expected = 0;

        assertEquals(expected, currentChannel);
    }

    @Test
    void goToNineChannel() {
        Radio radio = new Radio();
        radio.previousChannel();
        int currentChannel = radio.getChannel();
        int expected = 9;

        assertEquals(expected, currentChannel);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int currentVolume = radio.getVolume();
        int expected = 1;

        assertEquals(expected, currentVolume);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        int currentVolume = radio.getVolume();
        int expected = 0;

        assertEquals(expected, currentVolume);
    }

    @Test
    void checkMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int currentVolume = radio.getVolume();
        int expected = 100;

        assertEquals(expected, currentVolume);
    }

    @Test
    void checkOverMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int currentVolume = radio.getVolume();
        int expected = 0;

        assertEquals(expected, currentVolume);
    }

    @Test
    void checkUnderMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int currentVolume = radio.getVolume();
        int expected = 0;

        assertEquals(expected, currentVolume);
    }

    @Test
    void checkMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int currentVolume = radio.getVolume();
        int expected = 0;

        assertEquals(expected, currentVolume);
    }


}