package com.example.practiceui.cardview;

public class MenuItem {
    private String tv_menu;
    private int iv_menu;

    public MenuItem(String tv_menu, int iv_menu) {
        this.tv_menu = tv_menu;
        this.iv_menu = iv_menu;
    }

    public String getTv_menu() {
        return tv_menu;
    }

    public void setTv_menu(String tv_menu) {
        this.tv_menu = tv_menu;
    }

    public int getIv_menu() {
        return iv_menu;
    }

    public void setIv_menu(int iv_menu) {
        this.iv_menu = iv_menu;
    }
}
