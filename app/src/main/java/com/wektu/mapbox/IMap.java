package com.wektu.mapbox;

/**
 * Created by Wektu on 3/28/2016.
 * This interface will allow the usage of google maps, mapbox and osm
 * by implementing this interface
 */
public interface IMap {

    /**
     * Change the map type to one of the following options
     * Style.MAPBOX_STREETS
     * Style.EMERALD
     * Style.LIGHT
     * Style.DARK
     * Style.SATELLITE
     * Style.SATELLITE_STREETS
     * @param mapType The int value of the map Type
     */
    void SetMapType(String mapType);

}
