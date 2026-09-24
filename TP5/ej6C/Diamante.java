public class Diamante extends Gema{
    public Diamante() {
    }

    public String Combinar(Gema gema) {
        return gema.CombinarDiamante(this);
    }

    @Override
    public String CombinarRubi(Rubi gema){
        return  "Tormenta de Rayos";
    }

    @Override
    public String CombinarZafiro(Zafiro gema){
        return  "Granizo Asesino";
    }

    @Override
    public String CombinarEsmeralda(Esmeralda gema){
        return  "Vientos Venenenosos";
    }

    @Override
    public String CombinarDiamante(Diamante gema){
        return  "Congelamiento";
    }
}
