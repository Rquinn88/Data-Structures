/***************************************************************************************
//*** Test program                                                                    ***
//*** Project 1:      CSCI231 - Java/Object Oriented programming review               ***
//***                                                 								  ***
//*** Description:    This program tests the class hierarchy and plymorphism          ***
//***                 implemented for the classes:                                    ***
//***                                     Person                                      ***
//***                                     /    \                                      ***
//***                                    /      \                                     ***
//***                                Student Employee                                 ***
//***                                          /  \                                   ***
//***                                         /    \                                  ***
//***                                    Faculty  Staff                               ***
//***                                                                                 ***
//***************************************************************************************

// Class to define the test program for the given class hierarchy.
*/

import java.util.Scanner;

public class TestProg
{
    public static void main(String[] args)
    {
       //***
       //*** Scanner for interaction
       //***
       Scanner input = new Scanner(System.in);
	   

       //********************************************************************************
       //*** Number of instances of the hierarchy classes                             ***
       //********************************************************************************  
       Person[] people = { new Person("Sue", "Carr", "Jane", "222 Flower Lane, Rochester, NY  14610",
                                      "scarr@gmail.com", "585-991-2222"),
                           new Student("Mitchell", "Gilbert", "Jason", "175 Alexander St., Rochester, NY 14615",
                                       "Mitchellg@yahoo.com", "585-992-1111", Student.STATUS_JUNIOR, "CSCI"),
                           new Employee("Jeffrey", "Nelson", "Michael", "125 St. Paul St., Rochester, NY 14605",
                                        "jeffrey.nelson@myMail.com", "585-442-2131", "C345", 70351.65),
                           new Faculty("Tara", "Sherman", "", "420 Main St., East Rochester, NY 14513", 
                                       "shermta@bigmail.com", "585-334-9190", "G134", 70223.00, "MWF 11-1",
                                       "Associate Professor"),
                           new Faculty("Cristina", "Boyd", "Bonnie", "1800 South Ave., Rochester, NY  14620", 
                                       "BoudCB@schollmail.edu", "585-398-1213", "G156", 74075.00, "MW 09-12",
                                       "Associate Professor"),
                           new Staff("Elvira", "Harris", "Jane", "770 West Main St, Rochester, NY 14619",
                                     "eharris12@gmail.com", "585-330-1112", "A221", 72345.77, "Comptroller")
                         };

       //********************************************************************************
       //*** Display instances                                                        ***
       //********************************************************************************  
       
       System.out.println("====================================================================================");
       System.out.println("DISPLAYING INSTANCES USING PLYMORPHISM                                              ");
       System.out.println("====================================================================================");
       pause(input, "Press <ENTER> to continue...");

       for (int i = 0; i < people.length; i++)
       {
           System.out.println("\n------------------------------------------------------------------\n");
           System.out.println(people[i]);
           System.out.println("------------------------------------------------------------------\n");
           if (i < people.length - 1)
           {
               pause(input, "Press <ENTER> to view the next one...");
           }
       }
       System.out.println();
 
       //********************************************************************************
       //*** Test invalid instances                                                   ***
       //********************************************************************************  
       
       System.out.println("====================================================================================");
       System.out.println("TEST INVALID INSTANCES USING PLYMORPHISM                                            ");
       System.out.println("====================================================================================");
       pause(input, "Press <ENTER> to continue...");
       
       System.out.println("Trying student with invalid status...");
       Student st1 = new Student("Higgins", "Kristi", "Priscilla", "435 Dewey Ave., Rochester, NY, 14605",
                                 "KHiggins@school.edu", "585-335-2234", 7, "CYBR");
       System.out.println("------------------------------------------------------------------\n");
       System.out.println("Student 1: \n" + st1);
       System.out.println("------------------------------------------------------------------\n");
       pause(input, "Press <ENTER> to continue...");

       System.out.println("Trying faculty with invalid salary...");
       Faculty f1 = new Faculty("Herrera", "Mary", "", "435 State St., Rochester, NY  14615", 
                                "mary.herrera@gmail.com", "585-222-1401", "A211", -10.00, "TR 12:00 - 2:00",
                                "Assistant Professor");
       System.out.println("------------------------------------------------------------------\n");
       System.out.println("Faculty 1: \n" + f1);
       System.out.println("------------------------------------------------------------------\n");
       pause(input, "Press <ENTER> to finish...");
    }


    public static void pause(Scanner input, String prompt)
    {
        System.out.print(prompt + " >>  ");
        input.nextLine();
    }
}