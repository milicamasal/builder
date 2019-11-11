package view.factory.impl;

import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdvancedPersonViewFactory extends Builder {

    public AdvancedPersonViewFactory() {
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
        panelDate = new PanelInputDate();
        panelDate.setLabels("Date of birth", "");
        panel.add((JPanel) panelDate);

    }

    @Override
    public void createPanelGender() {
        panelGender = new PanelInputComboBox();
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        panelGender.initialize(genders);

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
                panelDate.setLabels("Date of birth", "");
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

                String personString = "";
                personString = " First name " + panelFirstName.getValue().toString() + " Last name " + panelLastName.getValue().toString() + " Gender " + panelGender.getValue().toString() + " Date " + panelDate.getValue().toString();
                if (f == 0) {
                    JOptionPane.showMessageDialog(null, personString);
                }

            }
        });
    }
}
