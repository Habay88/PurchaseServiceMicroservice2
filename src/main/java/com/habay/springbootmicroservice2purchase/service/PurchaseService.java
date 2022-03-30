package com.habay.springbootmicroservice2purchase.service;

import java.util.List;

import com.habay.springbootmicroservice2purchase.model.Purchase;

/**
 * @author sa
 * @date 9.10.2021
 * @time 17:59
 */
public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
