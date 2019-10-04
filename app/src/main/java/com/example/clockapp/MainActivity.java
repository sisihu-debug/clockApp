package com.example.clockapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.ImageView;

import android.widget.TextClock;
import android.widget.TextView;


import java.lang.*;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring all the clocks
        final ConstraintLayout clock1 = findViewById(R.id.city1);
        final ConstraintLayout clock2 = findViewById(R.id.city2);
        final ConstraintLayout clock3 = findViewById(R.id.city3);
        final ConstraintLayout clock4 = findViewById(R.id.city4);
        final ConstraintLayout clock5 = findViewById(R.id.city5);


        //declaring all the cities' names

        final TextView cityName1 = clock1.findViewById(R.id.cityName);
        final TextView cityName2 = clock2.findViewById(R.id.cityName);
        final TextView cityName3 = clock3.findViewById(R.id.cityName);
        final TextView cityName4 = clock4.findViewById(R.id.cityName);
        final TextView cityName5 = clock5.findViewById(R.id.cityName);

        //setting cities names

        cityName1.setText(R.string.cityNameString1);
        cityName2.setText(R.string.cityNameString2);
        cityName3.setText(R.string.cityNameString3);
        cityName4.setText(R.string.cityNameString4);
        cityName5.setText(R.string.cityNameString5);

        cityName1.setText("Sydney    ");
        cityName2.setText("New York");
        cityName3.setText("Shanghai");
        cityName4.setText("London   ");
        cityName5.setText("Paris       ");



        //declaring all city pictures
        final ImageView cityImage1 = clock1.findViewById(R.id.cityImage);
        final ImageView cityImage2 = clock2.findViewById(R.id.cityImage);
        final ImageView cityImage3 = clock3.findViewById(R.id.cityImage);
        final ImageView cityImage4 = clock4.findViewById(R.id.cityImage);
        final ImageView cityImage5 = clock5.findViewById(R.id.cityImage);

        cityImage1.setImageResource(R.drawable.sydney);
        cityImage2.setImageResource(R.drawable.newyork);
        cityImage3.setImageResource(R.drawable.shanghai);
        cityImage4.setImageResource(R.drawable.london);
        cityImage5.setImageResource(R.drawable.paris);

        //declaring all the clock times

        final TextClock cityTime1 = clock1.findViewById(R.id.cityTime);
        final TextClock cityTime2 = clock2.findViewById(R.id.cityTime);
        final TextClock cityTime3 = clock3.findViewById(R.id.cityTime);
        final TextClock cityTime4 = clock4.findViewById(R.id.cityTime);
        final TextClock cityTime5 = clock5.findViewById(R.id.cityTime);


        //display time in different time zones


        cityTime1.setTimeZone("Australia/Sydney");
        cityTime2.setTimeZone("America/New_York");
        cityTime3.setTimeZone("Asia/Shanghai");
        cityTime4.setTimeZone("Europe/London");
        cityTime5.setTimeZone("Europe/Paris");



        //declare 12Hour and 24Hour toggle buttons
        Button switchTo12Button = findViewById(R.id.hour12Button);
        Button switchTo24Button = findViewById(R.id.hour24Button);

        //set methods for switch between 12hr and 24hr

        switchTo24Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
//

//
                final String DEFAULT_FORCED_24_HOUR_FORMAT = "kk:mm";

                cityTime1.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);
                cityTime2.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);
                cityTime3.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);
                cityTime4.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);
                cityTime5.setFormat12Hour(DEFAULT_FORCED_24_HOUR_FORMAT);

//
//
//
            }
//

        });


        switchTo12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
//
                final String DEFAULT_FORCED_12_HOUR_FORMAT = "hh:mm a";

                //reference: https://medium.com/@tapuranjannahak/android-textclock-customization-to-deviate-from-system-time-format-b1ab05db7f3a

                cityTime1.setFormat12Hour(DEFAULT_FORCED_12_HOUR_FORMAT);
                cityTime2.setFormat12Hour(DEFAULT_FORCED_12_HOUR_FORMAT);
                cityTime3.setFormat12Hour(DEFAULT_FORCED_12_HOUR_FORMAT);
                cityTime4.setFormat12Hour(DEFAULT_FORCED_12_HOUR_FORMAT);
                cityTime5.setFormat12Hour(DEFAULT_FORCED_12_HOUR_FORMAT);

            }
