package example.lab4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findAll();
    List<Pet> findByName(String name);
    List<Pet> findBySpecies(String species);
    void deleteById(Long id);
    List<Pet> findByOwnerId(Long ownerId);
    Pet save(Pet pet);
    List<Pet> findPetsRequiringMedicalAttention();

}
