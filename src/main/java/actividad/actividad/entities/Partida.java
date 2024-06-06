package actividad.actividad;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Partidas")
@NoArgsConstructor
@Getter
@Setter

public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creador;
    private String deporte;
    private String ciudad;
    private String provincia;
    private LocalDateTime fecha;
    private LocalDateTime horaComienzo;
    private LocalDateTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

    ManyToMany(mappedBy="id",
    cascade= ,
    fetch= etchType.EAGER)

    
}
