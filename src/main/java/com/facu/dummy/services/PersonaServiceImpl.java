package com.facu.dummy.services;

import com.facu.dummy.entities.Persona;
import com.facu.dummy.repository.BaseRepository;
import com.facu.dummy.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Una manera de aplicar la inyeccion de dependencia es con el @Autowired y la otra es haciendo el constructor

    public PersonaService (PersonaRepository personaRepository){
    this.personaRepository = personaRepository;
}
*/
    /*
    Dentro de cada metodo usaremso un try catch para el manejo de excpciones

    */
    @Service
    public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
        @Autowired
        private PersonaRepository personaRepository;
    /*
    Una manera de aplicar la inyeccion de dependencia es con el @Autowired y la otra es haciendo el constructor

        public PersonaService (PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    */
    /*
    Dentro de cada metodo usaremso un try catch para el manejo de excpciones

    */
        public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
            super(baseRepository);
            this.personaRepository = personaRepository;
        }
    }