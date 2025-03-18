public class methodvariabelargument{
    public static void main(String[] args){

    }

    public static void sayCongrats(String name, int[] values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;
    }
}