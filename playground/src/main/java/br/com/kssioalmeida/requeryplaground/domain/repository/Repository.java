package br.com.kssioalmeida.requeryplaground.domain.repository;

import rx.Observable;

/**
 * Created by Cassio on 06/11/2016.
 */

interface Repository<T> {
    Observable<T> get();
    Observable<T> insert(T object);
}
