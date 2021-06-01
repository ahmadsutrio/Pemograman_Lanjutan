package Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTable {
    private JButton cekButton;
    private JPanel rootPanel;
    private JTextField textJumDig;
    private JTextField textDigit;
    private JButton keluarButton;
    private JTable tableOut;
    private DefaultTableModel tableModel;

    public FormTable() {
        this.initComponent();
        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tableOut.getModel();

                String digit = textDigit.getText();

                if (digit.isBlank()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;

                }

                //Mengubah jumlah digit menjadi int
                int jumdig = Integer.parseInt(textJumDig.getText());
                String[] tmp = digit.split(",");

                for (int i = 0; i < jumdig; i++) {
                    model.addRow(new Object[]{});
                }

                int a = 0;
                for (int i : Sorting.getAscending(digit, jumdig)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }

                int b = 0;
                for (int i : Sorting.getDescending(digit, jumdig)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }

            }
        });


                keluarButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);

                }
                });
            }

    Object[] tableColom = {
            "Ascending", "Descending"
    };
    Object[][] iniData = {

    };

    public JPanel getRootPanel() {
        return rootPanel;
    }
        private void initComponent(){
            tableModel = new DefaultTableModel(iniData, tableColom);
            //set tabel model
            tableOut.setModel(tableModel);
            //Menampilkan sorting
            tableOut.setAutoCreateRowSorter(true);
            //Enable single selection
            tableOut.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }


    }
