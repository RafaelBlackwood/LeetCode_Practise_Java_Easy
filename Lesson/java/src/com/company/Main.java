package com.company;
import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;



//public class Main {

//    public static void main(String[] args) {
//***********************************************************************************************

        // Comment

        //System.out.print("I love khinkhali");
       /* System.out.print("I love khinkhali\n");
        System.out.println("I love khinkhali");
        System.out.println("\tIt's really good");
        System.out.println("\\ \"Rafael\" \\ ");
*/
        /*
        multiple line comment
         */

       /* int a=65;
        char c;
        c=a; //ошибка
        c=65;
        System.out.println(c);
*/
//***********************************************************************************************

        //user input
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();
        scanner.nextLine();//without this line we won`t be able to see any information about favorite food
        System.out.println("What is your favorite food");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your are  " + age + " years old");
        System.out.println("You like " + food);
    */

//***********************************************************************************************


        // GUI Application - Graphical User Interface
        /*
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Your age is: "+ age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"Your height is: "+ height);
    */

//***********************************************************************************************

        //Math function
        /*
    double x = 3.14;
    double y = -10;

    double z = Math.max(x,y);
    double s = Math.abs(y);
    double v = Math.sqrt(x);
    double d = Math.ceil(x);
    int f = (int) d;

        System.out.println(z);
    System.out.println(s);
    System.out.println(v);
    System.out.println(d);
    System.out.println(f);

        double x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z= Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+ z);

        scanner.close();
*/

//***********************************************************************************************

        //Random
/*
        Random random = new Random();

        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        //System.out.println(x);
        ///System.out.println(y);
        System.out.println(z);
*/

//***********************************************************************************************


//If statement

        /*
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18 & age<=74){
            System.out.println("You are an adult");
        }
        else if (age>=75){
            System.out.println("Ok Boomer!");
        }
        else if ( age>= 13 & age<=17 ){
            System.out.println("Ok Boomer!");
        }
        else{
            System.out.println("You are not an adult");

        }

         */

//***********************************************************************************************

//switch statement
/*
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch(day){
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Moday": System.out.println("It is Moday");
                break;
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Wednesday": System.out.println("It is Wednesday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            case "Saturday": System.out.println("It is Saturday");
                break;
            default: System.out.println("It is not a day");
        }

 */

//***********************************************************************************************

//Loops


        //While loop
/*
    Scanner sc = new Scanner(System.in);
    String name = "";

    while(name.isBlank()){
        System.out.println("Enter your name: ");
        name = sc.nextLine();
    }
    System.out.println("Hello" + name);


 */

        //Do while Loop
/*
        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter your name: ");
            name = sc.nextLine();
        }while(name.isBlank());
        System.out.println("Hello" + name);

 */

        //For Loop
        /*
        for(int i = 0; i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("Happy new year");

         */

        //Nested Loops

        /*
        Scanner sc = new Scanner(System.in);

        int rows,columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter the synbol: ");
        symbol = sc.next();

        for(int i=1;i<=rows;i++)
        {
            System.out.println();
            for(int j = 1; j<=columns;j++){
                System.out.print(symbol);
            }

        }


        //For-Each loop - traversing techinque to iterate through the elements in array/collection
        //                  less steps, more readable
        //                  less flexible

        //String[] animals = {"Cat", "Dog","Rat","Bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");

        for(String index : animals){  //  : - means *in*
            System.out.println(index);
        }

   */


//***********************************************************************************************

//Arrays - used to store multiple values in a single variable
/*
        String[] cars = {"Camaro", "BMW", "Rollce Royce"};

        cars[0] = "Mustang";
        System.out.println(cars[2]);

        String[] machine =  new String[3];

        machine[0] = "Camaro";
        machine[1] = "Corvette";
        machine[2] = "Tesla";

        for(int i=0; i<machine.length;i++)
        {
            System.out.println(machine[i]);
        }
 */

        //2D Arrays
/*
        String[][] machines = {
                {"Camaro", "Corvette","Silverado"},
                {"Mustang","Ranger", "F-150"},
                {"Ferrari", "Lambo","Tesla"}
        };


        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";


        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";


        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";


        for (int i = 0; i< cars.length;i++){
            for(int j =0; j< cars[i].length;j++)
            {
                System.out.print(cars[i][j]+ "   ");
            }
            System.out.println();
        }


 */


//***********************************************************************************************

//Strings - a reference data type that can store one or more characters
        // reference data types have access to useful methods
/*
String name = "Rafael";
boolean result = name.equals("Bro");
boolean result2 = name.equalsIgnoreCase("rafael");
System.out.println(result);
System.out.println(result2);

int result3 = name.length();
System.out.println(result3);

char result4 = name.charAt(0);
System.out.println(result4);

int result5 = name.indexOf("R");
System.out.println(result5);

boolean result6 = name.isEmpty();
        System.out.println(result6);

String result7 = name.toUpperCase();
String result8 = name.toLowerCase();

        System.out.println(result7);
        System.out.println(result8);

String name2 = name.trim(); //deletes all the empty spaces
        System.out.println(name2);

String result9 = name.replace('o', 'a');
        System.out.println(result9);


 */


