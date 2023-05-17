package com.inhatc.android_firebase1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView objTV;
    private String strServiceUrl, strServiceKey, strRouteId;
    private StringBuilder strUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTV = (TextView) findViewById(R.id.txtTitle);

        strServiceUrl = "";
        strServiceKey = "QY7q2nj6qzKQ2Lvd6T4M%2Fty5EwyXmxO%2B1myK5lynrj%2B3eGB%2BFiPi4djRUP3plQi%2BfPz2Twf6Qok8%2FGRE6LY5hg%3D%3D";
        strRouteId="100100063";
    }
}