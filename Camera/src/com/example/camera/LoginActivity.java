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
	
	TextView textRegister=null;	//���û�ע��
	TextView textForgetPassword=null;	//��������
	Button buttonLogin = null;	//��¼��ť
	EditText editName=null;	//�û��������
	EditText editPassword = null;	//���������
	
	Button buttonBack = null;		//���ذ�ť��ʵ��Ӧ����actionBar�ϣ�Ŀǰ��û�о�����ʱ�÷��ذ�ť����
	
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
		 * ��¼��ť�����ã����֮����֤�����Ϣ����֤�ɹ�����HomeActivity
		 * 							  ��֤ʧ������ʾ������˺Ŵ���
		 */
		buttonLogin.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				System.out.println(editName.getText().toString()+"-------------"+editPassword.getText().toString());;
				if(editName.getText().toString()=="abc" && editPassword.getText().toString()=="123456"){
					Intent intent = new Intent();
					intent.setClass(LoginActivity.this, HomeActivity.class);
					LoginActivity.this.startActivity(intent);
					LoginActivity.this.finish();
				}else if(editName.getText().toString()!="abc" || editPassword.getText().toString()!="123456"){//��֤ʧ�ܣ���ʾ"�˺Ż��������"
					Toast toast;
					toast = Toast.makeText(getApplicationContext(), "�˺Ż��������", Toast.LENGTH_LONG);
					toast.setGravity(Gravity.CENTER, 0, 0);
					toast.show();
				}
			}
		});
		
		
		//���������ҳ��
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
