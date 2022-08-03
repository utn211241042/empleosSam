package com.Ibarra.ponce.pablo.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Ibarra.ponce.pablo.Model.Vacante;

public interface IntVacantes {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vaca);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public int numVacantes();
	//void modificar(int posicion, Vacante v);
	//int buscarPosicion(Vacante v);
	public Page<Vacante> buscarTodas(Pageable page);
}
