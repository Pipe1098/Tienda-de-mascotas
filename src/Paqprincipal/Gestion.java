package Paqprincipal;
import java.util.Scanner;
import java.util.Date;
public class Gestion {

        Scanner input = new Scanner(System.in);
        private String name;
        private Gato[] cats;
        private Perro[] dogs;
        private Conejo[] rabits;
        private Mascota[] pets;

        private int dogFoot = 0; // la longitud actual del perro
        private int catFoot = 0; // La longitud actual del gato
        private int rabitFoot = 0;
        private int petFoot = 0;



        private int num = 0; // Cantidad de stock
        private int inNum = 0; // Cantidad de compra
        private int outNum = 0; // Cantidad de ventas

        public Gestion(int Size) {
            if (Size > 0) {
                this.cats = new Gato [Size]; // Abre el tamaño de la matriz
                this.dogs = new Perro[Size];
                this.rabits = new Conejo[Size];
                this.pets = new Mascota[Size];
            } else {
                this.dogs = new Perro [1]; // abre al menos un espacio
                this.cats = new Gato[1];
                this.rabits = new Conejo[1];
                this.pets = new Mascota[1];
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void add () {// Agregar una mascota
            System.out.println ("¿Agrega un perro o un gato o un conejo? \n" + "1.   2.   3.");
            String choice = input.next();
            if(choice.equals("1")) {
                Perro dog = new Perro();

                System.out.println ("Ingrese la información de la mascota que desea agregar");
                System.out.print ("Color:");
                dog.setColor(input.next());
                System.out.print ("Edad:");
                dog.setEdad(input.nextInt());
                System.out.print ("Género:");
                dog.setSex(input.next());
                System.out.print ("Precio de compra:");
                dog.setInPrice(input.nextDouble());
                System.out.print ("Precio de venta:");
                dog.setOutPrice(input.nextDouble());

                if(dogFoot < dogs.length) {
                    dogs[dogFoot] = dog;
                    dogFoot++;
                    System.out.println ("¡Agregado exitosamente!");
                    inNum++;
                    num++;
                }
                else {
                    System.out.println ("¡Error al agregar!");
                }
            }
            else if(choice.equals("2")) {
                if (catFoot < cats.length) {
                    Gato cat = new Gato();

                    System.out.println("Ingrese la información de la mascota que desea agregar");
                    System.out.print("Color:");
                    cat.setColor(input.next());
                    System.out.print("Edad:");
                    cat.setEdad(input.nextInt());
                    System.out.print("Género:");
                    cat.setSex(input.next());
                    System.out.print("Precio de compra:");
                    cat.setInPrice(input.nextDouble());
                    System.out.print("Precio de venta:");
                    cat.setOutPrice(input.nextDouble());


                    cats[catFoot] = cat;
                    catFoot++;
                    System.out.println("¡Agregado exitosamente!");
                    inNum++;
                    num++;
                } else {
                    System.out.println("¡Error al agregar!");
                }
            }
                  else if(choice.equals("3")) {
                    if(rabitFoot < rabits.length) {
                        Conejo rabi = new Conejo();

                        System.out.println ("Ingrese la información de la mascota que desea agregar");
                        System.out.print ("Color:");
                        rabi.setColor(input.next());
                        System.out.print ("Edad:");
                        rabi.setEdad(input.nextInt());
                        System.out.print ("Género:");
                        rabi.setSex(input.next());
                        System.out.print ("Precio de compra:");
                        rabi.setInPrice(input.nextDouble());
                        System.out.print ("Precio de venta:");
                        rabi.setOutPrice(input.nextDouble());


                        rabits[rabitFoot] = rabi;
                        rabitFoot++;
                        System.out.println ("¡Agregado exitosamente!");
                        inNum++;
                        num++;
                    }

                    else {
                        System.out.println ("¡Error al agregar!");
                    }
            }
            else {
                System.out.println ("No existe tal opción, ¡vuelva a ingresar!");
            }
        }

        public void print() {
            Date date = new Date();
            System.out.println ("=============== Lista de inventario de la tienda de mascotas ===============");
            System.out.println("*******************C A T S*******************");
            System.out.println("Color    Age    Sex    InPrice    OutPrice");
            for (int i = 0; i < cats.length; i++) {
                if (cats[i] != null) {
                    System.out.println(cats[i].getColor() + "\t" + cats[i].getEdad() + "\t" + cats[i].getSex() + "\t" + cats[i].getInPrice() + "\t" + cats[i].getOutPrice());
                }
            }
            System.out.println("\n*******************D O G S*******************");
            System.out.println("Color    Age    Sex    InPrice    OutPrice");
            for (int i = 0; i < dogs.length; i++) {
                if (dogs[i] != null) {
                    System.out.println(dogs[i].getColor() + "\t" + dogs[i].getEdad() + "\t" + dogs[i].getSex() + "\t" + dogs[i].getInPrice() + "\t" + dogs[i].getOutPrice());
                }
            }
            System.out.println("\n*******************Rabits*******************");
            System.out.println("Color    Age    Sex    InPrice    OutPrice");
            for (int i = 0; i < rabits.length; i++) {
                if (rabits[i] != null) {
                    System.out.println(rabits[i].getColor() + "\t" + rabits[i].getEdad() + "\t" + rabits[i].getSex() + "\t" + rabits[i].getInPrice() + "\t" + rabits[i].getOutPrice());
                }
            }
            System.out.println("=============================================");
            System.out.println("date:      " + date);
        }

        public void sell() {
            if(num == 0) {
                System.out.println ("El inventario es cero, ¡compre mascotas a tiempo! \n");
            }
            else {
                System.out.println ("¿Quieres vender un gato un perro o un conejo? \n" + "1.   2.   3.");
                String choice = input.next();
                if(choice.equals("1")) {
                    System.out.println ("Ingrese las características del gato que desea vender");
                    System.out.print ("Color:");
                    String color1 = input.next();
                    System.out.print ("Edad:");
                    int age1 = input.nextInt();
                    System.out.print ("Género:");
                    String sex1 = input.next();

                    int i, flag = catFoot;
                    for(i = 0; i < catFoot; i++) {
                        if(color1.equals(cats[i].getColor()) && age1 == cats[i].getEdad() && sex1.equals(cats[i].getSex())) {
                            flag = i; break;
                        }
                    }
                    if(i == catFoot) {
                        System.out.println ("¡No existe tal gato! Por favor verifique y vuelva a ingresar \n");
                        sell();
                    }
                    else {
                        pets[petFoot] = cats[i];
                        pets[petFoot].setKind("cat");
                        petFoot++;
                        for(int j = flag; j < catFoot; j++) {
                            cats[j] = cats[j + 1];
                        }
                        System.out.println ("Vendido con éxito! \n");
                        catFoot -= 1; // Si no disminuye en 1, informará un error de matriz fuera de límites
                        outNum++;
                        num--;
                    }
                }
                else if(choice.equals("2")) {
                    System.out.println ("Ingrese las características del perro que desea vender");
                    System.out.print ("Color:");
                    String color1 = input.next();
                    System.out.print ("Edad:");
                    int age1 = input.nextInt();
                    System.out.print ("Género:");
                    String sex1 = input.next();

                    int i, flag = dogFoot;
                    for(i = 0; i < dogFoot; i++) {
                        if(color1.equals(dogs[i].getColor()) && age1 == dogs[i].getEdad() && sex1.equals(dogs[i].getSex())) {
                            flag = i; break;
                        }
                    }
                    if(i == dogFoot) {
                        System.out.println ("¡Verifique que no haya tal perro! Vuelva a ingresar después de verificar");
                        sell();
                    }
                    else {
                        pets[petFoot].setKind("dog");
                        pets[petFoot] = dogs[i];
                        petFoot++;
                        for(int j = flag; j < dogFoot; j++) {
                            dogs[j] = dogs[j + 1];
                        }
                        System.out.println ("Vendido con éxito! \n");
                        dogFoot -= 1; // Si no es menos 1, informará un error de matriz fuera de límites
                        outNum++;
                        num--;
                    }
                }
                if(choice.equals("3")) {
                    System.out.println ("Ingrese las características del Conejo que desea vender");
                    System.out.print ("Color:");
                    String color1 = input.next();
                    System.out.print ("Edad:");
                    int age1 = input.nextInt();
                    System.out.print ("Género:");
                    String sex1 = input.next();

                    int i, flag = rabitFoot;
                    for(i = 0; i < rabitFoot; i++) {
                        if(color1.equals(rabits[i].getColor()) && age1 == rabits[i].getEdad() && sex1.equals(rabits[i].getSex())) {
                            flag = i; break;
                        }
                    }
                    if(i == rabitFoot) {
                        System.out.println ("¡No existe tal conejo! Por favor verifique y vuelva a ingresar \n");
                        sell();
                    }
                    else {
                        pets[petFoot] = rabits[i];
                        pets[petFoot].setKind("rabit");
                        petFoot++;
                        for(int j = flag; j < rabitFoot; j++) {
                            rabits[j] = rabits[j + 1];
                        }
                        System.out.println ("Vendido con éxito! \n");
                        rabitFoot -= 1; // Si no disminuye en 1, informará un error de matriz fuera de límites
                        outNum++;
                        num--;
                    }
                }

                else {
                    System.out.println ("No existe tal opción, ¡vuelva a ingresar!");
                }
            }
        }

        public void note() {
            Date date = new Date();
            System.out.println ("=============== Lista de registros de ventas de la tienda de mascotas ===============");
            System.out.println("Kind    Color    Age    Sex    InPrice    OutPrice");
            for(int i = 0; i < pets.length; i++) {
                if(pets[i] != null) {
                    System.out.println(pets[i].getKind() + "\t" + pets[i].getColor() + "\t" + pets[i].getEdad() + "\t" + pets[i].getSex() + "\t" + pets[i].getInPrice() + "\t" + pets[i].getOutPrice());
                }
            }
            System.out.println("=================================================");
            System.out.println("date:          " + date);
        }

        public void profitNote() {
            Date date = new Date();
            System.out.println ("=========== Rentabilidad de la tienda de mascotas ===========");
            double cost = 0.0;
            double income = 0.0;
            double myProfit = 0.0;
            for(int i = 0; i < pets.length; i++) {
                if(pets[i] != null) {
                    cost += pets[i].getInPrice();
                    income += pets[i].getOutPrice();
                }
            }
            myProfit = income - cost;
            System.out.println ("Costo:" + cost + "\n" + "Ingresos totales:" + income + "\n" + "Beneficios:" + myProfit);
            if(myProfit > 0) {
                System.out.println ("¡Felicitaciones, su tienda está en un estado rentable!");
            }
            else {
                System.out.println ("Desafortunadamente, ¡su tienda está perdida!");
            }
            System.out.println("=======================================");
            System.out.println("date:      " + date);
        }

        public int getOutNum() {
            return outNum;
        }

        public int getInNum() {
            return inNum;
        }

        public int getNum() {
            return num;
        }
    }


