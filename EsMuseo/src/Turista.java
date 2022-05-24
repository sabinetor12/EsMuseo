public class Turista extends Thread{
    private String nome;
    private Museo m;


    public Turista(String nome, Museo m) {
        this.nome = nome;
        this.m = m;
        this.setName(nome);
    }

    public void run()
    {
        m.entrata();
        try {
            sleep(((int)((Math.random()*10))+1)*1000);
        } catch (Exception e) {}
        m.uscita();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
