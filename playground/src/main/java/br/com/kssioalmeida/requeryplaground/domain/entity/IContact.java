package br.com.kssioalmeida.requeryplaground.domain.entity;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;

/**
 * Created by Cassio on 06/11/2016.
 */

@Entity
interface IContact {

    @Key @Generated
    int getId();

    String getName();

    String getLastName();

    int getAge();

    String getPhone();

    String getMail();
}
