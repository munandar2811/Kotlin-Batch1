/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main
{
	public static void main(String[] args) {
	   
	    System.out.println(" Jawaban nomor 1");
	    triangle(1);
	    System.out.println();
		triangle(5);
		System.out.println();
		triangle("tiga");
		
		System.out.println();
		System.out.println();
		System.out.println("Jawaban nomor 2"); 
		
		cek_kata("ini adalah sebuah kata");
		cek_kata("2 pasang sandal hilang");
		
		System.out.println();
		System.out.println();
		System.out.println("Jawaban nomor 3");
		
		HollowTriangle(6);
		
		System.out.println();
		System.out.println();
		System.out.println("Jawaban nomor 4");
		
		findDuplicates("hari apa saja saya bisa!");
		System.out.println();
		findDuplicates("cepat kerjakan!!!");
		
		
		System.out.println();
		System.out.println();
		System.out.println("Jawaban nomor 5");
		cariPasangan(new int[] {5,13,7,5,9,20,9,5,14});

	}
	
	//soal nomor satu print triangle
	private static void triangle(int x) {
	    if (x>0){
	        for (int i=0; i<x; i++){
	            for (int j=i; j>=0; j--){
	                System.out.print("#");
	             }
	             System.out.println("");
	        }
	    }else {
	       System.out.println("Parameter harus angka dan positif");
	    } 
	}
	
	private static void triangle(String text) {
	    System.out.println("Parameter harus angka dan positif");
	}
	
	//batas soal nomor satu
	
	//soal nomor dua
	private static void cek_kata (String text) {
	    String cek_kata_penyebut[] = text.split(" ");
	    int pembilang =cek_kata_penyebut.length;
	    
	    for (int i=0; i<pembilang; i++){
	        if(isInteger(cek_kata_penyebut[i])){
	           pembilang--;
	        }
	    }
	   
	    
	    System.out.println(pembilang+"/"+cek_kata_penyebut.length);
	}
	
	private static boolean isInteger(String pembilang){
	    try {
	        Integer.parseInt(pembilang);
	    } catch(NumberFormatException e) {
	        return false;
	    } catch (NullPointerException e) {
	        return false;
	    }
	    
	    return true;
	}
	//batas soal nomor dua
	
	//soal nomor tiga
	private static void HollowTriangle(int x){
	   
	   
	   int i, j; 
        for (i=1; i<=x; i++) { 
      
    
            for (j=1; j < i; j++) { 
                System.out.print(" "); 
            } 
      
            for (j=1; j <= (x*2 - (2*i-1)); j++) { 
      
                if (i==1|| j==1||j==(x * 2- (2 * i - 1))) { 
                    System.out.print("o"); 
                } 
                else { 
                    System.out.print("*"); 
                } 
            } 
      
            // next line 
            System.out.println(); 
        } 
	} 
	//batas nomor 3
	
	
	//soal nomor 4
	private static void findDuplicates (String  text){
	    Map<Character, Integer> baseChar = new HashMap<Character, Integer>();  
        char[] charArray = text.toCharArray();  
        for (Character ch : charArray) {  
           if(ch!=' '){
                if (baseChar.containsKey(ch)) {  
                baseChar.put(ch, baseChar.get(ch) + 1);  
            } else {  
                baseChar.put(ch, 1);  
            }  
           }
        }  
        Set<Character> keys = baseChar.keySet();  
        for (Character ch : keys) {  
            if (baseChar.get(ch) > 1) {  
                System.out.println(ch + ":" + baseChar.get(ch));  
            }  
        }
	}
	//batas soal nomor 4
	
	//soal nomor 5
	private static void cariPasangan (int[] array) {
	    
	    Map<Integer,Integer> baseInt=new HashMap<Integer,Integer>();
	    int ada=0;
	    for(int i:array){
	        for (int j:array){
	            if (i==j)
	            ada++;
	        }
	        if (ada>=2){
	            baseInt.put(i,i);
	        }
	        ada=0;
	    }
	    
	    Set<Integer> keys=baseInt.keySet();
	    System.out.println(baseInt.size()+" pasang");
	    for(int i:keys){
	       System.out.println("[" + i +","+baseInt.get(i)+"]"); 

	    }
	}
}
