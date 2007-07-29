/*
 * LegOSCView.java
 *
 * Created on 23 de Janeiro de 2007, 0:14
 *
 *  LegOSC: An OSC gateway to control the NXT Brick.
 *  This is part a of the DiABlu Project (http://diablu.jorgecardoso.org)
 *
 *  Copyright (C) 2007  Jorge Cardoso
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  You can reach me by:
 *  email: jorgecardoso <> ieee org
 *  web: http://jorgecardoso.org
 */

package pt.citar.diablu.legosc;

import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import javax.swing.JComboBox;

/**
 *
 * @author  Jorge Cardoso
 */
public class LegOSCView extends javax.swing.JFrame implements LegOSCObserver {
    
    LegOSC legOSC;
    
    boolean legOSCStarted;
    
    Vector <LegOSCViewObserver>observers = new Vector<LegOSCViewObserver>();
    
    LegOSCProperties properties;
    
    /** Creates new form NewJFrame */
    public LegOSCView() {
        
        properties = new LegOSCProperties();
        
        /* must be created before the components because component initialization
         uses this object */
        legOSC = new LegOSC();
        this.registerObserver(legOSC);
        
        initComponents();
        
        /* Set the Sensor Configuration pane to be enabled or disable
            according to the state of the check box*/
        enableSensorConfigurationPane();
        
        legOSCStarted = false;
        
        legOSC.registerObserver(this);
        
    }
    
