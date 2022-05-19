package fr.rroch.chifumi.ihm;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("")
    public String index(){
        return "redirect:/movie/all";
    }
}
