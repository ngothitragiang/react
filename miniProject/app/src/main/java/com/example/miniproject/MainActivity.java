package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button a,b,c,d,e,f,g,h,i,k,l,m;
String txta,txtb,txtc,txtd,txte,txtf,txtg,txth,txti,txtk,txtl,strchar;
TextView str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        i = findViewById(R.id.i);
        k = findViewById(R.id.k);
        l = findViewById(R.id.l);
        m = findViewById(R.id.m);
        str = findViewById(R.id.txtcCharacter);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txta = a.getText().toString();
                strchar = str.getText().toString();
                if(txta.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    a.setText(" ");
                    str.setText("D");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtb = b.getText().toString();
                strchar = str.getText().toString();
                if(txtb.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    b.setText(" ");
                    str.setText("G");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtc = c.getText().toString();
                strchar = str.getText().toString();
                if(txtc.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    c.setText(" ");
                    str.setText("I");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtd = d.getText().toString();
                strchar = str.getText().toString();
                if(txtd.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    d.setText(" ");
                    str.setText("M");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txte = e.getText().toString();
                strchar = str.getText().toString();
                if(txte.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    e.setText(" ");
                    str.setText("L");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtf = f.getText().toString();
                strchar = str.getText().toString();
                if(txtf.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    f.setText(" ");
                    str.setText("E");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtg = g.getText().toString();
                strchar = str.getText().toString();
                if(txth.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    g.setText(" ");
                    str.setText("I");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txth = h.getText().toString();
                strchar = str.getText().toString();
                if(txth.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    h.setText(" ");
                    str.setText("");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txti = i.getText().toString();
                strchar = str.getText().toString();
                if(txti.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    h.setText(" ");
                    str.setText("K");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtk = k.getText().toString();
                strchar = str.getText().toString();
                if(txtk.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    k.setText(" ");
                    str.setText("B");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtl = l.getText().toString();
                strchar = str.getText().toString();
                if(txtl.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    l.setText(" ");
                    str.setText("C");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtl = m.getText().toString();
                strchar = str.getText().toString();
                if(txtl.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    m.setText(" ");
                    str.setText("F");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();

            }
        });

    }


}
