package com.dj.diegame.dice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRepo extends CrudRepository<Dice,Long>{

}
