package com.example.lecturerecoder.lecturesrecorder.asynctask;

/**
 * Created by yasir on 15/04/2017.
 */

import android.app.ProgressDialog;
import android.content.Context;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.lecturerecoder.lecturesrecorder.R;
import com.example.lecturerecoder.lecturesrecorder.utils.dialog.RegistrationDialog;

/**
 * A callback, which has ability to show loading dialog while response is being received.
 * Shows Toast with result's toString() on success.
 * Shows AlertDialog with error message on failure.
 * If overriding handleResponse and/or handleFault, should manually dismiss ProgressDialog with hideLoading() method
 * or calling super.handleResponse() or super.handleFault().
 *
 * @param <T> class to be received from server
 */
public class LoadingCallback<T> implements AsyncCallback<T>
{
    private Context context;
    private ProgressDialog progressDialog;

    /**
     * Create an instance with message "Loading...".
     *
     * @param context context to which ProgressDialog should be attached
     */
    public LoadingCallback( Context context )
    {
        this( context, context.getString( R.string.loading_empty ) );
    }

    /**
     * Creates an instance with given message.
     *
     * @param context        context to which ProgressDialog should be attached
     * @param loadingMessage message to be shown on ProgressDialog
     */
    public LoadingCallback( Context context, String loadingMessage )
    {
        this.context = context;
        progressDialog = new ProgressDialog( context );
        progressDialog.setMessage( loadingMessage );
    }

    @Override
    public void handleResponse( T response )
    {
        progressDialog.dismiss();
    }

    @Override
    public void handleFault( BackendlessFault fault )
    {
        progressDialog.dismiss();
        RegistrationDialog.createErrorDialog( context, "BackendlessFault", fault.getMessage() ).show();
    }

    /**
     * Shows ProgressDialog.
     */
    public void showLoading()
    {
        progressDialog.show();
    }

    /**
     * Hides ProgressDialog.
     */
    public void hideLoading()
    {
        progressDialog.dismiss();
    }
}