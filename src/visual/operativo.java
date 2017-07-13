package visual;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class operativo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private JTextField edad;
    private JTextField nombre;
    private JButton adicionarButton;
    private JTextField cargo;
    private JButton borrarButton;
    private JButton salirButton;

    private DefaultTableModel model;

    public operativo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

            model=new DefaultTableModel();
            model.addColumn("nombre");
            model.addColumn("edad");
            model.addColumn("cargo");
            table1.setModel(model);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom=nombre.getText();
                int eda=Integer.parseInt(edad.getText());
                String car=cargo.getText();

                nombre.setText("");
                edad.setText("");
                cargo.setText("");
                model.addRow(new Object[]{nom,eda,car});

            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel dtm = (DefaultTableModel) table1.getModel(); //TableProducto es el nombre de mi tabla ;)
                dtm.removeRow(table1.getSelectedRow());

            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal doc = new principal();

                doc.pack();
                doc.setLocationRelativeTo(null);
                dispose();
                doc.setVisible(true);

            }
        });
    }

    private void onOK() {
        // add your code here
        //dispose();
       // JOptionPane.showMessageDialog();

    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
