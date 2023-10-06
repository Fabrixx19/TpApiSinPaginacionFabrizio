package com.facu.dummy.controllers;

import com.facu.dummy.entities.Persona;
import com.facu.dummy.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")    //Brinda o permite el acceso a nuestra API desde distintos origenes
@RequestMapping(path = "api/v1/personas")    // indicamos la URL para acceder a los recursos
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
