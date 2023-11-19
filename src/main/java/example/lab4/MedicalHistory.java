package example.lab4;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    // Другие поля и методы
}
