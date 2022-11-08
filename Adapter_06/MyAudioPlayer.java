package com.javapractice.designTypes.Adapter_06;

public class MyAudioPlayer implements AudioPlayer{
    @Override
    public void playAudio(String fileName){
        System.out.println("Playing. Name:"+ fileName);
    }
}
