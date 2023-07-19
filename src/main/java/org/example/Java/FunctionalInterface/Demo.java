package org.example.Java.FunctionalInterface;

//public class Demo implements FunctionalInterfaceDemo{
//    @Override
//    public void show() {
//        System.out.println("Functional Interface Demo");
//    }
//}

class mainClass{
    public static void main(String[] args) {
//       FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {
//           @Override
//           public void show() {
//               System.out.println("Lambda Expression");
//           }
//       };

//        FunctionalInterfaceDemo demo = () ->  {
//            System.out.println("Lambda Expression");
//        };

        FunctionalInterfaceDemo demo = (x,y) -> {
                return x+y;
            };
        System.out.println(demo.add(2,5));
    }
}
