package de.albritter.gui;

import javax.swing.*;
import java.awt.*;

public class PanelTLS extends JPanel {
    private JTextField textArgument;
    private JTextField textDomain;
    private JSpinner spinnerID;
    private JComboBox comboBoxPolicy;
    private JCheckBox chckbxActive;

    /**
     * Create the panel.
     */
    public PanelTLS() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 202, 202, 202, 0};
        gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        JLabel label = new JLabel("ID");
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.insets = new Insets(0, 0, 5, 5);
        gbc_label.anchor = GridBagConstraints.EAST;
        gbc_label.gridx = 0;
        gbc_label.gridy = 0;
        add(label, gbc_label);

        spinnerID = new JSpinner();
        GridBagConstraints gbc_spinnerID = new GridBagConstraints();
        gbc_spinnerID.gridwidth = 3;
        gbc_spinnerID.ipadx = 20;
        gbc_spinnerID.anchor = GridBagConstraints.NORTHWEST;
        gbc_spinnerID.insets = new Insets(0, 0, 5, 0);
        gbc_spinnerID.gridx = 1;
        gbc_spinnerID.gridy = 0;
        add(spinnerID, gbc_spinnerID);

        JLabel lblDomain = new JLabel("Domain");
        GridBagConstraints gbc_lblDomain = new GridBagConstraints();
        gbc_lblDomain.anchor = GridBagConstraints.EAST;
        gbc_lblDomain.insets = new Insets(0, 0, 5, 5);
        gbc_lblDomain.gridx = 0;
        gbc_lblDomain.gridy = 1;
        add(lblDomain, gbc_lblDomain);

        textDomain = new JTextField();
        GridBagConstraints gbc_textDomain = new GridBagConstraints();
        gbc_textDomain.insets = new Insets(0, 0, 5, 5);
        gbc_textDomain.fill = GridBagConstraints.HORIZONTAL;
        gbc_textDomain.gridx = 1;
        gbc_textDomain.gridy = 1;
        add(textDomain, gbc_textDomain);
        textDomain.setColumns(10);

        JLabel lblPolicy = new JLabel("Policy");
        GridBagConstraints gbc_lblPolicy = new GridBagConstraints();
        gbc_lblPolicy.anchor = GridBagConstraints.EAST;
        gbc_lblPolicy.insets = new Insets(0, 0, 5, 5);
        gbc_lblPolicy.gridx = 0;
        gbc_lblPolicy.gridy = 2;
        add(lblPolicy, gbc_lblPolicy);

        comboBoxPolicy = new JComboBox();
        comboBoxPolicy.setModel(new DefaultComboBoxModel(new String[]{"none", "may", "encrypt", "dane", "dane-only", "fingerprint", "verify", "secure"}));
        GridBagConstraints gbc_comboBoxPolicy = new GridBagConstraints();
        gbc_comboBoxPolicy.insets = new Insets(0, 0, 5, 5);
        gbc_comboBoxPolicy.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBoxPolicy.gridx = 1;
        gbc_comboBoxPolicy.gridy = 2;
        add(comboBoxPolicy, gbc_comboBoxPolicy);

        JLabel lblArguments = new JLabel("Arguments");
        GridBagConstraints gbc_lblArguments = new GridBagConstraints();
        gbc_lblArguments.anchor = GridBagConstraints.EAST;
        gbc_lblArguments.insets = new Insets(0, 0, 5, 5);
        gbc_lblArguments.gridx = 0;
        gbc_lblArguments.gridy = 3;
        add(lblArguments, gbc_lblArguments);

        textArgument = new JTextField();
        GridBagConstraints gbc_textArgument = new GridBagConstraints();
        gbc_textArgument.insets = new Insets(0, 0, 5, 0);
        gbc_textArgument.gridwidth = 3;
        gbc_textArgument.fill = GridBagConstraints.HORIZONTAL;
        gbc_textArgument.gridx = 1;
        gbc_textArgument.gridy = 3;
        add(textArgument, gbc_textArgument);
        textArgument.setColumns(10);

        chckbxActive = new JCheckBox("Active");
        GridBagConstraints gbc_chckbxActive = new GridBagConstraints();
        gbc_chckbxActive.anchor = GridBagConstraints.WEST;
        gbc_chckbxActive.insets = new Insets(0, 0, 0, 5);
        gbc_chckbxActive.gridx = 1;
        gbc_chckbxActive.gridy = 4;
        add(chckbxActive, gbc_chckbxActive);

    }

    public JSpinner getSpinnerID() {
        return spinnerID;
    }

    public JTextField getTextDomain() {
        return textDomain;
    }

    public JComboBox getComboBoxPolicy() {
        return comboBoxPolicy;
    }

    public JTextField getTextArgument() {
        return textArgument;
    }

    public JCheckBox getChckbxActive() {
        return chckbxActive;
    }
}