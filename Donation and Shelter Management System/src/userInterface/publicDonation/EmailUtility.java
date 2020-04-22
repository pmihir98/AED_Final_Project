/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.publicDonation;
import userInterface.publicDonation.TrayIconDemo;
import static com.db4o.Deploy.debug;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import sun.security.krb5.Config;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nikhil Joshi
 */
public class EmailUtility extends javax.swing.JFrame {

    /**
     * Creates new form EmailUtility
     */
    public EmailUtility() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ToField = new javax.swing.JTextField();
        FromField = new javax.swing.JTextField();
        SubField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConTextArea = new javax.swing.JTextArea();
        SendEmailBtn = new javax.swing.JButton();
        BackToPanelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Advertiser Alert Notification");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("TO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("FROM:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("SUBJECT:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("MESSAGE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        ToField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ToField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(ToField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 350, 30));

        FromField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FromField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(FromField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 350, 30));

        SubField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SubField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(SubField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 350, 30));

        ConTextArea.setColumns(20);
        ConTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ConTextArea.setRows(5);
        ConTextArea.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(ConTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 350, 260));

        SendEmailBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SendEmailBtn.setText("Send E-Mail");
        SendEmailBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SendEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SendEmailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 110, 40));

        BackToPanelBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackToPanelBtn.setText("<<<BACK<<<");
        BackToPanelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackToPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPanelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToPanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SendEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailBtnActionPerformed
        String ToEmail = ToField.getText();
        String FromEmail = FromField.getText();
        String FromEmailPassword = "devil@333";
        String Subject = SubField.getText();
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.user", FromEmail);
        properties.put("mail.smtp.password", FromEmailPassword);
        properties.put("mail.smtp.socketFactory.port", 465);
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthenticator(){
              String username = FromEmail;
 String password = FromEmailPassword;
    if ((username != null) && (username.length() > 0) && (password != null) && (password.length   () > 0))
           return new PasswordAuthentication(FromEmail,FromEmailPassword);
             return null;
         }
});
     session.setDebug(false);
        try {
          MimeMessage message = new MimeMessage(session);
          message.setFrom(new InternetAddress(FromEmail));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
          message.setSubject(Subject);
          message.setText(ConTextArea.getText());
                 Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com" , 465 , FromEmail, FromEmailPassword);
          Transport.send(message,FromEmail,FromEmailPassword);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
       if (SystemTray.isSupported()) {
            TrayIconDemo td = new TrayIconDemo();
            try {
                td.displayTray();
            } catch (AWTException ex) {
                Logger.getLogger(EmailUtility.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.err.println("System tray not supported!");
        }
    
    }//GEN-LAST:event_SendEmailBtnActionPerformed

    private void BackToPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPanelBtnActionPerformed
      dispose();
    }//GEN-LAST:event_BackToPanelBtnActionPerformed
public void displayTray() throws AWTException{
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("One little step from you can help us change the world", "Orphanage Donation Alert", MessageType.INFO);
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
            java.util.logging.Logger.getLogger(EmailUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailUtility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPanelBtn;
    private javax.swing.JTextArea ConTextArea;
    private javax.swing.JTextField FromField;
    private javax.swing.JButton SendEmailBtn;
    private javax.swing.JTextField SubField;
    private javax.swing.JTextField ToField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
