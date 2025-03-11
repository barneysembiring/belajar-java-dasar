public class ifelsestatement{

    public static void main (String[] args){

        var nilaiAbsen = 90;
        var nilaiAkhir = 90;

        var lulusAbsen = nilaiAbsen >= 70;
        var lulusNilaiAkhir = nilaiAkhir >= 80;

        var lulus =  lulusAbsen && lulusNilaiAkhir;
        // System.out.println(lulus);

        if (lulus) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
         }

         if(nilaiAbsen >= 80 && nilaiAkhir >= 80){
            System.out.println("Nilai A");
         }else if(nilaiAbsen >= 70 && nilaiAkhir >= 70){
            System.out.println("Nilai B");
         }else{
            System.out.println("Nilai C");
         }


    }
}