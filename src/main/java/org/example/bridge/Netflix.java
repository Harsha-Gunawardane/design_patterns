package org.example.bridge;

public class Netflix implements Video{
    protected VideoProcessor videoProcessor;

    public Netflix(VideoProcessor videoProcessor){
        System.out.print("in netflix\n");
        this.videoProcessor = videoProcessor;
    }
}
