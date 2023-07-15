package udemi.curso.SpringBoot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControler {
    private static final String template = "Hello word,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "word") String name) {

        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }

    public static String getTemplate() {
        return template;

    }

}
