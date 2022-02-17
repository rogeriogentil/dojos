package dojo.controller;

import dojo.dominio.Ano;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anos")
public class AnoController {

    @GetMapping
    @ResponseBody
    public String isAnoBissexto(@RequestParam String ano) {
        boolean isBissexto = Ano.isBissexto(Integer.parseInt(ano));
        return Boolean.toString(isBissexto);
    }
}
