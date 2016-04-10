package com.example.tellphone;

import java.net.URI;
import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button butt;
	private EditText tv_phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		butt = (Button) findViewById(R.id.butt);
		tv_phone = (EditText) findViewById(R.id.tv_phone);
		butt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String num = tv_phone.getText().toString().trim();
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_CALL);
				Uri uri = Uri.parse("tel:"+num);
				intent.setData(uri);
				startActivity(intent);
				
			}
		});
	}
	
}
