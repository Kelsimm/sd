package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		ExitHelper.getInstance().addActivity(this);

		new Handler().postDelayed(new Runnable() {
			public void run() {
				Intent intent = new Intent(StartActivity.this,HomeActivity.class);
				StartActivity.this.startActivity(intent);
				StartActivity.this.finish();
			}
		}, 2000);
	}

}
