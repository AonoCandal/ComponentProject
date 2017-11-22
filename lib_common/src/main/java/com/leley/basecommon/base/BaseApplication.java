package com.leley.basecommon.base;

import android.app.Application;

import com.leley.basecommon.utils.Utils;

/**
 * Created by Aono on 2017/11/22.
 * 要想使用BaseApplication，必须在组件中实现自己的Application，并且继承BaseApplication；
 * 组件中实现的Application必须在debug包中的AndroidManifest.xml中注册，否则无法使用；
 * 组件的Application需置于java/debug文件夹中，不得放于主代码；
 * 组件中获取Context的方法必须为:Utils.getContext()，不允许其他写法；
 */

public class BaseApplication extends Application {

	private static BaseApplication mInstance;

	public static BaseApplication getinstance() {
		return mInstance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;
		Utils.init(this);
	}
}
