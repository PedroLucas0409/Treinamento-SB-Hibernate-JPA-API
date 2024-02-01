package br.com.plucas.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plucas.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
