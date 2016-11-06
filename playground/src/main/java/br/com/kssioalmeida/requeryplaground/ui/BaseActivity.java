package br.com.kssioalmeida.requeryplaground.ui;

import android.support.v7.app.AppCompatActivity;

import br.com.kssioalmeida.requeryplaground.MainApplication;

/**
 * Created by Cassio on 06/11/2016.
 */

public class BaseActivity extends AppCompatActivity {

    public MainApplication getMainApplication(){
        return (MainApplication) getApplication();
    }
}
