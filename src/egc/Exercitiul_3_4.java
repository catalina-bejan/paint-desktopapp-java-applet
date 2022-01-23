package egc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class Exercitiul_3_4 extends javax.swing.JPanel {

    public BufferedImage img;
    public String fontName;
    public int fontSize;
    public Font f;
    public Color c = Color.BLACK;
    public List<Position> lines = new ArrayList<>(),
            rectangles = new ArrayList<>(),
            filledRectangles = new ArrayList<>(),
            roundRectangles = new ArrayList<>(),
            filledRoundRectangles = new ArrayList<>(),
            ovals = new ArrayList<>(),
            filledOvals = new ArrayList<>(),
            arcs = new ArrayList<>(),
            filledArcs = new ArrayList<>(),
            polylines = new ArrayList<>(),
            polygons = new ArrayList<>(),
            filledPolygons = new ArrayList<>(),
            images = new ArrayList<>(),
            texts = new ArrayList<>();
    public int xiBound,
            xfBound,
            yiBound,
            yfBound;

    public Exercitiul_3_4() {
        initComponents();
        value1TextField.setVisible(false);
        value2TextField.setVisible(false);
        chooseButton.setVisible(false);
        fontNameComboBox.setVisible(false);
        fontSizeTextField.setVisible(false);
        plainCheckBox.setVisible(false);
        italicCheckBox.setVisible(false);
        boldCheckBox.setVisible(false);
        writeTextField.setVisible(false);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String familii[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < familii.length; i++) {
            fontNameComboBox.addItem(familii[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        culoareComboBox = new javax.swing.JComboBox<>();
        shapeComboBox = new javax.swing.JComboBox<>();
        value1TextField = new javax.swing.JTextField();
        value2TextField = new javax.swing.JTextField();
        chooseButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        fontNameComboBox = new javax.swing.JComboBox<>();
        fontSizeTextField = new javax.swing.JTextField();
        plainCheckBox = new javax.swing.JCheckBox();
        italicCheckBox = new javax.swing.JCheckBox();
        boldCheckBox = new javax.swing.JCheckBox();
        writeTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        culoareComboBox.setBackground(new java.awt.Color(204, 255, 204));
        culoareComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Green", "Blue", "Magenta", "Cyan", "Yellow" }));
        culoareComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Color", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 10))); // NOI18N
        culoareComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                culoareComboBoxItemStateChanged(evt);
            }
        });

        shapeComboBox.setBackground(new java.awt.Color(204, 255, 204));
        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Line", "Rectangle", "Filled Rectangle", "Round Rectangle", "Filled Round Rectangle", "Oval", "Filled Oval", "Arc", "Filled Arc", "Polyline", "Polygon", "Filled Polygon", "Image from disk", "Text" }));
        shapeComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shape", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 10))); // NOI18N
        shapeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shapeComboBoxItemStateChanged(evt);
            }
        });

        value1TextField.setBackground(new java.awt.Color(204, 255, 255));
        value1TextField.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        value1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value1TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start angle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 10))); // NOI18N

        value2TextField.setBackground(new java.awt.Color(204, 255, 255));
        value2TextField.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        value2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value2TextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Angle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri Light", 0, 10))); // NOI18N

        chooseButton.setBackground(new java.awt.Color(102, 255, 102));
        chooseButton.setText("Choose image");
        chooseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chooseButtonMousePressed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(255, 102, 102));
        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonMousePressed(evt);
            }
        });

        fontNameComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        fontNameComboBox.setMinimumSize(new java.awt.Dimension(144, 40));
        fontNameComboBox.setPreferredSize(new java.awt.Dimension(144, 40));

        fontSizeTextField.setBackground(new java.awt.Color(204, 255, 255));
        fontSizeTextField.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        fontSizeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fontSizeTextField.setText("12");
        fontSizeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font size", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        plainCheckBox.setText("PLAIN");

        italicCheckBox.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        italicCheckBox.setText("ITALIC");

        boldCheckBox.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boldCheckBox.setText("BOLD");

        writeTextField.setBackground(new java.awt.Color(204, 255, 255));
        writeTextField.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        writeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Text", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(culoareComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseButton)
                .addGap(18, 18, 18)
                .addComponent(fontNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(writeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plainCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(italicCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boldCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plainCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(italicCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boldCheckBox)
                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(culoareComboBox)
                        .addComponent(shapeComboBox)
                        .addComponent(value1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(value2TextField)
                        .addComponent(chooseButton)
                        .addComponent(fontNameComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fontSizeTextField)
                        .addComponent(writeTextField)))
                .addGap(461, 461, 461))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xiBound = 0;
        xfBound = this.getBounds().width;
        yiBound = 50;
        yfBound = this.getBounds().height;

        switch (shapeComboBox.getSelectedItem().toString()) {
            case "Line":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    lines.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    rectangles.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Filled Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledRectangles.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;
            case "Round Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    roundRectangles.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Filled Round Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledRoundRectangles.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Oval":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    ovals.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Filled Oval":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledOvals.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Arc":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    arcs.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Filled Arc":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledArcs.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Polyline":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    polylines.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Polygon":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    polygons.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Filled Polygon":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledPolygons.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Image from disk":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    images.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));
                    repaint();
                }
                break;

            case "Text":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    texts.add(new Position(evt.getX(), evt.getY(), evt.getX(), evt.getY(), c));

                    fontName = fontNameComboBox.getSelectedItem().toString();
                    fontSize = ("".equals(fontSizeTextField.getText())) ? 12 : Integer.parseInt(fontSizeTextField.getText());

                    if ((!plainCheckBox.isSelected() && !italicCheckBox.isSelected() && !boldCheckBox.isSelected())
                            || (plainCheckBox.isSelected() && italicCheckBox.isSelected() && boldCheckBox.isSelected())) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.PLAIN, fontSize);
                    } else if (plainCheckBox.isSelected() && boldCheckBox.isSelected()) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.PLAIN + Font.BOLD, fontSize);
                        italicCheckBox.setSelected(false);

                    } else if (italicCheckBox.isSelected() && boldCheckBox.isSelected()) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.ITALIC + Font.BOLD, fontSize);
                        plainCheckBox.setSelected(false);

                    } else if (plainCheckBox.isSelected()) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.PLAIN, fontSize);
                        italicCheckBox.setSelected(false);

                    } else if (italicCheckBox.isSelected()) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.ITALIC, fontSize);
                        plainCheckBox.setSelected(false);

                    } else if (boldCheckBox.isSelected()) {
                        texts.get(texts.size() - 1).font = new Font(fontName, Font.BOLD, fontSize);

                    }
                    texts.get(texts.size() - 1).text = writeTextField.getText();
                    repaint();
                }
                break;

            default:
                break;
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        xiBound = 0;
        xfBound = this.getBounds().width;
        yiBound = 50;
        yfBound = this.getBounds().height;

        switch (shapeComboBox.getSelectedItem().toString()) {
            case "Line":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    lines.get(lines.size() - 1).xf = evt.getX();
                    lines.get(lines.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    rectangles.get(rectangles.size() - 1).xf = evt.getX();
                    rectangles.get(rectangles.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Filled Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledRectangles.get(filledRectangles.size() - 1).xf = evt.getX();
                    filledRectangles.get(filledRectangles.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;
            case "Round Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    roundRectangles.get(roundRectangles.size() - 1).xf = evt.getX();
                    roundRectangles.get(roundRectangles.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Filled Round Rectangle":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledRoundRectangles.get(filledRoundRectangles.size() - 1).xf = evt.getX();
                    filledRoundRectangles.get(filledRoundRectangles.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Oval":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    ovals.get(ovals.size() - 1).xf = evt.getX();
                    ovals.get(ovals.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Filled Oval":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledOvals.get(filledOvals.size() - 1).xf = evt.getX();
                    filledOvals.get(filledOvals.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Arc":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    arcs.get(arcs.size() - 1).xf = evt.getX();
                    arcs.get(arcs.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Filled Arc":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledArcs.get(filledArcs.size() - 1).xf = evt.getX();
                    filledArcs.get(filledArcs.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Polyline":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    polylines.get(polylines.size() - 1).xf = evt.getX();
                    polylines.get(polylines.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Polygon":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    polygons.get(polygons.size() - 1).xf = evt.getX();
                    polygons.get(polygons.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Filled Polygon":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    filledPolygons.get(filledPolygons.size() - 1).xf = evt.getX();
                    filledPolygons.get(filledPolygons.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Image from disk":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    images.get(images.size() - 1).xf = evt.getX();
                    images.get(images.size() - 1).yf = evt.getY();
                    repaint();
                }
                break;

            case "Text":
                if (evt.getX() >= xiBound && evt.getX() <= xfBound && evt.getY() >= yiBound && evt.getY() <= yfBound) {
                    texts.get(texts.size() - 1).xi = evt.getX();
                    texts.get(texts.size() - 1).yi = evt.getY();
                    repaint();
                }
                break;

            default:
                break;
        }
    }//GEN-LAST:event_formMouseDragged

    private void chooseButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseButtonMousePressed
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(null) == 0) {
            try {
                img = ImageIO.read(jfc.getSelectedFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_chooseButtonMousePressed

    private void resetButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMousePressed
        lines.clear();
        rectangles.clear();
        filledRectangles.clear();
        roundRectangles.clear();
        filledRoundRectangles.clear();
        ovals.clear();
        filledOvals.clear();
        arcs.clear();
        filledArcs.clear();
        polylines.clear();
        polygons.clear();
        filledPolygons.clear();
        images.clear();
        texts.clear();
        repaint();
    }//GEN-LAST:event_resetButtonMousePressed

    private void shapeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_shapeComboBoxItemStateChanged
        Object item = evt.getItem();

        switch (item.toString()) {
            case "Line":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Rectangle":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Filled Rectangle":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;
            case "Round Rectangle":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Filled Round Rectangle":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Oval":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Filled Oval":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Arc":
                chooseButton.setVisible(false);
                value1TextField.setVisible(true);
                value2TextField.setVisible(true);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                revalidate();
                break;

            case "Filled Arc":
                chooseButton.setVisible(false);
                value1TextField.setVisible(true);
                value2TextField.setVisible(true);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                revalidate();
                break;

            case "Polyline":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Polygon":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Filled Polygon":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                break;

            case "Image from disk":
                chooseButton.setVisible(true);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(false);
                fontSizeTextField.setVisible(false);
                plainCheckBox.setVisible(false);
                italicCheckBox.setVisible(false);
                boldCheckBox.setVisible(false);
                writeTextField.setVisible(false);
                repaint();
                revalidate();
                break;

            case "Text":
                chooseButton.setVisible(false);
                value1TextField.setVisible(false);
                value2TextField.setVisible(false);
                fontNameComboBox.setVisible(true);
                fontSizeTextField.setVisible(true);
                plainCheckBox.setVisible(true);
                italicCheckBox.setVisible(true);
                boldCheckBox.setVisible(true);
                writeTextField.setVisible(true);
                repaint();
                revalidate();
                break;

            default:
                break;
        }


    }//GEN-LAST:event_shapeComboBoxItemStateChanged

    private void culoareComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_culoareComboBoxItemStateChanged
        Object item = evt.getItem();

        switch (item.toString()) {
            case "Black":
                c = Color.black;
                break;
            case "Red":
                c = Color.red;
                break;
            case "Green":
                c = Color.green;
                break;
            case "Blue":
                c = Color.blue;
                break;
            case "Magenta":
                c = Color.magenta;
                break;
            case "Cyan":
                c = Color.cyan;
                break;
            case "Yellow":
                c = Color.yellow;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_culoareComboBoxItemStateChanged

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        xiBound = 1;
        xfBound = this.getBounds().width - 3;
        yiBound = 50;
        yfBound = this.getBounds().height - 52;
        g.setColor(Color.black);
        g.drawRect(xiBound, yiBound, xfBound, yfBound);

        for (Position p : lines) {
            g.setColor(p.color);
            g.drawLine(p.xi, p.yi, p.xf, p.yf);
        }

        for (Position p : rectangles) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.drawRect(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.drawRect(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf);
            } else if ((p.xf - p.xi <= 0)) {
                g.drawRect(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi);
            } else {
                g.drawRect(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf);
            }
        }

        for (Position p : filledRectangles) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.fillRect(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.fillRect(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf);
            } else if ((p.xf - p.xi <= 0)) {
                g.fillRect(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi);
            } else {
                g.fillRect(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf);
            }
        }

        for (Position p : roundRectangles) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.drawRoundRect(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi, 50, 50);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.drawRoundRect(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf, 50, 50);
            } else if ((p.xf - p.xi <= 0)) {
                g.drawRoundRect(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi, 50, 50);
            } else {
                g.drawRoundRect(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf, 50, 50);
            }
        }

        for (Position p : filledRoundRectangles) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.fillRoundRect(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi, 50, 50);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.fillRoundRect(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf, 50, 50);
            } else if ((p.xf - p.xi <= 0)) {
                g.fillRoundRect(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi, 50, 50);
            } else {
                g.fillRoundRect(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf, 50, 50);
            }
        }

        for (Position p : ovals) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.drawOval(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.drawOval(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf);
            } else if ((p.xf - p.xi <= 0)) {
                g.drawOval(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi);
            } else {
                g.drawOval(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf);
            }
        }

        for (Position p : filledOvals) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.fillOval(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.fillOval(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf);
            } else if ((p.xf - p.xi <= 0)) {
                g.fillOval(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi);
            } else {
                g.fillOval(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf);
            }
        }

        int value1 = ("".equals(value1TextField.getText())) ? 0 : Integer.parseInt(value1TextField.getText());
        int value2 = ("".equals(value2TextField.getText())) ? 0 : Integer.parseInt(value2TextField.getText());
        for (Position p : arcs) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.drawArc(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi, value1, value2);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.drawArc(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf, value1, value2);
            } else if ((p.xf - p.xi <= 0)) {
                g.drawArc(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi, value1, value2);
            } else {
                g.drawArc(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf, value1, value2);
            }
        }

        value1 = ("".equals(value1TextField.getText())) ? 0 : Integer.parseInt(value1TextField.getText());
        value2 = ("".equals(value2TextField.getText())) ? 0 : Integer.parseInt(value2TextField.getText());
        for (Position p : filledArcs) {
            g.setColor(p.color);
            if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                g.fillArc(p.xi, p.yi, p.xf - p.xi, p.yf - p.yi, value1, value2);
            } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                g.fillArc(p.xf, p.yf, p.xi - p.xf, p.yi - p.yf, value1, value2);
            } else if ((p.xf - p.xi <= 0)) {
                g.fillArc(p.xf, p.yi, p.xi - p.xf, p.yf - p.yi, value1, value2);
            } else {
                g.fillArc(p.xi, p.yf, p.xf - p.xi, p.yi - p.yf, value1, value2);
            }
        }

        int[] x = new int[polylines.size()];
        int[] y = new int[polylines.size()];
        for (int i = 0; i < polylines.size(); i++) {
            x[i] = polylines.get(i).xf;
            y[i] = polylines.get(i).yf;
            g.setColor(c);
        }
        g.drawPolyline(x, y, polylines.size());

        x = new int[polygons.size()];
        y = new int[polygons.size()];
        for (int i = 0; i < polygons.size(); i++) {
            x[i] = polygons.get(i).xf;
            y[i] = polygons.get(i).yf;
            g.setColor(c);
        }
        g.drawPolygon(x, y, polygons.size());

        x = new int[filledPolygons.size()];
        y = new int[filledPolygons.size()];
        for (int i = 0; i < filledPolygons.size(); i++) {
            x[i] = filledPolygons.get(i).xf;
            y[i] = filledPolygons.get(i).yf;
            g.setColor(c);
        }
        g.fillPolygon(x, y, filledPolygons.size());

        for (Position p : images) {
            g.setColor(p.color);
            if (img != null) {
                if ((p.xf - p.xi >= 0) && (p.yf - p.yi >= 0)) {
                    g.drawImage(img, p.xi, p.yi, p.xf - p.xi, p.yf - p.yi, this);
                } else if ((p.xf - p.xi <= 0) && (p.yf - p.yi <= 0)) {
                    g.drawImage(img, p.xf, p.yf, p.xi - p.xf, p.yi - p.yf, this);
                } else if ((p.xf - p.xi <= 0)) {
                    g.drawImage(img, p.xf, p.yi, p.xi - p.xf, p.yf - p.yi, this);
                } else {
                    g.drawImage(img, p.xi, p.yf, p.xf - p.xi, p.yi - p.yf, this);
                }
            } else {
                System.out.println("No image selected.");
            }
        }

        for (Position p : texts) {
            g.setColor(p.color);
            g.setFont(p.font);
            if (p.text != null) {
                g.drawString(p.text, p.xi, p.yi);
            } else {
                System.out.println("No string.");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boldCheckBox;
    private javax.swing.JButton chooseButton;
    private javax.swing.JComboBox<String> culoareComboBox;
    private javax.swing.JComboBox<String> fontNameComboBox;
    private javax.swing.JTextField fontSizeTextField;
    private javax.swing.JCheckBox italicCheckBox;
    private javax.swing.JCheckBox plainCheckBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> shapeComboBox;
    private javax.swing.JTextField value1TextField;
    private javax.swing.JTextField value2TextField;
    private javax.swing.JTextField writeTextField;
    // End of variables declaration//GEN-END:variables
}

class Position {

    int xi;
    int yi;
    int xf;
    int yf;
    String text;
    Font font;
    Color color;

    public Position(int xi, int yi, int xf, int yf, Color color) {
        this.xi = xi;
        this.yi = yi;
        this.xf = xf;
        this.yf = yf;
        this.color = color;
        this.text = null;
        this.font = null;
    }
}
