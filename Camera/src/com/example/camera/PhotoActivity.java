package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PhotoActivity extends Activity {
	Button buttonBack = null;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo);
		ExitHelper.getInstance().addActivity(this);
		
		buttonBack = (Button)findViewById(R.id.but_photoback);
		
		//点击进入拍照的页面
		buttonBack.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intent = new Intent(PhotoActivity.this,CameraActivity.class);
				PhotoActivity.this.startActivity(intent);
				PhotoActivity.this.finish();
			}
		});
	}
}
