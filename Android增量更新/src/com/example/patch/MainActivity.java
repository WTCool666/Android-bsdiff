package com.example.patch;

import java.io.File;

import com.example.androidpatch.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		getPatchAPK();
	}

	private void getPatchAPK() {
		 if (Environment.getExternalStorageState() != null) {
			 File sdFile=Environment.getExternalStorageDirectory();
			 String sdString=sdFile.getAbsolutePath();
			 hebingAPK.hbAPK(sdString+"/old.apk", sdString+"/new2.apk", sdString+"/patch.patch");
		 }
		
	}
}
