public class ThreeDigitsCodes {
    public static void main(String[] args) {
        //variable to count the unique numbers
        int counter = 0;

        for (int i=1;i<=4;i++)
        {
            for (int j=1; j<=4; j++)
            {
                for (int k=1; k<=4; k++)
                {
                    //establish that no 2 letters are the same
                    if (k!=j && k!=i && j!=i){
                        //convert int to String, in order to concatenate, instead of + operator for int
                        String i1=String.valueOf(i);
                        String j1=String.valueOf(j);
                        String k1=String.valueOf(k);

                        //concatenate different numbers from 3 unique digits
                        System.out.println(i1+j1+k1);
                        counter ++; // increase count accordingly
                        System.out.println(i1+k1+j1);
                        counter ++; // increase count accordingly
                        System.out.println(j1+i1+k1);
                        counter ++; // increase count accordingly
                        System.out.println(j1+k1+i1);
                        counter ++; // increase count accordingly
                        System.out.println(k1+i1+j1);
                        counter ++;// increase count accordingly
                        System.out.println(k1+j1+i1);
                        counter ++; // increase count accordingly
                    }
                }
            }
        }
        //print the final count
        System.out.println("That adds up to a total of " + counter +" three-digits unique numbers.");
    }
}
