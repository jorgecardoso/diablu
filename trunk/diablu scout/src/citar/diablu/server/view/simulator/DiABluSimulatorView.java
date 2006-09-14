/*
 * DiABluSimulatorView.java
 *
 * Created on 11 ao�t 2006, 15:47
 */

package citar.diablu.server.view.simulator;

// j2se
import java.util.Vector;

// i18n & l9n
import java.util.ResourceBundle;

// model data 
import citar.diablu.server.model.data.DiABluID;
import citar.diablu.server.model.data.DiABluDevice;
import citar.diablu.server.model.data.DiABluKey;
import citar.diablu.server.model.data.DiABluMsg;

/*
 * Interfaces
 */

// controller
import citar.diablu.server.controller.in.devices.simulator.DiABluSimulatorControllerListener;

// model
import citar.diablu.server.controller.out.simulator.DiABluSimulatorModelListener;


/**
 *
 * @author  nrodrigues
 */
public class DiABluSimulatorView extends javax.swing.JFrame implements DiABluSimulatorModelListener {
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_jb;
    private javax.swing.JPanel dclientPanel;
    private javax.swing.JPanel devicePanel;
    private javax.swing.JButton edit_jb;
    private javax.swing.JLabel fName_jl;
    private javax.swing.JTextField fName_jtf;
    private javax.swing.JComboBox gameAction_jcb;
    private javax.swing.JLabel gameAction_jl;
    private javax.swing.JComboBox key_jcb;
    private javax.swing.JLabel key_jl;
    private javax.swing.JLabel keyboard_jl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox majorDeviceClass_jcb;
    private javax.swing.JLabel majorDeviceClass_jl;
    private javax.swing.JLabel message_jl;
    private javax.swing.JTextField message_jtf;
    private javax.swing.JComboBox minorDeviceClass_jcb;
    private javax.swing.JLabel minorDeviceClass_jl;
    private javax.swing.JComboBox protocol_jcb;
    private javax.swing.JLabel protocol_jl;
    private javax.swing.JButton remove_jb;
    private javax.swing.JButton sendKeys_jb;
    private javax.swing.JButton sendMessage_jb;
    private javax.swing.JPanel superPanel;
    private javax.swing.JLabel uuid_jl;
    private javax.swing.JTextField uuid_jtf;
    // End of variables declaration//GEN-END:variables

    public DiABluSimulatorControllerListener controller;
    
