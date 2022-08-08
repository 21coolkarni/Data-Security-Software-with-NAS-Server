import javax.crypto.SecretKey;
import java.io.File;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.PBEParameterSpec;
import java.util.Random;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.awt.Component;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;

// 
// Decompiled by Procyon v0.5.36
// 

class FileEncrypt
{
    StringBuilder sb;
    
    FileEncrypt() {
        this.sb = new StringBuilder();
    }
    
    public void FileT() throws Exception {
        try {
            final JFileChooser fileChooser = new JFileChooser();
            final FileNameExtensionFilter filter = new FileNameExtensionFilter("(.txt)", new String[] { "txt", "text" });
            fileChooser.setFileFilter(filter);
            if (fileChooser.showOpenDialog(null) == 0) {
                final File file1 = fileChooser.getSelectedFile();
                final Scanner input = new Scanner(file1);
                input.close();
                final FileInputStream inFile = new FileInputStream(file1);
                final FileOutputStream outFile = new FileOutputStream("HashText.des");
                final String password = "javapapers";
                final PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
                final SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndTripleDES");
                final SecretKey secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
                final byte[] salt = new byte[8];
                final Random random = new Random();
                random.nextBytes(salt);
                final PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);
                final Cipher cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
                cipher.init(1, secretKey, pbeParameterSpec);
                outFile.write(salt);
                final byte[] input2 = new byte[64];
                int bytesRead;
                while ((bytesRead = inFile.read(input2)) != -1) {
                    final byte[] output = cipher.update(input2, 0, bytesRead);
                    if (output != null) {
                        outFile.write(output);
                    }
                }
                final byte[] output = cipher.doFinal();
                if (output != null) {
                    outFile.write(output);
                }
                inFile.close();
                outFile.flush();
                outFile.close();
            }
        }
        catch (Exception e1) {
            System.out.println(e1);
        }
    }
}
