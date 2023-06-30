package com.example.ecommerceetapa2.controler;

import com.example.ecommerceetapa2.model.Producto;
import com.example.ecommerceetapa2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String home(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "usuario/home";
    }

    @GetMapping("/registro")
    public String register() {
        return "pages/register";
    }

    @GetMapping("/login")
    public String login() {
        return "pages/login";
    }

    @GetMapping("/compras")
    public String shopping() {
        return "pages/shopping";
    }

    @GetMapping("/detallecompra")
    public String shoppingdetail() {
        return "pages/shoppingdetail";
    }

    @GetMapping("/cerrar")
    public String closesession() {
        return "redirect:/";
    }
}