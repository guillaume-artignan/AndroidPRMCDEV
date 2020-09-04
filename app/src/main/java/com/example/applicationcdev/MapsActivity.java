package com.example.applicationcdev;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private GoogleMap mMap;
    private Circle c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1, 1, this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng lyon = new LatLng(45.7505921659877,4.836478965169793);
        LatLng lyon2 = new LatLng(45.74759752564679,4.848769915568685);
        LatLng lyon3 = new LatLng(45.7647246995444,4.851722482870375);
        mMap.addMarker(new MarkerOptions()
                                .position(lyon)
                                .title("Marker in Lyon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lyon));

        mMap.addMarker(new MarkerOptions()
                .position(lyon2));

        mMap.addMarker(new MarkerOptions()
                .position(lyon3));

        mMap.moveCamera(CameraUpdateFactory.zoomTo(14.0f));

        c = mMap.addCircle(new CircleOptions()
                                        .center(lyon)
                                        .radius(50.0)
                                        .strokeColor(Color.BLUE)
                                        .fillColor(Color.argb(50,50,50,255)));

        Polygon p = mMap.addPolygon(new PolygonOptions()
                .add(lyon,lyon2,lyon3)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(50,50,50,255)));

    }

    @Override
    public void onLocationChanged(Location location) {
       // c.remove();
        LatLng position = new LatLng(location.getLatitude(),location.getLongitude());

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(position));
        c.remove();
        c = mMap.addCircle(new CircleOptions()
                .center(position)
                .radius(10.0)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(50,50,50,255)));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
