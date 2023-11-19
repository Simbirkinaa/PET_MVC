package example.controllers;

import example.lab4.Owner;
import example.lab4.Pet;
import example.lab4.PetOwnerRepository;
import example.lab4.PetRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetRepository petRepository;

    @GetMapping("/add")
    public String showPetForm(Model model) {
        // Создаем новый объект Pet для передачи в форму
        Pet pet = new Pet();

        // Передаем объект Pet в модель
        model.addAttribute("pet", pet);

        return "pet/add";
    }

    @PostMapping("/add")
    public String addPet(@Valid @ModelAttribute("pet") Pet pet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "pet/add";
        }

        // Сохранение питомца в базу данных
        petRepository.save(pet);

        return "redirect:/home";
    }
}
