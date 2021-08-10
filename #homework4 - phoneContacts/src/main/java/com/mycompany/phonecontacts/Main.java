
package com.mycompany.phonecontacts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan=new Scanner(System.in);
        String islemler="************************\n1-Kişi Ekle\n2-Kişi Sorgula\n3-Kişi Sil\n4-Kişileri Listele\n5-Ara\n6-Çıkış\n************************";
        System.out.println(islemler);
        FileWriter writer=null;
        try {
            writer=new FileWriter("contacts.txt",true);//dosyanın içeriği her seferinde sıfırlanmasın yeni eklenenler sondan eklensin diye true.
            
            while (true) {               
                System.out.println("---------------------------------------------------");
                System.out.println("Lütfen işlem seçiniz(1-2-3-4-5-6):");
                String selected=scan.nextLine();
                
                if (selected.equals("1")){
                    System.out.println("Kişinin ismi:");
                    String name=scan.nextLine();
                    System.out.println("Kişinin numarası:");
                    String no=scan.nextLine();
                    writer.write(name+"-"+no+"\n");
                    System.out.println("Rehberinize " +name+" isimli kişi eklendi");
                }
                else if(selected.equals("2")){
                    boolean isFound=false;
                    System.out.println("Numarasını öğrenmek istediğiniz kişinin ismi:");
                    String sorgulanan=scan.nextLine();
                    Scanner scan3=new Scanner(new FileReader("contacts.txt"));
                    while (scan3.hasNextLine()) {                        
                        String arananSatir=scan3.nextLine();
                        String arr[]=arananSatir.split("-");
                        if (arr[0].trim().equalsIgnoreCase(sorgulanan)) {
                            System.out.println("Kişinin Bilgileri--->"+arananSatir);
                            isFound=true;
                        }   
                    }
                    if (isFound==false) {
                        System.out.println("Sorguladığınız kişi rehberinizde kayıtlı değil !");
                        continue;
                    }  
                }
                else if(selected.equals("3"){
                    //silme işlemi başarısız???
                }
                else if (selected.equals("4")) {
                    System.out.println("******Kişi Listeniz******");
                    try {
                        Scanner scan2=new Scanner(new FileReader("contacts.txt"));
                        while (scan2.hasNextLine()) {                            
                            System.out.println(scan2.nextLine());
                        }
                        System.out.println("*********************");   
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                
                else if(selected.equals("5")){
                    System.out.println("Aramak istediğiniz kişinin ismini veya numarasını giriniz:");
                    String aranan=scan.nextLine();
                    Thread.sleep(3000);
                    System.out.println(aranan+" aranıyor");
                            
                }
                else if (selected.equals("6")) {
                    System.out.println("Çıkış yapılıyor...");
                    break;
                }
                    
                
                
                
                
                
                
                
                
           
                writer.flush();//flush ve close yazmazsan dosyaya yazılmaz..
                writer.close();
               
            }
            
        } catch ( IOException e) {
            writer.close();
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
