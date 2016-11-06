package br.com.kssioalmeida.requeryplaground.dagger.module.domain;

import javax.inject.Singleton;

import br.com.kssioalmeida.requeryplaground.domain.repository.ContactRepository;
import dagger.Module;
import dagger.Provides;
import io.requery.Persistable;
import io.requery.rx.SingleEntityStore;

/**
 * Created by Cassio on 06/11/2016.
 */

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    ContactRepository providesPersonRepository(SingleEntityStore<Persistable> dataStore){
        return new ContactRepository(dataStore);
    }
}
