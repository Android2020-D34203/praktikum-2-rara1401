package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulator1.R;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button;
    EditText editText1,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.bilanganpertama);
        editText2 = findViewById(R.id.bilangankedua);
        editText3 = findViewById(R.id.operasihitung);
        button = findViewById(R.id.hitung);
        textView1 = findViewById(R.id.hasil);
    }
    public void ngitung (View view){
        double bilangan_pertama = Double.parseDouble(editText1.getText().toString());
        double bilangan_kedua = Double.parseDouble(editText2.getText().toString());
        String operasi_hitung = editText3.getText().toString();
        double textView2;

        if (operasi_hitung.equals("+")){
            textView2 = bilangan_pertama+bilangan_kedua;
            textView1.setText("Hasil = "+textView2);
        }
        else if (operasi_hitung.equals("-")){
            textView2 = bilangan_pertama-bilangan_kedua;
            textView1.setText("Hasil = "+textView2);
        }
        else if (operasi_hitung.equals("*")){
            textView2 = bilangan_pertama*bilangan_kedua;
            textView1.setText("Hasil = "+textView2);
        }
        else if (operasi_hitung.equals("/")){
            textView2 = bilangan_pertama/bilangan_kedua;
            textView1.setText("Hasil = "+textView2);
        }
        else {
            textView1.setText("Operasi salah");
        }

    }
}