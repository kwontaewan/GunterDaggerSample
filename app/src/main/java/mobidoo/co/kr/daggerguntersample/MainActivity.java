package mobidoo.co.kr.daggerguntersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import mobidoo.co.kr.daggerguntersample.di.DaggerHelloWorldComponent;
import mobidoo.co.kr.daggerguntersample.model.HelloWorld;
import mobidoo.co.kr.daggerguntersample.model.HelloWorld2;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;

    @Inject
    HelloWorld helloWorld;

    @Inject
    HelloWorld2 helloWorld2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerHelloWorldComponent.builder().build().inject(this);
        initView();


    }

    private void initView(){
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView.setText(helloWorld.getData());
        textView2.setText(helloWorld2.getData());
    }
}
