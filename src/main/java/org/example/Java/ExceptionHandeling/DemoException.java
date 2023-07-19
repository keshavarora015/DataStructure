package org.example.Java.ExceptionHandeling;

public class DemoException {
    public static void main(String[] args) {
        int i=8,j=0,k=0;
        try {
            //k=i/j;
            throw new MyException("invalid");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In finally Block");
        }
        System.out.println("After Catch Block");
    }
}
