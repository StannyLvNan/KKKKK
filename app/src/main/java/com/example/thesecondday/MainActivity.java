package com.example.thesecondday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            textView = (TextView) findViewById(R.id.asd_text);
            String string = "马玉强";
            String string2 = "是傻逼";
            textView.setText(string+string2);
            //111
            Log.e("第一次","---");
            Log.e("第一次","---");
            Log.e("第一次","---");
            Log.e("第一次","---");
            Log.e("第一次","---");
            //222
            Log.e("第二次","---");
            Log.e("第二次","---");
            Log.e("第二次","---");
            Log.e("第二次","---");
            Log.e("第二次","---");
            //333
            Log.e("第三次","---");
            Log.e("第三次","---");
            Log.e("第三次","---");
            Log.e("第三次","---");
            Log.e("第三次","---");
    }
}
