package com.example.ecommerceetapa2.controler;


import com.example.ecommerceetapa2.model.Producto;
import com.example.ecommerceetapa2.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoService productoService;

    @GetMapping ("")
    public String home(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "administrador/home";
    }

    @GetMapping ("administrador/producto")
    public String itemdetail() {return "pages/itemdetail";
    }

    @GetMapping ("/usuarios")
    public String users() {return "pages/users";}

    @GetMapping ("/ordenes")
    public String order() {return "pages/order";}

    @GetMapping ("/detalleorden")
    public String orderdetail() {return "pages/orderdetail";}


}
