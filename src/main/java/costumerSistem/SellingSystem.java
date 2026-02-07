package costumerSistem;

import java.util.Scanner;

public class SellingSystem {

    static Scanner sc = new Scanner(System.in);

        // product Atributes
        static int id;
        static String description;
        static double price;
        static int quantity;
        static boolean state;
    public static void main(String[] args) {
        createProducts();
        getProducts();
        System.out.println("ingrese el Id a actualizar");
        int id=sc.nextInt();
        sc.nextLine();
        updateProducts(id);
        deletProducts(id);
    }

    //class products
    public static void createProducts(){
        System.out.println("Ingrese el ID del producto ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el nombre del producto");
        description=sc.nextLine();
        System.out.println("ingrese el precio del producto");
        price=sc.nextDouble();
        sc.nextLine();
        System.out.println("ingrese la cantidad");
        quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el estado del producto");
        state=sc.nextBoolean();

    }
     public static void getProducts(){
         System.out.println("Id: "+id+ "\n" +
                 "Description: " + description +"\n" +
                 "price: " + price + "\n" +
                 "Quantity: " + quantity+ "\n" +
                 "state: " + state);
     }
    public static void updateProducts(int findId){
        if (findId == id){
            System.out.println("Ingrese el ID del producto ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese el nombre del producto");
            description=sc.nextLine();
            System.out.println("ingrese el precio del producto");
            price=sc.nextDouble();
            sc.nextLine();
            System.out.println("ingrese la cantidad");
            quantity=sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese el estado del producto");
            state=sc.nextBoolean();
        }else{
            System.out.println("----------------------");
            System.out.println("producto no encontrado");
            System.out.println("----------------------");
        }
        {
            System.out.println("Ingrese el ID del producto ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese el nombre del producto");
            description=sc.nextLine();
            System.out.println("ingrese el precio del producto");
            price=sc.nextDouble();
            sc.nextLine();
            System.out.println("ingrese la cantidad");
            quantity=sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese el estado del producto");
            state=sc.nextBoolean();
        }
    }
    public static void deletProducts(int findId){
        if (findId==id) {
            id= 0;
            description="";
            price=0;
            quantity=0;
            state=false;
        }else{
            System.out.println("----------------------");
            System.out.println("producto no encontrado");
            System.out.println("----------------------");
        }

    }
}
