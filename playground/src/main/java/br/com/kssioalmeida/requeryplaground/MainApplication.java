package br.com.kssioalmeida.requeryplaground;

import android.app.Application;

import br.com.kssioalmeida.requeryplaground.dagger.DaggerMainComponent;
import br.com.kssioalmeida.requeryplaground.dagger.MainComponent;
import br.com.kssioalmeida.requeryplaground.dagger.module.ApplicationModule;

/**
 * Created by Cassio on 06/11/2016.
 */

public class MainApplication extends Application{

    private MainComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMainComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public MainComponent getCompoment(){
        return component;
    }
}
