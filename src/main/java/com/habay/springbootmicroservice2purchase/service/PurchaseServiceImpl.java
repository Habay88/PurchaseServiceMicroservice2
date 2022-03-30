package com.habay.springbootmicroservice2purchase.service;

import com.habay.springbootmicroservice2purchase.model.Purchase;
import com.habay.springbootmicroservice2purchase.repository.PurchaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sa
 * @date 9.10.2021
 * @time 17:59
 */
@Service
public class PurchaseServiceImpl implements PurchaseService
{
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase)
    {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchasesOfUser(Long userId)
    {
        return purchaseRepository.findAllByUserId(userId);
    }
}
