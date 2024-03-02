package Tema10;

//-parcurgem un for care are indexul de la 1 la 1000. Daca indexul=10 afisam un mesaj, daca indexul=100 afisam un al doilea mesaj,
// daca  indexul este 900 afisam un al treilea mesaj.

//-rezolvam exercitiul de mai sus cu while si do while in loc de for.

public class Ex1 {
    public static void main(String[] args){
        for(int index = 1; index <= 1000; index++){
            if(index == 10){
                System.out.println("This is number 10");
            }

            else if(index == 100){
                System.out.println("This is number 100");
            }

            else if(index == 900){
                System.out.println("This is number 900");
            }
        }

        System.out.println("-------------------");

        int idx = 1;
        while(idx <= 1000){
            if(idx == 10){
                System.out.println("This is number 10");
            }
            else if (idx == 100){
                System.out.println("This is number 100");
            }

            else if (idx == 900){
                System.out.println("This is number 900");
            }

            idx++;
        }

        System.out.println("-------------------");

        int ind = 0;
        do{
            if(ind == 10){
                System.out.println("This is number 10");
            }
            else if (ind == 100){
                System.out.println("This is number 100");
            }

            else if (ind == 900){
                System.out.println("This is number 900");
            }

            ind++;
        }
        while (ind <= 1000);
    }

}
