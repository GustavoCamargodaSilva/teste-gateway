package gustavo.teste.testegateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testeController {

    @RequestMapping("/teste")
    public String teste() {
        System.out.println("Teste de gateway");
        return "Teste de gateway";
    }

}
