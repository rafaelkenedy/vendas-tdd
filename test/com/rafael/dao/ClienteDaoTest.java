package com.rafael.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.rafael.domain.Cliente;

public class ClienteDaoTest {
	
	private IClienteDao clienteDao;
	
	private Cliente cliente;
	
	public ClienteDaoTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() {
		cliente = new Cliente();		
		cliente.setCpf("12312345678");
		clienteDao.salvar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());		
		assertNotNull(clienteConsultado);
	}
	
	@Test
	public void excluirCliente() {
		
		Boolean isClienteExcluido = clienteDao.excluir(cliente.getCpf());		
		assertNotNull(isClienteExcluido);
	}

}
