/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PictureSaveToDatabase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author kelly
 */
public class NewClass {

    public void saveToDatabase(Connection con, String user) throws FileNotFoundException {
        JFileChooser picchooser = new JFileChooser();
        picchooser.setDialogTitle("Select Image");
        picchooser.showOpenDialog(null);
        File pic = picchooser.getSelectedFile();
        String path = pic.getAbsolutePath();
       
        File image = new File(path);
        FileInputStream fis = new FileInputStream(image);
        String sql = "insert into imgtst (username,image) values (?, ?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setBinaryStream(2, fis, (int) image.length());
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
