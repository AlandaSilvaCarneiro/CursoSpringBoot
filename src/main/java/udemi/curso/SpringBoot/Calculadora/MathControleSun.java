package udemi.curso.SpringBoot.Calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import udemi.curso.Exeptions.UnsupportedMathOpera;


@RestController
public class MathControleSun extends MathControler{
    @RequestMapping(value="/sun/{numero1}/{numero2}",method = RequestMethod.GET)
    public double sun(@PathVariable (value ="numero1") String numero1,@PathVariable (value ="numero2")String numero2) 
        throws Exception {
            if(!isNumeric(numero2) || !isNumeric(numero1)){
                throw new UnsupportedMathOpera("Digite umnumero");
            }
        return convertToDouble(numero1)+convertToDouble(numero2);

    }

    
}
