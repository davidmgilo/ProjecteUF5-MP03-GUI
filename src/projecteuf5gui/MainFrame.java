/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5gui;

import java.awt.event.WindowEvent;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumne
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public MainFrame(){
        initComponents();
        try{
            carregaFitxer();
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Error en la càrrega",JOptionPane.ERROR_MESSAGE);
        }finally{
            setPrincipi();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        llistarButton = new javax.swing.JButton();
        crudAnimalButton = new javax.swing.JButton();
        crudAlimentButton = new javax.swing.JButton();
        sortirButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AlimentPanel = new javax.swing.JPanel();
        AnimalPanel = new javax.swing.JPanel();
        llistarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(24, 29, 47));

        jPanel2.setBackground(new java.awt.Color(24, 29, 47));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        llistarButton.setText("Llistar Animals");
        llistarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llistarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(llistarButton, java.awt.BorderLayout.LINE_START);

        crudAnimalButton.setText("CRUD Animal");
        crudAnimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudAnimalButtonActionPerformed(evt);
            }
        });
        jPanel2.add(crudAnimalButton, java.awt.BorderLayout.CENTER);

        crudAlimentButton.setText("CRUD Aliment");
        crudAlimentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudAlimentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(crudAlimentButton, java.awt.BorderLayout.PAGE_START);

        sortirButton.setText("Sortir");
        sortirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortirButtonActionPerformed(evt);
            }
        });
        jPanel2.add(sortirButton, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(24, 29, 47));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel3.setLayout(new java.awt.CardLayout());

        AlimentPanel.setBackground(new java.awt.Color(227, 24, 24));

        javax.swing.GroupLayout AlimentPanelLayout = new javax.swing.GroupLayout(AlimentPanel);
        AlimentPanel.setLayout(AlimentPanelLayout);
        AlimentPanelLayout.setHorizontalGroup(
            AlimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        AlimentPanelLayout.setVerticalGroup(
            AlimentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jPanel3.add(AlimentPanel, "card2");

        AnimalPanel.setBackground(new java.awt.Color(24, 227, 42));

        javax.swing.GroupLayout AnimalPanelLayout = new javax.swing.GroupLayout(AnimalPanel);
        AnimalPanel.setLayout(AnimalPanelLayout);
        AnimalPanelLayout.setHorizontalGroup(
            AnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        AnimalPanelLayout.setVerticalGroup(
            AnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jPanel3.add(AnimalPanel, "card2");

        llistarPanel.setBackground(new java.awt.Color(220, 227, 24));

        javax.swing.GroupLayout llistarPanelLayout = new javax.swing.GroupLayout(llistarPanel);
        llistarPanel.setLayout(llistarPanelLayout);
        llistarPanelLayout.setHorizontalGroup(
            llistarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        llistarPanelLayout.setVerticalGroup(
            llistarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jPanel3.add(llistarPanel, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llistarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llistarButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.revalidate();
        jPanel3.add(llistarPanel);
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_llistarButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:       
        guardaFitxer();
    }//GEN-LAST:event_formWindowClosing

    private void sortirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortirButtonActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_sortirButtonActionPerformed

    private void crudAlimentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudAlimentButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.revalidate();
        jPanel3.add(AlimentPanel);
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_crudAlimentButtonActionPerformed

    private void crudAnimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudAnimalButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.revalidate();
        jPanel3.add(AnimalPanel);
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_crudAnimalButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public static ArrayList<Animal> animals;
    public static TreeSet<Aliment> aliments;
    public static File f = new File("animals.dat");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlimentPanel;
    private javax.swing.JPanel AnimalPanel;
    private javax.swing.JButton crudAlimentButton;
    private javax.swing.JButton crudAnimalButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton llistarButton;
    private javax.swing.JPanel llistarPanel;
    private javax.swing.JButton sortirButton;
    // End of variables declaration//GEN-END:variables

    private void guardaFitxer() {
            try (
                ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
                )
            {                                   
                
                for(int i=0;i<animals.size();i++)
                {
                    try{
                        Animal a=(Animal)animals.get(i);
                        out.writeObject(a);
                    }
                    catch(Exception ex){
                        break;
                    }
                }
                out.close();
            }catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"Error en la escriptura",JOptionPane.ERROR_MESSAGE);
            }
    }

    private void carregaFitxer() throws IOException {
       animals = new ArrayList<>();
       aliments = new TreeSet<>();
       
       if(f.exists()){
           ObjectInputStream entrada=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
               
                while(true)
                {
                    try{
                        Animal a=(Animal)entrada.readObject();
                        animals.add(a);
                        ArrayList<Aliment> la =a.get5menja();
                        aliments.addAll(la);
                    }
                    catch(Exception ex){
                        break;
                    }
                }
                entrada.close();      
       }else{
           JOptionPane.showMessageDialog(rootPane, "No s'ha carregat correctament","Error en la càrrega",JOptionPane.ERROR_MESSAGE);
       }
 
    }

    private void setPrincipi() {
       jPanel3.removeAll();
       jPanel3.revalidate();
       jPanel3.add(llistarPanel);
       jPanel3.revalidate();
       jPanel3.repaint();
    }
}

class ModelTaula<T> extends AbstractTableModel {
    
    final Class<T> typeParameterClass;

    private String[] columnNames;
    private List<T> dades;

    public ModelTaula(String[] nomColumnes, ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        
        this.columnNames = nomColumnes;
        this.dades = dades;
    }

    public ModelTaula(ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        if(dades!=null && !dades.isEmpty()){
            //Obtinc els noms de les columnes a partir de la reflexió de la classe
            //Class<?> classe = dades.get(0).getClass();
            Class<?> classe = this.typeParameterClass;

            //Anoto el nº de camps de la classe
            int ncamps = classe.getDeclaredFields().length;

            //Omplo l'array de noms de columna a partir del camps de la classe. Se suposa que el format dels noms dels camps 
            //és _xnom_camp, sent x un enter major o igual que 0, per això elimino els dígits i el _
            this.columnNames=new String[ncamps];

            for(int i=0;i<ncamps;i++){
                //Busquem el primer grup de _dígits numèrics del nom de camp
                Matcher matcher = Pattern.compile("_\\d+").matcher(classe.getDeclaredFields()[i].getName());
                matcher.find();
                //El nom que mostrarem serà a partir del següent caracter que hi ha després del _grup numèric trobat
                this.columnNames[i]=classe.getDeclaredFields()[i].getName().substring(matcher.group().length()).toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_0-9]", "").toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_\\d]", "").toUpperCase();
            }
        }
        this.dades = dades;
    }

    //Necessari per a que mostre el nom de les columnes passat al crear l'objecte
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    //Necessari per a que mostre el número correcte de files de dades
    @Override
    public int getRowCount() {
        int cont=0;
        
        if(dades!=null) cont=dades.size();
        
        return cont;
    }

    //Necessari per a que mostre el número correcte de columnes 
    @Override
    public int getColumnCount() {
        
        int cont=0;
        
        if(columnNames!=null) cont=columnNames.length;
        
        return cont;
    }

    //Necessari per a que mostre les dades passades al crear l'objecte
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Si demanen la columna -1 vol dir que hem de retornar tot l'objecte contingut a la fila
        if(columnIndex==-1) return dades.get(rowIndex);
        Class<?> classe = this.typeParameterClass;
        //Class<?> classe = dades.get(0).getClass();
        //Anotem el nº de camps de la classe
        int ncamps = classe.getDeclaredFields().length;

        Method[] methods = new Method[ncamps];
        int i = 0;
        try {
            for (PropertyDescriptor pD : Introspector.getBeanInfo(classe).getPropertyDescriptors()) {
                Method m = pD.getReadMethod();
                if (m != null & !m.getName().equals("getClass")) {
                    methods[i++] = m;
                }
            }
        } catch (java.beans.IntrospectionException ex) {
            //Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            return methods[columnIndex].invoke(dades.get(rowIndex));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}