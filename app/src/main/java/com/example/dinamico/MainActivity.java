package com.example.dinamico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2,text3,text4;
    LinearLayout c01,c02,c03,c04,c05;
    LinearLayout n01,n02,n03,n04,n05;
    String s;
    Button Add,blimpiar;
    //int periodo=12;
    Double monto;
    int periodo=6;
    Double amortizacion,rentamensual,taza,saldo;

    //INgenieria Economica

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.tex1);
        text2=findViewById(R.id.tex2);
        text3=findViewById(R.id.tex3);
        blimpiar=findViewById(R.id.btlimpiar);
        Add=findViewById(R.id.btmostrar);
        //text4=findViewById(R.id.);

        c01=findViewById(R.id.c1);
        c02=findViewById(R.id.c2);
        c03=findViewById(R.id.c3);
        c04=findViewById(R.id.c4);
        c05=findViewById(R.id.c5);





        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s= text2.getText().toString();
                periodo = Integer.parseInt(s);
                double monto=Double.parseDouble(text1.getText().toString());
                taza=Double.parseDouble(text3.getText().toString());
                saldo=monto;
                taza=taza/100;
                double ii;
                //double rai=Math(,);

                amortizacion=monto*( (Math.pow((1+taza),periodo)*taza)/(Math.pow((1+taza),periodo)-1));








                TextView tvdinamico001=new TextView(MainActivity.this);
                tvdinamico001.setText("0");
                    c01.addView(tvdinamico001);


                    TextView tvdinamico0001=new TextView(MainActivity.this);
                tvdinamico0001.setText("");
                    c02.addView(tvdinamico0001);

                    TextView tvdinamico0002=new TextView(MainActivity.this);
                tvdinamico0002.setText("");
                    c03.addView(tvdinamico0002);    


                    TextView tvdinamico003=new TextView(MainActivity.this);
                tvdinamico003.setText("");
                    c04.addView(tvdinamico003);



                    TextView tvdinamico004=new TextView(MainActivity.this);
                tvdinamico004.setText(""+String.format("%.2f",monto));
                    c05.addView(tvdinamico004);



                for(int i=0;i<periodo;i++) {
                    ii=saldo*taza;

                    TextView tvdinamico=new TextView(MainActivity.this);
                    tvdinamico.setText(""+(i+1));
                    c01.addView(tvdinamico);


                    TextView tvdinamico1=new TextView(MainActivity.this);
                    tvdinamico1.setText(""+String.format("%.2f",amortizacion));
                    c02.addView(tvdinamico1);

                    TextView tvdinamico2=new TextView(MainActivity.this);
                    tvdinamico2.setText(""+String.format("%.2f",ii));
                    c03.addView(tvdinamico2);

                    rentamensual=amortizacion-ii;
                    TextView tvdinamico3=new TextView(MainActivity.this);
                    tvdinamico3.setText(""+String.format("%.2f",rentamensual));
                    c04.addView(tvdinamico3);


                    saldo=saldo-rentamensual;
                    TextView tvdinamico4=new TextView(MainActivity.this);
                    saldo=Math.abs(saldo);
                    if(saldo==0.0){
                        //tvdinamico.Background(Color.YELLOW);
                        //tvdinamico.getBackground("@drawable/yellow");
                        //tvdinamico.getBackgroundTintBlendMode(#090909);
                        tvdinamico4.setText(""+String.format("%.2f",saldo));
                        c05.addView(tvdinamico4);}
                    tvdinamico4.setText(""+String.format("%.2f",saldo));
                    c05.addView(tvdinamico4);
                }
            }
        });


        blimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                text2.setText("");
                text3.setText("");
                c01.removeAllViewsInLayout();
                c02.removeAllViewsInLayout();
                c03.removeAllViewsInLayout();
                c04.removeAllViewsInLayout();
                c05.removeAllViewsInLayout();
                //01=n01;
                //c02=n02;
                //c03=n03;
                //c04=n04;
                //c05=n05;


            }
        });
    }
}












    /*a=Double.parseDouble(rmonto.toString());
        b=Double.parseDouble(rperiodo.toString());
        c=Double.parseDouble(rtaza.toString());
        c=c/100;

        //a=a*((c*Math.pow((1+c),b))/Math.pow((1+c),(b-1)));
        amort=monto*( (Math.pow((1+inter),periodo)*inter)/(Math.pow((1+inter),periodo)-1));*/





