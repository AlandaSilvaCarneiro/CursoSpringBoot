package udemi.curso.SpringBoot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import udemi.curso.Exeptions.UnsupportedMathOpera;

@RestController
public class MathControler {

    @RequestMapping(value = "/sun/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sun(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsupportedMathOpera("Please set a numeric valuer!");
        }

        return convertToDouble(numberTwo) + convertToDouble(numberOne);
    }

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

    @RequestMapping(value = "/multi/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double multiplicacao(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsupportedMathOpera("Please set a numeric valuer!");
        }

        return convertToDouble(numberTwo) * convertToDouble(numberOne);
    }

    @RequestMapping(value = "/divis/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double divisao(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberTwo) || !isNumeric(numberOne)) {
            throw new UnsupportedMathOpera("Please set a numeric valuer!");
        }

        return convertToDouble(numberTwo) / convertToDouble(numberOne);
    }

}
