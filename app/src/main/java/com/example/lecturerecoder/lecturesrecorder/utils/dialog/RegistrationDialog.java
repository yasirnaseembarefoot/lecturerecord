package com.example.lecturerecoder.lecturesrecorder.utils.dialog;

/**
 * Created by yasir on 15/04/2017.
 */
import android.app.AlertDialog;
import android.content.Context;
public class RegistrationDialog {


    public static AlertDialog createErrorDialog( Context context, String title, String message )
    {
        return new AlertDialog.Builder( context )
                .setTitle( title )
                .setMessage( message )
                .setIcon( android.R.drawable.ic_dialog_alert )
                .create();
    }
}
