/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.BookAnAppointment;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rishika
 */
public class DoctorRoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRoleJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private Organization organization;

    public DoctorRoleJPanel(JPanel container, Enterprise enterprise, UserAccount userAccount, Network network, Organization organization) {

        initComponents();

        this.container = container;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;
        this.userAccount = userAccount;
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
        jLabel1 = new javax.swing.JLabel();
        ManAppoDc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        medPres = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor Role ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        ManAppoDc.setBackground(new java.awt.Color(255, 255, 255));
        ManAppoDc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManAppoDcMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Manage");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Appointments");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-health-checkup-filled-100.png"))); // NOI18N

        javax.swing.GroupLayout ManAppoDcLayout = new javax.swing.GroupLayout(ManAppoDc);
        ManAppoDc.setLayout(ManAppoDcLayout);
        ManAppoDcLayout.setHorizontalGroup(
            ManAppoDcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManAppoDcLayout.createSequentialGroup()
                .addGroup(ManAppoDcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManAppoDcLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(ManAppoDcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManAppoDcLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10))))
                    .addGroup(ManAppoDcLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        ManAppoDcLayout.setVerticalGroup(
            ManAppoDcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManAppoDcLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(35, 35, 35))
        );

        medPres.setBackground(new java.awt.Color(255, 255, 255));
        medPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medPresMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Medicine");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Prescription");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-pill-filled-100.png"))); // NOI18N

        javax.swing.GroupLayout medPresLayout = new javax.swing.GroupLayout(medPres);
        medPres.setLayout(medPresLayout);
        medPresLayout.setHorizontalGroup(
            medPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPresLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(medPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(medPresLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(medPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        medPresLayout.setVerticalGroup(
            medPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(ManAppoDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(medPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ManAppoDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medPres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManAppoDcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManAppoDcMouseClicked
        // TODO add your handling code here:
         ManageAppointmentsJPanel manageAppointmentjpanel = new ManageAppointmentsJPanel(container, enterprise, userAccount, network, organization);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("ManageAppointmentsJPanel", manageAppointmentjpanel);
        layout.next(container);
    }//GEN-LAST:event_ManAppoDcMouseClicked

    private void medPresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medPresMouseClicked
        // TODO add your handling code here:
        PrescriptionsJPanel prescriptionjpanel = new PrescriptionsJPanel(container, enterprise, userAccount, network,organization);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("PrescriptionsJPanel", prescriptionjpanel);
        layout.next(container);
    }//GEN-LAST:event_medPresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManAppoDc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel medPres;
    // End of variables declaration//GEN-END:variables
}
