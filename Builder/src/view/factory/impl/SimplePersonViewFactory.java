package view.factory.impl;

import components.fields.PanelInputTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SimplePersonViewFactory extends Builder {

    public SimplePersonViewFactory() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
    }

    @Override
    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void createPanelFirstName() {
        panelFirstName = new PanelInputTextField();
        panelFirstName.setLabels("First name:", "");
        panel.add((JPanel) panelFirstName);
    }

    @Override
    public void createPanelLastName() {
        panelLastName = new PanelInputTextField();
        panelLastName.setLabels("Last name:", "");
        panel.add((JPanel) panelLastName);

    }

    @Override
    public void createPanelDate() {
        panelDate = new PanelInputTextField();
        panelDate.setLabels("Date od birth:", "");
        panel.add((JPanel) panelDate);
    }

    @Override
    public void createPanelGender() {
        panelGender = new PanelInputTextField();
        panelGender.setLabels("Gender:", "");
        panel.add((JPanel) panelGender);
    }

    @Override
    public void createButtonSubmit() {
        JButton btnSubmit = new JButton("Submit");
        panel.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                panelFirstName.setLabels("First name:", "");
                panelLastName.setLabels("Last name:", "");
                panelDate.setLabels("Date of birth:", "");
                panelGender.setLabels("Gender:", "");
                int f = 0;
                if (panelFirstName.getValue().toString().isEmpty()) {
                    f = 1;
                    panelFirstName.setLabels("First name: ", "Enter first name!");
                }

                if (panelLastName.getValue().toString().isEmpty()) {
                    f = 1;
                    panelLastName.setLabels("Last name", "Enter last name!");
                }
                if (!panelGender.getValue().equals("male") && !panelGender.getValue().equals("female")) {
                    panelGender.setLabels("Gender", "Gender must be male or female!");
                    f = 1;
                }

                String input = panelDate.getValue().toString();

                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

                java.util.Date textFieldAsDate = null;
                try {
                    if (input.length() != 10) {
                        f = 1;
                    }
                    if (!input.matches("[0-3][0-9].[01][0-9].[12][0-9][0-9][0-9]")) {
                        f = 1;
                    }
                    textFieldAsDate = sdf.parse(input);
                } catch (ParseException ex) {
                    panelDate.setLabels("Date of birth", "Format must be: 31.12.2019");
                    f = 1;
                }

                String personString = "";
                personString = " First name " + panelFirstName.getValue().toString() + " Last name " + panelLastName.getValue().toString() + " Gender " + panelGender.getValue().toString() + " Date " + panelDate.getValue().toString();

                if (f == 0) {
                    JOptionPane.showMessageDialog(null, personString);
                }

            }
        });
    }

}
