package com.example.FestOn.view.Customer.CustomerPurchases;

import androidx.lifecycle.ViewModel;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.PurchaseDAOMemory;

/**
 * ViewModel class for managing data related to customer purchases.
 * Instantiates and provides access to the associated presenter.
 */
public class CustomerPurchasesViewModel extends ViewModel {
    private CustomerPurchasesPresenter presenter;

    /**
     * Constructor to initialize the ViewModel with the necessary DAOs.
     */
    public CustomerPurchasesViewModel() {
        presenter = new CustomerPurchasesPresenter(new CustomerDAOMemory(), new PurchaseDAOMemory());
    }

    /**
     * Retrieves the presenter associated with this ViewModel.
     *
     * @return The {@link CustomerPurchasesPresenter} instance.
     */
    public CustomerPurchasesPresenter getPresenter() {
        return presenter;
    }
}