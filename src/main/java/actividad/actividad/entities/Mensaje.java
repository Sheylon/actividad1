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
@Table(name = "Mensajes")
@NoArgsConstructor
@Getter
@Setter

public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creador;
    private String destinaterio;
    private LocalDateTime createAt;
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    Usuario Usuario;
}
