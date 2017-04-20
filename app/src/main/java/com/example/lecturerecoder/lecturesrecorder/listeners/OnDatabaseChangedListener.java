package com.example.lecturerecoder.lecturesrecorder.listeners;


/**
 * Created by yasir on 15/04/2017.
 * * Listen for add/rename items in database
 */

public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}