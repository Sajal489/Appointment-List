package sa.edu.rctc.appointmentlist;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListGUI extends javax.swing.JFrame {

    public ListGUI() {
        initComponents();
    }
    static ArrayList<Customer> List = new ArrayList<>();
    static ArrayList<Customer> am = new ArrayList<>();
    static ArrayList<Customer> pm = new ArrayList<>();
    static ArrayList<Customer> newList = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        NameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        TimeList = new javax.swing.JComboBox<>();
        ShowList = new javax.swing.JButton();
        ClearText = new javax.swing.JButton();
        NewList = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 0, 51));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Appointment List For Comapany X");

        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        NameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NameLabel.setText("Name: ");

        nameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addButton.setText("Add Customer");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        TimeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "9:00am", "9:30am", "10:00am", "10:30am", "11:00am", "11:30am", "12:00pm", "12:30pm", "1:00pm", "1:30pm", "2:00pm", "2:30pm", "3:00pm", "3:30pm", "4:00pm", "4:30pm", "5:00pm", "5:30pm", "6:00pm" }));
        TimeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeListActionPerformed(evt);
            }
        });

        ShowList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ShowList.setText("Show List");
        ShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowListActionPerformed(evt);
            }
        });

        ClearText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ClearText.setText("Clear Names");
        ClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTextActionPerformed(evt);
            }
        });

        NewList.setBackground(new java.awt.Color(255, 0, 0));
        NewList.setForeground(new java.awt.Color(0, 0, 0));
        NewList.setText("New List");
        NewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewListActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimeList, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ShowList)
                                        .addGap(76, 76, 76)
                                        .addComponent(ClearText)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewList)
                        .addGap(102, 102, 102)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel))
                        .addGap(46, 46, 46)
                        .addComponent(TimeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(addButton)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowList)
                            .addComponent(ClearText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewList)
                            .addComponent(Exit)
                            .addComponent(Print))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String name = nameField.getText();

        if (name.length() == 0 || TimeList.getSelectedItem().toString().compareToIgnoreCase("Select") == 0) {
            outputArea.setText(null);
            outputArea.append("You need to put in a Name and a appropriate time");
        } else {

            outputArea.setText(null);

            int id = 0;
            int p = 0;
            boolean key = true;

            String time = TimeList.getSelectedItem().toString().replaceAll(":", " ");

            if (time.length() == 6) {
                int t1 = Integer.parseInt(time.substring(0, 1));

                int t2 = Integer.parseInt(time.substring(2, 4));

                p = t1 * 100;
                int q = t2;

                id = p + q;

            } else if (time.length() == 7) {

                int t1 = Integer.parseInt(time.substring(0, 2));

                int t2 = Integer.parseInt(time.substring(3, 5));

                if (t1 == 12) {

                    p = 12;
                } else {

                    p = t1 * 100;
                }
                int q = t2;

                id = p + q;

            }

            List.add(new Customer(name, TimeList.getSelectedItem().toString(), id));
            outputArea.append("\n" + name + " was added");

            ArrayList<Customer> List2 = List;

            for (int i = 0; i < List.size(); i++) {
                for (int j = 0; j < List2.size(); j++) {

                    if (List.get(i).getId() == List2.get(j).getId() && List.get(i).getName().compareToIgnoreCase(List.get(j).getName()) == 0 && i != j) {
                        outputArea.setText(null);
                        outputArea.append("You cannot have one person take up more than one slot on the list");
                        List.remove(i);
                    }

                }
            }

        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void TimeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeListActionPerformed

    }//GEN-LAST:event_TimeListActionPerformed

    private void ShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowListActionPerformed

        outputArea.setText(null);

        if (List.size() == 0) {
            outputArea.append("There are no customers entered");
        } else {

            am.clear();
            pm.clear();
            newList.clear();

            sort();

            for (int i = 0; i < newList.size(); i++) {
                outputArea.append("\n" + newList.get(i).toString());
            }

        }


    }//GEN-LAST:event_ShowListActionPerformed

    public static void sort() {

        create();
        quicksortTime(am, 0, am.size() - 1);
        quicksortTime(pm, 0, pm.size() - 1);

        for (int i = 0; i < am.size(); i++) {

            newList.add(am.get(i));
        }
        for (int i = 0; i < pm.size(); i++) {

            newList.add(pm.get(i));
        }

    }
    private void ClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTextActionPerformed
        outputArea.setText(null);
    }//GEN-LAST:event_ClearTextActionPerformed

    private void NewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewListActionPerformed
        List.clear();
        outputArea.setText(null);
    }//GEN-LAST:event_NewListActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        String s = outputArea.getText();

        try {
            PrintWriter out = new PrintWriter("output.txt");
            for (int i = 0; i < List.size(); i++) {
                out.println(List.get(i));
            }
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PrintActionPerformed

    public static void quicksortTime(ArrayList<Customer> a, int p, int r) {

        if (p < r) {
            int q = partition(a, p, r);
            quicksortTime(a, p, q);
            quicksortTime(a, q + 1, r);
        }

    }

    public static int partition(ArrayList<Customer> a, int p, int r) {
        int x = a.get(p).getId();

        int i = p - 1;
        int j = r + 1;

        while (true) {

            do {
                j--;
            } while (a.get(j).getId() > x);

            do {
                i++;
            } while (a.get(i).getId() < x);

            if (i < j) {

                Customer temp = a.get(j);
                a.set(j, a.get(i));
                a.set(i, temp);
            } else {
                return j;
            }

        }

    }

    public static void create() {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getTime().length() == 6) {
                if (List.get(i).getTime().substring(4, 6).compareToIgnoreCase("am") == 0) {

                    am.add(List.get(i));
                } else {
                    pm.add(List.get(i));
                }

            } else {
                if (List.get(i).getTime().substring(5, 7).compareToIgnoreCase("am") == 0) {
                    am.add(List.get(i));
                } else {
                    pm.add(List.get(i));
                }

            }
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearText;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton NewList;
    private javax.swing.JButton Print;
    private javax.swing.JButton ShowList;
    private javax.swing.JComboBox<String> TimeList;
    private javax.swing.JLabel Title;
    private javax.swing.JButton addButton;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nameField;
    private javax.swing.JTextArea outputArea;
    // End of variables declaration//GEN-END:variables
}
