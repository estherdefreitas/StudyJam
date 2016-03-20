package com.justjava.esther.justjava;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    int quantity = 5;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Sobre você");
    }

    /**
     * This metod displays the given quantity value on the screen.
     */
    public String saveName(View view) {
        EditText text = (EditText)findViewById(R.id.name_edit_view);
        String name = text.getText().toString();
        TextView nameEditView = (TextView) findViewById(
                R.id.name_edit_view);
        nameEditView.setText(name);
        return name;

    }

    public void increment(View view) {
        quantity = quantity + 1;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);

    }

    public void decrement(View view) {
        if(quantity>5) {
            quantity = quantity - 1;
        }
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }


    public void startSecondActivity(View view) {
        Intent secondActivity = new Intent(this, SecondActivity.class);
        EditText text = (EditText)findViewById(R.id.name_edit_view);
        secondActivity.putExtra("username", saveName(text));
        secondActivity.putExtra("age", quantity);
        startActivity(secondActivity);
    }

}