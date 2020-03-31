/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewProject;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ReLL
 */
public class AddPlayer extends javax.swing.JFrame {

    ArrayList<Player> players;

    public AddPlayer() {
        initComponents();
        players = new ArrayList<Player>();
        populateArrayList();
    }

    public void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("Player.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    players.add((Player) inputFile.readObject());
//                } catch (Execption e) {
//                    JOptionPane.showMessageDialog(null, e.getMessage());
//                    endOfFile = true;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddPlayer.class.getName()).log(Level.SEVERE, null, ex);
                } 

            }
            inputFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void savePlayersToFile(){
    try{
    FileOutputStream file = new FileOutputStream("Player.dat");
    ObjectOutputStream outputFile = new ObjectOutputStream(file);
        for (int i = 0; i < players.size(); i++) {
            outputFile.writeObject(players.get(i));
        }
    outputFile.close();
    JOptionPane.showMessageDialog(null, "Succesfully saved");
     this.dispose();
    }
    catch(IOException e){
    JOptionPane.showMessageDialog(null, e.getMessage());
   
    }
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        pCurrTeam = new javax.swing.JLabel();
        jerseyNumber = new javax.swing.JLabel();
        playerTxt = new javax.swing.JTextField();
        pTeamTxt = new javax.swing.JTextField();
        jerseyTxt = new javax.swing.JTextField();
        playerPosition = new javax.swing.JLabel();
        saveBut = new javax.swing.JToggleButton();
        height = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        weightTxt = new javax.swing.JTextField();
        posBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Player");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add a new player by entering the data below");

        playerName.setText("Player Name");

        pCurrTeam.setText("Player Current Team");

        jerseyNumber.setText("Jersey Number");

        jerseyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jerseyTxtActionPerformed(evt);
            }
        });

        playerPosition.setText("Player Position");

        saveBut.setText("Save");
        saveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButActionPerformed(evt);
            }
        });

        height.setText("Height");

        weight.setText("Weight");

        posBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pCurrTeam)
                            .addComponent(playerName)
                            .addComponent(jerseyNumber)
                            .addComponent(playerPosition)
                            .addComponent(height)
                            .addComponent(weight))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pTeamTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jerseyTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 201, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(saveBut)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerName)
                    .addComponent(playerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCurrTeam)
                    .addComponent(pTeamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jerseyNumber)
                    .addComponent(jerseyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerPosition)
                    .addComponent(posBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(height)
                    .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weight)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(saveBut)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jerseyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jerseyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jerseyTxtActionPerformed

    private void saveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButActionPerformed
//        if (heightTxt.getText().isEmpty() || jerseyTxt.getText().isEmpty() || pTeamTxt.getText().isEmpty() || playerTxt.getText().isEmpty()
//                || weightTxt.getText().isEmpty()) {
    if((playerTxt.getText().isEmpty() || jerseyTxt.getText().isEmpty())){          
    JOptionPane.showMessageDialog(null, "All fields required");
        } else {
            String playerName1 = playerTxt.getText().trim();
            //String currTeam = pTeamTxt.getText().trim();
            String jersey = jerseyTxt.getText().trim();
            // String position = posTxt.getText().trim();
            //String height1 = heightTxt.getText().trim();
            //String weight1 = weightTxt.getText().trim();
            Player player = new Player(Double.parseDouble(jersey),playerName1); 
            players.add(player);
            savePlayersToFile();
    }
    }//GEN-LAST:event_saveButActionPerformed
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel height;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jerseyNumber;
    private javax.swing.JTextField jerseyTxt;
    private javax.swing.JLabel pCurrTeam;
    private javax.swing.JTextField pTeamTxt;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerPosition;
    private javax.swing.JTextField playerTxt;
    private javax.swing.JComboBox<String> posBox;
    private javax.swing.JToggleButton saveBut;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
