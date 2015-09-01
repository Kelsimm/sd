package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InformationActivity extends Activity {
	Button buttonUser = null;
	Button buttonMyPicture = null;
	Button buttonBack = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_information);
		ExitHelper.getInstance().addActivity(this);

		buttonBack = (Button)findViewById(R.id.but_informationback);
		
		// 点击进入主页面
		buttonBack.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				Intent intent = new Intent(InformationActivity.this,
						HomeActivity.class);
				InformationActivity.this.startActivity(intent);
				InformationActivity.this.finish();
			}
		});
		buttonMyPicture.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intent = new Intent(InformationActivity.this,
						PhotoActivity.class);
				InformationActivity.this.startActivity(intent);
				InformationActivity.this.finish();
			}
		});
	}
}
