/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusalon;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Lenovo
 */
public class TransaksiMember extends JPanel{
    Image gambar;
    public TransaksiMember(){
    gambar = new ImageIcon(getClass().getResource("/Gambar/bg1.jpg")).getImage();   
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create();
        gd.drawImage(gambar,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
