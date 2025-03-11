public class switchjava{
    public static void main(String[] args){
        var nilai = "A";

        switch(nilai){
            case "A" -> System.out.println("Terbaik");
            case "B", "C" -> System.out.println("OKe");
            default->{
                System.out.println("Maaf");
            }
        }
    }
}