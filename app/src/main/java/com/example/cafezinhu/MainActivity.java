package com.example.cafezinhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cont= 0;
    int preco =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();

        button button = findViewById(R.id.imprime);

        button.setOnClickListener(new View.OnClickListener());
    }
    int custo ;
    public void mais(View view){
        TextView quantidade = findViewById(R.id.quant);
        cont ++;
        preco = custo * cont;
        quantidade.setText("" + cont);
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco);
        mensagem();
    }
    public void menos(View view) {
        if (cont > 0){
            TextView quant = findViewById(R.id.quant);
            cont--;
            preco = custo * cont;
            quant.setText("" + cont);
            TextView total = findViewById(R.id.total);
            total.setText("Preço total: " + preco);
            mensagem();
        }else{

        }
    }
    public void op1(View view){
        custo = 3 ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op2(View view){
        custo = 4 ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op3(View view){
        custo = 6  ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op4(View view){
        custo = 5 ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    private void start(){
        RadioButton box = findViewById(R.id.c1);
        if (box.isChecked())
        {
            custo = 3;
            TextView atual = findViewById(R.id.atual);
            atual.setText("Preço do café atual: " + custo );
            mensagem();
        }
    }
    public void mensagem(){
        TextView msg = findViewById(R.id.msg);
        msg.setText("O café atual custa R$:" + custo + "\nA quantia desejadas é :" + cont + "\nTotalizando R$:" + preco);
    }

}