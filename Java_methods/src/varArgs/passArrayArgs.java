package varArgs;


public class passArrayArgs {
    public static void main(String[] args) {

        System.out.println("without varArgs feature");
        argumentsArray obj = new argumentsArray();
        // here we have to create array which is tedius and very error prone
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {10,20};
        int arr3[] = {};

        obj.meth(arr1);
        obj.meth(arr2);
        obj.meth(arr3);


        // By using varagrs syntax      (int ...arr) -> we did not need to create array 
        System.out.println("\n\nWith var args (int ...arr) feature");
        varArgsKeyword obj2 = new varArgsKeyword();
        
        // we can directly pass numbers of argument in object method
        obj2.arrArgs(100,200,300,400,500);
        obj2.arrArgs();



        // we can overload var args method by passing differnt types of arguments in same name method
        // this time i use static method so we can call methods without using objects
        System.out.println("\n\nCreaitng multiple varArgs method with same name & passing differnt types of args (Overlaoding) ");

        overloadVaraArgs.arrVarOverl(90,80,70,60,40,50);
        overloadVaraArgs.arrVarOverl(90.99,80.88,70.77,60.66);   
        overloadVaraArgs.arrVarOverl(true,false,true,false);     


        System.out.println("\n\nPasssing different arguments in same varargs method ");
        // We can overload a varargs method by passing different type of arguments in same method
        diffArgu.diffVarArgs("Sachin Yadav", 962564, 33,66,99,88,55,22,11);
    }
}
