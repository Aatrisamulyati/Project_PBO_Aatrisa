/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa.dao;
import Tisa.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class BukuDaoImpl implements BukuDao {
     List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("1222", "Bumi","Tereliye","SinarJaya"));
    }
     
    @Override
    public Buku save(Buku buku){
        data.add(buku);
        return buku;
    }
    
    public  Buku update(int index,Buku buku){
        data.set(index , buku);
        return buku;
    }
    
    public Buku delete(int index){
        return data.remove(index);
    }
    
    public Buku getBuku(int index){
         return data.get(index);
    }
    
    public  List<Buku> getAllBuku(){
        return data;
    }
}
