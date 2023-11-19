package example.lab4;

import example.lab4.Owner;
import example.lab4.PetOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetOwnerService {
    private final PetOwnerRepository petOwnerRepository;

    @Autowired
    public PetOwnerService(PetOwnerRepository petOwnerRepository) {
        this.petOwnerRepository = petOwnerRepository;
    }

    public List<Owner> getAllPetOwners() {
        return petOwnerRepository.findAll();
    }

    // Другие методы сервиса
}
