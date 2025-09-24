package com.precisionpos.nearpay;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import com.precisionpos.nearpay.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import io.nearpay.softpos.library.Country;
import io.nearpay.terminalsdk.SdkEnvironment;
import io.nearpay.terminalsdk.TerminalSDK;
import timber.log.Timber;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            TerminalSDK nearpay = new TerminalSDK.Builder()
                    .activity(this)  // Sets the activity context
                    .environment(SdkEnvironment.SANDBOX)  // Choose SANDBOX or PRODUCTION or INTERNAL
                    .googleCloudProjectNumber(12345678L)  // Set Google Cloud project number
                    .huaweiSafetyDetectApiKey("your_api_key")  // Set Huawei API key
                    .country(Country.SA)  // Set country SA, TR, USA, KEN
                    .build();
        } catch (Throwable e) {
            Timber.e("Error initializing TerminalSDK: $e");
        }

    }




}