//

        });



        //declare all hide buttons


        final Button hide1Button = findViewById(R.id.hide1Switch);
        final Button hide2Button = findViewById(R.id.hide2Switch);
        final Button hide3Button = findViewById(R.id.hide3Switch);
        final Button hide4Button = findViewById(R.id.hide4Switch);
        final Button hide5Button = findViewById(R.id.hide5Switch);

        //hide and unhide onclick listeners

        hide1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hide1Button.getText().equals("Hide")){

                    cityName1.setHeight(0);
                    cityImage1.setVisibility(View.GONE);
                    cityTime1.setHeight(0);
                    hide1Button.setText("Sydney");
                    hide1Button.setBackgroundColor(Color.rgb(67,170,139));
                    hide1Button.setTextColor(Color.rgb(255,255,255));


                    ;
                }

                else{
                    cityName1.setHeight(100);
                    cityImage1.setVisibility(View.VISIBLE);
                    cityTime1.setHeight(100);
                    hide1Button.setText("Hide");
                    hide1Button.setBackgroundColor(Color.rgb(207,92,54));
                    hide1Button.setTextColor(Color.rgb(255,255,255));



                }





            }
        });

        hide2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hide2Button.getText().equals("Hide")){

                    cityName2.setHeight(0);
                    cityImage2.setVisibility(View.GONE);
                    cityTime2.setHeight(0);
                    hide2Button.setText("New York");
                    hide2Button.setBackgroundColor(Color.rgb(67,170,139));
                    hide2Button.setTextColor(Color.rgb(255,255,255));
                }

                else{
                    cityName2.setHeight(100);
                    cityImage2.setVisibility(View.VISIBLE);
                    cityTime2.setHeight(100);
                    hide2Button.setText("Hide");
                    hide2Button.setBackgroundColor(Color.rgb(207,92,54));
                    hide2Button.setTextColor(Color.rgb(255,255,255));
                }





            }
        });


        hide3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hide3Button.getText().equals("Hide")){

                    cityName3.setHeight(0);
                    cityImage3.setVisibility(View.GONE);
                    cityTime3.setHeight(0);
                    hide3Button.setText("Shanghai");
                    hide3Button.setBackgroundColor(Color.rgb(67,170,139));
                    hide3Button.setTextColor(Color.rgb(255,255,255));
                }

                else{
                    cityName3.setHeight(100);
                    cityImage3.setVisibility(View.VISIBLE);
                    cityTime3.setHeight(100);
                    hide3Button.setText("Hide");
                    hide3Button.setBackgroundColor(Color.rgb(207,92,54));
                    hide3Button.setTextColor(Color.rgb(255,255,255));
                }





            }
        });


        hide4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hide4Button.getText().equals("Hide")){

                    cityName4.setHeight(0);
                    cityImage4.setVisibility(View.GONE);
                    cityTime4.setHeight(0);
                    hide4Button.setText("London");
                    hide4Button.setBackgroundColor(Color.rgb(67,170,139));
                    hide4Button.setTextColor(Color.rgb(255,255,255));
                }

                else{
                    cityName4.setHeight(100);
                    cityImage4.setVisibility(View.VISIBLE);
                    cityTime4.setHeight(100);
                    hide4Button.setText("Hide");
                    hide4Button.setBackgroundColor(Color.rgb(207,92,54));
                    hide4Button.setTextColor(Color.rgb(255,255,255));
                }





            }
        });

        hide5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hide5Button.getText().equals("Hide")){

                    cityName5.setHeight(0);
                    cityImage5.setVisibility(View.GONE);
                    cityTime5.setHeight(0);
                    hide5Button.setText("Paris");
                    hide5Button.setBackgroundColor(Color.rgb(67,170,139));
                    hide5Button.setTextColor(Color.rgb(255,255,255));
                }

                else{
                    cityName5.setHeight(100);
                    cityImage5.setVisibility(View.VISIBLE);
                    cityTime5.setHeight(100);
                    hide5Button.setText("Hide");
                    hide5Button.setBackgroundColor(Color.rgb(207,92,54));
                    hide5Button.setTextColor(Color.rgb(255,255,255));
                }





            }
        });





    }

}













//        Button abc = newsItem1.findViewById(R.id.shareButton);
//        abc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Context context = getApplicationContext();
//                CharSequence text = "Hello skittles!";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
//            }
//        });




