package com.example.hp.calculatoractivity;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

public class UnitConvert extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unitconversion);
        final EditText et = (EditText) findViewById(R.id.editText);
        Button ba = (Button) findViewById(R.id.MtoCM);
        Button bb = (Button) findViewById(R.id.CMtoM);
        Button bc = (Button) findViewById(R.id.MtoKM);
        Button bd = (Button) findViewById(R.id.KMtoM);
        Button be = (Button) findViewById(R.id.CMtoKM);
        Button bf = (Button) findViewById(R.id.KMtoCM);
        Button bg = (Button) findViewById(R.id.GtoKG);
        Button bh = (Button) findViewById(R.id.KGtoG);
        Button bi = (Button) findViewById(R.id.KGtoT);
        Button bj = (Button) findViewById(R.id.TtoKG);
        Button bk = (Button) findViewById(R.id.GtoT);
        Button bl = (Button) findViewById(R.id.TtoG);
        Button br = (Button) findViewById(R.id.clearUnit);
        Button bz=(Button)findViewById(R.id.esc);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/100;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*100;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/100000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*100000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*1000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num/1000000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Double num=Double.parseDouble(a);
                        Double num1=num*1000000;
                        BigDecimal b1=BigDecimal.valueOf(num1);
                        String s2 = b1.toString();
                        et.setText(s2);
                    }
                }
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(UnitConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    et.setText("");
                }
            }
        });
        bz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(UnitConvert.this,calculator.class);
                startActivity(intent);
            }
        });
    }
}