    /**
     * Creates new formDiABluSimulatorView
     */
    
    
    public DiABluSimulatorView(DiABluSimulatorControllerListener control) {
        
        this.controller = control;
        
        initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        superPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        dclientPanel = new javax.swing.JPanel();
        message_jl = new javax.swing.JLabel();
        keyboard_jl = new javax.swing.JLabel();
        key_jl = new javax.swing.JLabel();
        key_jcb = new javax.swing.JComboBox();
        gameAction_jl = new javax.swing.JLabel();
        gameAction_jcb = new javax.swing.JComboBox();
        message_jtf = new javax.swing.JTextField();
        sendKeys_jb = new javax.swing.JButton();
        sendMessage_jb = new javax.swing.JButton();
        devicePanel = new javax.swing.JPanel();
        fName_jl = new javax.swing.JLabel();
        fName_jtf = new javax.swing.JTextField();
        uuid_jl = new javax.swing.JLabel();
        uuid_jtf = new javax.swing.JTextField();
        majorDeviceClass_jl = new javax.swing.JLabel();
        minorDeviceClass_jl = new javax.swing.JLabel();
        minorDeviceClass_jcb = new javax.swing.JComboBox();
        majorDeviceClass_jcb = new javax.swing.JComboBox();
        add_jb = new javax.swing.JButton();
        edit_jb = new javax.swing.JButton();
        remove_jb = new javax.swing.JButton();
        protocol_jcb = new javax.swing.JComboBox();
        protocol_jl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("DiABlu_Simulator_Beta_1"));
        superPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString(""), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        dclientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("DiABlu_Client"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));
        message_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("[Message]"));

        keyboard_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("[Keyboard]"));

        key_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("_Key:"));

        key_jcb.setEditable(true);
        key_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_STAR"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_POUND"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM0"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM1"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM2"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM3"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM4"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM5"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM6"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM7"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM8"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("KEY_NUM9"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("[none]") }));
        key_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key_jcbActionPerformed(evt);
            }
        });

        gameAction_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Game_Action:"));

        gameAction_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("[none]"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("UP"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("DOWN"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("LEFT"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("RIGHT"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("FIRE"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("GAME_A"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("GAME_B"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("GAME_C"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("GAME_D") }));
        gameAction_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameAction_jcbActionPerformed(evt);
            }
        });

        message_jtf.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Type_here_your_text_message..."));

        sendKeys_jb.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Send_Keys"));
        sendKeys_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendKeys_jbActionPerformed(evt);
            }
        });

        sendMessage_jb.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Send_Message"));
        sendMessage_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessage_jbActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout dclientPanelLayout = new org.jdesktop.layout.GroupLayout(dclientPanel);
        dclientPanel.setLayout(dclientPanelLayout);
        dclientPanelLayout.setHorizontalGroup(
            dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dclientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dclientPanelLayout.createSequentialGroup()
                        .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(message_jl)
                            .add(keyboard_jl))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(message_jtf)
                            .add(dclientPanelLayout.createSequentialGroup()
                                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(dclientPanelLayout.createSequentialGroup()
                                        .add(39, 39, 39)
                                        .add(key_jl))
                                    .add(gameAction_jl))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(key_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(gameAction_jcb, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, dclientPanelLayout.createSequentialGroup()
                        .add(sendMessage_jb)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(sendKeys_jb)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dclientPanelLayout.setVerticalGroup(
            dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dclientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(message_jtf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(message_jl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(gameAction_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(gameAction_jl)
                    .add(keyboard_jl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(key_jl)
                    .add(key_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                .add(dclientPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(sendKeys_jb)
                    .add(sendMessage_jb))
                .addContainerGap())
        );

        devicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("DiABlu_Device"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));
        fName_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("_Friendly_Name:"));

        fName_jtf.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("JC's_PDA2"));

        uuid_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("UUID:"));

        uuid_jtf.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("08002B0ECEF1"));

        majorDeviceClass_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Major_Device_Class:"));

        minorDeviceClass_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Minor_Device_Class:"));

        minorDeviceClass_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Server-class_computer"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Item_2"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Item_3"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Item_4") }));

        majorDeviceClass_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Computer"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Phone"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Audio/Video"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("LAN_/Network_Access_point"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Peripheral"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Imaging"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Wearable"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("_Toy"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Miscellaneous_[Ref_#2]"), java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Uncategorized") }));
        majorDeviceClass_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorDeviceClass_jcbActionPerformed(evt);
            }
        });

        add_jb.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Add"));
        add_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jbActionPerformed(evt);
            }
        });

        edit_jb.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Edit"));
        edit_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_jbActionPerformed(evt);
            }
        });

        remove_jb.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Remove"));
        remove_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_jbActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout devicePanelLayout = new org.jdesktop.layout.GroupLayout(devicePanel);
        devicePanel.setLayout(devicePanelLayout);
        devicePanelLayout.setHorizontalGroup(
            devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(devicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(minorDeviceClass_jl)
                    .add(majorDeviceClass_jl)
                    .add(fName_jl)
                    .add(uuid_jl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(majorDeviceClass_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fName_jtf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .add(minorDeviceClass_jcb, 0, 222, Short.MAX_VALUE)
                    .add(uuid_jtf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, devicePanelLayout.createSequentialGroup()
                        .add(add_jb)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(edit_jb)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(remove_jb)))
                .addContainerGap())
        );
        devicePanelLayout.setVerticalGroup(
            devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(devicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(majorDeviceClass_jl)
                    .add(majorDeviceClass_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(minorDeviceClass_jl)
                    .add(minorDeviceClass_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fName_jl)
                    .add(fName_jtf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(uuid_jl)
                    .add(uuid_jtf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(devicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(remove_jb)
                    .add(edit_jb)
                    .add(add_jb))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        protocol_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Bliuetooth") }));
        protocol_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protocol_jcbActionPerformed(evt);
            }
        });

        protocol_jl.setText(java.util.ResourceBundle.getBundle("citar/diablu/server/model/i18n/diABluServerDefaultBundle").getString("Protocol:"));

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(devicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(dclientPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(protocol_jl)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(protocol_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(protocol_jcb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(protocol_jl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, devicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, dclientPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout superPanelLayout = new org.jdesktop.layout.GroupLayout(superPanel);
        superPanel.setLayout(superPanelLayout);
        superPanelLayout.setHorizontalGroup(
            superPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(superPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(mainPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        superPanelLayout.setVerticalGroup(
            superPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(superPanelLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(38, 38, 38))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(superPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(superPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remove_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_jbActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_remove_jbActionPerformed

    private void edit_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_jbActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_edit_jbActionPerformed

    private void add_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jbActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_add_jbActionPerformed
    // View Methods
    
    /*
     * This method returns the DiABluID corresponding to the selected device
     *
     */
    private DiABluID getDiABluID(){
        
        // get friendly name
        String fName = fName_jtf.getText();
        
        // get uuid
        String uuid = uuid_jtf.getText();
        
        // construct the DiABlu ID
        DiABluID dId = new DiABluID(uuid,fName);
        
        return dId;
    }
    
    // Controller Methods
    
    private void sendKeys_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendKeys_jbActionPerformed

        // get the keys
        String keyPressed = key_jcb.getSelectedItem().toString();
        String gAction = key_jcb.getSelectedItem().toString();
        
        // get the id
        DiABluID dId = getDiABluID();
        
        // contruct the diablu key
        DiABluKey dK = new DiABluKey(dId,keyPressed,gAction);
        
        controller.newKey(dK);
        
    }//GEN-LAST:event_sendKeys_jbActionPerformed

    private void sendMessage_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessage_jbActionPerformed
                
        // get the text
        String text = message_jtf.getText();
        
        // get the id
        DiABluID dId = getDiABluID();
        
        // construct the msg
        DiABluMsg dM = new DiABluMsg(dId,text);
        
        controller.newMsg(dM);
        
    }//GEN-LAST:event_sendMessage_jbActionPerformed

    private void key_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key_jcbActionPerformed

        // TODO: method that updates the corresponding game action
        
    }//GEN-LAST:event_key_jcbActionPerformed

    private void gameAction_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameAction_jcbActionPerformed

        // TODO: method that updates the corresponding key pressed
        
    }//GEN-LAST:event_gameAction_jcbActionPerformed

    private void majorDeviceClass_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorDeviceClass_jcbActionPerformed

        // TODO: method that updates the minor device class selection options
        
    }//GEN-LAST:event_majorDeviceClass_jcbActionPerformed

    private void protocol_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protocol_jcbActionPerformed
            
        // TODO : in next version :)
        
    }//GEN-LAST:event_protocol_jcbActionPerformed

    
    // Model Listener Methods
    
    /*
     * This method receives a DiABlu Device and updates the view
     *
     */
    public void setSelectedDevice(DiABluDevice dd){
        
        //uuid
        String uuid = dd.getID().getUUID();
        uuid_jtf.setText(uuid);
        
        //friendly name
        String fname = dd.getID().getFName();
        fName_jtf.setText(fname);
        
        //minor device class
        //TODO method that receives a minor device class and updates both minor & major
        
        
    }

 
}

