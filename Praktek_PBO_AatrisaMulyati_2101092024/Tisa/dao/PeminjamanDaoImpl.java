/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa.dao;
import Tisa.dao.PeminjamanDao;
import Tisa.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("2101091008", "208","20 Des 2022","20 Jan 2023"));
    }
     
     
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}
