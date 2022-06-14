import java.util.Scanner;

/***************************************************************
 Filename: Donations
 Created by: Melat Semereab
 Created on: 10/11/2021
 Comment: A charity is trying to raise £500 for a project. Write a Java application which
 accepts variable donations from an unknown number of donors. As soon as the £500 target is
 reached the charity wants to announce that they have reached their target by highlighting the
 following information:
 How many donations were received
 Who donated the largest amount
 Value of the largest donation

 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  
  {
        //Declaring our variables, constant, strings and initialize them
        final int TARGETMONEY = 500;
        Scanner keyborad = new Scanner(System.in);
        String firstName, lastName, fullName, largestDonator = " ";
        int , numberOfDonations = 0, largestDonation=0 , totalDonation = 0;
        double amountMoney;

        // do-while loop and if loop to calculate the desired output
        do
        {
            System.out.println("Enter your first name: ");
            firstName = keyborad.nextLine();

            System.out.println("Enter your last name: ");
            lastName = keyborad.nextLine();

            //concatenate our first and last name
            fullName = firstName + " " + lastName;

            System.out.println("Enter the amount you're going to donate");
            amountMoney = keyborad.nextDouble();

            keyborad.nextLine();

           //comparing the given amount money with the previous largest donation
            if (amountMoney > largestDonation)
            {
                largestDonation = amountMoney;
                largestDonator = fullName;
            }//if
            totalDonation = totalDonation + amountMoney;
            numberOfDonations = numberOfDonations + 1;
            }while (totalDonation != TARGETMONEY && totalDonation <=TARGETMONEY) ;
            System.out.println("Total donations received were " + totalDonation);
            System.out.println("The person Who donated the largest amount is " + largestDonator);
            System.out.println("Value of the largest donation was " + largestDonation);
            System.out.println( "Number of donors are " + numberOfDonations);
  }//main
}//class