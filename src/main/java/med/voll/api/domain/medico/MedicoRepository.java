package med.voll.api.medico;

import aj.org.objectweb.asm.commons.Remapper;
import med.voll.api.paciente.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
     Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
