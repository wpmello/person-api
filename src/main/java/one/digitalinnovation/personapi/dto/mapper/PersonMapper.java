package one.digitalinnovation.personapi.dto.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/* Esta classe está sendo responsável por, debaixo dos panos, fazer o algorítimo da CONVERSÃO do DTO para a entidade e vice e versa.
              ================== Classe criada a partir do framework 'MapStruct' ==================' */

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy") // <-- Conversão do 'birthDate' das classes.
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
