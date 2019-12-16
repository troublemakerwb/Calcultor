package com.example.hp.calculatoractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class calculator extends AppCompatActivity {

    private StringBuilder str=new StringBuilder();//运算式

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final TextView answer=(TextView)findViewById(R.id.input);
        final TextView result=(TextView)findViewById(R.id.result);
        Button b0=(Button)findViewById(R.id.zero);
        Button b1=(Button)findViewById(R.id.one);
        Button b2=(Button)findViewById(R.id.two);
        Button b3=(Button)findViewById(R.id.three);
        Button b4=(Button)findViewById(R.id.four);
        Button b5=(Button)findViewById(R.id.five);
        Button b6=(Button)findViewById(R.id.six);
        Button b7=(Button)findViewById(R.id.seven);
        Button b8=(Button)findViewById(R.id.eight);
        Button b9=(Button)findViewById(R.id.nine);
        Button b_clear=(Button)findViewById(R.id.clear);
        Button b_del=(Button)findViewById(R.id.delete);
        Button b_e=(Button)findViewById(R.id.e);
        Button b_divide=(Button)findViewById(R.id.divide);
        Button b_mul=(Button)findViewById(R.id.multiply);
        Button b_sub=(Button)findViewById(R.id.subtract);
        Button b_add=(Button)findViewById(R.id.add);
        Button b_point=(Button)findViewById(R.id.point);
        Button b_left=(Button)findViewById(R.id.left);
        Button b_right=(Button)findViewById(R.id.right);
        Button b_sin=(Button)findViewById(R.id.sin);
        Button b_cos=(Button)findViewById(R.id.cos);
        Button b_tan=(Button)findViewById(R.id.tan);
        Button b_unit=(Button)findViewById(R.id.unit);
        Button b_sys=(Button)findViewById(R.id.sys);
        Button b_p2=(Button)findViewById(R.id.power2);
        Button b_p3=(Button)findViewById(R.id.power3);
        Button b_i2=(Button)findViewById(R.id.index2);
        Button b_i10=(Button)findViewById(R.id.index10);
        Button b_ip=(Button)findViewById(R.id.IP);
        Button b_s2=(Button)findViewById(R.id.sign2);
        Button b_s3=(Button)findViewById(R.id.sign3);
        Button b_sn=(Button)findViewById(R.id.signn);
        Button b_pi=(Button)findViewById(R.id.PI);
        Button b_ln=(Button)findViewById(R.id.ln);
        Button b_rand=(Button)findViewById(R.id.rand);
        Button b_date=(Button)findViewById(R.id.date);
        final Button b_equal=(Button)findViewById(R.id.equal);
        result.setCursorVisible(true);
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("0");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("0");
                        result.setText(str);
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("1");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("1");
                        result.setText(str);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("2");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("2");
                        result.setText(str);
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("3");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("3");
                        result.setText(str);
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("4");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("4");
                        result.setText(str);
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("5");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("5");
                        result.setText(str);
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("6");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("6");
                        result.setText(str);
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("7");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("7");
                        result.setText(str);
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("8");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("8");
                        result.setText(str);
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("9");
                    result.setText(str);
                }
                else{
                    char t=a.charAt(i-1);
                    if(t!=')'){
                        str.append("9");
                        result.setText(str);
                    }
                }
            }
        });
        b_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                str.delete(0,str.length());
                //calculate.clear();
                result.setText("");
                answer.setText("");
            }
        });
        b_del.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(str.length()==0) {
                    Toast.makeText(calculator.this, "This is not allowed", Toast.LENGTH_SHORT).show();
                }
                else {
                    str.deleteCharAt(str.length() - 1);
                    result.setText(str);
                }
            }
        });
        b_point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if (a.equals("")) {
                    str.append("0");
                    str.append(".");
                    result.setText(str);
                }
                else{
                    char t;
                    int i,j=0;
                    i=a.length();
                    t=a.charAt(i-1);
                    char n;
                    for(i=a.length();i>0;i--){
                        n=a.charAt(i-1);
                        //if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/')
                        //if(n=='.'){
                        if (n!='0'&&n!='1'&&n!='2'&&n!='3'&&n!='4'&&n!='5'&&n!='6'&&n!='7'&&n!='8'&&n!='9') {
                            if (n == '.') {
                                j = 1;
                            }
                            break;             //运算符则中断
                        }
                    }
                    //else if(t=='.'||t=='+'||t=='-'||t=='X'||t=='/'){
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        if(i==0){
                            str.append(".");
                            result.setText(str);
                        }
                        else{
                            if(j!=1){
                                str.append(".");
                                result.setText(str);
                            }
                            else
                                Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b_left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if (a.equals("")) {
                    str.append("(");
                    result.setText(str);
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'||t==')'||t=='.'){
                         Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        str.append("(");
                        result.setText(str);
                    }
                }
            }
        });
        b_right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if (a.equals("")) {
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    int j=0;
                    char t=a.charAt(i-1);
                    char n;
                    for(i=a.length();i>0;i--) {
                        n = a.charAt(i - 1);
                        if (n == '(') {
                            j++;
                        }
                    }
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        if(j>0){
                            str.append(")");
                            result.setText(str);
                            j--;
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_pi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("3.141592653589793");
                    result.setText(str);
                }
                else{
                    Toast.makeText(calculator.this,"Please clear the interface",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b_e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append("2.718281828459045");
                    result.setText(str);
                }
                else{
                    Toast.makeText(calculator.this,"Please clear the interface",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b_rand.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                if(a.equals("")){
                    str.append(Math.random());
                    result.setText(str);
                }
                else{
                    str.delete(0,str.length());
                    str.append(Math.random());
                    result.setText(str);
                }
            }
        });
        b_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'||t==')'){
                        str.append("+");
                        result.setText(str);
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                char t=a.charAt(i-1);
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'||t==')'){
                        str.append("-");
                        result.setText(str);
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                char t=a.charAt(i-1);
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'||t==')'){
                        str.append("*");
                        result.setText(str);
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                int i=a.length();
                char t=a.charAt(i-1);
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'||t==')'){
                        str.append("/");
                        result.setText(str);
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_sin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            Double num = Double.parseDouble(a);
                            Double snum = sin(num);
                            String s2 = Double.toString(snum);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_cos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            Double num = Double.parseDouble(a);
                            Double snum = cos(num);
                            String s2 = Double.toString(snum);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_tan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            Double num = Double.parseDouble(a);
                            Double snum = tan(num);
                            String s2 = Double.toString(snum);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_p2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            BigDecimal b0=BigDecimal.valueOf(num);
                            //Double snum =num*num*num;
                            BigDecimal b1=b0.multiply(b0);
                            String s2 = b1.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_p3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            BigDecimal b0=BigDecimal.valueOf(num);
                            //Double snum =num*num*num;
                            BigDecimal b1=b0.multiply(b0);
                            BigDecimal b2=b1.multiply(b0);
                            String s2 = b2.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            //Log.d("TAG","执行到这里了");
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_i2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9'&&t!='.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num=Double.parseDouble(a);
                            //Integer num = Integer.parseInt(a);
                            //BigDecimal b0=BigDecimal.valueOf(num);
                            //Double snum =num*num*num;
                            //BigDecimal b1=b0.pow(b0);
                            //BigDecimal b2=b1.multiply(b1);
                            Double num1=Math.pow(2,num);
                            String s2 = Double.toString(num1);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_i10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9'&&t!='.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num=Double.parseDouble(a);
                            //Integer num = Integer.parseInt(a);
                            //BigDecimal b0=BigDecimal.valueOf(num);
                            //Double snum =num*num*num;
                            //BigDecimal b1=b0.pow(b0);
                            //BigDecimal b2=b1.multiply(b1);
                            Double num1=Math.pow(10,num);
                            String s2 = Double.toString(num1);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_ip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9'&&t!='.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num=Double.parseDouble(a);
                            //Integer num = Integer.parseInt(a);
                            //BigDecimal b0=BigDecimal.valueOf(num);
                            //Double snum =num*num*num;
                            //BigDecimal b1=b0.pow(b0);
                            //BigDecimal b2=b1.multiply(b1);
                            Double num1=Math.pow(num,num);
                            String s2 = Double.toString(num1);
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_s2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            //Double snum =num*num*num;
                            Double num1=Math.sqrt(num);
                            BigDecimal b1=BigDecimal.valueOf(num1);
                            String s2 = b1.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_s3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            //Double snum =num*num*num;
                            Double num1=Math.cbrt(num);
                            BigDecimal b1=BigDecimal.valueOf(num1);
                            String s2 = b1.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_sn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            //Double snum =num*num*num;
                            Double num0=1/num;
                            Double num1=Math.pow(num,num0);
                            BigDecimal b1=BigDecimal.valueOf(num1);
                            String s2 = b1.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_ln.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    int i=a.length();
                    char t=a.charAt(i-1);
                    int j=0;
                    if(t=='0'||t=='1'||t=='2'||t=='3'||t=='4'||t=='5'||t=='6'||t=='7'||t=='8'||t=='9'){
                        for(i=a.length();i>0;i--) {
                            t = a.charAt(i - 1);
                            if (t != '0' && t != '1' && t != '2' && t != '3' && t != '4' && t != '5' && t != '6' && t != '7' && t != '8' && t != '9' && t != '.') {
                                j=1;
                            }
                        }
                        if(j==0) {
                            //String s1 = a.substring(0, a.length());
                            Double num = Double.parseDouble(a);
                            //Double snum =num*num*num;
                            Double num1=Math.log(num);
                            BigDecimal b1=BigDecimal.valueOf(num1);
                            String s2 = b1.toString();
                            str.delete(0, str.length());
                            str.append(s2);
                            result.setText(s2);
                        }
                        else
                            Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b_unit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(calculator.this,UnitConvert.class);
                startActivity(intent);
            }
        });
        b_sys.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(calculator.this,SysConvert.class);
                startActivity(intent);
            }
        });
        b_date.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(calculator.this,date.class);
                startActivity(intent);
            }
        });
        b_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String a=str.toString();
                if(a.equals("")){
                    Toast.makeText(calculator.this,"This is not allowed",Toast.LENGTH_SHORT).show();
                }
                else{
                    PostfixConversion res = new PostfixConversion();
                    StringBuffer stringBuffer;
                    stringBuffer = res.toPostfixString(str.toString());
                    Double result = res.toValue(stringBuffer);
                    BigDecimal result1=BigDecimal.valueOf(result);
                    Double result2=result1.doubleValue();
                    answer.setText("" + result2);
                    str.delete(0, str.length());
                    str = new StringBuilder();
                    str.append("" + result2);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id=menuItem.getItemId();
        switch (id){
            case R.id.help:
                Toast.makeText(this,"help",Toast.LENGTH_LONG).show();
                break;
            case R.id.exit:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
