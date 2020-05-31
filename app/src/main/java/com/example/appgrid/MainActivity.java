package com.example.appgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtRaca;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtRaca = findViewById(R.id.txtRaca);
        gridView = findViewById(R.id.grid);

        int[] lista = new int[] {
                R.drawable.sample_0,R.drawable.sample_1,R.drawable.sample_2,
                R.drawable.sample_3,R.drawable.sample_4,R.drawable.sample_5,
                R.drawable.sample_6,R.drawable.sample_7,R.drawable.sample_8,
                R.drawable.sample_9,R.drawable.sample_10,R.drawable.sample_11,
                R.drawable.sample_12,R.drawable.sample_13,R.drawable.sample_14,
                R.drawable.sample_15,R.drawable.sample_16,R.drawable.sample_17,
        };

        gridView.setAdapter(new Adaptador(this,lista));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        txtRaca.setText("Raça: Buldog");
                        break;
                    case 1:
                        txtRaca.setText("Raça: Poodle");
                        break;
                    case 2:
                        txtRaca.setText("Raça: LabradorRetriever");
                        break;
                    case 3:
                        txtRaca.setText("Raça: Beagle");
                        break;
                    case 4:
                        txtRaca.setText("Raça: Chihuahua");
                        break;
                    case 5:
                        txtRaca.setText("Raça: Maltes");
                        break;
                    case 6:
                        txtRaca.setText("Raça: Pastor");
                        break;
                    case 7:
                        txtRaca.setText("Raça: Pug");
                        break;
                    case 8:
                        txtRaca.setText("Raça: Husky Siberiano");
                        break;
                    case 9:
                        txtRaca.setText("Raça: Shi tzu");
                        break;
                    default:
                        txtRaca.setText("Sem Raça definida!");
                }
            }
        });
    }
}
