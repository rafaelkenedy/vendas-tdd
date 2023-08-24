package com.rafael.domain;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.rafael.dao.ClienteDaoMock;
import com.rafael.dao.IClienteDao;
import com.rafael.services.ClienteService;
import com.rafael.services.IClienteService;

public class ClienteServiceTest {

	private IClienteService clienteService;
	private Cliente cliente;

	public ClienteServiceTest() {
		IClienteDao dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}

	@Before
	public void init() {
		cliente = new Cliente();		
		cliente.setCpf("12312345678");
		clienteService.salvar(cliente);
	}

	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

		assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);
		assertTrue(retorno);		
	}
	
	@Test
	public void excluirCliente() {
		Boolean retorno = clienteService.excluir(cliente.getCpf());
		assertTrue(retorno);		
	}
	
	@Test
	public void alterarCliente() {
		Boolean retorno = clienteService.alterar(cliente);
		assertTrue(retorno);		
	}

}
