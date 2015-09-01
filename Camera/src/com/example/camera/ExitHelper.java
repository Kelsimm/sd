package com.example.camera;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;

public class ExitHelper extends Application {
	private List<Activity> activityList = new LinkedList<Activity>();
	private static ExitHelper instance;

	private ExitHelper() {
	}

	// ����ģʽ�л�ȡΨһ��ExitApplication ʵ��
	public static ExitHelper getInstance() {
		if (null == instance) {
			instance = new ExitHelper();
		}
		return instance;
	}

	// ���Activity ��������
	public void addActivity(Activity activity) {
		activityList.add(activity);
	}

	// ��������Activity ��finish
	public void exit() {
		for (Activity activity : activityList) {
			activity.finish();
		}
		System.exit(0);
	}
}
