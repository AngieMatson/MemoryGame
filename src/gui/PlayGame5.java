/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.LogicaJuego;
import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class PlayGame5 extends javax.swing.JFrame
{

    private VFondo fondo;
    private LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public PlayGame5()
    {
        initComponents();
        
        fondo = new VFondo(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        setCards();
    }       
    
    private void setCards()
    {
        //Variables a usar
        int[] numbers = log.getCardsLong();
        int[] num1 = new int [32];
        int[] num2 = new int [32];        
        int[][] matriz = new int [8][8];
        int tope = 63;
        int count = 0;
           
       
        for(int i=0; i<32;i++)
        {
            num1[i] = numbers[i];

            num2[i] = numbers[tope];
            tope = tope -1;
        }
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[0]+".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[31]+".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[1]+".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[30]+".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[2]+".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[29]+".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[3]+".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[28]+".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[4]+".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[27]+".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[5]+".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[26]+".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[6]+".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[25]+".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[7]+".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[24]+".png")));
        btnC17.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[8]+".png")));
        btnC18.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[23]+".png")));
        btnC19.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[9]+".png")));
        btnC20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[22]+".png")));
        btnC21.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[10]+".png")));
        btnC22.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[21]+".png")));
        btnC23.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[11]+".png")));
        btnC24.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[20]+".png")));
        btnC25.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[12]+".png")));
        btnC26.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[19]+".png")));
        btnC27.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[13]+".png")));
        btnC28.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[18]+".png")));
        btnC29.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[14]+".png")));
        btnC30.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[17]+".png")));
        btnC31.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[15]+".png")));
        btnC32.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[16]+".png")));
        btnC33.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[16]+".png")));
        btnC34.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[15]+".png")));
        btnC35.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[17]+".png")));
        btnC36.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[14]+".png")));
        btnC37.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[18]+".png")));
        btnC38.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[13]+".png")));
        btnC39.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[19]+".png")));
        btnC40.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[12]+".png")));
        btnC41.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[20]+".png")));
        btnC42.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[11]+".png")));
        btnC43.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[21]+".png")));
        btnC44.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[10]+".png")));
        btnC45.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[22]+".png")));
        btnC46.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[9]+".png")));
        btnC47.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[23]+".png")));
        btnC48.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[8]+".png")));
        btnC49.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[24]+".png")));
        btnC50.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[7]+".png")));
        btnC51.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[25]+".png")));
        btnC52.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[6]+".png")));
        btnC53.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[26]+".png")));
        btnC54.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[5]+".png")));
        btnC55.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[27]+".png")));
        btnC56.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[4]+".png")));
        btnC57.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[28]+".png")));
        btnC58.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[3]+".png")));
        btnC59.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[29]+".png")));
        btnC60.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[2]+".png")));
        btnC61.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[30]+".png")));
        btnC62.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[1]+".png")));
        btnC63.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num1[31]+".png")));
        btnC64.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/c"+num2[0]+".png")));
        
        
        
        
    }    
    
    private void btnEnabled(JButton btn)
    {
        
        if(!caraUp)
        {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else
        {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }
    
    private void compare()
    {
        if(caraUp && primerc)
        {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar()
    {
        
        btnC1.setEnabled(true);
        btnC2.setEnabled(true);
        btnC3.setEnabled(true);
        btnC4.setEnabled(true);
        btnC5.setEnabled(true);
        btnC6.setEnabled(true);
        btnC7.setEnabled(true);
        btnC8.setEnabled(true);
        btnC9.setEnabled(true);
        btnC10.setEnabled(true);
        btnC11.setEnabled(true);
        btnC12.setEnabled(true);
        btnC13.setEnabled(true);
        btnC14.setEnabled(true);
        btnC15.setEnabled(true);
        btnC16.setEnabled(true);
        btnC17.setEnabled(true);
        btnC18.setEnabled(true);
        btnC19.setEnabled(true);
        btnC20.setEnabled(true);
        btnC21.setEnabled(true);
        btnC22.setEnabled(true);
        btnC23.setEnabled(true);
        btnC24.setEnabled(true);
        btnC25.setEnabled(true);
        btnC26.setEnabled(true);
        btnC27.setEnabled(true);
        btnC28.setEnabled(true);
        btnC29.setEnabled(true);
        btnC30.setEnabled(true);
        btnC31.setEnabled(true);
        btnC32.setEnabled(true);
        btnC33.setEnabled(true);
        btnC34.setEnabled(true);
        btnC35.setEnabled(true);
        btnC36.setEnabled(true);
        btnC37.setEnabled(true);
        btnC38.setEnabled(true);
        btnC39.setEnabled(true);
        btnC40.setEnabled(true);
        btnC41.setEnabled(true);
        btnC42.setEnabled(true);
        btnC43.setEnabled(true);
        btnC44.setEnabled(true);
        btnC45.setEnabled(true);
        btnC46.setEnabled(true);
        btnC47.setEnabled(true);
        btnC48.setEnabled(true);
        btnC49.setEnabled(true);
        btnC50.setEnabled(true);
        btnC51.setEnabled(true);
        btnC52.setEnabled(true);
        btnC53.setEnabled(true);
        btnC54.setEnabled(true);
        btnC55.setEnabled(true);
        btnC56.setEnabled(true);
        btnC57.setEnabled(true);
        btnC58.setEnabled(true);
        btnC59.setEnabled(true);
        btnC60.setEnabled(true);
        btnC61.setEnabled(true);
        btnC62.setEnabled(true);
        btnC63.setEnabled(true);
        btnC64.setEnabled(true);      
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }
    
    private void pregwin()
    {
        if(!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() 
        && !btnC6.isEnabled() && !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled() 
        && !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled()&& !btnC17.isEnabled()
        && !btnC18.isEnabled() && !btnC19.isEnabled() && !btnC20.isEnabled() && !btnC21.isEnabled() && !btnC22.isEnabled() && !btnC23.isEnabled()
        && !btnC24.isEnabled() && !btnC25.isEnabled() && !btnC26.isEnabled() && !btnC27.isEnabled() && !btnC28.isEnabled() && !btnC29.isEnabled()
        && !btnC30.isEnabled() && !btnC31.isEnabled() && !btnC32.isEnabled() && !btnC33.isEnabled() && !btnC34.isEnabled() && !btnC35.isEnabled()
        && !btnC36.isEnabled() && !btnC37.isEnabled() && !btnC38.isEnabled() && !btnC39.isEnabled() && !btnC40.isEnabled() && !btnC41.isEnabled()
        && !btnC42.isEnabled() && !btnC43.isEnabled() && !btnC44.isEnabled() && !btnC45.isEnabled() && !btnC46.isEnabled() && !btnC47.isEnabled()
        && !btnC48.isEnabled() && !btnC49.isEnabled() && !btnC50.isEnabled() && !btnC51.isEnabled() && !btnC52.isEnabled() && !btnC52.isEnabled()
        && !btnC53.isEnabled() && !btnC54.isEnabled() && !btnC55.isEnabled() && !btnC56.isEnabled() && !btnC57.isEnabled() && !btnC58.isEnabled()
        && !btnC59.isEnabled() && !btnC60.isEnabled() && !btnC61.isEnabled() && !btnC62.isEnabled() && !btnC63.isEnabled() && !btnC64.isEnabled()){
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: "+puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnC17 = new javax.swing.JButton();
        btnC18 = new javax.swing.JButton();
        btnC19 = new javax.swing.JButton();
        btnC20 = new javax.swing.JButton();
        btnC21 = new javax.swing.JButton();
        btnC22 = new javax.swing.JButton();
        btnC23 = new javax.swing.JButton();
        btnC24 = new javax.swing.JButton();
        btnC25 = new javax.swing.JButton();
        btnC26 = new javax.swing.JButton();
        btnC27 = new javax.swing.JButton();
        btnC28 = new javax.swing.JButton();
        btnC29 = new javax.swing.JButton();
        btnC30 = new javax.swing.JButton();
        btnC31 = new javax.swing.JButton();
        btnC32 = new javax.swing.JButton();
        btnC33 = new javax.swing.JButton();
        btnC34 = new javax.swing.JButton();
        btnC35 = new javax.swing.JButton();
        btnC36 = new javax.swing.JButton();
        btnC37 = new javax.swing.JButton();
        btnC38 = new javax.swing.JButton();
        btnC39 = new javax.swing.JButton();
        btnC40 = new javax.swing.JButton();
        btnC41 = new javax.swing.JButton();
        btnC42 = new javax.swing.JButton();
        btnC43 = new javax.swing.JButton();
        btnC44 = new javax.swing.JButton();
        btnC45 = new javax.swing.JButton();
        btnC46 = new javax.swing.JButton();
        btnC47 = new javax.swing.JButton();
        btnC48 = new javax.swing.JButton();
        btnC49 = new javax.swing.JButton();
        btnC50 = new javax.swing.JButton();
        btnC51 = new javax.swing.JButton();
        btnC52 = new javax.swing.JButton();
        btnC53 = new javax.swing.JButton();
        btnC54 = new javax.swing.JButton();
        btnC55 = new javax.swing.JButton();
        btnC56 = new javax.swing.JButton();
        btnC57 = new javax.swing.JButton();
        btnC58 = new javax.swing.JButton();
        btnC59 = new javax.swing.JButton();
        btnC60 = new javax.swing.JButton();
        btnC61 = new javax.swing.JButton();
        btnC62 = new javax.swing.JButton();
        btnC63 = new javax.swing.JButton();
        btnC64 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Modo 8x8");

        jPanel1.setBackground(new java.awt.Color(240, 248, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setFocusable(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setFocusable(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setFocusable(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setFocusable(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setFocusable(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setFocusable(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setFocusable(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setFocusable(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setFocusable(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setFocusable(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setFocusable(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setFocusable(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setFocusable(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setFocusable(false);
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setFocusable(false);
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });

        btnC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC17.setBorder(null);
        btnC17.setBorderPainted(false);
        btnC17.setContentAreaFilled(false);
        btnC17.setFocusable(false);
        btnC17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC17MouseExited(evt);
            }
        });
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });

        btnC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC18.setBorder(null);
        btnC18.setBorderPainted(false);
        btnC18.setContentAreaFilled(false);
        btnC18.setFocusable(false);
        btnC18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC18MouseExited(evt);
            }
        });
        btnC18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC18ActionPerformed(evt);
            }
        });

        btnC19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC19.setBorder(null);
        btnC19.setBorderPainted(false);
        btnC19.setContentAreaFilled(false);
        btnC19.setFocusable(false);
        btnC19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC19MouseExited(evt);
            }
        });
        btnC19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC19ActionPerformed(evt);
            }
        });

        btnC20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC20.setBorder(null);
        btnC20.setBorderPainted(false);
        btnC20.setContentAreaFilled(false);
        btnC20.setFocusable(false);
        btnC20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC20MouseExited(evt);
            }
        });
        btnC20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC20ActionPerformed(evt);
            }
        });

        btnC21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC21.setBorder(null);
        btnC21.setBorderPainted(false);
        btnC21.setContentAreaFilled(false);
        btnC21.setFocusable(false);
        btnC21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC21MouseExited(evt);
            }
        });
        btnC21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC21ActionPerformed(evt);
            }
        });

        btnC22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC22.setBorder(null);
        btnC22.setBorderPainted(false);
        btnC22.setContentAreaFilled(false);
        btnC22.setFocusable(false);
        btnC22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC22MouseExited(evt);
            }
        });
        btnC22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC22ActionPerformed(evt);
            }
        });

        btnC23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC23.setBorder(null);
        btnC23.setBorderPainted(false);
        btnC23.setContentAreaFilled(false);
        btnC23.setFocusable(false);
        btnC23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC23MouseExited(evt);
            }
        });
        btnC23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC23ActionPerformed(evt);
            }
        });

        btnC24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC24.setBorder(null);
        btnC24.setBorderPainted(false);
        btnC24.setContentAreaFilled(false);
        btnC24.setFocusable(false);
        btnC24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC24MouseExited(evt);
            }
        });
        btnC24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC24ActionPerformed(evt);
            }
        });

        btnC25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC25.setBorder(null);
        btnC25.setBorderPainted(false);
        btnC25.setContentAreaFilled(false);
        btnC25.setFocusable(false);
        btnC25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC25MouseExited(evt);
            }
        });
        btnC25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC25ActionPerformed(evt);
            }
        });

        btnC26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC26.setBorder(null);
        btnC26.setBorderPainted(false);
        btnC26.setContentAreaFilled(false);
        btnC26.setFocusable(false);
        btnC26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC26MouseExited(evt);
            }
        });
        btnC26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC26ActionPerformed(evt);
            }
        });

        btnC27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC27.setBorder(null);
        btnC27.setBorderPainted(false);
        btnC27.setContentAreaFilled(false);
        btnC27.setFocusable(false);
        btnC27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC27MouseExited(evt);
            }
        });
        btnC27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC27ActionPerformed(evt);
            }
        });

        btnC28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC28.setBorder(null);
        btnC28.setBorderPainted(false);
        btnC28.setContentAreaFilled(false);
        btnC28.setFocusable(false);
        btnC28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC28MouseExited(evt);
            }
        });
        btnC28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC28ActionPerformed(evt);
            }
        });

        btnC29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC29.setBorder(null);
        btnC29.setBorderPainted(false);
        btnC29.setContentAreaFilled(false);
        btnC29.setFocusable(false);
        btnC29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC29MouseExited(evt);
            }
        });
        btnC29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC29ActionPerformed(evt);
            }
        });

        btnC30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC30.setBorder(null);
        btnC30.setBorderPainted(false);
        btnC30.setContentAreaFilled(false);
        btnC30.setFocusable(false);
        btnC30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC30MouseExited(evt);
            }
        });
        btnC30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC30ActionPerformed(evt);
            }
        });

        btnC31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC31.setBorder(null);
        btnC31.setBorderPainted(false);
        btnC31.setContentAreaFilled(false);
        btnC31.setFocusable(false);
        btnC31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC31MouseExited(evt);
            }
        });
        btnC31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC31ActionPerformed(evt);
            }
        });

        btnC32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC32.setBorder(null);
        btnC32.setBorderPainted(false);
        btnC32.setContentAreaFilled(false);
        btnC32.setFocusable(false);
        btnC32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC32MouseExited(evt);
            }
        });
        btnC32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC32ActionPerformed(evt);
            }
        });

        btnC33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC33.setBorder(null);
        btnC33.setBorderPainted(false);
        btnC33.setContentAreaFilled(false);
        btnC33.setFocusable(false);
        btnC33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC33MouseExited(evt);
            }
        });
        btnC33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC33ActionPerformed(evt);
            }
        });

        btnC34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC34.setBorder(null);
        btnC34.setBorderPainted(false);
        btnC34.setContentAreaFilled(false);
        btnC34.setFocusable(false);
        btnC34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC34MouseExited(evt);
            }
        });
        btnC34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC34ActionPerformed(evt);
            }
        });

        btnC35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC35.setBorder(null);
        btnC35.setBorderPainted(false);
        btnC35.setContentAreaFilled(false);
        btnC35.setFocusable(false);
        btnC35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC35MouseExited(evt);
            }
        });
        btnC35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC35ActionPerformed(evt);
            }
        });

        btnC36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC36.setBorder(null);
        btnC36.setBorderPainted(false);
        btnC36.setContentAreaFilled(false);
        btnC36.setFocusable(false);
        btnC36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC36MouseExited(evt);
            }
        });
        btnC36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC36ActionPerformed(evt);
            }
        });

        btnC37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC37.setBorder(null);
        btnC37.setBorderPainted(false);
        btnC37.setContentAreaFilled(false);
        btnC37.setFocusable(false);
        btnC37.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC37MouseExited(evt);
            }
        });
        btnC37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC37ActionPerformed(evt);
            }
        });

        btnC38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC38.setBorder(null);
        btnC38.setBorderPainted(false);
        btnC38.setContentAreaFilled(false);
        btnC38.setFocusable(false);
        btnC38.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC38MouseExited(evt);
            }
        });
        btnC38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC38ActionPerformed(evt);
            }
        });

        btnC39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC39.setBorder(null);
        btnC39.setBorderPainted(false);
        btnC39.setContentAreaFilled(false);
        btnC39.setFocusable(false);
        btnC39.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC39MouseExited(evt);
            }
        });
        btnC39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC39ActionPerformed(evt);
            }
        });

        btnC40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC40.setBorder(null);
        btnC40.setBorderPainted(false);
        btnC40.setContentAreaFilled(false);
        btnC40.setFocusable(false);
        btnC40.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC40MouseExited(evt);
            }
        });
        btnC40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC40ActionPerformed(evt);
            }
        });

        btnC41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC41.setBorder(null);
        btnC41.setBorderPainted(false);
        btnC41.setContentAreaFilled(false);
        btnC41.setFocusable(false);
        btnC41.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC41MouseExited(evt);
            }
        });
        btnC41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC41ActionPerformed(evt);
            }
        });

        btnC42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC42.setBorder(null);
        btnC42.setBorderPainted(false);
        btnC42.setContentAreaFilled(false);
        btnC42.setFocusable(false);
        btnC42.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC42MouseExited(evt);
            }
        });
        btnC42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC42ActionPerformed(evt);
            }
        });

        btnC43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC43.setBorder(null);
        btnC43.setBorderPainted(false);
        btnC43.setContentAreaFilled(false);
        btnC43.setFocusable(false);
        btnC43.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC43MouseExited(evt);
            }
        });
        btnC43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC43ActionPerformed(evt);
            }
        });

        btnC44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC44.setBorder(null);
        btnC44.setBorderPainted(false);
        btnC44.setContentAreaFilled(false);
        btnC44.setFocusable(false);
        btnC44.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC44MouseExited(evt);
            }
        });
        btnC44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC44ActionPerformed(evt);
            }
        });

        btnC45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC45.setBorder(null);
        btnC45.setBorderPainted(false);
        btnC45.setContentAreaFilled(false);
        btnC45.setFocusable(false);
        btnC45.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC45MouseExited(evt);
            }
        });
        btnC45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC45ActionPerformed(evt);
            }
        });

        btnC46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC46.setBorder(null);
        btnC46.setBorderPainted(false);
        btnC46.setContentAreaFilled(false);
        btnC46.setFocusable(false);
        btnC46.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC46MouseExited(evt);
            }
        });
        btnC46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC46ActionPerformed(evt);
            }
        });

        btnC47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC47.setBorder(null);
        btnC47.setBorderPainted(false);
        btnC47.setContentAreaFilled(false);
        btnC47.setFocusable(false);
        btnC47.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC47MouseExited(evt);
            }
        });
        btnC47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC47ActionPerformed(evt);
            }
        });

        btnC48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC48.setBorder(null);
        btnC48.setBorderPainted(false);
        btnC48.setContentAreaFilled(false);
        btnC48.setFocusable(false);
        btnC48.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC48MouseExited(evt);
            }
        });
        btnC48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC48ActionPerformed(evt);
            }
        });

        btnC49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC49.setBorder(null);
        btnC49.setBorderPainted(false);
        btnC49.setContentAreaFilled(false);
        btnC49.setFocusable(false);
        btnC49.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC49MouseExited(evt);
            }
        });
        btnC49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC49ActionPerformed(evt);
            }
        });

        btnC50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC50.setBorder(null);
        btnC50.setBorderPainted(false);
        btnC50.setContentAreaFilled(false);
        btnC50.setFocusable(false);
        btnC50.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC50MouseExited(evt);
            }
        });
        btnC50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC50ActionPerformed(evt);
            }
        });

        btnC51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC51.setBorder(null);
        btnC51.setBorderPainted(false);
        btnC51.setContentAreaFilled(false);
        btnC51.setFocusable(false);
        btnC51.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC51MouseExited(evt);
            }
        });
        btnC51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC51ActionPerformed(evt);
            }
        });

        btnC52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC52.setBorder(null);
        btnC52.setBorderPainted(false);
        btnC52.setContentAreaFilled(false);
        btnC52.setFocusable(false);
        btnC52.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC52MouseExited(evt);
            }
        });
        btnC52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC52ActionPerformed(evt);
            }
        });

        btnC53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC53.setBorder(null);
        btnC53.setBorderPainted(false);
        btnC53.setContentAreaFilled(false);
        btnC53.setFocusable(false);
        btnC53.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC53MouseExited(evt);
            }
        });
        btnC53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC53ActionPerformed(evt);
            }
        });

        btnC54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC54.setBorder(null);
        btnC54.setBorderPainted(false);
        btnC54.setContentAreaFilled(false);
        btnC54.setFocusable(false);
        btnC54.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC54MouseExited(evt);
            }
        });
        btnC54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC54ActionPerformed(evt);
            }
        });

        btnC55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC55.setBorder(null);
        btnC55.setBorderPainted(false);
        btnC55.setContentAreaFilled(false);
        btnC55.setFocusable(false);
        btnC55.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC55MouseExited(evt);
            }
        });
        btnC55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC55ActionPerformed(evt);
            }
        });

        btnC56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC56.setBorder(null);
        btnC56.setBorderPainted(false);
        btnC56.setContentAreaFilled(false);
        btnC56.setFocusable(false);
        btnC56.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC56MouseExited(evt);
            }
        });
        btnC56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC56ActionPerformed(evt);
            }
        });

        btnC57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC57.setBorder(null);
        btnC57.setBorderPainted(false);
        btnC57.setContentAreaFilled(false);
        btnC57.setFocusable(false);
        btnC57.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC57MouseExited(evt);
            }
        });
        btnC57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC57ActionPerformed(evt);
            }
        });

        btnC58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC58.setBorder(null);
        btnC58.setBorderPainted(false);
        btnC58.setContentAreaFilled(false);
        btnC58.setFocusable(false);
        btnC58.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC58MouseExited(evt);
            }
        });
        btnC58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC58ActionPerformed(evt);
            }
        });

        btnC59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC59.setBorder(null);
        btnC59.setBorderPainted(false);
        btnC59.setContentAreaFilled(false);
        btnC59.setFocusable(false);
        btnC59.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC59MouseExited(evt);
            }
        });
        btnC59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC59ActionPerformed(evt);
            }
        });

        btnC60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC60.setBorder(null);
        btnC60.setBorderPainted(false);
        btnC60.setContentAreaFilled(false);
        btnC60.setFocusable(false);
        btnC60.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC60MouseExited(evt);
            }
        });
        btnC60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC60ActionPerformed(evt);
            }
        });

        btnC61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC61.setBorder(null);
        btnC61.setBorderPainted(false);
        btnC61.setContentAreaFilled(false);
        btnC61.setFocusable(false);
        btnC61.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC61MouseExited(evt);
            }
        });
        btnC61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC61ActionPerformed(evt);
            }
        });

        btnC62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC62.setBorder(null);
        btnC62.setBorderPainted(false);
        btnC62.setContentAreaFilled(false);
        btnC62.setFocusable(false);
        btnC62.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC62MouseExited(evt);
            }
        });
        btnC62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC62ActionPerformed(evt);
            }
        });

        btnC63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC63.setBorder(null);
        btnC63.setBorderPainted(false);
        btnC63.setContentAreaFilled(false);
        btnC63.setFocusable(false);
        btnC63.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC63MouseExited(evt);
            }
        });
        btnC63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC63ActionPerformed(evt);
            }
        });

        btnC64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        btnC64.setBorder(null);
        btnC64.setBorderPainted(false);
        btnC64.setContentAreaFilled(false);
        btnC64.setFocusable(false);
        btnC64.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        btnC64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC64MouseExited(evt);
            }
        });
        btnC64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC64)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC2)
                    .addComponent(btnC1)
                    .addComponent(btnC3)
                    .addComponent(btnC4)
                    .addComponent(btnC6)
                    .addComponent(btnC5)
                    .addComponent(btnC7)
                    .addComponent(btnC8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC9)
                    .addComponent(btnC10)
                    .addComponent(btnC11)
                    .addComponent(btnC12)
                    .addComponent(btnC13)
                    .addComponent(btnC14)
                    .addComponent(btnC15)
                    .addComponent(btnC16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC17)
                    .addComponent(btnC18)
                    .addComponent(btnC19)
                    .addComponent(btnC20)
                    .addComponent(btnC21)
                    .addComponent(btnC22)
                    .addComponent(btnC23)
                    .addComponent(btnC24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC25)
                    .addComponent(btnC26)
                    .addComponent(btnC27)
                    .addComponent(btnC28)
                    .addComponent(btnC29)
                    .addComponent(btnC30)
                    .addComponent(btnC31)
                    .addComponent(btnC32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC34)
                    .addComponent(btnC33)
                    .addComponent(btnC35)
                    .addComponent(btnC36)
                    .addComponent(btnC38)
                    .addComponent(btnC37)
                    .addComponent(btnC39)
                    .addComponent(btnC40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC41)
                    .addComponent(btnC42)
                    .addComponent(btnC43)
                    .addComponent(btnC44)
                    .addComponent(btnC45)
                    .addComponent(btnC46)
                    .addComponent(btnC47)
                    .addComponent(btnC48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC49)
                    .addComponent(btnC50)
                    .addComponent(btnC51)
                    .addComponent(btnC52)
                    .addComponent(btnC53)
                    .addComponent(btnC54)
                    .addComponent(btnC55)
                    .addComponent(btnC56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC57)
                    .addComponent(btnC58)
                    .addComponent(btnC59)
                    .addComponent(btnC60)
                    .addComponent(btnC61)
                    .addComponent(btnC62)
                    .addComponent(btnC63)
                    .addComponent(btnC64))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 204, 0));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReiniciar)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(862, 811));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:        
        compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed
