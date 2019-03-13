package com.example.locationdemo.location;

import android.location.Location;

public interface FusedLocationListener {
    void onLocationChanged(Location location);
}
