package Dec06;

public class DecisionMaking {

    public static void main(String[] args) {

        boolean isRaining = false ;
        boolean isSunny = false;
        boolean rainingHeavily = true;



        if(isRaining){
            if(rainingHeavily){
                System.out.println(" I will have rain coat");
            }
            System.out.println("Carry Umbrella");
        } else if (isSunny){
            System.out.println("I will cary shades");
        } else{
            System.out.println("I will do nothing");
        }
    }
}
