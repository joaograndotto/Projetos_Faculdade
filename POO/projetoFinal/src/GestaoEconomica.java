package ProjetoFinal;

public class GestaoEconomica {

    private double montanteIngred;
    private double montanteVendas;

    public double getMontanteIngred() {
        return montanteIngred;
    }

    public void setMontanteIngred(double montanteIngred) {
        this.montanteIngred = montanteIngred;
    }


    public double getMontanteVendas() {
        return montanteVendas;
    }

    public void setMontanteVendas(double montanteVendas) {
        this.montanteVendas = montanteVendas;
    }

    //===========================================================|


    public void calcularGastos(double qi, double vi) {
        setMontanteIngred(qi * vi);
        System.out.println(getMontanteIngred());

    }

    public void calcularLucro(double vp, double qp) {
        setMontanteVendas(vp * qp);
        System.out.println(getMontanteVendas());

    }
}
