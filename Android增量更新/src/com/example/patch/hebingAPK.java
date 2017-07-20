package com.example.patch;

public class hebingAPK {
	public native static int hbAPK(String oldFile,String newFile,String patchFile);
	static{
		System.loadLibrary("client_patch");
	}
}