//  boton regresar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal v= new Principal();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnC17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC17MouseExited
        compare();
    }//GEN-LAST:event_btnC17MouseExited

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        btnEnabled(btnC17);
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnC18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC18MouseExited
        compare();
    }//GEN-LAST:event_btnC18MouseExited

    private void btnC18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC18ActionPerformed
        btnEnabled(btnC18);
    }//GEN-LAST:event_btnC18ActionPerformed

    private void btnC19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC19MouseExited
        compare();
    }//GEN-LAST:event_btnC19MouseExited

    private void btnC19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC19ActionPerformed
        btnEnabled(btnC19);
    }//GEN-LAST:event_btnC19ActionPerformed

    private void btnC20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC20MouseExited
        compare();
    }//GEN-LAST:event_btnC20MouseExited

    private void btnC20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC20ActionPerformed
       btnEnabled(btnC20);
    }//GEN-LAST:event_btnC20ActionPerformed

    private void btnC21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC21MouseExited
        compare();
    }//GEN-LAST:event_btnC21MouseExited

    private void btnC21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC21ActionPerformed
        btnEnabled(btnC21);
    }//GEN-LAST:event_btnC21ActionPerformed

    private void btnC22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC22MouseExited
        compare();
    }//GEN-LAST:event_btnC22MouseExited

    private void btnC22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC22ActionPerformed
         btnEnabled(btnC22);
    }//GEN-LAST:event_btnC22ActionPerformed

    private void btnC23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC23MouseExited
        compare();
    }//GEN-LAST:event_btnC23MouseExited

    private void btnC23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC23ActionPerformed
         btnEnabled(btnC23);
    }//GEN-LAST:event_btnC23ActionPerformed

    private void btnC24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC24MouseExited
        compare();
    }//GEN-LAST:event_btnC24MouseExited

    private void btnC24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC24ActionPerformed
         btnEnabled(btnC24);
    }//GEN-LAST:event_btnC24ActionPerformed

    private void btnC25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC25MouseExited
        compare();
    }//GEN-LAST:event_btnC25MouseExited

    private void btnC25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC25ActionPerformed
         btnEnabled(btnC25);
    }//GEN-LAST:event_btnC25ActionPerformed

    private void btnC26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC26MouseExited
        compare();
    }//GEN-LAST:event_btnC26MouseExited

    private void btnC26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC26ActionPerformed
        btnEnabled(btnC26);
    }//GEN-LAST:event_btnC26ActionPerformed

    private void btnC27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC27MouseExited
        compare();
    }//GEN-LAST:event_btnC27MouseExited

    private void btnC27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC27ActionPerformed
         btnEnabled(btnC27);
    }//GEN-LAST:event_btnC27ActionPerformed

    private void btnC28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC28MouseExited
        compare();
    }//GEN-LAST:event_btnC28MouseExited

    private void btnC28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC28ActionPerformed
         btnEnabled(btnC28);
    }//GEN-LAST:event_btnC28ActionPerformed

    private void btnC29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC29MouseExited
        compare();
    }//GEN-LAST:event_btnC29MouseExited

    private void btnC29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC29ActionPerformed
         btnEnabled(btnC29);
    }//GEN-LAST:event_btnC29ActionPerformed

    private void btnC30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC30MouseExited
        compare();
    }//GEN-LAST:event_btnC30MouseExited

    private void btnC30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC30ActionPerformed
         btnEnabled(btnC30);
    }//GEN-LAST:event_btnC30ActionPerformed

    private void btnC31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC31MouseExited
        compare();
    }//GEN-LAST:event_btnC31MouseExited

    private void btnC31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC31ActionPerformed
        btnEnabled(btnC31);
    }//GEN-LAST:event_btnC31ActionPerformed

    private void btnC32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC32MouseExited
        compare();
    }//GEN-LAST:event_btnC32MouseExited

    private void btnC32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC32ActionPerformed
        btnEnabled(btnC32);
    }//GEN-LAST:event_btnC32ActionPerformed

    private void btnC33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC33MouseExited
        compare();
    }//GEN-LAST:event_btnC33MouseExited

    private void btnC33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC33ActionPerformed
        btnEnabled(btnC33);
    }//GEN-LAST:event_btnC33ActionPerformed

    private void btnC34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC34MouseExited
        compare();
    }//GEN-LAST:event_btnC34MouseExited

    private void btnC34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC34ActionPerformed
        btnEnabled(btnC34);
    }//GEN-LAST:event_btnC34ActionPerformed

    private void btnC35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC35MouseExited
        compare();
    }//GEN-LAST:event_btnC35MouseExited

    private void btnC35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC35ActionPerformed
        btnEnabled(btnC35);
    }//GEN-LAST:event_btnC35ActionPerformed

    private void btnC36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC36MouseExited
        compare();
    }//GEN-LAST:event_btnC36MouseExited

    private void btnC36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC36ActionPerformed
        btnEnabled(btnC36);
    }//GEN-LAST:event_btnC36ActionPerformed

    private void btnC37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC37MouseExited
        compare();
    }//GEN-LAST:event_btnC37MouseExited

    private void btnC37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC37ActionPerformed
        btnEnabled(btnC37);
    }//GEN-LAST:event_btnC37ActionPerformed

    private void btnC38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC38MouseExited
        compare();
    }//GEN-LAST:event_btnC38MouseExited

    private void btnC38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC38ActionPerformed
        btnEnabled(btnC38);
    }//GEN-LAST:event_btnC38ActionPerformed

    private void btnC39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC39MouseExited
        compare();
    }//GEN-LAST:event_btnC39MouseExited

    private void btnC39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC39ActionPerformed
        btnEnabled(btnC39);
    }//GEN-LAST:event_btnC39ActionPerformed

    private void btnC40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC40MouseExited
        compare();
    }//GEN-LAST:event_btnC40MouseExited

    private void btnC40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC40ActionPerformed
        btnEnabled(btnC40);
    }//GEN-LAST:event_btnC40ActionPerformed

    private void btnC41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC41MouseExited
        compare();
    }//GEN-LAST:event_btnC41MouseExited

    private void btnC41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC41ActionPerformed
        btnEnabled(btnC41);
    }//GEN-LAST:event_btnC41ActionPerformed

    private void btnC42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC42MouseExited
        compare();
    }//GEN-LAST:event_btnC42MouseExited

    private void btnC42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC42ActionPerformed
        btnEnabled(btnC42);
    }//GEN-LAST:event_btnC42ActionPerformed

    private void btnC43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC43MouseExited
        compare();
    }//GEN-LAST:event_btnC43MouseExited

    private void btnC43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC43ActionPerformed
        btnEnabled(btnC43);
    }//GEN-LAST:event_btnC43ActionPerformed

    private void btnC44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC44MouseExited
       compare();
    }//GEN-LAST:event_btnC44MouseExited

    private void btnC44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC44ActionPerformed
        btnEnabled(btnC44);
    }//GEN-LAST:event_btnC44ActionPerformed

    private void btnC45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC45MouseExited
        compare();
    }//GEN-LAST:event_btnC45MouseExited

    private void btnC45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC45ActionPerformed
        btnEnabled(btnC45);
    }//GEN-LAST:event_btnC45ActionPerformed

    private void btnC46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC46MouseExited
        compare();
    }//GEN-LAST:event_btnC46MouseExited

    private void btnC46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC46ActionPerformed
        btnEnabled(btnC46);
    }//GEN-LAST:event_btnC46ActionPerformed

    private void btnC47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC47MouseExited
        compare();
    }//GEN-LAST:event_btnC47MouseExited

    private void btnC47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC47ActionPerformed
        btnEnabled(btnC47);
    }//GEN-LAST:event_btnC47ActionPerformed

    private void btnC48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC48MouseExited
        compare();
    }//GEN-LAST:event_btnC48MouseExited

    private void btnC48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC48ActionPerformed
        btnEnabled(btnC48);
    }//GEN-LAST:event_btnC48ActionPerformed

    private void btnC49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC49MouseExited
        compare();
    }//GEN-LAST:event_btnC49MouseExited

    private void btnC49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC49ActionPerformed
        btnEnabled(btnC49);
    }//GEN-LAST:event_btnC49ActionPerformed

    private void btnC50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC50MouseExited
        compare();
    }//GEN-LAST:event_btnC50MouseExited

    private void btnC50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC50ActionPerformed
        btnEnabled(btnC50);
    }//GEN-LAST:event_btnC50ActionPerformed

    private void btnC51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC51MouseExited
        compare();
    }//GEN-LAST:event_btnC51MouseExited

    private void btnC51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC51ActionPerformed
        btnEnabled(btnC51);
    }//GEN-LAST:event_btnC51ActionPerformed

    private void btnC52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC52MouseExited
          compare();
    }//GEN-LAST:event_btnC52MouseExited

    private void btnC52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC52ActionPerformed
        btnEnabled(btnC52);
    }//GEN-LAST:event_btnC52ActionPerformed

    private void btnC53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC53MouseExited
       compare();
    }//GEN-LAST:event_btnC53MouseExited

    private void btnC53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC53ActionPerformed
        btnEnabled(btnC53);
    }//GEN-LAST:event_btnC53ActionPerformed

    private void btnC54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC54MouseExited
        compare();
    }//GEN-LAST:event_btnC54MouseExited

    private void btnC54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC54ActionPerformed
        btnEnabled(btnC54);
    }//GEN-LAST:event_btnC54ActionPerformed

    private void btnC55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC55MouseExited
        compare();
    }//GEN-LAST:event_btnC55MouseExited

    private void btnC55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC55ActionPerformed
        btnEnabled(btnC55);
    }//GEN-LAST:event_btnC55ActionPerformed

    private void btnC56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC56MouseExited
        compare();
    }//GEN-LAST:event_btnC56MouseExited

    private void btnC56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC56ActionPerformed
        btnEnabled(btnC56);
    }//GEN-LAST:event_btnC56ActionPerformed

    private void btnC57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC57MouseExited
        compare();
    }//GEN-LAST:event_btnC57MouseExited

    private void btnC57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC57ActionPerformed
        btnEnabled(btnC57);
    }//GEN-LAST:event_btnC57ActionPerformed

    private void btnC58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC58MouseExited
        compare();
    }//GEN-LAST:event_btnC58MouseExited

    private void btnC58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC58ActionPerformed
        btnEnabled(btnC58);
    }//GEN-LAST:event_btnC58ActionPerformed

    private void btnC59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC59MouseExited
        compare();
    }//GEN-LAST:event_btnC59MouseExited

    private void btnC59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC59ActionPerformed
        btnEnabled(btnC59);
    }//GEN-LAST:event_btnC59ActionPerformed

    private void btnC60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC60MouseExited
        compare();
    }//GEN-LAST:event_btnC60MouseExited

    private void btnC60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC60ActionPerformed
        btnEnabled(btnC60);
    }//GEN-LAST:event_btnC60ActionPerformed

    private void btnC61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC61MouseExited
       compare();
    }//GEN-LAST:event_btnC61MouseExited

    private void btnC61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC61ActionPerformed
        btnEnabled(btnC61);
    }//GEN-LAST:event_btnC61ActionPerformed

    private void btnC62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC62MouseExited
        compare();
    }//GEN-LAST:event_btnC62MouseExited

    private void btnC62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC62ActionPerformed
        btnEnabled(btnC62);
    }//GEN-LAST:event_btnC62ActionPerformed

    private void btnC63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC63MouseExited
        compare();
    }//GEN-LAST:event_btnC63MouseExited

    private void btnC63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC63ActionPerformed
       btnEnabled(btnC63);
    }//GEN-LAST:event_btnC63ActionPerformed

    private void btnC64MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC64MouseExited
        compare();
    }//GEN-LAST:event_btnC64MouseExited

    private void btnC64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC64ActionPerformed
       btnEnabled(btnC64);
    }//GEN-LAST:event_btnC64ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(PlayGame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnC18;
    private javax.swing.JButton btnC19;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC20;
    private javax.swing.JButton btnC21;
    private javax.swing.JButton btnC22;
    private javax.swing.JButton btnC23;
    private javax.swing.JButton btnC24;
    private javax.swing.JButton btnC25;
    private javax.swing.JButton btnC26;
    private javax.swing.JButton btnC27;
    private javax.swing.JButton btnC28;
    private javax.swing.JButton btnC29;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC30;
    private javax.swing.JButton btnC31;
    private javax.swing.JButton btnC32;
    private javax.swing.JButton btnC33;
    private javax.swing.JButton btnC34;
    private javax.swing.JButton btnC35;
    private javax.swing.JButton btnC36;
    private javax.swing.JButton btnC37;
    private javax.swing.JButton btnC38;
    private javax.swing.JButton btnC39;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC40;
    private javax.swing.JButton btnC41;
    private javax.swing.JButton btnC42;
    private javax.swing.JButton btnC43;
    private javax.swing.JButton btnC44;
    private javax.swing.JButton btnC45;
    private javax.swing.JButton btnC46;
    private javax.swing.JButton btnC47;
    private javax.swing.JButton btnC48;
    private javax.swing.JButton btnC49;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC50;
    private javax.swing.JButton btnC51;
    private javax.swing.JButton btnC52;
    private javax.swing.JButton btnC53;
    private javax.swing.JButton btnC54;
    private javax.swing.JButton btnC55;
    private javax.swing.JButton btnC56;
    private javax.swing.JButton btnC57;
    private javax.swing.JButton btnC58;
    private javax.swing.JButton btnC59;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC60;
    private javax.swing.JButton btnC61;
    private javax.swing.JButton btnC62;
    private javax.swing.JButton btnC63;
    private javax.swing.JButton btnC64;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
