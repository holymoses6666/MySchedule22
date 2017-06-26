package com.rodion.myschedule2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

        String[] name = { "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
                "Костя", "Игорь","q","w","e","r" };
        String[] position = { "Программер", "Бухгалтер", "Программер",
                "Программер", "Бухгалтер", "Директор", "Программер", "Охранник","q","w","e","r" };
        int salary[] = { 13000, 10000, 13000, 13000, 10000, 15000, 13000, 8000 , 1, 2, 3, 4};

        int[] colors = new int[2];
        Button CreatePunktBtn;

        /** Called when the activity is first created. */
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                colors[0] = Color.parseColor("#559966CC");
                colors[1] = Color.parseColor("#55336699");

                final LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

                final LayoutInflater ltInflater = getLayoutInflater();

                CreatePunktBtn = (Button) findViewById(R.id.CreatePunktBtn);

                CreatePunktBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                View item = ltInflater.inflate(R.layout.item, linLayout, false);
                                item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;
                                item.setBackgroundColor(Color.parseColor("#55336699"));
                                linLayout.addView(item);

                        }
                });/*
                for (int i = 0; i < name.length; i++) {
                        Log.d("myLogs", "i = " + i);
                        View item = ltInflater.inflate(R.layout.item, linLayout, false);
                        TextView tvName = (TextView) item.findViewById(R.id.tvName);
                        tvName.setText(name[i]);
                        TextView tvPosition = (TextView) item.findViewById(R.id.tvPosition);
                        tvPosition.setText("Должность: " + position[i]);
                        TextView tvSalary = (TextView) item.findViewById(R.id.tvSalary);
                        tvSalary.setText("Оклад: " + String.valueOf(salary[i]));
                        item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
                        item.setBackgroundColor(colors[i % 2]);
                        linLayout.addView(item);
                }*/
        }
}