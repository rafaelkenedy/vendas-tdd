package com.rafael.services;

import java.util.Optional;


import com.rafael.dao.ClienteDao;
import com.rafael.dao.IClienteDao;
import com.rafael.domain.Cliente;
import com.rafael.exception.ClienteException;
import static com.rafael.utils.ValidationUtils.checkNotNull;

public class ClienteService implements IClienteService {

	private IClienteDao clienteDao;

	public ClienteService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	@Override
	public Cliente salvar(Cliente cliente) throws ClienteException {
		checkNotNull(cliente, "O cliente não pode ser nulo.");
		
		return clienteDao.salvar(cliente);
	}

	@Override
	public Optional<Cliente> buscarPorCpf(String cpf) {
		return clienteDao.buscarPorCpf(cpf);
	}

	@Override
	public void excluir(String cpf) throws ClienteException {
		if (cpf == null || cpf.isEmpty()) {
			throw new ClienteException("O cliente não pode ser nulo.");
		}
		clienteDao.excluir(cpf);
	}

	@Override
	public Cliente alterar(Cliente cliente) throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

}
