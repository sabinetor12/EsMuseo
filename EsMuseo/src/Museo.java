/**
 * questa classe gestisce un museo
 */
public class Museo{
    private int personeD=0;
    private final int MaxP=3;


    public Museo(){
    }
    /**
     * questo metodo fà entrare nel museo
     */
    public synchronized void entrata(){
        while(personeD >= MaxP){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        personeD++;
        System.out.println("entra "+ Thread.currentThread().getName());
        notifyAll();
    }
    /**
     * questo metodo fà uscire dal museo
     */
    public synchronized void uscita(){
        personeD--;
        System.out.println("esce "+ Thread.currentThread().getName());
        notifyAll();
    }
    /**
     * returna il numero di persone dentro
     * @return personeD le persone dentro
     */
    public int getPersoneD() {
        return this.personeD;
    }
    /**
     * setta il numero di persone dentro
     * @param personeD il numero di persone da settare
     */
    public void setPersoneD(int personeD) {
        this.personeD = personeD;
    }

    public int getMaxP() {
        return this.MaxP;
    }


}