public class operasiboolean{

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
    }
}