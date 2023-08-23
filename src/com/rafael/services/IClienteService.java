package com.rafael.services;

import com.rafael.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente buscarPorCpf(String cpf);

}
