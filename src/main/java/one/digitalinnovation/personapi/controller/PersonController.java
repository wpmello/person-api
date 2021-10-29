package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonRepository personRepository;

    /* o @Autowired é posto no construtor para agilizar o teste unitário, caso haja um. */
    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public String getPerson() {
        return "Test rest!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)   // <----                         Indica o melhor retorno da requisição, no caso o 'created'.
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getId()).build(); // <---- O resultado do annotation '@Builder' na classe
    }
}