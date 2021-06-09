/**
 * This is WriteCustomer text file
 * @author Chad Siegelaar 218340982
 * Date: 03 June 2021
 */
package za.ac.cput.assignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCustomer {
    public static void main(String[] args) {  
        try{
            FileWriter fw = new FileWriter("CustomerOutFile.txt");  
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(String.format("%-15s\n", "================== CUSTOMERS ======================="));
                bw.write(String.format("%-15s\n", "===================================================="));
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    System.out.println("File Created");
    }
}

