package zooProject;

/*
 * @author:Georgios Simos
 * @version 1.0
 * Project: Madagascar Zoo management system - Java Console App(Unipi Assignment - OOP)
 * lines 16 to 26 are used to create initial data for testing purposes
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationActions {
    public static void main(String[] args){

//        ArrayList<animal> zoo_animals = new ArrayList<>();
//        hippo Gloria = new hippo("Gloria",1327,"Mammal",882.47,21, 4.56);
//        zoo_animals.add(Gloria);
//        lion Alex = new lion("Alex",3371,"Mammal", 456.88, 27,77);
//        zoo_animals.add(Alex);
//        zebra Marty = new zebra("Marty",4320,"Mammal", 321.18, 15,55.12);
//        zoo_animals.add(Marty);
//        giraffe Melman = new giraffe("Melman",9803,"Mammal", 731.07, 33,3.12);
//        zoo_animals.add(Melman);
//        System.out.println(zoo_animals);
//        serializeList(zoo_animals);
          ArrayList<animal> zoo_animals = deserializeList("zoo_animals.ser");

        Scanner myScanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the zoo of Madagascar!");
        while (true) {
            System.out.println("""
                    1.Display all current zoo animals
                    2.Add a new animal.
                    3.Search animal by name
                    4.Search animal by code
                    5.Remove animal by code
                    6.Feed animals
                    7.Save changes and Exit the App""");

            System.out.println("Please enter what you want to do:");
            choice = myScanner.nextInt();
            switch (choice) {
                case 1 -> {
                    if (zoo_animals.isEmpty())//the arrayList is empty
                        System.out.println("The zoo is currently empty. No animals to display!");
                    else {
                        System.out.println("Animals currently in the zoo:");
                        System.out.println(zoo_animals);
                    }
                }//case 1 - display animals in the zoo
                case 2 -> {
                    int new_code;
                    String new_name;
                    String new_category;
                    double new_weight;
                    int new_age;

                    System.out.println("Ok, let's add a new animal. First enter the basic data.");
                    System.out.println("Give the name.");
                    new_name = myScanner.next();
                    System.out.println("Give the code number.");
                    new_code = myScanner.nextInt();
                    new_category = "Mammal";
                    System.out.println("Give the weight in kilos.");
                    new_weight = myScanner.nextDouble();
                    System.out.println("Give the age.");
                    new_age = myScanner.nextInt();

                    boolean valid = false;
                    do{
                        System.out.println("""
                            Press A if you want the animal to be a hippo.
                            Press B if you want the animal to be a lion.
                            Press C if you want the animal to be a zebra.
                            Press D if you want the animal to be a giraffe.""");

                        String entry_categ  = myScanner.next();
                        switch (entry_categ){
                            case "A","a" ->{
                                System.out.println("Ok, you want to add a hippo!\nGive the total length in meters.");
                                double new_length = myScanner.nextDouble();
                                zoo_animals.add(new hippo(new_name,new_code,new_category,new_weight,new_age, new_length));
                                System.out.println("Hippo "+new_name+" was added successfully!");
                                valid = true;
                            }//case A - hippo
                            case "B","b" ->{
                                System.out.println("Ok, you want to add a lion!\nGive the strength in power units.");
                                int new_strength = myScanner.nextInt();
                                zoo_animals.add(new lion(new_name,new_code,new_category,new_weight,new_age, new_strength));
                                System.out.println("Lion "+new_name+" was added successfully!");
                                valid = true;
                            }//case B - lion
                            case "C","c" ->{
                                System.out.println("Ok, you want to add a zebra!\nGive the top speed in km per hour.");
                                double new_top_speed = myScanner.nextDouble();
                                zoo_animals.add(new zebra(new_name,new_code,new_category,new_weight,new_age, new_top_speed));
                                System.out.println("Lion "+new_name+" was added successfully!");
                                valid = true;
                            }//case C - zebra
                            case "D","d" ->{
                                System.out.println("Ok, you want to add a giraffe!\nGive the neck length in meters.");
                                double new_neck_length = myScanner.nextDouble();
                                zoo_animals.add(new giraffe(new_name,new_code,new_category,new_weight,new_age, new_neck_length));
                                System.out.println("Lion "+new_name+" was added successfully!");
                                valid = true;
                            }//case D - giraffe
                            default -> System.out.println("Please select between categories A to D!");
                        }//switch - animal category

                   }while (!valid);   //while - validation check for animal addition
                }//case 2 - Add a new animal on an existing species
                case 3 -> {
                    System.out.println("Please enter the name of the animal you are searching for:");
                    String name = myScanner.next();
                    animal desired = null;
                    boolean found = false;
                    for (animal anm : zoo_animals){
                        if (anm.getName().equals(name)){
                            desired = anm;
                            found = true;
                            break;
                        }//if
                    }//for
                    if (found){
                        System.out.println("Animal with name "+name+ " found!!");
                        System.out.println(desired);
                    }
                    else
                        System.out.println("Animal with name "+name+ " not found!\n");
                }//case 3 - search animal by name
                case 4 ->{
                    System.out.println("Please enter the code of the animal you are searching for:");
                    int code = myScanner.nextInt();
                    animal desired = null;
                    boolean found = false;
                    for (animal anm : zoo_animals){
                        if (anm.getCode() == code){
                            desired = anm;
                            found = true;
                            break;
                        }//if
                    }//for
                    if (found){
                        System.out.println("Animal with code "+code+ " found!");
                        System.out.println(desired);
                    }
                    else
                        System.out.println("Animal with code "+code+ " not found!\n");
                }//case 4 - search animal by code
                case 5 -> {
                    System.out.println("Please enter the code of the animal you want to remove:");
                    int code = myScanner.nextInt();
                    animal desired = null;
                    boolean found = false;
                    for (animal anm : zoo_animals){
                        if (anm.getCode() == code){
                            desired = anm;
                            zoo_animals.remove(desired);
                            found = true;
                            break;
                        }//if
                    }//for
                    if (found){
                        System.out.println("Animal: "+desired+ "was removed successfully!\n");
                    }
                    else
                        System.out.println("Unable to remove. Animal with code "+code+ " not found!\n");
                }//case 5 - delete animal by code
                case 6 -> {
                    if (zoo_animals.isEmpty())
                        System.out.println("The zoo is currently empty. No animals to feed!");
                    else {
                        System.out.println("Alright, let's feed the animals!");
                        for (animal anm : zoo_animals){
                            anm.feedAnimal(anm.getName());
                        }//for
                    }//else
                }//case 6 - feed each animal in the zoo
                case 7 -> {
                    serializeList(zoo_animals);
                    System.out.println("Bye Bye!");
                    return;
                }//case 7 - Save and Exit
                default -> System.out.println("Choice must be between 1 and 7. Try again!\n");
            }//switch - choice of the various functions of the app
        }//while - menu options
    }//main

    /*
    * serializeList is used to store the objects of the arrayList in a file
    * */
    private static void serializeList(ArrayList<animal> animals){
        try {
            FileOutputStream fos = new FileOutputStream("zoo_animals.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animals);
            oos.close();
            fos.close();
            System.out.println("All changes to the zoo inventory were saved successfully!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//serializeList

    /*
     * deserializeList is used to load the objects from a file to an arrayList
     * */
    private static ArrayList<animal> deserializeList(String filename){
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<animal> animals = (ArrayList<animal>) ois.readObject();
            //System.out.println(animals);
            ois.close();
            fis.close();
            return animals;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }//deserializeList

}//SerializationActions
