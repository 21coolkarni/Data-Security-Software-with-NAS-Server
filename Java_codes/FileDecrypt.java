import javax.crypto.SecretKey;
import java.io.File;
import java.io.FileOutputStream;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.PBEParameterSpec;
import java.io.FileInputStream;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.util.Scanner;
import java.awt.Component;
import javax.swing.JFileChooser;

// 
// Decompiled by Procyon v0.5.36
// 

public class FileDecrypt
{
    JFileChooser fileChooser;
    StringBuilder sb;
    
    public FileDecrypt() {
        this.fileChooser = new JFileChooser();
        this.sb = new StringBuilder();
    }
    
    void FileT1() throws Exception {
        try {
            if (this.fileChooser.showOpenDialog(null) == 0) {
                final File file1 = this.fileChooser.getSelectedFile();
                final Scanner input = new Scanner(file1);
                input.close();
                final String password = "javapapers";
                final PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
                final SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES");
                final SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
                final FileInputStream fis = new FileInputStream(file1);
                final byte[] salt = new byte[8];
                fis.read(salt);
                final PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);
                final Cipher cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
                cipher.init(2, secretKey, pbeParameterSpec);
                final FileOutputStream fos = new FileOutputStream("Text.txt");
                final byte[] in = new byte[64];
                int read;
                while ((read = fis.read(in)) != -1) {
                    final byte[] output = cipher.update(in, 0, read);
                    if (output != null) {
                        fos.write(output);
                    }
                }
                final byte[] output = cipher.doFinal();
                if (output != null) {
                    fos.write(output);
                }
                fis.close();
                fos.flush();
                fos.close();
            }
        }
        catch (Exception e1) {
            System.out.println(e1);
        }
    }
}
