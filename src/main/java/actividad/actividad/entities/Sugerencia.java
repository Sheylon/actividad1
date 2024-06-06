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
@Table(name = "sugerencias")
@NoArgsConstructor
@Getter
@Setter

public class Sugerencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcion;
    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    Usuario Usuario;
}