//***********************************************************************************************


//wrapper class - provides a way to use primitive data types as reference data types
//                reference data types contain useful methods
//                can be used with collections (ex.ArrayList)


        //primitivve        //wrapper
        //----------        //---------
        //boolean           Boolean
        //char              Character
        //int               Integer
        //double            Double

        //autoboxing - the automatic conversion that the Java compiler makes between the primitive data types and their corresponding wrapper classes
        //unboxing - the reverse of autoboxing. Automatic conversion of wrapper classes to primitive
/*
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Rafael";

        if(a) {
        System.out.println("This is true");
        }

 */

//***********************************************************************************************

//ArrayList - a resizable array.
//            Elements can be added and removed after compilation phase
//            Store reference data types

        /*
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot dog");

        food.set(0,"Sushi");

        food.remove(2);
        food.clear();



        for(int i=0; i<food.size();i++){
            System.out.println(food.get(i));
        }
      */

//***********************************************************************************************
//Dictionary
/*
        HashMap<String, String> human = new HashMap<String, String>();
		human.put("name", "Wlad");
		human.put("secondName", "Kowalew");
		human.put("age", "25");
		human.put("proffesion", "teacher");

		System.out.println("-----------------------------");
		System.out.println("Size: " + human.size());
		System.out.println(human.isEmpty() ? "empty" : "not empty");
		System.out.println(human.getOrDefault("age", "None"));
		System.out.println(human.getOrDefault("Rge", "None"));
		System.out.println("-----------------------------");

		for (String key: human.keySet()){
		System.out.println(key + ": " + human.get(key));
		}
		human.remove("name");
		System.out.println("-----------------------------");
		for (String key: human.keySet()){
		System.out.println(key + ": " + human.get(key));
		}

 */

//***********************************************************************************************

//Множества(Set)

/*
 HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for(String state : states){

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");
 */


//***********************************************************************************************

        //Method - a block of code that is executed whenever it is called

 /*
        String name = "Raf";
        Integer age = 21;
    hello();
    hello_name(name);
    age(age);
    }

    static void hello(){
        System.out.println("Hello");
    }
    static void hello_name(String name){
        System.out.println("Hello "+ name);
    }
    static void age(int age){
        System.out.println("You are " + age + " years old");
    }


        int x = 3;
        int y = 4;

        int z = calc(x,y);

        System.out.println(z);


    }
    static int calc(int a, int b)
    {
        int result = a+b;
        return result;
    }


  */

//***********************************************************************************************


        // Overloaded methods = methods that share the same name but have different parameters
        //						method name + parameters = method signature
/*
        double x = add(1.0,2.0,3.0);

        System.out.println(x);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
 */


//***********************************************************************************************

//2D ArrayList - dynamic list of lists
        // You can change the size of these lists during runtime

/*

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);


 */

//***********************************************************************************************

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]
/*
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;


        System.out.printf("This is a format string %d, it is a variable\n",123);
         //[conversion-character]
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        //[width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f",myDouble);
 */


//***********************************************************************************************
//Final keyword
        /*
        final double PI = 3.14159;

        //PI = 4;  //You can't change a final variable

        System.out.println(PI);


         */
//**********************************************************************************************

//    }
//}


//OOP
//object  - an instance of a class that may contain attributes and methods
//Examplle: (phone,desk,computer,coffee,cup)
//LOOK AT THE FILE Car.Java

/*
In Java, a constructor is a special type of method that is used to initialize objects of a class.
 Constructors have the same name as the class and do not have a return type, not even void

 public class MyClass {
    // Default constructor (no-argument constructor)
    public MyClass() {
        // Constructor code here
    }

    // Parameterized constructor
    public MyClass(int value) {
        // Constructor code here
    }
}
 */


public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
/*
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        myCar1.drive();
        myCar1.brake();



 */
//******************************************************

        /*
        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);

        human1.drink();
        human2.eat();
 */

//******************************************************

//Variable Scope
		// local - declared inside a method
		//          visible only to that method

		//global - declared outside a method, but within a class
		//         visible to all parts of aa class

		///DiceRoller diceRoller = new DiceRoller();

//******************************************************

//Overloading constructors
		//Overloading constructors - multiple constructors within a class with the same name,
		//                           but have different parameters
		//                           name + parameters = signature



/*
        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


 */

//******************************************************

		// toString() = special method that all objects inherit,
		//    that returns a string that "textually represents" an object.
		//    can be used both implicitly and explicitly

/*
        Car car = new Car();


        System.out.println(car.toString()); //explicitly

        // or

        System.out.println(car);//implicitly


 */

//******************************************************

//Array of objects

        /*
        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

         */

//******************************************************
//Object passing as arguments
/*
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);

 */

//******************************************************


		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
/*
        Friend friend1 = new Friend("Sponegbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

 */


//******************************************************


		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
/*
        Car car = new Car("Bugatti");

        car.go();

        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);


 */

//******************************************************

		// method overriding = 	Declaring a method in sub class,
		//						which is already present in parent class.
		//						done so that a child class can give its own implementation
/*
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();

 */

