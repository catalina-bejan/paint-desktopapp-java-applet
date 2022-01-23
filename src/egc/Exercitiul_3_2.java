package egc;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class Exercitiul_3_2 extends javax.swing.JPanel {

    public String fontName;
    public String fontSize;
    public Font f;

    public Exercitiul_3_2() {
        initComponents();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String familii[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < familii.length; i++) {
            fontNameComboBox.addItem(familii[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fontSizeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewFontTextArea = new javax.swing.JTextArea();
        plainCheckBox = new javax.swing.JCheckBox();
        italicCheckBox = new javax.swing.JCheckBox();
        boldCheckBox = new javax.swing.JCheckBox();
        viewFontButton = new javax.swing.JButton();
        fontNameComboBox = new javax.swing.JComboBox<>();

        fontSizeTextField.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fontSizeTextField.setText("24");
        fontSizeTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        viewFontTextArea.setColumns(20);
        viewFontTextArea.setRows(5);
        viewFontTextArea.setText("Just a text to view the font. This text is editable.");
        jScrollPane1.setViewportView(viewFontTextArea);

        plainCheckBox.setText("PLAIN");

        italicCheckBox.setText("ITALIC");

        boldCheckBox.setText("BOLD");

        viewFontButton.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        viewFontButton.setText("View Font");
        viewFontButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewFontButtonMousePressed(evt);
            }
        });

        fontNameComboBox.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewFontButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(fontSizeTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plainCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(italicCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boldCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fontNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fontNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plainCheckBox)
                    .addComponent(italicCheckBox)
                    .addComponent(boldCheckBox))
                .addGap(18, 18, 18)
                .addComponent(viewFontButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewFontButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewFontButtonMousePressed
        fontName = fontNameComboBox.getSelectedItem().toString();

        if (!fontSizeTextField.getText().isEmpty()) {
            fontSize = fontSizeTextField.getText();
        }

        System.out.println(fontName);
        if ((!plainCheckBox.isSelected() && !italicCheckBox.isSelected() && !boldCheckBox.isSelected())
                || (plainCheckBox.isSelected() && italicCheckBox.isSelected() && boldCheckBox.isSelected())) {
            f = new Font(fontName, Font.PLAIN, Integer.parseInt(fontSize));

        }
        if (plainCheckBox.isSelected() && boldCheckBox.isSelected()) {
            f = new Font(fontName, Font.PLAIN + Font.BOLD, Integer.parseInt(fontSize));
            italicCheckBox.setSelected(false);

        } else if (italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
            f = new Font(fontName, Font.ITALIC + Font.BOLD, Integer.parseInt(fontSize));
            plainCheckBox.setSelected(false);

        } else if (plainCheckBox.isSelected()) {
            f = new Font(fontName, Font.PLAIN, Integer.parseInt(fontSize));
            italicCheckBox.setSelected(false);

        } else if (italicCheckBox.isSelected()) {
            f = new Font(fontName, Font.ITALIC, Integer.parseInt(fontSize));
            plainCheckBox.setSelected(false);

        } else if (boldCheckBox.isSelected()) {
            f = new Font(fontName, Font.BOLD, Integer.parseInt(fontSize));

        }

        viewFontTextArea.setFont(f);
    }//GEN-LAST:event_viewFontButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boldCheckBox;
    private javax.swing.JComboBox<String> fontNameComboBox;
    private javax.swing.JTextField fontSizeTextField;
    private javax.swing.JCheckBox italicCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox plainCheckBox;
    private javax.swing.JButton viewFontButton;
    private javax.swing.JTextArea viewFontTextArea;
    // End of variables declaration//GEN-END:variables
}
