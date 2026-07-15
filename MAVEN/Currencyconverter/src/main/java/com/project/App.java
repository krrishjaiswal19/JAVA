package com.project;

import com.eclipsesource.json.JsonObject;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("   Welcome to Maven Currency Converter   ");
        System.out.println("=========================================");
        
        // 1. Mock JSON Data (Imagine dynamic API data coming in JSON format)
        // Maven dependency "minimal-json" is used here to parse this data
        String mockJsonResponse = "{ \"base\": \"USD\", \"rates\": { \"INR\": 83.50, \"EUR\": 0.92, \"GBP\": 0.78 } }";
        
        // Parsing the JSON string using the library Maven downloaded for us
        JsonObject jsonObject = JsonObject.readFrom(mockJsonResponse);
        JsonObject rates = jsonObject.get("rates").asObject();
        
        System.out.print("Enter amount in USD: $");
        double usdAmount = scanner.nextDouble();
        
        System.out.println("\n--- Conversion Rates ---");
        System.out.println("1. Convert to INR (Indian Rupee)");
        System.out.println("2. Convert to EUR (Euro)");
        System.out.println("3. Convert to GBP (British Pound)");
        System.out.print("Choose currency option (1-3): ");
        int choice = scanner.nextInt();
        
        double convertedAmount = 0;
        String targetCurrency = "";
        
        switch (choice) {
            case 1:
                double inrRate = rates.get("INR").asDouble();
                convertedAmount = usdAmount * inrRate;
                targetCurrency = "INR";
                break;
            case 2:
                double eurRate = rates.get("EUR").asDouble();
                convertedAmount = usdAmount * eurRate;
                targetCurrency = "EUR";
                break;
            case 3:
                double gbpRate = rates.get("GBP").asDouble();
                convertedAmount = usdAmount * gbpRate;
                targetCurrency = "GBP";
                break;
            default:
                System.out.println("Invalid Option selected!");
                System.exit(0);
        }
        
        System.out.println("\n=========================================");
        System.out.printf("Result: $%.2f USD = %.2f %s\n", usdAmount, convertedAmount, targetCurrency);
        System.out.println("=========================================");
        
        scanner.close();
    }
}