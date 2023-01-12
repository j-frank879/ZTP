package com.example.kawiarnia;

public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Napoj currentItem();
}
