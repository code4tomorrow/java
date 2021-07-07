abstract class Restaurant {

    public abstract void food();

}

class Tacobell extends Restaurant {
    public void food() {
        System.out.println("Tacos!");
    }
}

class Pizzahut extends Restaurant {
    public void food() {
        System.out.println("Pizza!");
    }
}

class McDonalds extends Restaurant {
    public void food() {
        System.out.println("Burgers!");
    }
}

class KFC extends Restaurant {
    public void food() {
        System.out.println("Chicken!");
    }
}

public class AbstractClassesTutorial {

    public static void main(String[] args) {
        Tacobell t = new Tacobell();
        t.food();
        Pizzahut p = new Pizzahut();
        p.food();
        McDonalds m = new McDonalds();
        m.food();
        KFC k = new KFC();
        k.food();

    }
}
