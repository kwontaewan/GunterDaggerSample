package mobidoo.co.kr.daggerguntersample.di;

import dagger.Module;
import dagger.Provides;
import mobidoo.co.kr.daggerguntersample.model.HelloWorld;
import mobidoo.co.kr.daggerguntersample.model.HelloWorld2;

/**
 * Created by xc200 on 2017-07-25.
 */

@Module
public class HelloWorldModule {

    @Provides
    public HelloWorld provideHelloWorld(){
        return new HelloWorld();
    }

    @Provides
    public HelloWorld2 provideHelloWorld2(){
        return  new HelloWorld2();
    }
}
