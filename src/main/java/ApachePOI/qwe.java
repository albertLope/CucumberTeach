package ApachePOI;

public class qwe {

    public static void main(String[] args) {

        String[][] zoo = {{"Lion" , "3"} ,{"Tiger",  "2"} , {"Elephant",  "1"} ,{"Zebra", "3"} };

//          Print all the data from the zoo array
        System.out.println(zoo[2][0]);
        System.out.println("--------------------------------");
        for(int i = 0 ; i < zoo.length ; i++){
            if(zoo[i][0].equalsIgnoreCase("Elephant")){
                System.out.println(zoo[i][1]);
            }
        }

        System.out.println("-------------------------");
        for(int i = 0 ; i < zoo.length ; i++){
            for(int j = 0 ; j<zoo[i].length ; j++){
                System.out.println(zoo[i][j]);
            }
        }
    }
}
