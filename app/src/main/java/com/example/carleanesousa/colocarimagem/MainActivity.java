package com.example.carleanesousa.colocarimagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imagemMario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagemMario = (ImageView) findViewById(R.id.images);

    }
    public  void onClick(View v){
        Toast.makeText(this,"Mario", Toast.LENGTH_LONG).show();
    }
}
