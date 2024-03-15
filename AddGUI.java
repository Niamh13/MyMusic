/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mymusic;

/**
 *
 * @author niamh
 */
public class AddGUI extends javax.swing.JFrame {

    /**
     * Creates new form MusicGUI
     */
    public AddGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        genreBTNGroup = new javax.swing.ButtonGroup();
        tilteLB = new javax.swing.JLabel();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        genreLBL = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        popRBTN = new javax.swing.JRadioButton();
        soundRBTN = new javax.swing.JRadioButton();
        searchBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        returnBTN = new javax.swing.JButton();
        bgLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 545));
        setPreferredSize(new java.awt.Dimension(370, 545));
        getContentPane().setLayout(null);

        tilteLB.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tilteLB.setText("My Music");
        getContentPane().add(tilteLB);
        tilteLB.setBounds(90, 130, 170, 70);

        addBTN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addBTN);
        addBTN.setBounds(90, 280, 80, 30);

        deleteBTN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBTN);
        deleteBTN.setBounds(180, 280, 80, 30);

        genreLBL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        genreLBL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        genreLBL.setText("Genre: ");
        getContentPane().add(genreLBL);
        genreLBL.setBounds(80, 230, 110, 22);

        nameLBL.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nameLBL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLBL.setText("Song Name: ");
        getContentPane().add(nameLBL);
        nameLBL.setBounds(90, 200, 100, 22);

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        getContentPane().add(nameTF);
        nameTF.setBounds(190, 200, 71, 22);

        genreBTNGroup.add(popRBTN);
        popRBTN.setText("Pop Music");
        popRBTN.setToolTipText("");
        getContentPane().add(popRBTN);
        popRBTN.setBounds(190, 250, 98, 21);

        genreBTNGroup.add(soundRBTN);
        soundRBTN.setText("Soundtracks");
        soundRBTN.setToolTipText("");
        getContentPane().add(soundRBTN);
        soundRBTN.setBounds(190, 230, 88, 21);

        searchBTN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        getContentPane().add(searchBTN);
        searchBTN.setBounds(90, 320, 80, 30);

        moveBTN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        moveBTN.setText("Move to");
        moveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBTNActionPerformed(evt);
            }
        });
        getContentPane().add(moveBTN);
        moveBTN.setBounds(180, 320, 80, 30);

        returnBTN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        returnBTN.setText("Return");
        returnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTNActionPerformed(evt);
            }
        });
        getContentPane().add(returnBTN);
        returnBTN.setBounds(130, 360, 80, 30);

        bgLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymusic/musics.png"))); // NOI18N
        getContentPane().add(bgLB);
        bgLB.setBounds(0, 0, 360, 510);

        pack();
    }// </editor-fold>                        

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void moveBTNActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void returnBTNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Return to home/music gui:
        MusicGUI music = new MusicGUI();
        music.setVisible(true);
        this.dispose();
    }                                         

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
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel bgLB;
    private javax.swing.JButton deleteBTN;
    private javax.swing.ButtonGroup genreBTNGroup;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JButton moveBTN;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JRadioButton popRBTN;
    private javax.swing.JButton returnBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JRadioButton soundRBTN;
    private javax.swing.JLabel tilteLB;
    // End of variables declaration                   
}