    public void registerObserver(LegOSCViewObserver observer) {
        // Add observer only once
        if (observers.contains(observer)) {
            return;
        }
        
        this.observers.add(observer);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        tpPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfLocalPort = new javax.swing.JTextField();
        tfLocalPort.setText(properties.getLegOSCPort());
        jLabel2 = new javax.swing.JLabel();
        tfTargetAddress = new javax.swing.JTextField();
        tfTargetAddress.setText(properties.getAppHostname());
        jLabel3 = new javax.swing.JLabel();
        tfTargetPort = new javax.swing.JTextField();
        tfTargetPort.setText(properties.getAppPort());
        jLabel5 = new javax.swing.JLabel();
        tfCommPort = new javax.swing.JTextField();
        tfCommPort.setText(properties.getBrickCOMPort());
        jLabel4 = new javax.swing.JLabel();
        cbAutoSensor = new javax.swing.JCheckBox();
        cbAutoSensor.setSelected(properties.getAutoSensor());
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        sAutoSensorInterval = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        pSensorConfiguration = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbSensorType1 = new javax.swing.JComboBox();
        for (LegOSC.SensorType type : LegOSC.SensorType.values()) {
            cbSensorType1.addItem(type);
        }
        cbSensorType2 = new javax.swing.JComboBox();
        for (LegOSC.SensorType type : LegOSC.SensorType.values()) {
            cbSensorType2.addItem(type);
        }
        cbSensorType4 = new javax.swing.JComboBox();
        for (LegOSC.SensorType type : LegOSC.SensorType.values()) {
            cbSensorType4.addItem(type);
        }
        cbSensorType3 = new javax.swing.JComboBox();
        for (LegOSC.SensorType type : LegOSC.SensorType.values()) {
            cbSensorType3.addItem(type);
        }
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnStartStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLog = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiABlu LegOSC");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tpPanel.setName("teste");
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("LegOSC Port:");
        jLabel1.setToolTipText("");

        tfLocalPort.setToolTipText("LegOSC will listen for OSC messages on this port. Send messages to this port from your app.");
        tfLocalPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocalPortActionPerformed(evt);
            }
        });
        tfLocalPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLocalPortFocusLost(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hostname:");

        tfTargetAddress.setToolTipText("The name or IP of the computer on which your application is running.");
        tfTargetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTargetAddressActionPerformed(evt);
            }
        });
        tfTargetAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTargetAddressFocusLost(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Port:");

        tfTargetPort.setToolTipText("The port number your application is listening to.");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Brick COM Port:");

        tfCommPort.setToolTipText("The COM port you connected the NXT Brick to.");
        tfCommPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCommPortActionPerformed(evt);
            }
        });
        tfCommPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCommPortFocusLost(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Your application address:");

        cbAutoSensor.setText("Automatically send sensor readings every ");
        cbAutoSensor.setToolTipText("If checked, LegOSC will automatically send OSC messages to your application. Configure the sensors in the Sensor Configuration Tab.");
        cbAutoSensor.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        cbAutoSensor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cbAutoSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAutoSensorActionPerformed(evt);
            }
        });

        sAutoSensorInterval.setValue(properties.getAutoSensorInterval());
        sAutoSensorInterval.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sAutoSensorIntervalStateChanged(evt);
            }
        });

        jLabel10.setText("milliseconds");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel1)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4))
                        .add(16, 16, 16)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(tfTargetAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(19, 19, 19)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tfTargetPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(tfCommPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tfLocalPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .add(32, 32, 32))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .add(32, 32, 32))
            .add(jPanel1Layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(cbAutoSensor)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(sAutoSensorInterval, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15)
                .add(jLabel10)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(tfLocalPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tfTargetAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tfTargetPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tfCommPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbAutoSensor)
                    .add(sAutoSensorInterval, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .add(28, 28, 28))
        );
        tpPanel.addTab("Connection", jPanel1);

        jLabel6.setText("Port 1:");

        cbSensorType1.setSelectedItem(properties.getSensorMap(0));
        cbSensorType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSensorType1ActionPerformed(evt);
            }
        });

        cbSensorType2.setSelectedItem(properties.getSensorMap(1));
        cbSensorType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSensorType2ActionPerformed(evt);
            }
        });

        cbSensorType4.setSelectedItem(properties.getSensorMap(3));
        cbSensorType4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSensorType4ActionPerformed(evt);
            }
        });

        cbSensorType3.setSelectedItem(properties.getSensorMap(2));
        cbSensorType3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSensorType3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Port 4:");

        jLabel8.setText("Port 3:");

        jLabel9.setText("Port 2:");

        org.jdesktop.layout.GroupLayout pSensorConfigurationLayout = new org.jdesktop.layout.GroupLayout(pSensorConfiguration);
        pSensorConfiguration.setLayout(pSensorConfigurationLayout);
        pSensorConfigurationLayout.setHorizontalGroup(
            pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pSensorConfigurationLayout.createSequentialGroup()
                .add(23, 23, 23)
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9)
                    .add(jLabel6)
                    .add(jLabel8)
                    .add(jLabel7))
                .add(60, 60, 60)
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbSensorType4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbSensorType3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbSensorType2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbSensorType1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        pSensorConfigurationLayout.setVerticalGroup(
            pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pSensorConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(cbSensorType1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(22, 22, 22)
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbSensorType2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9))
                .add(30, 30, 30)
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbSensorType3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .add(29, 29, 29)
                .add(pSensorConfigurationLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbSensorType4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        tpPanel.addTab("Sensor Configuration", pSensorConfiguration);

        getContentPane().add(tpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 260));

        btnStartStop.setText("Start");
        btnStartStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStartStopMousePressed(evt);
            }
        });

        getContentPane().add(btnStartStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 180, 100));

        taLog.setColumns(20);
        taLog.setEditable(false);
        taLog.setRows(5);
        taLog.setAutoscrolls(true);
        jScrollPane1.setViewportView(taLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 580, 100));

        jLabel11.setText("Message Log:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sAutoSensorIntervalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sAutoSensorIntervalStateChanged
        notifyConfigurationChanged();
    }//GEN-LAST:event_sAutoSensorIntervalStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //legOSC.stop();
        properties.save();
        message("Saved INI file.");
    }//GEN-LAST:event_formWindowClosing
    
    private void tfCommPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCommPortFocusLost
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfCommPortFocusLost
    
    private void tfCommPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCommPortActionPerformed
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfCommPortActionPerformed
    
    private void tfTargetAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTargetAddressFocusLost
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfTargetAddressFocusLost
    
    private void tfLocalPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalPortFocusLost
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfLocalPortFocusLost
    
    private void tfLocalPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocalPortActionPerformed
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfLocalPortActionPerformed
    
    private void cbSensorType4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSensorType4ActionPerformed
        notifySensorMap();
    }//GEN-LAST:event_cbSensorType4ActionPerformed
    
    private void cbSensorType3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSensorType3ActionPerformed
        notifySensorMap();
    }//GEN-LAST:event_cbSensorType3ActionPerformed
    
    private void cbSensorType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSensorType2ActionPerformed
        notifySensorMap();
    }//GEN-LAST:event_cbSensorType2ActionPerformed
    
    private void cbSensorType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSensorType1ActionPerformed
        notifySensorMap();
    }//GEN-LAST:event_cbSensorType1ActionPerformed
    
    private void notifySensorMap() {
        String st[] = new String[4];
        st[0] = cbSensorType1.getSelectedItem().toString();
        st[1] = cbSensorType2.getSelectedItem().toString();
        st[2] = cbSensorType3.getSelectedItem().toString();
        st[3] = cbSensorType4.getSelectedItem().toString();
        
        properties.setSensorMap(0, (LegOSC.SensorType)cbSensorType1.getSelectedItem());
        properties.setSensorMap(1, (LegOSC.SensorType)cbSensorType2.getSelectedItem());
        properties.setSensorMap(2, (LegOSC.SensorType)cbSensorType3.getSelectedItem());
        properties.setSensorMap(3, (LegOSC.SensorType)cbSensorType4.getSelectedItem());
        
        for (LegOSCViewObserver observer : observers) {
            observer.sensorMapChanged(st);
        }
       
    }
    
    private void cbAutoSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAutoSensorActionPerformed
        enableSensorConfigurationPane();
        notifyConfigurationChanged();
    }//GEN-LAST:event_cbAutoSensorActionPerformed
    
    private void enableSensorConfigurationPane() {
        
        tpPanel.setEnabledAt(1, cbAutoSensor.isSelected());
        
    }
    
    public void notifyConfigurationChanged() {
        properties.setLegOSCPort(tfLocalPort.getText());
        properties.setAppHostname(tfTargetAddress.getText());
        properties.setAppPort(tfTargetPort.getText());
        properties.setBrickCOMPort(tfCommPort.getText());
        properties.setAutoSensor(cbAutoSensor.isSelected());
        properties.setAutoSensorInterval(((Integer)sAutoSensorInterval.getValue()).intValue());
        for (LegOSCViewObserver observer : observers) {
            observer.configChanged(tfLocalPort.getText(), tfTargetAddress.getText(), tfTargetPort.getText(), tfCommPort.getText(), cbAutoSensor.isSelected(), ((Integer)sAutoSensorInterval.getValue()).intValue());
        }
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed
    
    private void btnStartStopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartStopMousePressed
        // TODO add your handling code here:
        notifyStart();
       
    }//GEN-LAST:event_btnStartStopMousePressed
    public void error(String error) {
        taLog.append(error+"\n");
        
        System.err.println(error);
        //taLog.append("Error: " + error + "\n");
    }
    public void message(String message) {
        //taLog.append("Message: " + message + "\n");
        taLog.append(message+"\n");
        System.err.println(message);
        
    }
    
    public void verbose(String message) {
        taLog.append(message+"\n");
        System.err.println(message);
    }
    
 
    
    private void tfTargetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTargetAddressActionPerformed
        notifyConfigurationChanged();
    }//GEN-LAST:event_tfTargetAddressActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LegOSCView().setVisible(true);
            }
        });
    }
    
    public void notifyStart() {
        /* Make sure the server gets the config even if no changed were made before. */
        notifyConfigurationChanged();
        notifySensorMap();
        
        for (LegOSCViewObserver observer : observers) {
            observer.startStop();
        }
    }
    
    public void start(boolean started) {
        if (started) {
            btnStartStop.setText("Stop");
        } else {
            btnStartStop.setText("Start");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartStop;
    private javax.swing.JCheckBox cbAutoSensor;
    private javax.swing.JComboBox cbSensorType1;
    private javax.swing.JComboBox cbSensorType2;
    private javax.swing.JComboBox cbSensorType3;
    private javax.swing.JComboBox cbSensorType4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pSensorConfiguration;
    private javax.swing.JSpinner sAutoSensorInterval;
    private javax.swing.JTextArea taLog;
    private javax.swing.JTextField tfCommPort;
    private javax.swing.JTextField tfLocalPort;
    private javax.swing.JTextField tfTargetAddress;
    private javax.swing.JTextField tfTargetPort;
    private javax.swing.JTabbedPane tpPanel;
    // End of variables declaration//GEN-END:variables
    
}