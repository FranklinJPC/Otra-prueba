import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Jugador");
        System.out.println("2. Carro");
        int option;
        option = sc.nextInt();
        switch (option)
        {
            case 1:
                Jugador player = new Jugador();  //Instancia y objeto
                System.out.println("Vida: " + player.getVida());
                System.out.println("Mana: " + player.getMana());
                System.out.println("Estamina: " + player.getEstamina());
                System.out.println("Carga: " + player.getCarga());
                System.out.println("Objeto: " + player.getObjeto());
                System.out.println();

                player.setVida(70);
                player.setMana(20);
                player.setCarga(2);
                player.setObjeto("x2 Hielo");
                System.out.println("Vida: " + player.getVida());
                System.out.println("Mana: " + player.getMana());
                System.out.println("Estamina: " + player.getEstamina());
                System.out.println("Carga: " + player.getCarga());
                System.out.println("Objeto: " + player.getObjeto());
                System.out.println();

                Jugador player2 = new Jugador();

                player2.setVida(50);
                player2.setMana(0);
                System.out.println("Vida: " + player2.getVida());
                System.out.println("Mana: " + player2.getMana());
                System.out.println("Estamina: " + player2.getEstamina());
                System.out.println("Carga: " + player2.getCarga());
                System.out.println("Objeto: " + player2.getObjeto());
                System.out.println();
                player2.setVida(50);

                System.out.println("Vida: " + player2.getVida());
                System.out.println("Mana: " + player2.getMana());
                System.out.println("Estamina: " + player2.getEstamina());
                System.out.println("Carga: " + player2.getCarga());
                System.out.println("Objeto: " + player2.getObjeto());
                break;
            case 2:
                Automovil carro = new Automovil();
                carro.setAnio(2021);
                carro.setCapacidad(4);
                carro.setColor("Rojo");
                carro.setMarca("Chevrolet");
                carro.setRuedas(4);
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Color: " + carro.getColor());
                System.out.println("Capacidad: " + carro.getCapacidad());
                System.out.println("Año: " + carro.getAnio());
                System.out.println("Ruedas: " + carro.getRuedas());
                break;
        }

    }
}