package com.rafael.domain;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.rafael.dao.ClienteDaoMock;
import com.rafael.dao.IClienteDao;
import com.rafael.services.ClienteService;
import com.rafael.services.IClienteService;

public class ClienteTest {
	
	private IClienteService clienteService;
	
	public ClienteTest() {
		IClienteDao dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Test	
	public void pesquisarCliente() {
		
		
		Cliente cliente = new Cliente();
		cliente.setCpf("12312345678");
		
		clienteService.salvar(cliente);
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		
		assertNotNull(clienteConsultado);
		
		
		
	}

}
