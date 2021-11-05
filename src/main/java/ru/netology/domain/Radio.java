package ru.netology.domain;

public class Radio {
    private int volume;
    private int channel;
    private int channelCount;

    public Radio(int channelCount) {
        this.channelCount = channelCount;
    }

    public Radio() {
        this.channelCount = 10;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100)
            return;
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < 0 || channel > channelCount - 1)
            return;
        this.channel = channel;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume >= 1) {
            volume = volume - 1;
        }
    }

    public void nextChannel() {
        if (channel < channelCount - 1) {
            channel = channel + 1;
        } else {
            channel = 0;
        }
    }

    public void previousChannel() {
        if (channel >= 1) {
            channel = channel - 1;
        } else {
            channel = channelCount - 1;
        }
    }

}
