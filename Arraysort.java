public class Arraysort
{
    public static void main(String args[])
    {
        if (args.length == 0)
        {
            System.out.println("usage:  java Lab1 NUMBERS_TO_BE_SORTED");
            return;
        }


        int ar[] = new int[args.length];


        for (int i=0; i<ar.length; i++)
        {
            ar[i] = Integer.parseInt(args[i]);
        }


        System.out.println("before sort:");
        for (int i=0; i<ar.length; i++)
        {
            System.out.println("ar[" + i + "] = " + ar[i]);
        }


        final int oneMil = 1000000;
        //New empty arry
        int sorted[] = new int[args.length];


         //looping through array given.
        for(int i= 0; i<ar.length; i++)
        {


            int smallestNum = ar[i];
            int indexOfSmallest = i;




            //loop for comparing
            for(int j = 0; j<ar.length; j++)
            {
                //comparing ar index to sorted
                if(ar[j]<smallestNum)
                {
                    //replacing
                    smallestNum = ar[j];
                    indexOfSmallest = j;
                    //how can we update smallest to be max win!!!




                }


            }




            sorted[i] = smallestNum;
            ar[indexOfSmallest] = oneMil;




            //now we've checked every element in the innerloop
            //we know smallestNum is the smallest in the arry
            //Where does the smallestNum go!


        }


        System.out.println("\nafter sort:");
        for (int i=0; i<sorted.length; i++)
        {
            System.out.println("sorted[" + i + "] = " + sorted[i]);
        }
    }
}
