import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DonationsTester {
    public static void main(String[] args) throws FileNotFoundException {
      
        System.out.print("Would you like to process donations now? (enter ‘Yes’ to continue): ");
        Scanner sc = new Scanner(System.in);

        // If answer is not equal to yes 
        if(!sc.nextLine().equalsIgnoreCase("yes")){
            System.out.println("Ending now without processing donations");    
        }
        else {
            Donations giveToMe = new Donations();
            
            File donationFile = new File("Donations.txt");
            Scanner scan = new Scanner(donationFile);
           
            while(scan.hasNextLine()) {     
                String str = sc.nextLine();
               
                if(str.contains("EOF")){
                    break;
                }
                
                else {
                    String[] str2 = str.split(">");
                    
                    if(str2[0].contains("individual")){
                        giveToMe.processDonation("individual",Double.parseDouble(str2[1]));
                    }
                    else if(str2[0].contains("business")){
                        giveToMe.processDonation("business",Double.parseDouble(str2[1]));
                    }
                    else if(str2[0].contains("other")){
                        giveToMe.processDonation("other",Double.parseDouble(str2[1]));
                    }
                }
            }
            //giveStatistics method
            giveToMe.getStatistics();

        }
    }
}

