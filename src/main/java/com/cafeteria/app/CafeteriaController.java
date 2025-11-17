package com.cafeteria.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Un controlador simple para mostrar información de la cafetería.
 */
@RestController
public class CafeteriaController {

    /**
     * Endpoint que se activará al acceder a la raíz (/).
     *
     * @return Mensaje de bienvenida.
     */
    @GetMapping("/")
    public String bienvenidaCafeteria() {
        // Un mensaje simple y funcional para el ejemplo
        return "¡Bienvenido a 'El Grano Dorado'! Disfruta del mejor café de la ciudad. ☕";
    }

    /**
     * Endpoint para simular el menú.
     *
     * @return Mensaje del menú.
     */
    @GetMapping("/menu")
    public String verMenu() {
        return "Nuestro menú de hoy: Espresso, Latte, Cappuccino, y Muffin de arándanos. 🍰";
    }
}