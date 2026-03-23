/*These files edited by David Johnson for correction
I added spaces in some places (loops and print statements) for easier readability*/

public class error {//class name changed to error
    public static void main(String[] args){
    System.out.println("hello everybody");
    System.out.println("am I doing this correctly");
    for (int i = 0; i < 10; i++){
        System.out.println("the number i is " + i);//corrected lm to ln
    }

    for (int i = 0; i < 10; i++){//For changed to for, Int to int, : to ; > to <
        System.out.println(" the new number i is " + i);//added space at beginning of printed text for better readability
    
    if (i==0){//moved these if and else statements inside the for loop so they would run as intended
        System.out.print("i is equal to zero");

    }else {
        System.out.print("i is not equal to zero");//capitalized System

    }
    }

    }
}
