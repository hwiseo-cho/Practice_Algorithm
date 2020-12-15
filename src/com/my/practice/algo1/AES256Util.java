package com.my.practice.algo1;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES256Util {

	private String iv;
	private Key keySpec;
	final static String key = "비밀키 입력하는 곳";
	
	/**
	 * @throws UnsupportedEncodingException
	 * 			키 값의 길이가 16이하 일 경우
	 */
	public AES256Util() throws UnsupportedEncodingException {
		this.iv = key.substring(0, 16);
		byte[] keyBytes = new byte[16];
		byte[] b = key.getBytes("UTF-8");
		int len = b.length;
		if(len > keyBytes.length) {
			len = keyBytes.length;
		}
		System.arraycopy(b, 0, keyBytes, 0, len);
		SecretKeySpec keySpec = new SecretKeySpec(keyBytes,"AES");
		this.keySpec = keySpec;
	}
	
	public String encrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
//		c.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes()));
		
//		byte[] encrypted = c.doFinal(str.getBytes("UTF-8"));
//		String enStr = new String(Base64.encodeBase64(encrypted));
		
		return "";
	}
}
