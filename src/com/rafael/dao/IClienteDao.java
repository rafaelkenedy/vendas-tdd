package com.rafael.dao;

import java.util.Optional;

import com.rafael.domain.Cliente;
import com.rafael.exception.ClienteException;

public interface IClienteDao {

	Cliente salvar(Cliente cliente);

	Optional<Cliente> buscarPorCpf(String cpf);

	void excluir(String cpf);

	Cliente alterar(Cliente cliente);

}
