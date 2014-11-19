package com.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class WriteFile {
	public static void main(String[] args) {
		Path source = Paths.get("D:/app-security/Devday-java");
		try {
			for (int i = 1; i <= 30; i++) {
				Path target = Paths.get("D:/DevDaySVN1");
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
