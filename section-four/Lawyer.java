// mock test

import java.util.*; 

public class Lawyer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = 0;
        String name = null;
        double salary = 0.0;
        int age = 0;

        int n = sc.nextInt();
        Lawyer[] arr = new Lawyer[n];

        for(int i = 0; i < n; i++){
            id = sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();
            salary = sc.nextDouble();
            age = sc.nextInt();
            arr[i] = new Lawyer(id, name, salary, age);
        }

        sc.nextLine();
        name = sc.nextLine();

        double lawyer1 = findAverageOfLawyer(arr);
        Lawyer lawyer2 = searchLawyerByName(arr, name);

        // printInfo(lawyer1);
        System.out.println(lawyer1);
        printInfo(lawyer2);
        
        sc.close();
    }

    public static void printInfo(Lawyer lawyer){
        if(lawyer != null){
            System.out.println("id-" + lawyer.getId());
            System.out.println("name-"+ lawyer.getName());
            System.out.println("salary-" + lawyer.getSalary());
            System.out.println("age-" + lawyer.getAge());
        }
        else{
            System.out.println("No Lawyer found with mentioned attribute");
        }
    }

    public static Lawyer searchLawyerByName(Lawyer[] arr, String name){

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                return arr[i];
            }
        }
        return null;
    }

    public static double findAverageOfLawyer(Lawyer[] arr){
        double sum = 0.0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i].getAge();
        }

        return sum / arr.length;
    }

    private int id;
    private String name;
    private double salary;
    private int age;

    public Lawyer(int id, String name, double salary, int age){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }
}
