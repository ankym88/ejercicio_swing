package visual;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class principal extends JDialog {
    private JPanel contentPane;
    private JButton agregarDocentesButton;
    private JButton agregarPersonalOperativoButton;
    private JButton salirButton;




    private DefaultTableModel model;

    public principal() {
        setContentPane(contentPane);
        setModal(true);


        agregarDocentesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                docente doc = new docente();

                doc.pack();
                doc.setLocationRelativeTo(null);
                dispose();
                doc.setVisible(true);

            }
        });
        agregarPersonalOperativoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                operativo ope = new operativo();

                ope.pack();
                ope.setLocationRelativeTo(null);
                ope.setVisible(true);
                dispose();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
