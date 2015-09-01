package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterActivity extends Activity {
	Button buttonBack = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		ExitHelper.getInstance().addActivity(this);
		buttonBack = (Button)findViewById(R.id.but_registerback);
		// 点击进入登录的页面
		buttonBack.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				Intent intent = new Intent(RegisterActivity.this,
						LoginActivity.class);
				RegisterActivity.this.startActivity(intent);
				RegisterActivity.this.finish();
			}
		});
	}
}
