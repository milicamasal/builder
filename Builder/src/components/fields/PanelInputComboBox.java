package components.fields;

import java.util.List;
import components.IValue;

public class PanelInputComboBox extends javax.swing.JPanel implements IValue {

    public PanelInputComboBox() {
        initComponents();
        prepareView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFieldText = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        cbField = new javax.swing.JComboBox<>();

        lblFieldText.setText("label");

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("label");

        cbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbField;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFieldText;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        cbField.removeAllItems();
    }

    @Override
    public Object getValue() {
        return cbField.getSelectedItem();
    }

    @Override
    public void initialize(Object initValue) {
        List<Object> values = (List<Object>) initValue;
        for (Object value : values) {
            cbField.addItem(value);
        }
    }

    public javax.swing.JLabel getLblError() {
        return lblError;
    }

    public javax.swing.JLabel getLblFieldText() {
        return lblFieldText;
    }

    @Override
    public void setValue(Object value) {
        cbField.setSelectedItem(value);
    }

    @Override
    public void setLabels(String txt, String error) {
        lblFieldText.setText(txt);
        lblError.setText(error);
    }
}
