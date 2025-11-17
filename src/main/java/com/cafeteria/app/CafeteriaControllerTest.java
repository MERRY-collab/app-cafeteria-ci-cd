package com.cafeteria.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CafeteriaController.class)
public class CafeteriaControllerTest {

    @Autowired
    private MockMvc mockMvc; // Utilizado para simular peticiones HTTP

    @Test
    void debeRetornarMensajeDeBienvenidaEnRaiz() throws Exception {
        // Verifica que la llamada a "/" retorna un estado OK (200) y el texto esperado
        this.mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("¡Bienvenido a 'El Grano Dorado'! Disfruta del mejor café de la ciudad. ☕"));
    }

    @Test
    void debeRetornarMensajeDelMenuEnEndpointMenu() throws Exception {
        // Verifica que la llamada a "/menu" retorna un estado OK (200)
        this.mockMvc.perform(get("/menu"))
            .andExpect(status().isOk())
            .andExpect(content().string("Nuestro menú de hoy: Espresso, Latte, Cappuccino, y Muffin de arándanos. 🍰"));
    }
}