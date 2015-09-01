package com.example.camera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class CameraActivity extends Activity {
	SeekBar barLight = null;
	ImageView imgPicture = null;
	Button butTakePhoto = null;
	Button butBack = null;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera); 
		ExitHelper.getInstance().addActivity(this);
		
		imgPicture = (ImageView)findViewById(R.id.image_picture);
		butTakePhoto = (Button)findViewById(R.id.but_take_photo);
		butBack = (Button)findViewById(R.id.but_back);
		
		//如何实现用滚动条调整屏幕亮度？？
		//butTakePhoto的事件在后期拍照功能中实现
		imgPicture.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intent = new Intent(CameraActivity.this,PhotoActivity.class);
				CameraActivity.this.startActivity(intent);
				CameraActivity.this.finish();
			}
		});
		
		butBack.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent intent = new Intent(CameraActivity.this,HomeActivity.class);
				CameraActivity.this.startActivity(intent);
				CameraActivity.this.finish();
			}
		});
		
		
	}
}
