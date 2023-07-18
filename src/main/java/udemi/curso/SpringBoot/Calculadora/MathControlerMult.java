package udemi.curso.SpringBoot.Calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import udemi.curso.Exeptions.UnsupportedMathOpera;

@RestController
public class MathControlerMult extends MathControler {

    @RequestMapping(value ="/multi/{valor1}/{valor2}", method = RequestMethod.GET)
    public double multipli(@PathVariable(value = "valor1") String valor1, @PathVariable(value = "valor2") String valor2)
            throws Exception {
        if (!isNumeric(valor2) || !isNumeric(valor1)) {
            throw new UnsupportedMathOpera("Digite um numero pf");

        }

        return convertToDouble(valor2) * convertToDouble(valor1);
    }
}
