package innerclasses;

class Outerrr {

    static int x = 10;
           int y = 20;

    static class Innerr {

        void displ() {
            System.out.println(x);
            //System.out.println(y); // cannot access non static members

        }
    }
}

public class StaticInner {

    public static void main(String[] args) {

        Outerrr oo = new Outerrr();
        System.out.println(oo.y);
        Outerrr.Innerr ooii = new Outerrr.Innerr(); //observe that we only wrote new once not twice, because it is static
        ooii.displ();
    }
}
