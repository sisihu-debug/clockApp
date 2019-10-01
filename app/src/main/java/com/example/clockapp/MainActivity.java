package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.lang.*;

public class MainActivity extends AppCompatActivity {
    //static time

//    public static void main(String[] args) {
//        while (true) {
//            try {
//                Thread.sleep(60 * 1000); //one minute
//
//                Calendar calendar = new GregorianCalendar();
//                String hour;
//                int time = calendar.get(Calendar.HOUR);
//                int m = calendar.get(Calendar.MINUTE);
//                int sec = calendar.get(Calendar.SECOND);
//
//                if (calendar.get(Calendar.AM_PM) == 0)
//                    hour = "A.M.";
//                else
//                    hour = "P.M.";
//                System.out.println(time + ":" + m + ":" + sec + " " + hour);
//                cityTime1.setText(time + ":" + m + ":" + sec + " " + hour);
//
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring all the clocks
        ConstraintLayout clock1 = findViewById(R.id.city1);
        ConstraintLayout clock2 = findViewById(R.id.city2);
        ConstraintLayout clock3 = findViewById(R.id.city3);
        ConstraintLayout clock4 = findViewById(R.id.city4);
        ConstraintLayout clock5 = findViewById(R.id.city5);


        //declaring all the cities' names

        TextView cityName1 = clock1.findViewById(R.id.cityName);
        TextView cityName2 = clock2.findViewById(R.id.cityName);
        TextView cityName3 = clock3.findViewById(R.id.cityName);
        TextView cityName4 = clock4.findViewById(R.id.cityName);
        TextView cityName5 = clock5.findViewById(R.id.cityName);

        //setting cities names

        cityName1.setText(R.string.cityNameString1);
        cityName2.setText(R.string.cityNameString2);
        cityName3.setText(R.string.cityNameString3);
        cityName4.setText(R.string.cityNameString4);
        cityName5.setText(R.string.cityNameString5);

        //declaring all city pictures
        ImageView cityImage1 = clock1.findViewById(R.id.cityImage);
        ImageView cityImage2 = clock2.findViewById(R.id.cityImage);
        ImageView cityImage3 = clock3.findViewById(R.id.cityImage);
        ImageView cityImage4 = clock4.findViewById(R.id.cityImage);
        ImageView cityImage5 = clock5.findViewById(R.id.cityImage);

        cityImage1.setImageResource(R.drawable.sydney);
        cityImage2.setImageResource(R.drawable.newyork);
        cityImage3.setImageResource(R.drawable.shanghai);
        cityImage4.setImageResource(R.drawable.london);
        cityImage5.setImageResource(R.drawable.paris);

        //declaring all the clock times

        final TextView cityTime1 = clock1.findViewById(R.id.cityTime);
        TextView cityTime2 = clock2.findViewById(R.id.cityTime);
        TextView cityTime3 = clock3.findViewById(R.id.cityTime);
        TextView cityTime4 = clock4.findViewById(R.id.cityTime);
        TextView cityTime5 = clock5.findViewById(R.id.cityTime);

        //Attempt 1 which gets point in time

            //1a) getting system time

                LocalTime time = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

            //1b) display time

                cityTime1.setText(time.format(formatter));

        //Attempt 2 real time

//            while (true) {
//                try {
//                    LocalTime time = LocalTime.now();
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//                    cityTime1.setText(time.format(formatter));
//
//                    //Thread.sleep(60 * 1000); //one minute
//
////                    Calendar calendar = new GregorianCalendar();
////                    String hour;
////                    int time = calendar.get(Calendar.HOUR);
////                    int m = calendar.get(Calendar.MINUTE);
////                    int sec = calendar.get(Calendar.SECOND);
//
////                    if (calendar.get(Calendar.AM_PM) == 0)
////                        hour = "A.M.";
////                    else
////                        hour = "P.M.";
////                    System.out.println(time + ":" + m + ":" + sec + " " + hour);
//
//
//
////                    cityTime1.setText(time.format(formatter));
//
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

            //Attempt 3: real time code changes

//        final Thread thread = new Thread() {
//
//            @Override
//            public void run() {
//                try {
//                    while (!thread.isInterrupted()) {
//                        Thread.sleep(1000);
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                // update TextView here!
//                                LocalTime time = LocalTime.now();
//                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//                                cityTime1.setText(time.format(formatter));
//                            }
//                        });
//                    }
//                } catch (InterruptedException e) {
//                }
//            }
//        };
//
//        thread.start();










        //setting button notification

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


    }
}
