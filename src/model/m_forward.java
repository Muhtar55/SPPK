/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhtar
 */
public class m_forward {

    private final koneksi kon;
    public static String abobot;
    public static String bobotb;
    public static String haturan;
//    public String[] getMutu = new String[2];
    public static String getMutu;

    public m_forward() throws SQLException {
        super();
        this.kon = new koneksi("root", "", "spkjamur");
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Id_Spk", "Bobot", "Kriteria_Bobot", "Hasil"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

//        String sql = "select * from tb_panen";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
//        ResultSet rs = kon.getResult(sql);
        ResultSet rs = kon.getResult("select a.Id_Spk, b.Bobot, b.Kriteria_Bobot, a.Hasil_Spk from tb_Spk a join tb_bobot  b on a.Id_Bobot=b.Id_Bobot");
        while (rs.next()) {
            String kolom[] = new String[4];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public String[] IdBobot() throws SQLException {
        String query = "SELECT Bobot FROM tb_bobot";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String IdBobot[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            IdBobot[a] = rs.getString("Bobot");
            a++;
        }
        a = 0;
        return IdBobot;
    }

    public String status(String id) throws SQLException {
        String sql = "select * from tb_bobot where Bobot='" + id + "'";
        System.out.println(sql);
//        String sql = "select * from tb_bibit '" + id + "'";
//        Statement st = kon.getConnection().createStatement();
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            abobot = rs.getString("Kriteria_Bobot");
            bobotb = rs.getString("Kriteria_Bobot");
            haturan = rs.getString("Kriteria_Bobot");
//            periode = rs.getString("p.Periode");

        }
        return abobot;
    }

    public String[] Bobotb() throws SQLException {
        String query = "SELECT Bobot FROM tb_bobot";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String Bobotb[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            Bobotb[a] = rs.getString("Bobot");
            a++;
        }
        a = 0;
        return Bobotb;
    }

    public String[] Aturan() throws SQLException {
        String query = "SELECT Bobot FROM tb_bobot";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String Aturan[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            Aturan[a] = rs.getString("Bobot");
            a++;
        }
        a = 0;
        return Aturan;
    }

//    public void Pakar(int id) throws SQLException {
//        String query = "Select * from tb_mutu where Id_Mutu= " + id;
//        ResultSet rs = kon.getResult(query);
//        while (rs.next()) {
//            for (int i = 1; i < getMutu.length + 1; i++) {
//                getMutu[i - 1] = rs.getString(i);
//            }
//        }
//    }
//
//    public String getStatus() {
//        return getMutu[1];
//    }
    
    public void Pakar(int a) throws SQLException {
        String query = "Select * from tb_mutu where Id_Mutu= " + a;
        ResultSet rs  = kon.getResult(query);
         if (rs.next()) {
             getMutu = rs.getString("Mutu");
         }
    }

//    public String status(String id) throws SQLException {
//        String sql = "select * from tb_bobot where Bobot='" + id + "'";
//        System.out.println(sql);
////        String sql = "select * from tb_bibit '" + id + "'";
////        Statement st = kon.getConnection().createStatement();
//        ResultSet rs = kon.getResult(sql);
//        while (rs.next()) {
//            abobot = rs.getString("Kriteria_Bobot");
////            periode = rs.getString("p.Periode");
//
//        }
//        return abobot;
//    }
}
