package com.leyoujia.bigdata.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 把内容根据密钥加密与解密
 * 
 * @author lwk
 * 
 */
public class DesUtils {
	private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static String encryptDES(String encryptString, String encryptKey) {
		try {
			IvParameterSpec zeroIv = new IvParameterSpec(iv);
			SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
			byte[] encryptedData = cipher.doFinal(encryptString.getBytes());

			return Base64.byteArrayToBase64(encryptedData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("static-access")
	public static String decryptDES(String decryptString, String decryptKey) {
		try {
			byte[] byteMi = new Base64().base64ToByteArray(decryptString);
			IvParameterSpec zeroIv = new IvParameterSpec(iv);
			// IvParameterSpec zeroIv = new IvParameterSpec(new byte[8]);
			SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
			byte decryptedData[] = cipher.doFinal(byteMi);

			return new String(decryptedData);
		} catch (Exception e) {
			// Log.e(e.getMessage());
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		System.out.println(DesUtils.encryptDES("adffffffsm ,  , sdfsdfsf^%$#&#*#///dfdfsdf", "jjs%$#@!"));
		System.out.println(DesUtils.decryptDES("E2HqptYs9lHeAw3VoQpS5PbH2czvkVVr5fJJbua0gqwNNPowTiXs2msONOCylrUp-HeRN6xRfWVPnvJ89baj293HGdliZX1aQOgRSt1HyjM=", "jjs%$#@!"));
	}
}
