package com.scalefocus.day4;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReview {

    @DataProvider
    public Object[][] Capitals(){

        String[][] capitals = {
                {"Turkey","Ankara"},
                {"USA","Washington"},
                {"Germany","Berlin"}
        };
        return capitals;
    }

    @Test(dataProvider = "Capitals")
    public void test1(String country, String capital){
        System.out.println(capital + " is capital city of " + country);
    }

    @DataProvider
    public Object[][] tvShows(){
        String[][] shows = {
                {"Heroes","6.5"},
                {"How I meet your mother","8"},
                {"Fringe","9"},
                {"Person of Interest","9"},
                {"Chernobyl","9.9"},
                {"La Casa De Papel","8"},
                {"The 100","8"}
        };
        return shows;
    }

    @Test(dataProvider = "tvShows")
    public void test2(String seriesName, String imdbPoint){
        System.out.println("Point of " + seriesName + " is " + imdbPoint);
    }


}
