package br.com.kssioalmeida.requeryplaground.dagger.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cassio on 06/11/2016.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application){
        this.application = application;
    }

    @Singleton
    @Provides
    Application providesApplication(){
        return application;
    }

    @Singleton
    @Provides
    Context providesContext(Application application){
        return application.getBaseContext();
    }
}
