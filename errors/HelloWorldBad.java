
class HelloWorldBad {
    public static void main(String[] args) {
        
        for (int i=0;i<25;i++){
            System.out.println("the value of i is "+i);
            if (i==1){//added another = fo boolean checking
                System.out.println("i is equal to 1");
            }
        }    
        }
    }