package ru.pavel_zhukoff.desk.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Utils {

    public static String hash(String password, String username) throws NoSuchAlgorithmException {
        byte[] salt = username.getBytes();
        SecureRandom.getInstanceStrong().nextBytes(salt);
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt);
        return bytesToHex(md.digest(password.getBytes()));
    }

    private static String bytesToHex(byte[] hashInBytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
