package com.rafael.services;

import com.rafael.dao.ClienteDao;
import com.rafael.dao.IClienteDao;
import com.rafael.domain.Cliente;

public class ClienteService implements IClienteService {
	
	private IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	@Override
	public void salvar(Cliente cliente) {
		clienteDao.salvar(cliente);
		

	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return clienteDao.buscarPorCpf(cpf);
	}

}
