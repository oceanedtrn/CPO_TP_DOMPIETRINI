/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_dompietrini._elziere;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author odomp
 */
public class SP4_modeGraphique_DOMPIETRINI_ELZIERE extends javax.swing.JFrame {
Joueur []listeJoueurs = new Joueur[2];
Joueur joueurCourant;
PlateauDeJeu plateau;
    /**
     * Creates new form SP4_modeGraphique_DOMPIETRINI_ELZIERE
     */
    public SP4_modeGraphique_DOMPIETRINI_ELZIERE() {
       plateau  = new PlateauDeJeu();
        initComponents();
        panneau_info_joueur.setVisible(false);
        panneau_info_partie.setVisible(false);
        
        for (int i=5; i>=0; i--){
        for (int j=0; j<7; j++){   
            celluleGraphique cellGraph = new celluleGraphique(plateau.grille[i][j]);
            panneau_grille.add(cellGraph);
        } 
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

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_Joueur1 = new javax.swing.JTextField();
        nom_Joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_j2_joueur = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_col_5 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur2:");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("Nom joueur1:");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nom_Joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_Joueur1ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_Joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, -1));
        panneau_creation_partie.add(nom_Joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, -1));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, 40));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 290, 120));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("infos joueur");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_j1_desint.setText("nbesintjoueur1:");
        panneau_info_joueur.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel5.setText("Joueur 1:");
        panneau_info_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("couleur: ");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel7.setText("desintegrateur :");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel8.setText("nomjoueur1 :");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 20));

        lbl_j1_couleur.setText("couleurjoueur1 :");
        panneau_info_joueur.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 260, 10));

        lbl_j2_desint.setText("nbesintjoueur2:");
        panneau_info_joueur.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel10.setText("Joueur 2:");
        panneau_info_joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel11.setText("couleur: ");
        panneau_info_joueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setText("desintegrateur :");
        panneau_info_joueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lbl_j2_joueur.setText("nomjoueur2 :");
        panneau_info_joueur.add(lbl_j2_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, 20));

        lbl_j2_couleur.setText("couleurjoueur2 :");
        panneau_info_joueur.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 290, 270));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("infos jeu");
        panneau_info_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel13.setText("Joueur courant:");
        panneau_info_partie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 46, 90, 20));

        jLabel14.setText("nomJoueur:");
        panneau_info_partie.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 36, 120, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        message.setViewportView(jTextArea1);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 300, 180));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        setBounds(0, 0, 1046, 758);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_Joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_Joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_Joueur1ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
       
        panneau_info_joueur.setVisible(true);
        panneau_info_partie.setVisible(true);
       
        lancerPartie();
        
        panneau_grille.repaint();
        btn_start.setEnabled(false);
        
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
       jouerDansColonne(0);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
       jouerDansColonne(5);
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
       
        jouerDansColonne(6);
        joueurSuivant();
        
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indice_colonne){
        panneau_grille.repaint();
        
        
        if (joueurCourant.nombreDeJetons() > 0) { //si joueur a jetons encore
                    
                    Jeton joué = joueurCourant.jouerJeton();
                    boolean colonnerem = plateau.colonneRemplie(indice_colonne); //check si colonne vide
                    if (colonnerem == false) {
                        int lig = plateau.ajouterJetonsDansColonne(joueurCourant, indice_colonne); //si colonne vide on pose jeton

                        boolean res = plateau.presenceTrouNoir(lig, indice_colonne);
                        if (res == true) {
                            plateau.supprimerTrouNoir(lig, indice_colonne);
                            plateau.supprimerJeton(lig, indice_colonne);
                            

                        }
                        boolean res2 = plateau.presenceDesintegrateur(lig, indice_colonne);
                        if (res2 == true) {
                            plateau.supprimerDesintegrateur(lig, indice_colonne);
                            joueurCourant.obtenirDesintegrateur();
                            
                        if (res == true && res2 == true){
                            plateau.supprimerTrouNoir(lig, indice_colonne);
                            plateau.supprimerJeton(lig, indice_colonne);
                            plateau.supprimerDesintegrateur(lig, indice_colonne);
                            joueurCourant.obtenirDesintegrateur();
                        }
                        }

                    } 
                    
        lbl_j1_desint.setText(listeJoueurs[0].nombreDesintegrateurs+"");
        lbl_j2_desint.setText(listeJoueurs[1].nombreDesintegrateurs+"");
        
        
        return true;

    }
    return false;
        
    }
    
    
    public void joueurSuivant(){
    
    if (joueurCourant== listeJoueurs [0]){
        joueurCourant=listeJoueurs [1];
        
    }
    else{
        joueurCourant = listeJoueurs[0];    
    }
    jLabel14.setText(joueurCourant.afficherNom());
}

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
            java.util.logging.Logger.getLogger(SP4_modeGraphique_DOMPIETRINI_ELZIERE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SP4_modeGraphique_DOMPIETRINI_ELZIERE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SP4_modeGraphique_DOMPIETRINI_ELZIERE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SP4_modeGraphique_DOMPIETRINI_ELZIERE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SP4_modeGraphique_DOMPIETRINI_ELZIERE().setVisible(true);
            }
        });
    }
   
    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }

     public void lancerPartie(){  
        
       
       
        String nomjoueur1= nom_Joueur1.getText();
        Joueur J1 = new Joueur(nomjoueur1);
        String nomjoueur2= nom_Joueur2.getText();
        Joueur J2 = new Joueur(nomjoueur2);
        listeJoueurs[0]= J1;
        listeJoueurs [1]= J2;
       
        
       attribuerCouleurAuxJoueurs();
       
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    
        plateau.afficherGrilleSurConsole();

       System.out.println(J1.afficherNom() + "est de couleur" + J1.couleur);
       System.out.println(J2.afficherNom() + "est de couleur" + J2.couleur);
       jLabel8.setText(nomjoueur1);
       lbl_j2_joueur.setText(nomjoueur2);
       lbl_j1_couleur.setText(J1.couleur);
        lbl_j2_couleur.setText(J2.couleur);
        
        lbl_j1_desint.setText(J1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(J2.nombreDesintegrateurs + "");
        
        Random r = new Random ();
        boolean le_premier = r.nextBoolean();
        if (le_premier){
            joueurCourant = listeJoueurs[0];
            
        }
        else{
            joueurCourant = listeJoueurs[1];
        }
        /*
        Random r= new Random();
        int joueur= r.nextInt(1);
        joueurCourant = listeJoueurs[0];
        boolean victoire=false;
        
        
       /*
        while (victoire != true){ //si personne gagne
            if (joueur==1){
                joueurCourant = listeJoueurs [0]; //joueur1 qui commence
                        joueur=0; //changement de joueur qui joue
            }
            else
                joueurCourant = listeJoueurs[1]; //joueur2 qui commence
            joueur=1;
        }
        System.out.println ("Que voulez vous faire? \n poser jeton  tapez 1 \n Retirez jeton tapez 2 \n desintegrateur tapez 3 ");
        int choix= saisieUtilisateur.nextInt();
       
        if (choix==1){
            if (joueurCourant.nombreDeJetons()>0){ //si joueur a jetons encore
               
                System.out.println ( "Dans quelle colonne vous voulez poser votre jeton");
                int colonne= saisieUtilisateur.nextInt();
                Jeton joué= joueurCourant.jouerJeton();
                boolean colonnerem= plateau.colonneRemplie(colonne); //check si colonne vide
                if (colonnerem==false){
                    plateau.ajouterJetonsDansColonne(joué, colonne); //si colonne vide on pose jeton
                   
                    for (int i=1; i<=6; i++ ){
                        boolean res=plateau.presenceTrouNoir(i, colonne);
                        if (res== true){
                            plateau.supprimerTrouNoir(i, colonne);
                            plateau.supprimerJeton(i, colonne);
                           
                        }
                    }
                }
                else {
                    System.out.println ("Colonne pleine, en choisir une autre");
                }   
                
            }
            else {
                System.out.println ("plus de jeton dans votre jeu");
               
            }
            String couleur= joueurCourant.afficherCouleur();
            victoire = plateau.etreGagnantePourCouleur(couleur);
            }
            if (choix ==2){ //retirer un jeton
           
                System.out.println ("Dans quelle ligne est le jeton que vous voulez enlever");
                int ligneretirer= saisieUtilisateur.nextInt();
                System.out.println ("Dans quelle est le jeton que vous voulez enlever?");
                int colonneretirer= saisieUtilisateur.nextInt();
                boolean place = plateau.presenceJeton(ligneretirer, colonneretirer);
                String couleurjeton= plateau.lireCouleurDuJeton(ligneretirer, colonneretirer);
                String lirecouleurjeton= plateau.lireCouleurDuJeton(ligneretirer, colonneretirer);
                
                if (place==true & couleurjeton== lirecouleurjeton){
                    plateau.recupererJeton(ligneretirer, colonneretirer);
                    plateau.tassercolonne(ligneretirer,colonneretirer);
                }
                else{
                    System.out.println ("aucun jeton à enlever");
               
            }
            String couleur= joueurCourant.afficherCouleur();
            victoire= plateau.etreGagnantePourCouleur(couleur);
           
        }
        if (choix==3){
            System.out.println("ligne du jeton à desintegrer?");
            int ligneretirer=saisieUtilisateur.nextInt();
            System.out.println("colonne du jeton à desintegrer?");
            int colonneretirer=saisieUtilisateur.nextInt();
            boolean place= plateau.presenceJeton(ligneretirer, colonneretirer);
           
            if (place==true){
                plateau.supprimerJeton(ligneretirer, colonneretirer);
                plateau.tassercolonne(ligneretirer,colonneretirer);
            }
            else{
                System.out.println ("aucun jeton à désintegrer");
               
            }
            joueurCourant.utiliserDesintegrateur();
            String couleur = joueurCourant.afficherCouleur();
            victoire = plateau.etreGagnantePourCouleur(couleur);
        }
    */
    String nom=joueurCourant.afficherNom();
    System.out.println(nom + " gagne");
    }
   
     public void  attribuerCouleurAuxJoueurs(){
        Random r = new Random();
        int c = r.nextInt(1);
        if (c == 0){
            listeJoueurs [0].affecterCouleur("rouge");
            listeJoueurs [1].affecterCouleur("jaune");
        }if (c == 1){
            listeJoueurs [0].affecterCouleur("jaune");
            listeJoueurs [1].affecterCouleur("rouge");
        }
    }
      public void creerEtAffecterJeton(Joueur joueur) {
        Jeton[] jetons = new Jeton[30];
        for (int i = 0; i < 30; i++) {
            jetons[i] = new Jeton(joueur.couleur);
            joueur.ajouterJeton(jetons[i]);
        }
    }

    public void placerTrousNoirsEtDesintegrateurs() {
    Random l = new Random();
        Random c = new Random();
        for (int i = 0; i < 3; i++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                i -= 1;
            }
        }
        for (int j = 0; j < 2; j++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                j -= 1;
            }
        }
        for (int k = 0; k < 2; k++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
            } else {
                k -= 1;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_joueur;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_Joueur1;
    private javax.swing.JTextField nom_Joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
