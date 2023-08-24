package com.rafael.services;

import java.util.Optional;

import com.rafael.domain.Cliente;
import com.rafael.exception.ClienteException;

public interface IClienteService {

	Cliente salvar(Cliente cliente) throws ClienteException;

	Optional<Cliente> buscarPorCpf(String cpf);

	void excluir(String cpf) throws ClienteException;

	Cliente alterar(Cliente cliente) throws ClienteException;

}
