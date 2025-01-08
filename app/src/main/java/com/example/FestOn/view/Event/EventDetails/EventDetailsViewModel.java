package com.example.FestOn.view.Event.EventDetails;

import androidx.lifecycle.ViewModel;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.EventDAOMemory;
import com.example.FestOn.memorydao.OrganizerDAOMemory;
import com.example.FestOn.memorydao.PurchaseDAOMemory;
import com.example.FestOn.memorydao.TicketDAOMemory;

public class EventDetailsViewModel extends ViewModel {
    private EventDetailsPresenter presenter;

    public EventDetailsViewModel() {
        presenter = new EventDetailsPresenter(new CustomerDAOMemory(), new OrganizerDAOMemory(), new EventDAOMemory(), new PurchaseDAOMemory(), new TicketDAOMemory());
    }

    public EventDetailsPresenter getPresenter() {
        return presenter;
    }
}
