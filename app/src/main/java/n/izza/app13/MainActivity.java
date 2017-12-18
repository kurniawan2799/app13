package n.izza.app13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText edtjari, edttinggi;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DecimalFormat df = new DecimalFormat("3.14");

        getSupportActionBar().setTitle("Hitung Luas Permukaan Tabung");

        edtjari = (EditText) findViewById(R.id.edt_jari);
        edttinggi = (EditText) findViewById(R.id.edt_tinggi);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jari = edtjari.getText().toString().trim();
                String tinggi = edttinggi.getText().toString().trim();

                double j = Double.parseDouble(jari);
                double t = Double.parseDouble(tinggi);
                double luas = 2 * 3.14 * j * t;

                txtLuas.setText("Luas : " + luas);
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtjari.length() == 0 || edttinggi.length() == 0){
                    Toast.makeText(MainActivity.this,"DATA WAJIB DI ISI", Toast.LENGTH_LONG).show();
                }
                else {
                    btnHitung.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String jari = edtjari.getText().toString().trim();
                            String tinggi = edttinggi.getText().toString().trim();

                            double j = Double.parseDouble(jari);
                            double t = Double.parseDouble(tinggi);
                            double luas = 2 * 3.14 * j * t;

                            txtLuas.setText("Luas : " + luas);
                        }
                    });
                }
            }
        });
    }

}
