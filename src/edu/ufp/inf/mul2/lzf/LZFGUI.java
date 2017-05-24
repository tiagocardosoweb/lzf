package edu.ufp.inf.mul2.lzf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * <p>
 * Title: Multimedia II - LZF</p>
 * <p>
 * Description: LZF Compression / Decompression GUI</p>
 * <p>
 * Copyright: Copyright (c) 2017</p>
 * <p>
 * Company: UFP </p>
 *
 * @author Tiago Cardoso <tiagocardosoweb@gmail.com>
 * @author André Nogueira <andreedsnogueira@gmail.com>
 * @author Filipe Teixeira <lipe_teixeira_ft@hotmail.com>
 * @author Hugo Ramalho <hugo_ramalho9@gmail.com>
 * 
 * @version 1.0
 */
public class LZFGUI extends javax.swing.JFrame {
    
    private final static String SUFFIX = ".lzf";
    private final JFileChooser fc = new JFileChooser();
    private boolean openedFile = false;
    private String filename = null;
    private byte[] lzfCompressResult = null;
    private byte[] lzfDecompressResult = null;
    private boolean fileCompressed = false;

    /**
     * Creates new form LZFGUI
     */
    public LZFGUI() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        taInput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnOpenFile = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        btnCompress = new javax.swing.JButton();
        btnDecompress = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        radioShowBinary = new javax.swing.JRadioButton();
        lblOutSize = new javax.swing.JLabel();
        lblInpSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        taInput.setColumns(20);
        taInput.setRows(5);
        jScrollPane2.setViewportView(taInput);

        jLabel1.setText("Input:");

        jLabel2.setText("Output:");

