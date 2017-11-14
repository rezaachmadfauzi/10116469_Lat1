/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Reza Achmad Fauzi
 */
public class ModelMahasiswa {
    String nim;
    String nama;
    

public ModelMahasiswa(String nim, String nama){
  this.nim = nim;
  this.nama=nama;
}

public String getnim(){
 return nim;   
}

public String getnama(){
 return nama;   
}
}


 
