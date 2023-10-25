public class Main {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("Calabresa", "39.90");
        
        Oceano oceano1 = new Oceano ("Pacifico", 660000000.0);
        Pais pais1 = new Pais (59, "Italia");

        
        System.out.println(pizza1.getPreco());

        Animais animais1 = new Animais ("Réptil", "Crocodilo");
        System.out.println(animais1.getReino());
        animais1.setReino("Anfíbio");
        System.out.println("Após atualização: ");
        System.out.println(animais1.getReino());
        System.out.println();
        System.out.println();

        Aviao aviao1 = new Aviao ("Embraer", 100);
        System.out.println(aviao1.getFabricante());

        Moto moto1 = new Moto ("Yamaha", 250.5);
        System.out.println(pizza1.getPreco());

        
        System.out.println(pizza1.getPreco());
        System.out.println(pizza1.getPreco());
        

        }
    }
