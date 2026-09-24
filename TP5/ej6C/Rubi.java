public class Rubi extends Gema{
    public Rubi() {
    }

    public String Combinar(Gema gema) {
        return gema.CombinarRubi(this);
    }

    @Override
    public String CombinarRubi(Rubi gema){
        return  "Lluvia de Fuego";
    }

    @Override
    public String CombinarZafiro(Zafiro gema){
        return  "Erupcion Volcanica";
    }

    @Override
    public String CombinarEsmeralda(Esmeralda gema){
        return  "Terremoto";
    }

    @Override
    public String CombinarDiamante(Diamante gema){
        return  "Tormenta de Rayos";
    }
}
