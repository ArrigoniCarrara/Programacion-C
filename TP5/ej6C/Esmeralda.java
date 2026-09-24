public class Esmeralda extends Gema{
    public Esmeralda() {
    }

    public String Combinar(Gema gema) {
        return gema.CombinarEsmeralda(this);
    }

    @Override
    public String CombinarRubi(Rubi gema){
        return  "Terremoto";
    }

    @Override
    public String CombinarZafiro(Zafiro gema){
        return  "Huracan";
    }

    @Override
    public String CombinarEsmeralda(Esmeralda gema){
        return  "Niebla Desoladora";
    }

    @Override
    public String CombinarDiamante(Diamante gema){
        return  "Vientos Venenosos";
    }
}
