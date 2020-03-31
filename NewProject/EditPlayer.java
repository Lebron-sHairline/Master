/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewProject;

/**
 *
 * @author ReLL
 */
public class EditPlayer extends javax.swing.JFrame {

    /**
     * Creates new form EditPlayer
     */
    public EditPlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selPlayer = new javax.swing.JLabel();
        jerseyNum = new javax.swing.JLabel();
        Team = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        weightTxt = new javax.swing.JTextField();
        heightTxt = new javax.swing.JTextField();
        teamTxt = new javax.swing.JTextField();
        jerseyTxt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        position = new javax.swing.JLabel();
        saveBut = new javax.swing.JToggleButton();
        deleteBut = new javax.swing.JToggleButton();
        posBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit a Player");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit Player Data below");

        selPlayer.setText("Choose a Player");

        jerseyNum.setText("Jersey Number");

        Team.setText("Team");

        height.setText("Height");

        weight.setText("Weight");

        weightTxt.setText("jTextField1");

        heightTxt.setText("jTextField2");
        heightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTxtActionPerformed(evt);
            }
        });

        teamTxt.setText("jTextField3");

        jerseyTxt.setText("jTextField4");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        position.setText("Player Position");

        saveBut.setText("Save");

        deleteBut.setText("Delete");

        posBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(position)
                    .addComponent(weight)
                    .addComponent(height)
                    .addComponent(Team)
                    .addComponent(jerseyNum)
                    .addComponent(selPlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(posBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jerseyTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(teamTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(heightTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(saveBut)
                .addGap(65, 65, 65)
                .addComponent(deleteBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selPlayer)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jerseyNum)
                    .addComponent(jerseyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Team)
                        .addGap(18, 18, 18)
                        .addComponent(position))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(posBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(height)
                    .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weight)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBut)
                    .addComponent(deleteBut))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTxtActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Team;
    private javax.swing.JToggleButton deleteBut;
    private javax.swing.JLabel height;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jerseyNum;
    private javax.swing.JTextField jerseyTxt;
    private javax.swing.JComboBox<String> posBox;
    private javax.swing.JLabel position;
    private javax.swing.JToggleButton saveBut;
    private javax.swing.JLabel selPlayer;
    private javax.swing.JTextField teamTxt;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
