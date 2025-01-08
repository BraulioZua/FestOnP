package com.example.FestOn.view.TicketBooking;

import androidx.lifecycle.ViewModel;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.EventDAOMemory;
import com.example.FestOn.memorydao.PurchaseDAOMemory;
import com.example.FestOn.memorydao.TicketCategoryDAOMemory;
import com.example.FestOn.memorydao.TicketDAOMemory;
import com.example.FestOn.memorydao.TicketDiscountDAOMemory;

public class TicketBookingViewModel extends ViewModel {
    private TicketBookingPresenter presenter;

    public TicketBookingViewModel() {
        this.presenter = new TicketBookingPresenter(new CustomerDAOMemory(), new EventDAOMemory(), new TicketCategoryDAOMemory(), new TicketDiscountDAOMemory(), new TicketDAOMemory(), new PurchaseDAOMemory());
    }

    public TicketBookingPresenter getPresenter() {
        return presenter;
    }
}
