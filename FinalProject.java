/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;


/**
 *
 * @author AGUS
 */
public class FinalProject {
static Scanner sc=new Scanner(System.in);
static int menu;
static String nama[] = {"davi","intan","bamabang"};
static String jenis[] = new String[30];
static int stok[] = new int[30];
//static int KemunculanDdata[] = new int[30];
static int jumlah, tmp,h;
static int j; 
static int data = 1;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static int tampung, tampung2, tampung3,tampung4,tampung5, k = 1;
static int i = 1;
static char putar = 'y'; 
static String key;
static int hasil;
static int id,keluarkan;
        String ubah ;
//static barang[][];
    /**
     * @param args the command line arguments
     */    


        
 public static void app() {
    judul();
  }
  public static void judul() {
    System.out.println("+-----------------------------+");
    System.out.println("|   --> MENU INVENTARIS <--   |");
    System.out.println("+-----------------------------+");
    System.out.println("|   1.Tambah Barang Baru [1]  |");
    System.out.println("|   2.Tambah Stok Barang [2]  |");
    System.out.println("|   3.Pengeluaran Barang [3]  |");
    System.out.println("|   4.Lihat Data Barang  [4]  |");
    System.out.println("+-----------------------------+");
  }
  public static void menu() throws IOException {
    // Pesan tiket sekarang?
    System.out.print("Pilih salah satu menu: ");
    menu = sc.nextInt();
    
    switch(menu){
        case 1:
         insertBarang();
         break;
            
        case 2:
         tambahStok();
         break;
         
        case 3:
         keluarBarang();
         break;
         
        case 4:
         tampilbarang();
        break;   
    }
  }
  static void insertBarang() throws IOException
  {
      
       while (putar == 'y' || putar == 'Y') {
                      data++;
                       
                        tampung = i;
                        
                        for (i = tampung; i <data; i++) {
                            System.out.println("Barang Ke : " + i);
                            System.out.print("Nama       : ");
                            nama[i] = sc.next();
                            if(!nama[i].matches("[a-zA-Z_ ]+")){
                                System.err.println("Mohon Masukan Huruf");
                                data--;
                                break;
   
                            }
                            System.out.print("Merk      : ");
                            jenis[i] = sc.next();
                             if(!jenis[i].matches("[a-zA-Z_ -]+")){
                                System.err.println("Mohon Masukan Huruf");
                                data--;
                                break;
                            }
                            System.out.print("Stok         : ");
                            stok[i] = sc.nextInt();
                           
                            System.out.println("\n");
                            
                            }

                        System.out.print("Tambah data lagi ? y/t : ");
                        
                        putar = sc.next().charAt(0);
                       
                    }

    }
  static void tampilbarang(){
                
                    System.out.println("id  nama barang.   Merk.      Stok.");
                    for ( j = 1; j < data; j++) {

                        System.out.print(j + "\t");

                        System.out.print(" "+nama[j] + "\t");

                        System.out.print("     "+jenis[j] + "\t");

                        System.out.println("      "+stok[j] + "\t");

                    }
                

                  
  }
  static void keluarBarang(){
                if(data == 1){
                        System.err.println("data tidak ada");
                    }else{
                    
                    
                    
                    System.out.println("id  nama barang.   Merk.      Stok.");
                    for ( j = 1; j < data; j++) {

                        System.out.print(j + "\t");

                        System.out.print(" "+nama[j] + "\t");

                        System.out.print("     "+jenis[j] + "\t");

                        System.out.println("      "+stok[j] + "\t");

                    }
                }
                    System.out.println("--------------");
    System.out.print("Pilih Barang (id) : ");
    id = sc.nextInt();
    System.out.print("Jumlah yg ditambahkan : ");
    keluarkan = sc.nextInt();

    hasil = stok[id]-keluarkan;
    stok[id] = hasil;

    System.out.println("Setelah di update");
    System.out.println("id  nama barang.   Merk.      Stok.");
    for(int i=1; i<data; i++) {
      
                        System.out.print(i + "\t");

                        System.out.print(" "+nama[i] + "\t");

                        System.out.print("     "+jenis[i] + "\t");

                        System.out.println("      "+stok[i] + "\t");

    } 
  }
static void tambahStok(){
                if(data == 1){
                        System.err.println("data tidak ada");
                    }else{
                    
                    
                    
                    System.out.println("id  nama barang.   Merk.      Stok.");
                    for ( j = 1; j < data; j++) {

                        System.out.print(j + "\t");

                        System.out.print(" "+nama[j] + "\t");

                        System.out.print("     "+jenis[j] + "\t");

                        System.out.println("      "+stok[j] + "\t");

                    }
                }
                    System.out.println("--------------");
    System.out.print("Pilih Barang (id) : ");
    id = sc.nextInt();
    System.out.print("Jumlah yg dikeluarkan : ");
    keluarkan = sc.nextInt();

    hasil = stok[id]+keluarkan;
    stok[id] = hasil;

    System.out.println("Setelah di update");
    System.out.println("id  nama barang.   Merk.      Stok.");
    for(int i=1; i<data; i++) {
      
                        System.out.print(i + "\t");

                        System.out.print(" "+nama[i] + "\t");

                        System.out.print("     "+jenis[i] + "\t");

                        System.out.println("      "+stok[i] + "\t");

    } 
  }

  
  
    public static void main(String[] args) throws IOException {

        app();
            menu();
        
          
    }
    
}
