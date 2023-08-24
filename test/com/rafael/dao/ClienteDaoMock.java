package com.rafael.dao;

import com.rafael.domain.Cliente;

public class ClienteDaoMock implements IClienteDao{

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
		
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

	@Override
	public Boolean excluir(String cpf) {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