//******************************************************


		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
/*
        Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",43,"everything");

        System.out.println(hero2.toString());

 */


//******************************************************

		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation

        /*
        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();

         */

//******************************************************

		//public: visible in all classes in all packages
		//protected: visible to all classes in the same package or classes in other packages that are a subclass
		//default: visible to all classes in the same package
		//private: visible only in the same class

//Look at the package 1 and 2

//******************************************************

		// Encapsulation = 	attributes of a class will be hidden or private,
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make them public/protected
/*
        Car car = new Car("Chevrolet","Camaro",2021);

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

 */

//******************************************************

		//Coping objects

        /*
        Car car1 = new Car("Chevrolet","Camaro",2021);
        //Car car2 = new Car("Ford","Mustang",2022);
        //car2.copy(car1);
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

         */

//******************************************************

//Interface - a template that can be applied to a class
		// similar to inheritance, but specifies what a class has/must do.
		// classes can apply more than one interface, inheritance is limited to 1 super class
/*
        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();

        hawk.hunt();

        Fish fish = new Fish();

        fish.flee();
        fish.hunt();

 */


//******************************************************


// polymorphism = 	greek word for poly-"many", morph-"form"
		//			The ability of an object to identify as more than one type

		/*

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();

		Vehicle[] racers = {car, bicycle, boat};

		for (Vehicle x : racers) {
			x.go();
		}

		 */

//******************************************************





		//Dynamic Polymorphism
		//Polymorphism - many shapes/forms
		// Dynamic - after compilation(during runtime)

		// Example : A Corvette is a: corvette, and a car, and a vehicle, and an object
/*
		Scanner scanner = new Scanner(System.in);
		Animal animal;

		System.out.println("What animal do you want?");
		System.out.print("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();

		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}

 */


//******************************************************

//import java.util.InputMismatchException;
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions

		/*
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = x/y;

			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			scanner.close();

		 */

//******************************************************

		//file - an abstract representation of file and directory pathnames
/*
			File file = new File("src/secret_message.txt");

		if(file.exists()){
			System.out.println("That file exists!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.isFile());
			file.delete();
		}
		else{
			System.out.println("That file doesn't exist!");
		}

 */

//******************************************************

		//File Writer
/*
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by Bro)");
			writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 */

		//File Reader

		// FileReader = read the contents of a file as a stream of characters. One by one
		//				read() returns an int value which contains the byte value
		//				when read() returns -1, there is no more data to be read
/*
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 */


//******************************************************

	//Audio

		/*
		Scanner scanner = new Scanner(System.in);

		File file = new File("DubVision.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);

		String response = "";

		while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");

			response = scanner.next();
			response = response.toUpperCase();

			switch(response) {
				case ("P"): clip.start();
					break;
				case ("S"): clip.stop();
					break;
				case ("R"): clip.setMicrosecondPosition(0);
					break;
				case ("Q"): clip.close();
					break;
				default: System.out.println("Not a valid response");
			}
		}
		System.out.println("Byeeee!");
		 */
//***********************************************************************************************
		//Generics In Java
		/*
		Generics в Java представляют собой механизм, позволяющий создавать классы,
		 интерфейсы и методы, которые могут работать с различными типами данных,
		 обеспечивая безопасность типов во время компиляции
		 Основные принципы generics в Java:
		1. Параметризованные типы (Parameterized Types):
			Вы можете создавать классы, интерфейсы и методы, которые могут принимать один или несколько параметров типов.
			Например, List<String> - это параметризованный список, который будет работать только с элементами типа String.
		2. Обобщенные классы (Generic Classes):
		 	Обобщенный класс объявляется с использованием параметра типа в угловых скобках (<>). Например:
		 		public class MyGenericClass<Template> {
   					private Template value;

   					public MyGenericClass(Template value) {
   					    this.value = value;
   					}

   					public Template getValue() {
   					    return value;
   					}
				}
		 3. Обобщенные интерфейсы (Generic Interfaces): То же самое применяется и к интерфейсам.
		 4. Методы с параметрами типов (Generic Methods): Методы также могут быть обобщенными и иметь параметры типов.
		 Параметры типов метода указываются перед возвращаемым типом.

		Преимущества generics:

			Безопасность типов (Type Safety): Компилятор проверяет соответствие типов во время компиляции,
			 что позволяет обнаруживать ошибки до выполнения программы.

			Более общий и переиспользуемый код: Обобщенные классы и методы позволяют создавать более
			 универсальные и переиспользуемые компоненты.


				public class MyGenericClass<Template> {
   					private Template value;

   					public MyGenericClass(Template value) {
   					    this.value = value;
   					}

   					public Template getValue() {
   					    return value;
   					}
				}

				public class GenericExample {
				    public static void main(String[] args) {
				        MyGenericClass<Integer> intContainer = new MyGenericClass<>(42);
				        System.out.println("Value: " + intContainer.getValue()); // Output: Value: 42

				        MyGenericClass<String> stringContainer = new MyGenericClass<>("Hello");
				        System.out.println("Value: " + stringContainer.getValue()); // Output: Value: Hello
				    }
				}

		 */


	}
}


