package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/10/29.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;
    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }


}
