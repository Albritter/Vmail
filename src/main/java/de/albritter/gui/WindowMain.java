package de.albritter.gui;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class WindowMain extends JFrame {
    private final ButtonGroup buttonGroup = new ButtonGroup();
    @Getter
    private final PanelMailbox panelMailbox;
    @Getter
    private final PanelTLS panelTLS;
    @Getter
    private final PanelAliases panelAliases;
    @Getter
    private final PanelDomain panelDomain;
    private JRadioButton rdbtnAdd;
    private JRadioButton rdbtnUpadte;
    private JRadioButton rdbtnRemove;
    private JPanel swapPanel;
    private JPanel InputField;

    /**
     * Create the frame.
     */
    public WindowMain() {

        panelAliases = new PanelAliases();
        panelDomain = new PanelDomain();
        panelMailbox = new PanelMailbox();
        panelTLS = new PanelTLS();

        InputField = new JPanel();
        getContentPane().add(InputField, BorderLayout.SOUTH);
        GridBagLayout gbl_InputField = new GridBagLayout();
        gbl_InputField.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_InputField.rowHeights = new int[]{0, 0, 0, 0};
        gbl_InputField.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                Double.MIN_VALUE};
        gbl_InputField.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
        InputField.setLayout(gbl_InputField);

        swapPanel = new PanelDomain();
        GridBagConstraints gbc_swapPanel = new GridBagConstraints();
        gbc_swapPanel.gridheight = 3;
        gbc_swapPanel.gridwidth = 9;
        gbc_swapPanel.insets = new Insets(0, 0, 0, 5);
        gbc_swapPanel.fill = GridBagConstraints.BOTH;
        gbc_swapPanel.gridx = 0;
        gbc_swapPanel.gridy = 0;
        InputField.add(swapPanel, gbc_swapPanel);

        Box verticalBox = Box.createVerticalBox();
        GridBagConstraints gbc_verticalBox = new GridBagConstraints();
        gbc_verticalBox.anchor = GridBagConstraints.NORTHEAST;
        gbc_verticalBox.gridwidth = 2;
        gbc_verticalBox.gridheight = 3;
        gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
        gbc_verticalBox.gridx = 9;
        gbc_verticalBox.gridy = 0;
        InputField.add(verticalBox, gbc_verticalBox);

        rdbtnAdd = new JRadioButton("Add");

        verticalBox.add(rdbtnAdd);
        rdbtnAdd.setSelected(true);
        buttonGroup.add(rdbtnAdd);
        rdbtnUpadte = new JRadioButton("Upadte");
        verticalBox.add(rdbtnUpadte);
        buttonGroup.add(rdbtnUpadte);

        rdbtnRemove = new JRadioButton("Remove");
        verticalBox.add(rdbtnRemove);
        buttonGroup.add(rdbtnRemove);


        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        tabbedPane.addChangeListener(new TabbedItemListener(tabbedPane));

        JPanel pDomains = new JPanel();
        tabbedPane.addTab("Domains", null, pDomains, null);

        JPanel pMailboxes = new JPanel();
        tabbedPane.addTab("Mailboxes", null, pMailboxes, null);

        JPanel pAliases = new JPanel();
        tabbedPane.addTab("Aliases", null, pAliases, null);

        JPanel pTLS = new JPanel();
        tabbedPane.addTab("TLS", null, pTLS, null);

    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WindowMain frame = new WindowMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void swapPanel(JPanel panel) {
        InputField.remove(swapPanel);
        swapPanel = panel;
        GridBagConstraints gbc_swapPanel = new GridBagConstraints();
        gbc_swapPanel.gridheight = 3;
        gbc_swapPanel.gridwidth = 9;
        gbc_swapPanel.insets = new Insets(0, 0, 5, 5);
        gbc_swapPanel.fill = GridBagConstraints.BOTH;
        gbc_swapPanel.gridx = 0;
        gbc_swapPanel.gridy = 0;
        InputField.add(swapPanel, gbc_swapPanel);
        this.revalidate();
        this.repaint();
    }


}