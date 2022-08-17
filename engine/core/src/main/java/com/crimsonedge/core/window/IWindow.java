package com.crimsonedge.core.window;

public interface IWindow {

    int getWidth();
    int getHeight ();

    void setTitle (String title);
    String getTitle();

    void handleEvents();
    void swap ();


    IKeyboard getKeyboard ();
}
