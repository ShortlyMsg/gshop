package com.vana.gshop.repository;

import com.vana.gshop.entity.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerRepository extends JpaRepository<Gamer, String> {
}
