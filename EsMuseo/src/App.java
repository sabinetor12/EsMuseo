public class App {
    public static void main(String[] args) throws Exception {
        Museo m = new Museo();

        Turista t1 = new Turista("flavio", m);
        Turista t2 = new Turista("bello", m);
        Turista t3 = new Turista("figo", m);
        Turista t4 = new Turista("truce", m);
        Turista t5 = new Turista("baldazzi", m);
        Turista t6 = new Turista("manuto", m);
        Turista t7 = new Turista("samir", m);
        Turista t8 = new Turista("snoop dog", m);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();

        System.out.println("fine");
    }
}
