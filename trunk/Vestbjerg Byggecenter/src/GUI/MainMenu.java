/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainMenu.java
 *
 * Created on 09-06-2010, 10:44:05
 */
package GUI;

import java.awt.KeyboardFocusManager;
import java.util.HashSet;
import java.util.Set;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 *
 * @author Erik
 */
public class MainMenu extends javax.swing.JFrame {

    /** Creates new form MainMenu */
    public MainMenu() {
        initComponents();
        setupKeyboardshortcuts();
        testMenu1.setKundehaandtering(kundehaandtering1);
        testMenu1.setLagerstyring(lagerstyring1);
        testMenu1.setMedarbejderhaandtering(medarbejderhaandtering1);
        testMenu1.setSaleMenu(gUISale1);

    }

    public void setupKeyboardshortcuts() {
        InputMap im = jTabbedPaneMainMenu.getInputMap(jTabbedPaneMainMenu.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        KeyStroke controlTab = KeyStroke.getKeyStroke("control TAB");
        im.put(controlTab, "navigateRight");
//        System.out.println(jTabbedPaneMainMenu.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        Set newForwardKeys = new HashSet();
        newForwardKeys.add(KeyStroke.getKeyStroke("TAB"));
        jTabbedPaneMainMenu.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, newForwardKeys);
//        System.out.println(jTabbedPaneMainMenu.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));

        KeyStroke controlTab2 = KeyStroke.getKeyStroke("control shift TAB");
        im.put(controlTab2, "navigateLeft");
//        System.out.println(jTabbedPane1.getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        Set newBackwardKeys = new HashSet();
        newBackwardKeys.add(KeyStroke.getKeyStroke("shift TAB"));
        jTabbedPaneMainMenu.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, newBackwardKeys);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMainMenu = new javax.swing.JTabbedPane();
        lagerstyring1 = new GUI.Lagerstyring();
        kundehaandtering1 = new GUI.Kundehaandtering();
        medarbejderhaandtering1 = new GUI.Medarbejderhaandtering();
        gUISale1 = new GUI.SaleMenu();
        udlejning1 = new GUI.Udlejning();
        testMenu1 = new GUI.TestMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneMainMenu.addTab("Lagerstyring", lagerstyring1);
        jTabbedPaneMainMenu.addTab("Kundehåndtering", kundehaandtering1);
        jTabbedPaneMainMenu.addTab("Medarbejderhåndtering", medarbejderhaandtering1);
        jTabbedPaneMainMenu.addTab("Salg", gUISale1);
        jTabbedPaneMainMenu.addTab("Udlejning", udlejning1);
        jTabbedPaneMainMenu.addTab("Test", testMenu1);

        getContentPane().add(jTabbedPaneMainMenu, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//                  UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//                  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//                  javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
//                    new MainMenu().setVisible(true);
                    JFrame mainMenu = new MainMenu();
                    mainMenu.setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleMenu gUISale1;
    private javax.swing.JTabbedPane jTabbedPaneMainMenu;
    private GUI.Kundehaandtering kundehaandtering1;
    private GUI.Lagerstyring lagerstyring1;
    private GUI.Medarbejderhaandtering medarbejderhaandtering1;
    private GUI.TestMenu testMenu1;
    private GUI.Udlejning udlejning1;
    // End of variables declaration//GEN-END:variables
}
