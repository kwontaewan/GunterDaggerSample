package mobidoo.co.kr.daggerguntersample.di;

import dagger.Component;
import mobidoo.co.kr.daggerguntersample.MainActivity;

/**
 * Created by xc200 on 2017-07-25.
 */


@Component(modules = {HelloWorldModule.class})
public interface HelloWorldComponent {
    void inject(MainActivity mainActivity);
}
