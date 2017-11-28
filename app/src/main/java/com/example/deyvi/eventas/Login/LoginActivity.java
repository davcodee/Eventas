package com.example.deyvi.eventas.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deyvi.eventas.ContainerActivity;
import com.example.deyvi.eventas.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

	/*Button Login*/
	private Button      btnLogin;
	/*EditTexEmail*/
	private EditText    edtEmail;
	/*EditTextPasswot*/
	private EditText    edtPass;
	private TextView    tvCreateAccount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		/*Buscamos por id nuestros button*/
		btnLogin = (Button) findViewById(R.id.btnLogin);

		/*Buscamos nuestro edit Text de email y pass*/
		edtEmail = (EditText)findViewById(R.id.edtEmail);
		edtPass  = (EditText)findViewById(R.id.edtPassword);

		/*Buscamos nuestro Edit TExt CreateAccount*/
		tvCreateAccount = (TextView)findViewById(R.id.edtCreateAccount);

		/*Agregamos los listeners*/
		btnLogin.setOnClickListener(this);
		tvCreateAccount.setOnClickListener(this);

	}

	/*
	* Método que se ejecuta al dar click en el button o  el EditText CreateAccount
	* */

	@Override
	public void onClick(View view) {

		switch (view.getId()){
			case R.id.btnLogin:
				if (getText()){
					startActivity(new Intent(LoginActivity.this, ContainerActivity.class));
				}
				break;
			case R.id.edtCreateAccount:
				Toast.makeText(this, "Disabled", Toast.LENGTH_SHORT).show();
				break;
		}
	}

	/*Método que estrae el texto de los campos de nuestros
	*editText y valida que el usuario sea correcto.
	* */
	private boolean getText(){
		String email    = edtEmail.getText().toString().trim();
		String password = edtPass.getText().toString().trim();


		if (email.equals( "a_esperanza@gmail.com") && password.equals("123")){
				return true;
		}if(email.equals("tdamagica@gmail.com" ) && password.equals("123")){
				return true;
		}if(email.equals("tiendita@gmail.com") && password.equals("123")){
				return true;
		}if(email.equals("sumprema@gmail.com") && password.equals("123")){
				return true;
		}else {
			Toast.makeText(this, "Usuario Invalido", Toast.LENGTH_SHORT).show();
			return false;
		}

	}




}
