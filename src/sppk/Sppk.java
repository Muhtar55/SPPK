/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppk;

import controller.c_forward;
import java.sql.SQLException;
import model.m_forward;
import view.v_forward;

/**
 *
 * @author Muhtar
 */
public class Sppk {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) throws SQLException {
        c_forward control = new c_forward(new v_forward(), new m_forward());
    }

}
