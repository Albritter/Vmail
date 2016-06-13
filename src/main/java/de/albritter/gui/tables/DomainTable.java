package de.albritter.gui.tables;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


/**
 * Created by hhalbritter on 10.06.2016.
 */
public class DomainTable extends JPanel implements UpdateTabel {
    private DataTable table;

    public DomainTable() {
        setLayout(new BorderLayout());
        table = new DataTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {2, "Domain.tld", false}
                },
                new String[]{"ID", "Domain", "Active"}
        ));

        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(table.getColumnCount() - 1).setPreferredWidth(60);

        table.getColumnModel().getColumn(0).setMaxWidth(60);
        table.getColumnModel().getColumn(table.getColumnCount() - 1).setMaxWidth(120);
        add(new JScrollPane(table));
    }


    @Override
    public void updateDomainTable(String[] header, Object[][] data) {
        table.updateTable(header, data);
    }

    @Override
    public void updateMailboxTable(String[] header, Object[][] data) {

    }

    @Override
    public void updateAliasTable(String[] header, Object[][] data) {

    }

    @Override
    public void updateTLSTable(String[] header, Object[][] data) {

    }
}
