import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clientArr = new ArrayList<>();
        Client c1 = new Client("bar","kehila",5);
        Client c2 = new Client("nir","kehila",10);
        Client c3 = new Client("ran","kehila",8);
        Client c4 = new Client("ido","kehila",2);
        Client c5 = new Client("amit","kehila",3);
        clientArr.add(c1);
        clientArr.add(c2);
        clientArr.add(c3);
        clientArr.add(c4);
        clientArr.add(c5);

        ArrayList <Worker> workersArr = new ArrayList<>();
        Worker w1 = new Worker("bar","kehila","manager",100);
        Worker w2 = new Worker("nir","kehila","regular",80);
        Worker w3 = new Worker("ran","kehila","senior",90);
        workersArr.add(w1);
        workersArr.add(w2);
        workersArr.add(w3);

        ArrayList<Product>  productsArr = new ArrayList<>();
        Product p1 = new Product("rice",10,true);
        Product p2 = new Product("apple",12,false);
        Product p3 = new Product("water",6,true);
        Product p4 = new Product("banana",7,false);
        productsArr.add(p1);
        productsArr.add(p2);
        productsArr.add(p3);

        System.out.println("enter type of search client:1.by name 2.by pursuer");
        int x=scanner.nextInt();
        for (int i=0;i<clientArr.size();i++) {
            clientArr.get(i).setSearch(x);
        }
        System.out.println("enter type of search worker:1.by name 2.by description 3. salary");
        int y=scanner.nextInt();
        for (int i=0;i<workersArr.size();i++) {
            workersArr.get(i).setSearch(y);
        }
        System.out.println("enter type of search product:1.by name 2.price 3.stock");
        int z=scanner.nextInt();
        for (int i=0;i<productsArr.size();i++) {
            productsArr.get(i).setSearch(z);
        }
        Collections.sort(clientArr, Client::compereTo);
        Collections.sort(workersArr,Worker::compereTo);
        Collections.sort(productsArr,Product::compereTo);
        System.out.println(clientArr.toString());
        System.out.println(workersArr.toString());
        System.out.println(productsArr.toString());

    }



    }

