package example.lab4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetOwnerRepository extends JpaRepository<Owner, Long> {
    List<Owner> findAll();
    List<Owner> findByName(String name);
    // Добавьте другие методы доступа к данным, если необходимо
}
