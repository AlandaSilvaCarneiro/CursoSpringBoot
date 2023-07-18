package udemi.curso.SpringBoot.Calculadora;
public class MathControler {

    public boolean isNumeric(String StrNumber) {
        if (StrNumber == null)
            return false;
        String numero = StrNumber.replaceAll(",", ".");
        return numero.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public Double convertToDouble(String StrNumber) {
        if (StrNumber == null)
            return 0D;
        String numero = StrNumber.replaceAll(",", ".");
        if (isNumeric(numero))
            return Double.parseDouble(numero);
        return 0D;

    }


}
