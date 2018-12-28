package com.example.tercerpractica;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText texto1;
	private EditText texto2;
	private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        texto1=(EditText)findViewById(R.id.editText1);
        texto2=(EditText)findViewById(R.id.editText2);
        tv3=(TextView)findViewById(R.id.textView2);
    }
    public void concatenar(View view){
    	String texto1_espera1=texto1.getText().toString();
    	String texto2_espera2= texto2.getText().toString();
    	tv3.setText(texto1_espera1+","+texto2_espera2);
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
