package com.example.philip.assignment_4;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Philip on 2015-04-23.
 */
public class Planet implements Serializable {

    String planetTitle;
    String planetData;
    String planetInfo;
    Drawable imgPlanet;

    public Planet(String planetTitle,Drawable imgPlanet,String planetInfo, String planetData ) {
        this.imgPlanet = imgPlanet;
        this.planetTitle = planetTitle;
        this.planetInfo = planetInfo;
        this.planetData = planetData;

        }

    public String getPlanetTitle() {
        return planetTitle;
    }

    public void setPlanetTitle(String planetTitle) {
        this.planetTitle = planetTitle;
    }

    public String getPlanetData() {
        return planetData;
    }

    public void setPlanetData(String planetData) {
        this.planetData = planetData;
    }

    public String getPlanetInfo() {
        return planetInfo;
    }

    public void setPlanetInfo(String planetInfo) {
        this.planetInfo = planetInfo;
    }

    public Drawable getImgPlanet() {
        return imgPlanet;
    }

    public void setImgPlanet(Drawable imgPlanet) {
        this.imgPlanet = imgPlanet;
    }
}


