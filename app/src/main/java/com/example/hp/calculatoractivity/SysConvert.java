package com.example.hp.calculatoractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

public class SysConvert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sys);
        final EditText et = (EditText) findViewById(R.id.editTextsys);
        Button ba = (Button) findViewById(R.id.TwotoEight);
        Button bb = (Button) findViewById(R.id.EighttoTwo);
        Button bc = (Button) findViewById(R.id.TwotoTen);
        Button bd = (Button) findViewById(R.id.TentoTwo);
        Button be = (Button) findViewById(R.id.TwotoSixteen);
        Button bf = (Button) findViewById(R.id.SixteentoTwo);
        Button bg = (Button) findViewById(R.id.EighttoTen);
        Button bh = (Button) findViewById(R.id.TentoEight);
        Button bi = (Button) findViewById(R.id.EighttoSixteen);
        Button bj = (Button) findViewById(R.id.SixteentoEight);
        Button bk = (Button) findViewById(R.id.TentoSixteen);
        Button bl = (Button) findViewById(R.id.SixteentoTen);
        Button br = (Button) findViewById(R.id.clearSys);
        Button bz=(Button)findViewById(R.id.escsys);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toOctalString(Integer.parseInt(a,2));
                        et.setText(s);
                    }
                }
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toBinaryString(Integer.parseInt(a,8));
                        et.setText(s);
                    }
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.valueOf(a,2).toString();
                        et.setText(s);
                    }
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toBinaryString(Integer.parseInt(a,10));
                        et.setText(s);
                    }
                }
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toHexString(Integer.parseInt(a,2));
                        et.setText(s);
                    }
                }
            }
        });
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.'&&n!='a'&&n!='b'&&n!='c'&&n!='d'&&n!='e'&&n!='f') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toBinaryString(Integer.parseInt(a,16));
                        et.setText(s);
                    }
                }
            }
        });
        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.valueOf(a,8).toString();
                        et.setText(s);
                    }
                }
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toOctalString(Integer.parseInt(a,10));
                        et.setText(s);
                    }
                }
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toHexString(Integer.parseInt(a,8));
                        et.setText(s);
                    }
                }
            }
        });
        bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.'&&n!='a'&&n!='b'&&n!='c'&&n!='d'&&n!='e'&&n!='f') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toOctalString(Integer.parseInt(a,16));
                        et.setText(s);
                    }
                }
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.toHexString(Integer.parseInt(a,10));
                        et.setText(s);
                    }
                }
            }
        });
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i,j=0;
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9'&&n!='.'&&n!='a'&&n!='b'&&n!='c'&&n!='d'&&n!='e'&&n!='f') {
                            j=1;
                            break;             //运算符则中断
                        }
                    }
                    if(j==1){
                        Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String s = Integer.valueOf(a,16).toString();
                        et.setText(s);
                    }
                }
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=et.getText().toString();
                if (a.equals("")) {
                    Toast.makeText(SysConvert.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    et.setText("");
                }
            }
        });
        bz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(SysConvert.this,calculator.class);
                startActivity(intent);
            }
        });
    }
}
