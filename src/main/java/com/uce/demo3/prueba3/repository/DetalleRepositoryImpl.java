package com.uce.demo3.prueba3.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.demo3.prueba3.repository.modelo.DetalleVenta;


@Repository
@Transactional
public class DetalleRepositoryImpl implements IDetalleRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(DetalleVenta detalle) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalle);
	}
	
	
}
