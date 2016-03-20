package com.justjava.esther.justjava;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String name= this.getIntent().getStringExtra("username");
        int age= this.getIntent().getIntExtra("age", 5);
        super.onCreate(savedInstanceState);
        setTitle("Parabéns");
        setContentView(R.layout.secondview);
        TextView welcomeTextView = (TextView) findViewById(R.id.welcome);
        welcomeTextView.setText("Parabéns " + name +"!"+"\n" +"Você já sobreviveu "+ age + " anos nesse mundo cruel");
    }
    public void displaySoo(View view) {
        ImageView changeImg = (ImageView) findViewById(R.id.img_image_view);
        changeImg.setImageResource(R.drawable.estouro);

    }
}
