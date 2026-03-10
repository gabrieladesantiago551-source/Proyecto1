package Practica1.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/p")
    public String paginaP() {
        return "p";
    }

    @GetMapping("/h1")
    public String paginaH1() {
        return "h1";
    }

    @GetMapping("/span")
    public String span(){ return "span"; }

    @GetMapping("/strong")
    public String strong(){ return "strong"; }

    @GetMapping("/em")
    public String em(){ return "em"; }

    @GetMapping("/a")
    public String a(){ return "a"; }

    @GetMapping("/img")
    public String img(){ return "img"; }

    @GetMapping("/ul")
    public String ul(){ return "ul"; }

    @GetMapping("/ol")
    public String ol(){ return "ol"; }

    @GetMapping("/li")
    public String li(){ return "li"; }

    @GetMapping("/table")
    public String table(){ return "table"; }

    @GetMapping("/tr")
    public String tr(){ return "tr"; }

    @GetMapping("/td")
    public String td(){ return "td"; }

    @GetMapping("/th")
    public String th(){ return "th"; }

    @GetMapping("/form")
    public String form(){ return "form"; }

    @GetMapping("/input")
    public String input(){ return "input"; }

    @GetMapping("/label")
    public String label(){ return "label"; }

    @GetMapping("/button")
    public String button(){ return "button"; }

    @GetMapping("/audio")
    public String audio(){ return "audio"; }

    @GetMapping("/video")
    public String video(){ return "video"; }

    }