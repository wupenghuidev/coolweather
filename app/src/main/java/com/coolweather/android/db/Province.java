package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/10/28.
 */

public class Province extends DataSupport {
    private int id;
    private  String proviceName;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
