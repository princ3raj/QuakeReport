package com.example.quakereport;

public class EarthQuake {


    private double mMagnitude;

    private long mTimeInMilliseconds;

    private  String mLocation;

    private String mDate;

    public EarthQuake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds=timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
