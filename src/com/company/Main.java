package com.company;

import entities.Funcionario;
import util.Calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Main {


    public static void main(String[] args) throws ParseException {
     Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);
  /*
        triangle y, x;
        y = new triangle();
        x = new triangle();

        System.out.println("Entre com os valores de X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os valores de Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areay = x.area();

        double areax = y.area();


        System.out.printf("Tamanho da areaY é: %.4f%n", areay);
        System.out.printf("Tamanho da areax é: %.4f%n", areax);

        if(areay > areax) {
            System.out.println("Area y é maior");
        }
        else {
            System.out.println("Area X é maior");
        }






            System.out.println("Enter product data");
             System.out.print("name: ");

             String name = sc.nextLine();
            System.out.print("price: ");
            double price = sc.nextDouble();

             Product product = new Product(name, price);

             product.setName("computador");
             System.out.println("Update name:"+ product.getName());
             product.setPrice(1200);
            System.out.println("Update price: "+ product.getPrice());

                System.out.println("product data: "+ product);
                System.out.println();
                System.out.println("Enter com o numero de produtos em estoque");
               int quantity = sc.nextInt();
                product.addProducts(quantity);
                System.out.println("update data: "+ product);
                System.out.println("Enter the number of products to be remove from stock");
                quantity = sc.nextInt();
                product.removeProducts(quantity);
                 System.out.println("update data: "+ product);


            rectangle retangulo = new rectangle();
        System.out.println("enter rectangle width and height");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.println(retangulo);


        Employee emploee = new Employee();

        System.out.println("Name: ");
        emploee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emploee.grossSalary = sc.nextDouble();
        System.out.print("tax: ");
        emploee.tax = sc.nextDouble();

        System.out.println("emploee: "+ emploee);

        System.out.println("which porcentage to increase salary? ");
        double porcento = sc.nextDouble();
        emploee.IncreaseSalary(porcento);

        System.out.println("Update data : "+ emploee);


        aluno Aluno = new aluno();
        double media = 60.0;
        Aluno.nome = sc.nextLine();
        Aluno.nota1 = sc.nextDouble();
        Aluno.nota2 = sc.nextDouble();
        Aluno.nota3 = sc.nextDouble();

        System.out.printf("Missing %.2f points%n", Aluno.Notafinal());
        if(Aluno.Notafinal() < 60.0){
            System.out.printf("Missing %.2f points%n", Aluno.MissingPoints());
            System.out.println("Faled");
        }
        else
        {
            System.out.println("pass");

        }


        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius);

        double v = Calculator.volume(radius);
        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("pi: %.2f%n", Calculator.PI);

        Cotacao cotacao = new Cotacao();
        System.out.printf("What is the dollar price? ");
        cotacao.dolar = sc.nextDouble();
        System.out.print("How many Dollar will be bouth? ");
        cotacao.quantity = sc.nextInt();



        System.out.printf("Amount to be paid in reais = ", cotacao.dolar);

        Deposito deposito;

            System.out.print("Enter account number: ");
            int number = sc.nextInt();

            System.out.print("Enter account holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Is there deposit initial (y/n)");
            char response = sc.next().charAt(0);
            if(response == 'y'){
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                deposito = new Deposito(holder, number, initialDeposit);
            }
            else
            {
                deposito = new Deposito(holder, number);
            }

            System.out.println();
            System.out.println("Account dada: ");
            System.out.print(deposito);

            System.out.println();

            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            deposito.deposit(depositValue);

              System.out.println("update account data: ");
              System.out.print(deposito);
              System.out.println();

             System.out.println("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            deposito.withdrow(withdraw);
            System.out.println("update account data: ");
            System.out.print(deposito);
            System.out.println();


            int n = sc.nextInt();
            double [] vect = new double [n];
            for(int i = 0; i < n; i++ ){
               vect[i] = sc.nextDouble();
            }
            double sum = 0;
            for (int i = 0; i < n; i++ ){
                sum += vect[i];

            }
            double avg = sum / n;

            System.out.printf("Average height: %.2f%n", avg);

            int n = sc.nextInt();
            ProductVect[] vect = new ProductVect[n];

            for(int i =0; i< vect.length;i++){
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();

                vect[i] = new ProductVect(name,price);
            }
            double soma = 0.0;
            for (int i = 0; i <vect.length; i++){
                soma += vect[i].getPrice();
            }
            double avg = soma / vect.length;
            System.out.printf("Average price = %.2f%n", avg);

        Quartos[]vect = new Quartos[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Rent # " + i + ":");
            sc.nextLine();
            System.out.print("Name ");
            String name = sc.nextLine();
            System.out.print("Email ");
            String email = sc.nextLine();
            System.out.print("Quarto ");
            int quarto = sc.nextInt();

            vect[quarto] = new Quartos(name, email );
        }
        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i <= 10; i++){
            if(vect[i] != null){
                System.out.println(i + ":" + vect[i]);
            }
        }
        int x = 20;
            Integer obj = x;
            System.out.println(obj);

            int y = obj * 2;
            System.out.println(y);
       String[]vect = new String[]{"Maria", "Bob","Alex"};

            for(String obj : vect){
                System.out.println(obj);
            }

        List<String>list = new ArrayList<>();

        list.add("Bruno");
        list.add("Alex");
        list.add("bob");
        list.add("Ana");
        list.add(2, "Marco");
        list.add(2, "Marcos");


        System.out.println(list.size());


        for (String x : list){
            System.out.println(x);
        }
System.out.println("------------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Index of bob: "+ list.indexOf("das"));


        List<String>result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }
        System.out.println("------------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


        sc.close();

        List<Funcionario> func = new ArrayList<>() ;

        System.out.print("How many employess will be registered? ");
        int n = sc.nextInt();
        for(int i =1; i <= n; i++){
            System.out.print("Employee: "+ i + ":" );
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary");
            double salary = sc.nextDouble();

            func.add(new Funcionario(name, id, salary));
        }
        System.out.print("Enter the employee id that will have salary increase:");
            int id = sc.nextInt();
            Funcionario funci = func.stream().filter(x -> x.id == id).findFirst().orElse(null);
            if(funci == null){
            System.out.print("Não encontrado");
            }
            else{
                System.out.print("Acresentar salario: ");
                double sala = sc.nextDouble();
                funci.Increase(sala);
            }
            for(Funcionario f : func){
                System.out.print("Galera" + f.id + ", " + f.name + ", " + f.salary);
            }


                int n = sc.nextInt();
                int[][]mat = new int [n][n];

                for(int i = 0; i < mat.length; i++){
                    for (int j = 0; j<mat[i].length;j++){
                        mat[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Main diagonal: ");
                for(int i = 0; i< mat.length; i++){
                    System.out.print(mat[i][i]+ " ");
                }
                System.out.println();
                int coun =0;
                for(int i = 0; i <mat.length ; i++){
                    for (int j =0; j<mat[i].length; j++){
                        if(mat[i][j] <0 ){
                            coun++;
                        }
                    }
                }
                System.out.println("negative number = " + coun);
*/

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4);

        d = cal.getTime();
        System.out.println(sdf2.format(d));


    }


}
