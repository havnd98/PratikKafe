/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SMSNG
 */
public class etkinlik {
    private int id;
    private String ad;
    private int fiyat;
    private int kapasite;

    public etkinlik () {
    }

    public etkinlik (int id , String ad , int fiyat , int kapasite) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.kapasite = kapasite;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getAd () {
        return ad;
    }

    public void setAd (String ad) {
        this.ad = ad;
    }

    public int getFiyat () {
        return fiyat;
    }

    public void setFiyat (int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapasite () {
        return kapasite;
    }

    public void setKapasite (int kapasite) {
        this.kapasite = kapasite;
    }  
    
}
