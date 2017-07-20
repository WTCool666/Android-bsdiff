package com.example.serverpatch;

import java.io.File;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getPatchAPK();
	}

	private void getPatchAPK() {
		 if (Environment.getExternalStorageState() != null) {
			 File sdFile=Environment.getExternalStorageDirectory();
			 String sdString=sdFile.getAbsolutePath();
			 PatchAPK.patchAPK(sdString+"/old.apk", sdString+"/new.apk", sdString+"/patch.patch");
		 }
		
	}
}
