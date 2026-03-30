package Tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomGenerateData {

	 private static final String BASE_CLIENT_NAME = "Client_Auto";
	    private static final String FILE_PATH = "src/test/java/DataFiles/clientName.txt";
	    
	    
	    private static final String BasePan ="AABCI1951J";
	    private static final String MODIFIED_STRINGS_FILE_PANNO = "src/test/java/DataFiles/PanNo.txt";
	    
	    private static final String email="client@gmail.com";
	    private static final String MODIFIED_STRINGS_FILE_Email = "src/test/java/DataFiles/Email.txt";
	    
	    private static final String Address="Rajiv Gandhi IT Park Hinjewadi Pune";
	    private static final String MODIFIED_STRINGS_FILE_Address= "src/test/java/DataFiles/Address.txt";
	    
	    private static final String Address1="Rajiv Gandhi IT Park Hinjewadi Pune";
	    private static final String MODIFIED_STRINGS_FILE_Address1= "src/test/java/DataFiles/Address1.txt";
	    
	    private static final String zipcode="445001";
	    private static final String MODIFIED_STRINGS_FILE_zipcode= "src/test/java/DataFiles/zipcode.txt";
	    
	    public static String generateClientName() {
	        Set<String> existingNames = readClientNamesFromFile();

	        String newName = BASE_CLIENT_NAME;
	        int counter = 1;

	      
	        while (existingNames.contains(newName)) {
	            newName = BASE_CLIENT_NAME + " " + counter;
	            counter++;
	        }

	       
	        writeClientNameToFile(newName);

	        return newName;
	    }

	    private static Set<String> readClientNamesFromFile() {
	        Set<String> names = new HashSet<>();

	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                names.add(line.trim());
	            }
	        } catch (IOException e) {
	            
	        }

	        return names;
	    }

	    private static void writeClientNameToFile(String name) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
	            writer.write(name);
	            writer.newLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
		private static void writeModifiedPANToFile(String modifiedPans) {
			// TODO Auto-generated method stub
			 try (BufferedWriter writer = new BufferedWriter(new FileWriter("MODIFIED_STRINGS_FILE_PANNO", true))) {
				 writer.write(modifiedPans);
				 writer.newLine();
				}
			 catch(IOException e) {
				 e.printStackTrace();
			 }
			 
			
		}

		private static  Set<String> readModifiedPANFromFile() {
			Set<String> existingPANs = new HashSet<>();
			
			try(BufferedReader  reader = new BufferedReader(new FileReader("MODIFIED_STRINGS_FILE_PANNO"))){
				 
				String line ;
				while((line = reader.readLine()) != null) {
					existingPANs.add(line);
					
				}
				
				}
			catch(IOException e) {
					e.printStackTrace();
				
			}
			
			return existingPANs;
		}
		 public static  String generatePan() {
		    	
		    	
		    	Set<String> existingPANs  = readModifiedPANFromFile();
		    	
		    	Random random = new Random();
		    	
		    	String randomCounter = String.valueOf((random.nextInt(9999))
		    			+ 1000);
		    	
		    	String counterstr = String.valueOf(randomCounter);
		    	
		    	 String modifiedPans = BasePan.replaceAll(BasePan.substring(5, 9),randomCounter );
		    	 System.out.println(modifiedPans);
		    	 
		    	while (existingPANs.contains(counterstr)) {
		    		randomCounter =   String.valueOf((random.nextInt(9999))
			    			+ 1000); 
		    		counterstr = String.valueOf(randomCounter);
		    		modifiedPans = BasePan.replaceAll(BasePan.substring(5, 9),randomCounter );
		    	}
		    	 writeModifiedPANToFile(modifiedPans);
	System.out.println(modifiedPans);
		         return modifiedPans;
		    }

		 
		 private static void writeEmailToFile(String email) {

			    try (BufferedWriter writer = new BufferedWriter(
			            new FileWriter("MODIFIED_STRINGS_FILE_EMAIL.txt", true))) {

			        writer.write(email);
			        writer.newLine();

			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}
		 private static Set<String> readEmailsFromFile() {

			    Set<String> existingEmails = new HashSet<>();

			    try (BufferedReader reader = new BufferedReader(
			            new FileReader("MODIFIED_STRINGS_FILE_EMAIL.txt"))) {

			        String line;
			        while ((line = reader.readLine()) != null) {
			            existingEmails.add(line);
			        }

			    } catch (IOException e) {
			        e.printStackTrace();
			    }

			    return existingEmails;
			}
		 
		 public static String generateEmail() {

			    Set<String> existingEmails = readEmailsFromFile();
			    Random random = new Random();

			    String email;

			    do {
			        
			        int randomNum = 1000 + random.nextInt(9000);

			       
			        email = "user" + randomNum + "@gmail.com";

			    } while (existingEmails.contains(email));

			 
			    writeEmailToFile(email);

			    System.out.println("Generated Email: " + email);

			    return email;
			}
		
		 private static void writeAddressToFile(String address) {

			    try (BufferedWriter writer = new BufferedWriter(
			            new FileWriter("MODIFIED_STRINGS_FILE_ADDRESS.txt", true))) {

			        writer.write(address);
			        writer.newLine();

			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			    
			}
		 
		 private static Set<String> readAddressFromFile() {

			    Set<String> existingAddresses = new HashSet<>();

			    try (BufferedReader reader = new BufferedReader(
			            new FileReader("MODIFIED_STRINGS_FILE_ADDRESS.txt"))) {

			        String line;
			        while ((line = reader.readLine()) != null) {
			            existingAddresses.add(line);
			        }

			    } catch (IOException e) {
			        e.printStackTrace();
			    }

			    return existingAddresses;
			}
		 
		 public static String generateAddress() {

			    Set<String> existingAddresses = readAddressFromFile();
			    Random random = new Random();

			    String address;

			    do {
			        int flatNo = 1 + random.nextInt(999);
			        int buildingNo = 1 + random.nextInt(50);

			        address = "Flat " + flatNo + ", Building " + buildingNo + ", Pune";

			    } while (existingAddresses.contains(address));

			    writeAddressToFile(address);

			    System.out.println("Generated Address: " + address);

			    return address;
			}
		 
		 public static String generateAddressLine2() {

			    Random random = new Random();

			    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			    StringBuilder randomText = new StringBuilder();

			    for (int i = 0; i < 8; i++) {
			        randomText.append(letters.charAt(random.nextInt(letters.length())));
			    }

			    return "Area-" + randomText.toString();
			}
		 
		 public static String generateZipCode() {

			    Random random = new Random();
			    int zip = 100000 + random.nextInt(900000);
			    return String.valueOf(zip);
			}
		 
		 }


	
	

