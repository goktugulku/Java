public class array_loop {
    public static void main (String [] args){
        String[] cars = {"Volvo", "Opel", "BMW", "Ford", "Mazda"};
        System.out.print(cars.length);
        for (int i = 0; i < cars.length ; i++){ 
            System.out.println(i);           
            System.out.println(cars[i]);
        }
    }
}
