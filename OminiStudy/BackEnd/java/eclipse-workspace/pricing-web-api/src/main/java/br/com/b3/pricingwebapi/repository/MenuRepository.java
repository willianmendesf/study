package br.com.b3.pricingwebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.b3.pricingwebapi.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
