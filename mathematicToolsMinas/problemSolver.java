
/**
 * Write a description of class problemSolver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class problemSolver
/**
 * The code below functions as a switch.If isOn and isLicensed are true then it will allow the programm to run.
 * If both of them are false the programm won't allow the user to run it because he has no permission to use it.
 * The user has an orio of 3 permissions to use it on 3 different computers.
 * For that to happened an equation will happen [if (plithos...//plithos++]
 */
{
    //Dilosi metablitis
    boolean isOn;
    boolean isLicensed;
    final int orio = 3;
    static int plithos;

    public problemSolver()
    {
        isOn=false;
        isLicensed=false;

    }

    public void turnOn()
    {
        if (plithos < orio)
        {
            isOn = true;
            isLicensed = true;
            plithos = plithos + 1; //plithos++;

        }
        else
        {
            System.out.println("You don't have permission...");
        }
    }

    public void turnOff()
    {
        if (isOn){

            isOn =false;
            isLicensed =false;
            plithos--;
        }

    }

    public int sumIntegers(int [] numbers)
    {
        int sum = 0;
        int size = numbers.length;

        for (int i = 0; i < size; i++)

        {
            sum = sum + numbers[i];
        }

        for (int i = 1; i <= 100; i++)

        {
            System.out.println (i +  i * 10);
        }

        for (int n:numbers)
        {
            sum += n;
        }
        return sum;
     
    }
/**
 * This arithemetic operation functions in order to sum the values on certain numbers.
 * Depending of the arithmetic symbol a loop will begin until the desired symbol will be chosen
 * If the user didn't insert a number,the system will inform him that this is not accepted.
 * The same applies to countIfIntegers.
 */
    public int sumIfIntegers(int [] numbers,String cond, int val)
    {
        //1. Dilosi metavlitis afrismatos
        int sum = 0;

        //2. Elegxos adeias (block{})
        if (isLicensed)
        {
            //3. Epanaliptikos braxos

            for (int n:numbers)
            {
                if (cond == "<")
                {
                    if(n<val)
                    {
                        sum = sum + n;
                    }

                }
                else if (cond == ">")
                {
                    if(n>val)
                    {
                        sum = sum + n;
                    }

                }
                else if (cond == "<=")
                {
                    if(n<=val)
                    {
                        sum = sum + n;
                    }

                }
                else if (cond == ">=")
                {
                    if(n>=val)
                    {
                        sum = sum + n;
                    }

                }
                else if (cond == "ison")
                {
                    if(n==val)
                    {
                        sum = sum + n;
                    }

                }
                else if (cond == "diaforo")
                {
                    if(n!=val)
                    {
                        sum = sum + n;
                    }

                }
                else {
                    System.out.println ("They symbol is not accepted");
                    break;
                }

                //3.1. Elegxos xaraktira telesti - an o xaraktiras DEN einai "apodektos" tote diakopi ektelesti.

                //3.2. Elegxos sinfikis kai afroisis gia kafe parakladi elegxoy
                return sum;
            }//end for
        }
        return sum;
    }

    public int countIfIntegers(int [] numbers,String cond, int val)
    {
        //1. Dilosi metavlitis afrismatos
        int count = 0;

        //2. Elegxos adeias (block{})
        if (isLicensed)
        {
            //3. Epanaliptikos braxos

            for (int n:numbers)
            {
                if (cond == "<")
                {
                    if(n<val)
                    {
                        count++;
                    }
                    else if (cond == ">")
                    {
                        if(n>val)
                        {
                            count++;
                        }

                    }
                    else if (cond == "<=")
                    {
                        if(n<=val)
                        {
                            count++;
                        }

                    }
                    else if (cond == ">=")
                    {
                        if(n>=val)
                        {
                            count++;
                        }

                    }
                    else if (cond == "ison")
                    {
                        if(n==val)
                        {
                            count++;
                        }

                    }
                    else if (cond == "diaforo")
                    {
                        if(n!=val)
                        {
                            count++;
                        }

                    }
                    else {
                        System.out.println ("They symbol is not accepted");
                        break;
                    }

                }

            }

        }
        return count;

    }

    /**
     * public= Can be seen by everyone.
     * void= No value is returned
     * int= akeraios number‚ (32 bits)
     * double= dekadikos arithmos
     * average= O M.O ton trion timon.
     * System.out.println= Prints out the sentence with the brackets next to it.
     * The goal of averageThreeIntegers is to find the average between three numbers.
     */

    public void averageThreeIntegers(int num1,int num2,int num3)
    {
        if (isLicensed)
        {
            double average=0;

            //average=(num1+num2+num3)/3;
            int sum = sumThreeIntegers(num1, num2, num3);
            average = (double)sum/3;    
            System.out.println("The average is:"+average);

        }
        else
        {
            System.out.println("Unable to acess...");
        }
    }

    public int sumThreeIntegers(int num1, int num2, int num3)
    {
        if (isLicensed)
        {
            /**
             * sum= To sinolo ton trion timon.
             * return= Returns dekadiko arithmo
             * The goal of sumThreeIntegers is to find the sum of the three numbers.
             */

            int sum = 0;
            sum = num1+num2+num3;
            System.out.println("The sum is:" + sum);
            return sum;
        }
        else
        {
            System.out.println("No permission!");
            return 0;
        }

    }

    public void firstDegreeEquation(double a,double b)
    {
        double result=0;

        if(a!=0)//start of first if-then-else
        {
            /**
             * Exactly one solution exists
             */

            result=a/b;

            System.out.println("The result is:"+result);

        }

        else

        {
            /**
             * No solutions exists
             */

            if(b!=0)//start of second-if-then-else
            {

                System.out.println("No solutions exist");

            }

            else
            {
                /**
                 * Infinite solutions exists
                 */

                System.out.println("Infinitely many solutions exist");

            }//end of second if-then-else

        }//end of first if-then-else

    }//end of method first DegreeEquation

}//end of class problemSolver                                            