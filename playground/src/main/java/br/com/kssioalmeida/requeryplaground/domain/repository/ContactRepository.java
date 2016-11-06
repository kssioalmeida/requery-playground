package br.com.kssioalmeida.requeryplaground.domain.repository;

import javax.inject.Inject;

import br.com.kssioalmeida.requeryplaground.domain.entity.Contact;
import io.requery.Persistable;
import io.requery.rx.SingleEntityStore;
import rx.Observable;

/**
 * Created by Cassio on 06/11/2016.
 */

public class ContactRepository implements Repository<Contact> {

    SingleEntityStore<Persistable> dataStore;

    @Inject
    public ContactRepository(SingleEntityStore<Persistable> dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public Observable<Contact> get() {
        return dataStore.select(Contact.class)
                .get()
                .toObservable();
    }

    @Override
    public Observable<Contact> insert(Contact object) {
        return dataStore.insert(object).toObservable();
    }
}
