//I used online compiler
class CamelCase {
    public static void SixTimesPrint(String first, String second, String third, String fourth){
        int maxPrint= 6;
        for (int i = 0; i < maxPrint; i++){
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        String first = "I will not copy a code";
        String second = "I will use Camel Case when writing class names.";
        String third = "I will use lower Camel Case when writing function names.";
        String fourth = "I will use lower Camel Case when writing variables names.";
        
        SixTimesPrint(first, second, third, fourth); //change nlng
        
    }
}
