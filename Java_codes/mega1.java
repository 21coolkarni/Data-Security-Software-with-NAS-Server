import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class mega1
{
    private JFrame frame;
    
    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    final mega1 window = new mega1();
                    window.frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public mega1() {
        this.initialize();
    }
    
    private void initialize() {
        (this.frame = new JFrame()).setBounds(100, 100, 337, 343);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout(new CardLayout(0, 0));
        final JPanel panelSelection = new JPanel();
        this.frame.getContentPane().add(panelSelection, "name_114894838947200");
        panelSelection.setLayout(null);
        panelSelection.setVisible(true);
        final JPanel panelDecryption = new JPanel();
        this.frame.getContentPane().add(panelDecryption, "name_124101575777900");
        panelDecryption.setLayout(null);
        panelDecryption.setVisible(false);
        final JPanel panelEncryption = new JPanel();
        this.frame.getContentPane().add(panelEncryption, "name_123934170886800");
        panelEncryption.setLayout(null);
        panelDecryption.setVisible(false);
        final JLabel lblNewLabel = new JLabel("select your choise");
        lblNewLabel.setFont(new Font("Tahoma", 1, 13));
        lblNewLabel.setBounds(98, 47, 132, 48);
        panelSelection.add(lblNewLabel);
        final JButton btnEncryptionButton = new JButton("Encryption");
        btnEncryptionButton.setFont(new Font("Tahoma", 1, 13));
        btnEncryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                panelSelection.setVisible(false);
                panelEncryption.setVisible(true);
            }
        });
        btnEncryptionButton.setBounds(31, 172, 109, 48);
        panelSelection.add(btnEncryptionButton);
        final JButton btnDecryptionButton = new JButton("Decryption");
        btnDecryptionButton.setFont(new Font("Tahoma", 1, 13));
        btnDecryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                panelSelection.setVisible(false);
                panelDecryption.setVisible(true);
            }
        });
        btnDecryptionButton.setBounds(177, 172, 109, 48);
        panelSelection.add(btnDecryptionButton);
        final JButton btnTextButton = new JButton("Text file");
        btnTextButton.setFont(new Font("Tahoma", 1, 13));
        btnTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileEncrypt fe = new FileEncrypt();
                    fe.FileT();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnTextButton.setBounds(37, 173, 95, 54);
        panelEncryption.add(btnTextButton);
        final JButton btnImgButton = new JButton("JPG file");
        btnImgButton.setFont(new Font("Tahoma", 1, 13));
        btnImgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileEncrypt1 fe = new FileEncrypt1();
                    fe.FileJ();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnImgButton.setBounds(191, 173, 95, 54);
        panelEncryption.add(btnImgButton);
        final JButton btnBackButton = new JButton("go back");
        btnBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                panelEncryption.setVisible(false);
                panelSelection.setVisible(true);
            }
        });
        btnBackButton.setFont(new Font("Tahoma", 1, 11));
        btnBackButton.setBounds(10, 11, 89, 23);
        panelEncryption.add(btnBackButton);
        final JLabel lblSelectYourFile = new JLabel("Select your file to encrypt");
        lblSelectYourFile.setFont(new Font("Tahoma", 1, 13));
        lblSelectYourFile.setBounds(64, 67, 189, 38);
        panelEncryption.add(lblSelectYourFile);
        final JButton btnAudioButton = new JButton("AudioFile");
        btnAudioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileEncrypt2 fe = new FileEncrypt2();
                    fe.FileA();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnAudioButton.setFont(new Font("Tahoma", 1, 13));
        btnAudioButton.setBounds(37, 238, 95, 54);
        panelEncryption.add(btnAudioButton);
        final JButton btnVideoButton = new JButton("Video File");
        btnVideoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileEncrypt3 fe = new FileEncrypt3();
                    fe.FileV();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnVideoButton.setFont(new Font("Tahoma", 1, 13));
        btnVideoButton.setBounds(191, 238, 95, 54);
        panelEncryption.add(btnVideoButton);
        final JLabel lblNewLabel_2 = new JLabel("Select your file to decrypt");
        lblNewLabel_2.setFont(new Font("Tahoma", 1, 13));
        lblNewLabel_2.setBounds(68, 71, 192, 38);
        panelDecryption.add(lblNewLabel_2);
        final JButton btnTextButton2 = new JButton("Text file");
        btnTextButton2.setFont(new Font("Tahoma", 1, 13));
        btnTextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileDecrypt fd = new FileDecrypt();
                    fd.FileT1();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnTextButton2.setBounds(37, 173, 95, 54);
        panelDecryption.add(btnTextButton2);
        final JButton btnImgButton2 = new JButton("JPG file");
        btnImgButton2.setFont(new Font("Tahoma", 1, 13));
        btnImgButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileDecrypt1 fd = new FileDecrypt1();
                    fd.FileJ1();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnImgButton2.setBounds(191, 173, 95, 54);
        panelDecryption.add(btnImgButton2);
        final JButton btnBackButton2 = new JButton("go back");
        btnBackButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                panelDecryption.setVisible(false);
                panelSelection.setVisible(true);
            }
        });
        btnBackButton2.setFont(new Font("Tahoma", 1, 11));
        btnBackButton2.setBounds(10, 11, 89, 23);
        panelDecryption.add(btnBackButton2);
        final JButton btnAudioButton2 = new JButton("Audio File");
        btnAudioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileDecrypt2 fd = new FileDecrypt2();
                    fd.FileA1();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnAudioButton2.setFont(new Font("Tahoma", 1, 13));
        btnAudioButton2.setBounds(37, 238, 95, 54);
        panelDecryption.add(btnAudioButton2);
        final JButton btnVideoButton2 = new JButton("Video File");
        btnVideoButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                try {
                    final FileDecrypt3 fd = new FileDecrypt3();
                    fd.FileV1();
                }
                catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        });
        btnVideoButton2.setFont(new Font("Tahoma", 1, 13));
        btnVideoButton2.setBounds(191, 238, 95, 54);
        panelDecryption.add(btnVideoButton2);
    }
}
