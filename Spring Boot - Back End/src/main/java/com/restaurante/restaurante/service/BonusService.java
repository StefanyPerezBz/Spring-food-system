package com.restaurante.restaurante.service;

import com.restaurante.restaurante.model.Bonus;
import com.restaurante.restaurante.repository.BonusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonusService {

    @Autowired
    private BonusRepository bonusRepository;

    public Bonus saveBonus(Bonus bonus) {
        return bonusRepository.save(bonus);
    }

    public Optional<Bonus> getBonusById(Long id) {
        return bonusRepository.findById(id);
    }

    public void deleteBonus(Long id) {
        bonusRepository.deleteById(id);
    }

    public List<Bonus> getAllBonuses() {
        return bonusRepository.findAll();
    }
}
