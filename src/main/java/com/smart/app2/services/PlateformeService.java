package com.smart.app2.services;

import com.smart.app2.entities.Plateforme;
import com.smart.app2.entities.Utilisateur;

import java.util.List;

public interface PlatefomreService
{
    Plateforme addNewPlateforme(Plateforme platefomre);
    Plateforme updatePlateforme(Plateforme platefomre);
    void deletePlateforme(Long id);
    Plateforme getPlateformeParId(Long id);
    List<Plateforme> getAllPlateforme();
}
