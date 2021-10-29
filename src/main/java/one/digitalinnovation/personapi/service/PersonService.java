package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.mapper.PersonMapper;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    /* O @Autowired é posto no construtor para agilizar o teste unitário, caso haja um. */
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO); // <-- PersonMapper sendo usado.

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPerson.getId()).build(); // <---- O resultado do annotation '@Builder' na classe
    }
}
