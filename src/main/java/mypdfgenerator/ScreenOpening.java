/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypdfgenerator;

import javax.swing.JInternalFrame;

/**
 *
 * @author Dhrit pc
 */
public class ScreenOpening {
    
    public ScreenOpening(JInternalFrame internalFrame)
    {
        ExternalScreen.desktopPane.removeAll();
        /*TexttoPDF txtToPdf = null;
            
        txtToPdf = new TexttoPDF();
            */
        System.out.println(ExternalScreen.desktopPane.getWidth() + "===== " + ExternalScreen.desktopPane.getHeight());
        internalFrame.setSize(ExternalScreen.desktopPane.getWidth() , ExternalScreen.desktopPane.getHeight());
        ExternalScreen.desktopPane.add(internalFrame).setVisible(true); 
        
    }

    
}
