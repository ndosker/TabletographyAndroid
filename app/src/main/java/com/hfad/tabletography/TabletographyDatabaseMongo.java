package com.hfad.tabletography;

public class TabletographyDatabaseMongo {

    public static String databaseName = "heroku_7xjtz4nv";
    public static String apiKey = "uxeZswGukUm7mR1QBs0d-aK9otZrLElY";

    public String getBaseUrl(){
        return "https://api.mlab.com/api/1/databases/" + databaseName;
    }

    public String getApiKeyUrl(){
        return "?apiKey=" + apiKey;
    }

    public String getCollectionUrl(String name){
        return getBaseUrl() + name + getApiKeyUrl();
    }



}
