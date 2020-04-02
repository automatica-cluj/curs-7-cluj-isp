package isp.curs5;

public class Lift {
    public static final int NIVEL_MAXIM = 10;

    private int nivelCurent;

    public void goUp() throws NivelGresitException{
        if(nivelCurent<NIVEL_MAXIM)
            nivelCurent++;
        else
            throw new NivelGresitException("Nivelul maxim a fost atins!");
    }

    public void controlLift() throws NivelGresitException {
        try {
            //1.
            //2.
            //3.
            for (int i = 0; i < 12; i++)
                goUp();
            //4.
            //5.
            return;
        }catch(NivelGresitException e){
            System.out.println("Liftul nu mai poate urca.");
            throw e;
        }finally {
            System.out.println("Deschide usile!");
        }
    }

    public static void main(String[] args) throws NivelGresitException {
        Lift l1 = new Lift();
        l1.controlLift();
        System.out.println("Finalizare normala program.");
    }

}

class NivelGresitException extends Exception{
    NivelGresitException(String msg){
        super(msg);
    }
}


