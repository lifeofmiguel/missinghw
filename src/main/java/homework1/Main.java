package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hows the weather hot humid or cold");
        String weather;
        weather = input.next();
        if(weather.equalsIgnoreCase("High")) {
            System.out.println("sunblock needed");
        }else if (weather.equalsIgnoreCase("humid")){
            System.out.println("its muggy");
        }else if (weather.equalsIgnoreCase("cold")){
            System.out.println("jacket is needed");
        }

    }
}
