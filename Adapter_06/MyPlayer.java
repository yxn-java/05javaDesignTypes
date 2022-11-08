package com.javapractice.designTypes.Adapter_06;

public class MyPlayer implements Player {

    AudioPlayer audioPlayer = new MyAudioPlayer();
    VideoPlayer videoPlayer = new MyVideoPlayer();

    public MyPlayer(){
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("avi")){
            videoPlayer.playVideo(fileName);
        }else if(audioType.equalsIgnoreCase("mp3")){
            audioPlayer.playAudio(fileName);
        }
    }
}
