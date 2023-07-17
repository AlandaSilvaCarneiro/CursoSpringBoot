package udemi.curso.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOpera extends RuntimeException {

    public UnsupportedMathOpera(String string) {
        super(string);
    }

    private static final long serialVersionUID = 1L;
}
