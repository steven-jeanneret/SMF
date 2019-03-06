package ch.hearc.sandbox.controller;

import ch.hearc.sandbox.data.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class AccueilController {
    @Autowired
    BoardDAO boardDAO;

    @Value("${accueil.message:[default]}")
    private String message;

    @GetMapping("/")
    public String accueil(Map<String, Object> model) {
        model.put("boards", boardDAO.findAll());

        return "accueil";
    }
}
