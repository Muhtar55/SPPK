/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_forward;
import view.v_forward;

/**
 *
 * @author Muhtar
 */
public class c_forward {

    private view.v_forward theview;
    private model.m_forward themodel;

    public c_forward(v_forward theviewforward, m_forward themodelforward) throws SQLException {
        this.theview = theviewforward;
        theviewforward.setVisible(true);
        this.themodel = themodelforward;

        theviewforward.addHitungListener(new hitungListener());
//        theviewforward.addforwardListener(new forwardListener());
//        theviewforward.addHitungListener(new hitungListener());
        theview.setIdbobot(themodel.IdBobot());
        theview.setBobotb(themodel.Bobotb());
        theview.setAturan(themodel.Aturan());
        theviewforward.check(new c_forward.check());
        theviewforward.combo(new c_forward.combo());
        theviewforward.box(new c_forward.box());
        theview.setTable(themodel.getTableModel());
//        theviewforward.setPenjualan(modelforward.Penjualan());

    }

    private class box implements ItemListener {

        String haturan;

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                haturan = themodel.status((String) theview.getAturan().getSelectedItem());
//            System.out.println(bobotb);
                theview.setHaturan(m_forward.haturan);
            } catch (SQLException ex) {
                Logger.getLogger(c_forward.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class combo implements ItemListener {

        String bobotb;

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                bobotb = themodel.status((String) theview.getBobotb().getSelectedItem());
//            abobot = themodel.status(Integer.parseInt((String) theview.getBobota().getSelectedItem()));
                System.out.println(bobotb);
                theview.setBbobot(m_forward.bobotb);
            } catch (SQLException ex) {
                Logger.getLogger(c_forward.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class check implements ItemListener {

        String abobot;

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                abobot = themodel.status((String) theview.getIdbobot().getSelectedItem());
//            abobot = themodel.status(Integer.parseInt((String) theview.getBobota().getSelectedItem()));
                System.out.println(abobot);
                theview.setAbobot(m_forward.abobot);
            } catch (SQLException ex) {
                Logger.getLogger(c_forward.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class hitungListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            if ((theview.getAbobot().getText().equals("A") || theview.getBbobot().getText().equals("B")) && (theview.getAbobot().getText().equals("A") || theview.getBbobot().getText().equals("B")) && theview.getHaturan().getText().equals("E")) // A&B
            try {
                if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("A") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {

                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);

                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                } else if ((theview.getIdbobot().getSelectedItem().toString().equals("A") || theview.getIdbobot().getSelectedItem().toString().equals("B")) && (theview.getBobotb().getSelectedItem().toString().equals("B") || theview.getBobotb().getSelectedItem().toString().equals("B")) && theview.getAturan().getSelectedItem().toString().equals("E")) {
                    themodel.Pakar(1);
                    theview.getHasil().setText(m_forward.getMutu);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_forward.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
