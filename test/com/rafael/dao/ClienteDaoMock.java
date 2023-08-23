package com.rafael.dao;

import com.rafael.domain.Cliente;

public class ClienteDaoMock implements IClienteDao{

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}
	
	

}
