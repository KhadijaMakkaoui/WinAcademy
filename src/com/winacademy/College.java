package com.winacademy;

public class College {
    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public int getCollege_Name() {
        return college_Name;
    }

    public void setCollege_Name(int college_Name) {
        this.college_Name = college_Name;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    private int college_id;
    private int college_Name;
    private String siteInternet;

    public College(int college_id, int college_Name, String siteInternet) {
        this.college_id = college_id;
        this.college_Name = college_Name;
        this.siteInternet = siteInternet;
    }
}
