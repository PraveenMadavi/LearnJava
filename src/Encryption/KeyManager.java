package Encryption;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class KeyManager {

    private static final String KEY_PATH = "C:/Users/Madavi/Documents/EncFiles/AESKey.key";

    public static SecretKey getKey() throws Exception {
        File keyFile = new File(KEY_PATH);

        if (keyFile.exists()) {
            System.out.println("Loading exiting key");
            // ✅ Load existing key
            byte[] keyBytes = Files.readAllBytes(Path.of(KEY_PATH));
            return new SecretKeySpec(keyBytes, "AES");

        } else {
            System.out.println("Generating new key");
            // 🔐 Generate new key
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey key = keyGen.generateKey();

            // 💾 Save key
            Files.createDirectories(Path.of(keyFile.getParent()));
            Files.write(Path.of(KEY_PATH), key.getEncoded());

            return key;
        }
    }
}
