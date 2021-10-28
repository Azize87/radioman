package ru.netology.domain;

public class Radio {
    private int volume;
    private int channel;

    public int getVolume(){
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if(newChannel<0 || newChannel>9)
            return;
        channel = newChannel;
    }
    public void setVolume(int newVolume) {
        if(newVolume<0 || newVolume>10)
            return;
        volume = newVolume;
    }
    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }
    public void decreaseVolume() {
        if (volume >= 1) {
            volume = volume - 1;
        }
    }
    public void nextChannel() {
        if (channel < 9) {
            channel = channel + 1;
        }
        else{
          channel = 0;
        }
    }
    public void previousChannel() {
        if (channel >= 1) {
            channel = channel - 1;
        }
        else{
            channel = 9;
        }
    }

}
