package de.tum.in.ase.eist;

import java.nio.file.Files;
import java.nio.file.Path;

public final class ExamSystem {

	private ExamSystem() {
	}

	// TODO 5: Change signature, make use of the bridge pattern
	public static String hashFile(String document, Hashing hashing) {
		return hashing.hashDocument(document);
	}

	public static void main(String[] args) {
		String file1 = readFile("exams/short_exam.txt");
		String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

		// TODO 6: Change SimpleHash to PreviewHashing
		HashFunction simpleHash = new SimpleHashAlgorithm();
		Hashing previewHashing =new PreviewHashing((SimpleHashAlgorithm) simpleHash);

		System.out.println(hashFile(file1, previewHashing));
		try {
			System.out.println(hashFile(file2, previewHashing));
			throw new IllegalStateException("Hashing this file with preview hashing should not work!");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// TODO 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing
		HashFunction cryptoSecureHash = new CryptoSecureHashAlgorithm();
		Hashing enterpriseHashing = new EnterpriseHashing((CryptoSecureHashAlgorithm) cryptoSecureHash);

		System.out.println(hashFile(file1, enterpriseHashing));
		System.out.println(hashFile(file2, enterpriseHashing));
	}

	public static String readFile(String filepath) {
		Path path = Path.of(filepath);
		// TODO 4: Return the content of the passed file as a String.
		return null;
	}
	public String HashFile(String str,Hashing hashing){
		return hashing.hashDocument(str);

	}

}
