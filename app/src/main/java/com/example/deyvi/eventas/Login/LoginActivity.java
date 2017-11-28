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
				startActivity(new Intent(LoginActivity.this, ContainerActivity.class));
				break;
			case R.id.edtCreateAccount:
				Toast.makeText(this, "Disabled", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}
