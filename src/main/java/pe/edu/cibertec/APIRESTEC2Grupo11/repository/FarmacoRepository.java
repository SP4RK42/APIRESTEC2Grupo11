package pe.edu.cibertec.APIRESTEC2Grupo11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2Grupo11.model.Farmaco;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco, Integer> {
}
