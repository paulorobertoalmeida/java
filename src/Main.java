public class Main {
    public static void main(String[] args) {
        System.out.println(productFormatter(" chaqueta de cuero ","21-05-2022"));

    }

    public static String productFormatter(String productName, String date) {
        //" chaqueta de cuero " , "21-05-2022"
        // "CHAQUETA_DE_CUERO-21-05-2022"
        productName = productName.trim().toUpperCase().replace(" ", "_" ) + "-" + date;


        return productName ;


    }
}