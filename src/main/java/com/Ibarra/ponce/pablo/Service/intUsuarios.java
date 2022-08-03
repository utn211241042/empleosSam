package com.Ibarra.ponce.pablo.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Ibarra.ponce.pablo.Model.Usuario;

public interface intUsuarios {

	public List<Usuario> obtenerTodas();
	public void guardar(Usuario usuario);
	public void eliminar(Integer idUsuario);
	public Usuario buscarPorId(Integer idUsuario);
	public long numeroUsuarios();
	
	public Page<Usuario>buscarTodas(Pageable page);
}

