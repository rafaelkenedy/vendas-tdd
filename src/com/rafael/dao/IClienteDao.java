package com.rafael.dao;

import com.rafael.domain.Cliente;

public interface IClienteDao {

	void salvar(Cliente cliente);
	
	Cliente buscarPorCpf(String cpf);

}
