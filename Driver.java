class Driver
{
    public static void main(String[] args)
    {
        Sport tennis = new Tennis("Singles Tennis", false, "set", 15, true);
        Sport football = new Football("Flag Football", true, "quarter", 6, false);
        Sport soccer  = new Soccer("Soccer", true, "half", 1, true);



        System.out.println(tennis);
        System.out.println();
        System.out.println(football);
        System.out.println();
        System.out.println(soccer);



    }// end main method
}// end Main class