        taOutput.setColumns(20);
        taOutput.setRows(5);
        jScrollPane1.setViewportView(taOutput);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        btnOpenFile.setText("Open");
        btnOpenFile.setToolTipText("");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnSaveFile.setText("Save");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        btnCompress.setText("Compress");
        btnCompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompressActionPerformed(evt);
            }
        });

        btnDecompress.setText("Decompress");
        btnDecompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecompressActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        radioShowBinary.setText("Show Binary");
        radioShowBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioShowBinaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCompress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnDecompress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioShowBinary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnReset)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpenFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDecompress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioShowBinary)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblOutSize.setText("Size: 0");

        lblInpSize.setText("Size: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblInpSize))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOutSize)))
                        .addGap(39, 39, 39)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblInpSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblOutSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecompressActionPerformed
        if (!this.fileCompressed) {
            JOptionPane.showMessageDialog(this, "You need to open a compressed file");
            return;
        }
        
        if (this.taInput.getText().length() > 0 || this.openedFile == true) {
            String output = null;
            byte[] data = null;
            if (this.openedFile == true) {
                try {
                    File src = new File(filename);
                    if (!src.exists()) {
                        System.err.println("File '" + filename + "' does not exist.");
                        System.exit(1);
                    }
                    
                    data = readData(src);
                    this.lblInpSize.setText("Size: " + data.length);
                    System.out.println("Read " + data.length + " bytes.");
                    lzfDecompressResult = LZFDecoder.decode(data);
                    System.out.println("Processed into " + lzfDecompressResult.length + " bytes.");

                    if (this.radioShowBinary.isSelected()) {
                        output = Utils.formatOctetBinary(Utils.bytesToBinaryString(lzfDecompressResult));
                    } else {
                        output = Utils.bytesToString(lzfDecompressResult);
                    }
                    
                    System.out.println(output);
                    
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                
                try {
                    data = taInput.getText().getBytes();
                    this.lblInpSize.setText("Size: " + data.length);
                    System.out.println("Read " + data.length + " bytes.");
                    lzfDecompressResult = LZFDecoder.decode(data);
                    System.out.println("Processed into " + lzfDecompressResult.length + " bytes.");
                    
                    if (this.radioShowBinary.isSelected()) {
                        output = Utils.formatOctetBinary(Utils.bytesToBinaryString(lzfDecompressResult));
                        
                    } else {
                        output = Utils.bytesToString(lzfDecompressResult);
                    }
                    System.out.println(output);
                } catch (IOException ex) {
                    Logger.getLogger(LZFGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            this.lblOutSize.setText("Size: " + lzfDecompressResult.length);
            taOutput.setText(output);
            
        } else {
            JOptionPane.showMessageDialog(this, "You haven't opened a file yet or you haven't wrote a input string.");
        }

    }//GEN-LAST:event_btnDecompressActionPerformed

    private void btnCompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompressActionPerformed
        
        if (this.taInput.getText().length() > 0 || this.openedFile == true) //|| this.openedFile == false
        {
            String output = null;
            byte[] data = null;
            if (this.openedFile == true) {
                try {
                    File src = new File(filename);
                    if (!src.exists()) {
                        System.err.println("File '" + filename + "' does not exist.");
                        System.exit(1);
                    }
                    
                    data = readData(src);
                    this.lblInpSize.setText("Size: " + data.length);
                    System.out.println("Read " + data.length + " bytes.");
                    lzfCompressResult = LZFEncoder.encode(data);
                    System.out.println("Processed into " + lzfCompressResult.length + " bytes.");

                    if (this.radioShowBinary.isSelected()) {
                        output = Utils.formatOctetBinary(Utils.bytesToBinaryString(lzfCompressResult));
                    } else {
                        output = Utils.bytesToString(lzfCompressResult);
                    }
                    System.out.println(output);
                    
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                
                data = taInput.getText().getBytes();
                this.lblInpSize.setText("Size: " + data.length);
                System.out.println("Read " + data.length + " bytes.");
                lzfCompressResult = LZFEncoder.encode(data);
                System.out.println("Processed into " + lzfCompressResult.length + " bytes.");
                
                if (this.radioShowBinary.isSelected()) {
                    output = Utils.formatOctetBinary(Utils.bytesToBinaryString(lzfCompressResult));
                } else {
                    output = Utils.bytesToString(lzfCompressResult);
                }
                
                System.out.println(output);
                
            }
            
            this.lblOutSize.setText("Size: " + lzfCompressResult.length);
            taOutput.setText(output);
            
        } else {
            JOptionPane.showMessageDialog(this, "You haven't opened a file yet or you haven't wrote a input string.");
        }
    }//GEN-LAST:event_btnCompressActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        File selectedFile = fc.getSelectedFile();
        filename = selectedFile.getAbsolutePath();
        System.out.println(filename);
        
        if (this.fileCompressed) {
            fc.setSelectedFile(new File(filename.replace(SUFFIX, "")));
        }
        
        int result = fc.showSaveDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
            
            try {
                if (this.fileCompressed) {
                    
                    if (lzfDecompressResult == null) {
                        JOptionPane.showMessageDialog(this, "You need to make a decompression first!");
                        return;
                    }
                    
                    File resultFile = new File(filename);
                    FileOutputStream out = new FileOutputStream(resultFile);
                    System.out.println("Here2: " + Utils.bytesToString(lzfDecompressResult));
                    out.write(lzfDecompressResult);
                    out.close();
                    System.out.println("Wrote in file '" + resultFile.getAbsolutePath() + "'.");
                    JOptionPane.showMessageDialog(this, "Compressed file save with success!");
                } else {
                    if (lzfCompressResult == null) {
                        JOptionPane.showMessageDialog(this, "You need to make a compression first!");
                        return;
                    }
                    
                    File resultFile = new File(filename + SUFFIX);
                    FileOutputStream out = new FileOutputStream(resultFile);
                    System.out.println("Here1: " + Utils.bytesToString(lzfCompressResult));
                    out.write(lzfCompressResult);
                    out.close();
                    System.out.println("Wrote in file '" + resultFile.getAbsolutePath() + "'.");
                    JOptionPane.showMessageDialog(this, "Decompressed file save with success!");
                }
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.openedFile = true;
            File selectedFile = fc.getSelectedFile();
            
            filename = selectedFile.getAbsolutePath();
            
            try {
                FileReader reader = new FileReader(filename);
                if (filename.contains(SUFFIX)) {
                    BufferedReader br = new BufferedReader(reader);
                    this.taInput.read(br, null);
                    br.close();
                    System.out.println(taInput.getText());
                    this.fileCompressed = true;
                    JOptionPane.showMessageDialog(this, "Compressed file loaded with success!");
                } else {
                    BufferedReader br = new BufferedReader(reader);
                    this.taInput.read(br, null);
                    br.close();
                    System.out.println(taInput.getText());
                    this.fileCompressed = false;
                    JOptionPane.showMessageDialog(this, "Decompressed file loaded with success!");
                }
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            
            this.taOutput.setText("");
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.openedFile = false;
        this.taInput.setText("");
        this.taOutput.setText("");
        this.lzfCompressResult = null;
        this.lzfDecompressResult = null;
        this.fileCompressed = false;
        this.lblInpSize.setText("Size: 0");
        this.lblOutSize.setText("Size: 0");
    }//GEN-LAST:event_btnResetActionPerformed

    private void radioShowBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioShowBinaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioShowBinaryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LZFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LZFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LZFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LZFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LZFGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompress;
    private javax.swing.JButton btnDecompress;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInpSize;
    private javax.swing.JLabel lblOutSize;
    private javax.swing.JRadioButton radioShowBinary;
    private javax.swing.JTextArea taInput;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables

    private void initCustomComponents() {
        this.taOutput.setEnabled(false);
        this.radioShowBinary.setSelected(false);
    }
    
    /**
     * Reads bytes from a given File
     * 
     * @param in
     * @return
     * @throws IOException 
     */
    private byte[] readData(File in) throws IOException {
        int len = (int) in.length();
        System.out.println("readDates in.length = " + len);
        byte[] result = new byte[len];
        int offset = 0;
        FileInputStream fis = new FileInputStream(in);
        
        while (len > 0) {
            int count = fis.read(result, offset, len);
            if (count < 0) {
                break;
            }
            len -= count;
            offset += count;
        }
        fis.close();
        if (len > 0) { // should never occur...
            throw new IOException("Could not read the whole file -- received EOF when there was "
                    + len + " bytes left to read");
        }
        return result;
    }
    
}
