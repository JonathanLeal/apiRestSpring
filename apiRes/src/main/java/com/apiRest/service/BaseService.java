package com.apiRest.service;

import java.util.List;

public interface BaseService<E> {
	public List<E> listar();
	public E encontrarPorId(Long id);
	public E guardar(E entity);
	public E editar(Long id,E entity);
	public boolean eliminar(Long id);
}
