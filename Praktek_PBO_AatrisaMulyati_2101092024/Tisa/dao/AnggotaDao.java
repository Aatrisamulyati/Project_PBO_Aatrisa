/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa.dao;
import Tisa.model.Anggota;
import java.util.List;
/**
 *
 * @author hp
 */
public interface AnggotaDao {
    Anggota save(Anggota anggota);
    Anggota update(int index, Anggota anggota);
    Anggota delete(int index);
    Anggota getAnggota(int index);
    List<Anggota> getAllAnggota();
    
}