package com.example.flagii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznikZłych = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void zlaOdpowiedz(View view)
    {
        Toast.makeText(this, R.string.bledne, Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznikZłych++;
        if (licznikZłych == 4);{
            textView.setText(R.string.podsumowanie);

        }
    }
}