package com.rafael.dao;

import com.rafael.domain.Cliente;

public class ClienteDao implements IClienteDao {

	@Override
	public Boolean salvar(Cliente cliente) {
		return true;
		
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean excluir(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
