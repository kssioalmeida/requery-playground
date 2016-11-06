package br.com.kssioalmeida.requeryplaground.dagger.module.domain;

import android.app.Application;
import android.os.StrictMode;

import javax.inject.Singleton;

import br.com.kssioalmeida.requeryplaground.domain.entity.Models;
import dagger.Module;
import dagger.Provides;
import io.requery.Persistable;
import io.requery.android.BuildConfig;
import io.requery.android.sqlite.DatabaseSource;
import io.requery.rx.RxSupport;
import io.requery.rx.SingleEntityStore;
import io.requery.sql.Configuration;
import io.requery.sql.EntityDataStore;
import io.requery.sql.TableCreationMode;

/**
 * Created by Cassio on 06/11/2016.
 */
@Module
public class DatabaseModule {

    @Singleton
    @Provides
    SingleEntityStore<Persistable> providesSingleEntityStore(DatabaseSource source) {
        StrictMode.enableDefaults();

        if (BuildConfig.DEBUG) {
            source.setTableCreationMode(TableCreationMode.DROP_CREATE);
        }
        Configuration configuration = source.getConfiguration();
        return RxSupport.toReactiveStore(
                new EntityDataStore<Persistable>(configuration));
    }

    @Singleton
    @Provides
    DatabaseSource providesDataStore(Application application) {
        return new DatabaseSource(application, Models.DEFAULT, 1);
    }
}
