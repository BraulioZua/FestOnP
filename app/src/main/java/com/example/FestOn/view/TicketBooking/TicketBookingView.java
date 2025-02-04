package com.example.FestOn.view.TicketBooking;

import com.example.FestOn.domain.TicketCategory;
import com.example.FestOn.domain.TicketDiscount;

public interface TicketBookingView {
    int getAttachedEventId();

    void setEventName(String eventName);

    void setTicketPrice(String price);

    TicketCategory getSelectedCategory();

    TicketDiscount getSelectedDiscount();

    void onChangeCategory();

    void onChangeDiscount();

    void showTickets();

    void setTotalCost(String totalCost);

    void showErrorMessage(String title, String message);

    void showPurchaseCompleteMessage();
}

