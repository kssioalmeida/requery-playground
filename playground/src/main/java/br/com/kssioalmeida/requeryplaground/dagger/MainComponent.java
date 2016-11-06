package br.com.kssioalmeida.requeryplaground.dagger;

import br.com.kssioalmeida.requeryplaground.dagger.module.ApplicationModule;
import br.com.kssioalmeida.requeryplaground.dagger.module.domain.DatabaseModule;
import dagger.Component;

/**
 * Created by Cassio on 06/11/2016.
 */
@Component(modules = {ApplicationModule.class, DatabaseModule.class})
public interface MainComponent {
}
