package com.example.cafezinhu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int cont= 0;
    int preco =0;
    String tipo = "Café preto";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();

        Button button = findViewById(R.id.imprimir);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.setType("*/*");
                String[] email ={"cafe.do.ifc.concordia@gmail.com"};
                sendEmail.putExtra(Intent.EXTRA_EMAIL, email);
                sendEmail.putExtra(Intent.EXTRA_TEXT, "Olá , gostaria de um café!");
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Tipo:"+tipo+".Quantidade:"+cont);

                TextView impresso = findViewById(R.id.impresso);
                impresso.setText("n funciono ainda");

                if(sendEmail.resolveActivity(getPackageManager()) != null){
                    startActivity(sendEmail);

                    impresso.setText("sucesso!");
                }
            }
        });
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
        tipo = "Café preto";
        custo = 3 ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op2(View view){
        tipo = "Café expresso";
        custo = 4 ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op3(View view){
        tipo = "Mocha";
        custo = 6  ;
        preco = custo * cont;
        TextView total = findViewById(R.id.total);
        total.setText("Preço total: " + preco );
        TextView atual = findViewById(R.id.atual);
        atual.setText("Preço do café atual: " + custo );
        mensagem();
    }
    public void op4(View view){
        tipo = "Café com leite";
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