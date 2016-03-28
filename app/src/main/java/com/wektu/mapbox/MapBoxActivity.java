package com.wektu.mapbox;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class MapBoxActivity extends AppCompatActivity
        implements IMap,
        OnMapReadyCallback,
        MapboxMap.OnCameraChangeListener{

    private MapView mapView = null;
    private MapboxMap mMap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_box);

        // Create a mapView
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {

                mMap = mapboxMap;



                // restore map to previous location and zoom level, if any, or to default values
                float zoomLevel = 2.0f;
                double lat = 44.427528;
                double lng = 26.087354;

                // Set the camera's starting position
                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(new LatLng(lat, lng)) // set the camera's center position
                        .zoom(zoomLevel)  // set the camera's zoom level
                        .tilt(0)  // set the camera's tilt
                        .build();

                // Move the camera to that position
                mapboxMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

                // Set map style
                mapboxMap.setStyleUrl(Style.DARK);
            }

        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause()  {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }



    @Override
    public void SetMapType(String mapType) {

    }


    @Override
    public void onCameraChange(CameraPosition position) {

    }

    @Override
    public void onMapReady(@NonNull MapboxMap mapboxMap) {
        mMap = mapboxMap;



        // restore map to previous location and zoom level, if any, or to default values
        float zoomLevel = 2.0f;
        double lat = 44.427528;
        double lng = 26.087354;

        // Set the camera's starting position
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(lat, lng)) // set the camera's center position
                .zoom(zoomLevel)  // set the camera's zoom level
                .tilt(20)  // set the camera's tilt
                .build();

        // Move the camera to that position
        mapboxMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        // Set map style
        mapboxMap.setStyleUrl(Style.DARK);

    }
}
