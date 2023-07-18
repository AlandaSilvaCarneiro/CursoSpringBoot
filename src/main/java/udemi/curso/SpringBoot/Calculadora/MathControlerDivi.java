package udemi.curso.SpringBoot.Calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import udemi.curso.Exeptions.UnsupportedMathOpera;

@RestController
public class MathControlerDivi extends MathControler {
    @RequestMapping(value = ("/divi/{n1}/{n2}"), method = RequestMethod.GET)
    public double divis(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) throws Exception {
        if (!isNumeric(n2) || !isNumeric(n1)) {
            throw new UnsupportedMathOpera("Digite um numero pfv");
        }
        return convertToDouble(n2) / convertToDouble(n1);
    }

}
