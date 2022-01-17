/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aan
 */
public class bookingKaroke {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public bookingKaroke(){
        
        getTabel().addColumn("Kode");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Waktu");
        getTabel().addColumn("Nama");
        getTabel().addColumn("Email");
        getTabel().addColumn("No HP");
    }
    
    public DefaultTableModel getTabel() {
        return tabel;
    }
    
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    
}
