package com.example.a21091.secondproject;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class Notebook {

    private String manufacturer;
    private double diagonal_screen;
    private int time_w_recharging;
    private int cost;
    private int kol;
    private ArrayList<Notebook> notebooks;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiagonal_screen() {
        return diagonal_screen;
    }

    public void setDiagonal_screen(double diagonal_screen) {
        this.diagonal_screen = diagonal_screen;
    }

    public int getTime_w_recharging() {
        return time_w_recharging;
    }

    public void setTime_w_recharging(int time_w_recharging) {
        this.time_w_recharging = time_w_recharging;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public Notebook(){
        notebooks = new ArrayList();
    }

    public Notebook(String manufacturer, double diagonal_screen, int time_w_recharging, int cost) {
        this.manufacturer = manufacturer;
        this.diagonal_screen = diagonal_screen;
        this.time_w_recharging = time_w_recharging;
        this.cost = cost;
    }

    public Notebook New(String manufacturer, double diagonal_screen, int time_w_recharging, int cost){
        Notebook New = new Notebook(manufacturer, diagonal_screen, time_w_recharging, cost);

        return  New;
    }

    public void Add(Notebook n){
        notebooks.add(n);
    }
} 