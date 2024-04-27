package pe.edu.cibertec.APIRESTEC2Grupo11.service;

import pe.edu.cibertec.APIRESTEC2Grupo11.model.Farmaco;

import java.util.List;
import java.util.Optional;

public interface IFarmacoService {
    List<Farmaco> getAllFarmacos();
    Optional<Farmaco> getFarmacoById(Integer id);
    Farmaco createFarmaco(Farmaco farmaco);
    Farmaco updateFarmaco(Integer id, Farmaco farmaco);
    void deleteFarmaco(Integer id);
}