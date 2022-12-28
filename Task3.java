import java.io.*;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            
            try {
                printSum(23, 234);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
            
            int[] abc = { 1, 2 };
            abc[1] = 9;
     
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex){
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);

     }
     

}
