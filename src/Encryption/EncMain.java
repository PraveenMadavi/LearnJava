package Encryption;

import javax.crypto.SecretKey;

public class EncMain {
    public static void main(String[] args) throws Exception {

        SecretKey key = KeyManager.getKey(); // 🔥 load or create

//        String inputPath = "C:/Users/Madavi/Pictures/EncFiles/half-moon.jpg";
//        String outputPath = "C:/Users/Madavi/Pictures/EncFiles/half-moon.enc";

        String outputPath = "C:/Users/Madavi/Pictures/EncFiles/decrypted-half-moon.jpg";
        String inputPath = "C:/Users/Madavi/Pictures/EncFiles/half-moon.enc";

        FileEncryptor fileEncryptor = new FileEncryptor();

//        fileEncryptor.encrypt(inputPath, outputPath, key);
//        System.out.println("Encryption Done");


            fileEncryptor.decrypt(inputPath,outputPath,key);
        System.out.println("Decryption is done");


    }
}
