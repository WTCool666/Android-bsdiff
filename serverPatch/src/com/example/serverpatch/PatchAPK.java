package com.example.serverpatch;

public class PatchAPK {
	public native static int patchAPK(String oldFile,String newFile,String patchFile);
	static{
		System.loadLibrary("server_patch");
	}
}
