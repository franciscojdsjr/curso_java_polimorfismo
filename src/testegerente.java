public class testegerente {

    public static void main(String[] args) {

        funcionarioteste fu = new funcionarioteste();

        fu.setSalario(1000.0);

        System.out.println(fu.getTipo());
        System.out.println(fu.getBonificacao());

        funcionarioteste f2 = new funcionarioteste();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());

    }

}
