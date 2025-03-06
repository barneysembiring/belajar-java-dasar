import java.io.*;
import java.util.*;

public class arrayjava {
    public static void main(String[] args){
        
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "King";
        arrayString[1] = "Joko";
        arrayString[2] = "Wanokuni";

        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
            1,2,3,4,5,6
        };
        
        System.out.println(arrayInt[2]);

        long[] arrayLong = {
        // Tipe data primitif / tipe data yang tidak bisa di ubah ubah    
            12, 14, 16, 18
        };

        System.out.println(arrayLong.length);

        String [][] members = {
            {"Eko", "Show"},
            {"Young", "Leg"},
            {"Raden", "Gonjay"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}