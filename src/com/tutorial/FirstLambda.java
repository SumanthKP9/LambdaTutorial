package com.tutorial;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
	
	public static void main(String[] args) {
		FileFilter fileFilter=new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".xls");
			}
		};
		
		File file=new File("E:/data");
		File [] files=file.listFiles(fileFilter);
		for (File fileName : files) {
			System.out.println(fileName);
		}
	}

}
