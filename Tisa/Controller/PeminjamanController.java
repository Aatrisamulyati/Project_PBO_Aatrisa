/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa.Controller;
import Tisa.dao.PeminjamanDaoImpl;
import Tisa.dao.AnggotaDao;
import Tisa.dao.AnggotaDaoImpl;
import Tisa.dao.BukuDao;
import Tisa.dao.BukuDaoImpl;
import Tisa.dao.PeminjamanDao;
import Tisa.model.Peminjaman;
import Tisa.model.Anggota;
import Tisa.model.Buku;
import Tisa.view.FormPeminjaman;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author hp
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotadao;
    private BukuDao bukudao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotadao = new AnggotaDaoImpl();
        bukudao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
        
    }
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List<Anggota> list = anggotadao.getAllAnggota();
        for (Anggota anggota: list ) {
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    public void setCboBuku(){
        formPeminjaman.getCboBuku().removeAllItems();
        List<Buku> list = bukudao.getAllBuku();
        for (Buku buku: list ) {
            formPeminjaman.getCboBuku().
                    addItem(buku.getKodeBuku());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp( formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku( formPeminjaman.getCboBuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null){
            List<Anggota> listAnggota =anggotadao.getAllAnggota();
            for(Anggota anggota:listAnggota){
                if (peminjaman.getNobp()==anggota.getNobp()){
                    formPeminjaman.getCboNobp()
                            .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                            break;
                }
            }
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setNobp( formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodebuku( formPeminjaman.getCboBuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
         int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
         peminjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
