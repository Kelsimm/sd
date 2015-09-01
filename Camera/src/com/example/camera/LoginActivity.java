package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	TextView textRegister=null;	//新用户注册
	TextView textForgetPassword=null;	//忘记密码
	Button buttonLogin = null;	//登录按钮
	EditText editName=null;	//用户名输入框
	EditText editPassword = null;	//密码输入框
	
	Button buttonBack = null;		//返回按钮，实际应该在actionBar上，目前还没研究，暂时用返回按钮代替
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ExitHelper.getInstance().addActivity(this);

		buttonLogin = (Button) findViewById(R.id.but_login2);
		editName = (EditText) findViewById(R.id.edit_name);
		editPassword = (EditText) findViewById(R.id.edit_password);
		textRegister = (TextView)findViewById(R.id.text_register);
		textForgetPassword = (TextView)findViewById(R.id.text_forgetpassword);
		buttonBack = (Button)findViewById(R.id.but_loginback);
		/**
		 * 登录按钮，作用：点击之后验证身份信息，验证成功跳回HomeActivity
		 * 							  验证失败则提示密码或账号错误
		 */
		buttonLogin.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				System.out.println(editName.getText().toString()+"-------------"+editPassword.getText().toString());;
				if(editName.getText().toString()=="abc" && editPassword.getText().toString()=="123456"){
					Intent intent = new Intent();
					intent.setClass(LoginActivity.this, HomeActivity.class);
					LoginActivity.this.startActivity(intent);
					LoginActivity.this.finish();
				}else if(editName.getText().toString()!="abc" || editPassword.getText().toString()!="123456"){//验证失败，提示"账号或密码错误"
					Toast toast;
					toast = Toast.makeText(getApplicationContext(), "账号或密码错误", Toast.LENGTH_LONG);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
				}
			}
		});
		
		
		//点击进入主页面
		buttonBack.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
				LoginActivity.this.startActivity(intent);
				LoginActivity.this.finish();
			}
		});
		
		textRegister.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
				LoginActivity.this.startActivity(intent);
				LoginActivity.this.finish();
			}
		});
	}
}
