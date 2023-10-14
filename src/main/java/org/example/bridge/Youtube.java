package org.example.bridge;

public class Youtube implements Video{
    protected VideoProcessor videoProcessor;

    public Youtube(VideoProcessor videoProcessor){
        System.out.print("in youtube\n");
        this.videoProcessor = videoProcessor;
    }
}
