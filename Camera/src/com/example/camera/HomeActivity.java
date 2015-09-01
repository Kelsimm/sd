package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends Activity {
	Button buttonLogin = null;	//登录按钮
	Button buttonPhoto = null;	//拍照按钮
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		ExitHelper.getInstance().addActivity(this);
		
		buttonLogin = (Button)findViewById(R.id.but_login1);
		buttonPhoto = (Button)findViewById(R.id.but_photo);
		
		/**
		 * 为登录按钮添加事件，点击之后跳转到LoginActivity
		 */
		buttonLogin.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
				HomeActivity.this.startActivity(intent);
			}
		});
		
		/**
		 * 为拍照按钮添加事件，点击之后跳转到CameraActivity
		 */
		buttonPhoto.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(HomeActivity.this, CameraActivity.class);
				HomeActivity.this.startActivity(intent);
				HomeActivity.this.finish();
			}
		});
		
		
	}
}
