package com.hfad.gpapredictor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;
//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.AdRequest;



public class MainActivity extends AppCompatActivity {
    public double Total;
   // private AdView mAdView;
    public void cal_gpa(View view ){
    Total=0;
    Spinner coa=(Spinner) findViewById(R.id.spinner1);

    String g1  = String.valueOf(coa.getSelectedItem());

        Spinner dbms=(Spinner) findViewById(R.id.spinner2);
        String g2  = String.valueOf(dbms.getSelectedItem());

        Spinner ap=(Spinner) findViewById(R.id.spinner3);
        String g3  = String.valueOf(ap.getSelectedItem());

        Spinner m3=(Spinner) findViewById(R.id.spinner4);
        String g4  = String.valueOf(m3.getSelectedItem());

        Spinner ota=(Spinner) findViewById(R.id.spinner5);
        String g5  = String.valueOf(ota.getSelectedItem());

        Spinner psy=(Spinner) findViewById(R.id.spinner6);
        String g6  = String.valueOf(psy.getSelectedItem());

        Log.i("g1",g1+"A");


        if(g1.equals("A")){
            Total+=40;
        }
        else if(g1.equals("AB")){
            Total+=36;
        }
        else if(g1.equals("B")){
            Total=Total +32;
        }
        else if(g1.equals("BC")){
            Total=Total +28;
        }
        else if(g1.equals("C")){
            Total=Total +24;
        }
        else if(g1.equals("CD")){
            Total=Total +20;
        }
        else if(g1.equals("D")){
            Total=Total +16;
        }



        if(g2.equals("A")){
            Total=Total +40;
        }
        else if(g2.equals("AB")){
            Total=Total +36;
        }
        else if(g2.equals("B")){
            Total=Total +32;
        }
        else if(g2.equals("BC")){
            Total=Total +28;
        }
        else if(g2.equals("C")){
            Total=Total +24;
        }
        else if(g2.equals("CD")){
            Total=Total +20;
        }
        else if(g2.equals("D")){
            Total=Total +16;
        }



        if(g3.equals("A")){
            Total=Total +40;
        }
        else if(g3.equals("AB")){
            Total=Total +36;
        }
        else if(g3.equals("B")){
            Total=Total +32;
        }
        else if(g3.equals("BC")){
            Total=Total +28;
        }
        else if(g3.equals("C")){
            Total=Total +24;
        }
        else if(g3.equals("CD")){
            Total=Total +20;
        }
        else if(g3.equals("D")){
            Total=Total +16;
        }



        if(g4.equals("A")){
            Total=Total +40;
        }
        else if(g4.equals("AB")){
            Total=Total +36;
        }
        else if(g4.equals("B")){
            Total=Total +32;
        }
        else if(g4.equals("BC")){
            Total=Total +28;
        }
        else if(g4.equals("C")){
            Total=Total +24;
        }
        else if(g4.equals("CD")){
            Total=Total +20;
        }
        else if(g4.equals("D")){
            Total=Total +16;
        }



        if(g5.equals("A")){
            Total=Total +30;
        }
        else if(g5.equals("AB")){
            Total=Total +27;
        }
        else if(g5.equals("B")){
            Total=Total +24;
        }
        else if(g5.equals("BC")){
            Total=Total +21;
        }
        else if(g5.equals("C")){
            Total=Total +18;
        }
        else if(g5.equals("CD")){
            Total=Total +15;
        }
        else if(g5.equals("D")){
            Total=Total +12;
        }



        if(g6.equals("A")){
            Total=Total +30;
        }
        else if(g6.equals("AB")){
            Total=Total +27;
        }
        else if(g6.equals("B")){
            Total=Total +24;
        }
        else if(g6.equals("BC")){
            Total=Total +21;
        }
        else if(g6.equals("C")){
            Total=Total +18;
        }
        else if(g6.equals("CD")){
            Total=Total +15;
        }
        else if(g6.equals("D")) {
            Total = Total + 12;
        }
        Total=Total/22;
        Total =Math.round(Total * 100.0) / 100.0;
        String str1 = Double.toString(Total);
        Log.i("Pointer",str1);

        Toast.makeText(this,"Pointer---"+str1,Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
//        MobileAds.initialize(this, "ca-app-pub-7468471302199566/3436245613");
//        AdView adView = new AdView(this);
//        adView.setAdSize(AdSize.BANNER);
//        adView.setAdUnitId("ca-app-pub-7468471302199566/3436245613");
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


    }
}



