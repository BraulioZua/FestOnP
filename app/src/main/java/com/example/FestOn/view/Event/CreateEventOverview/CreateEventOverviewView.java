package com.example.FestOn.view.Event.CreateEventOverview;

import com.example.FestOn.domain.Event;
import com.example.FestOn.domain.TicketCategory;
import com.example.FestOn.domain.TicketDiscount;

import java.util.ArrayList;

public interface CreateEventOverviewView {
    Integer getAttachedOrganizerId();

    Event getAttachedEvent();

    ArrayList<TicketCategory> getAttachedTicketCategories();

    ArrayList<TicketDiscount> getAttachedTicketDiscounts();

    void setEventName(String eventName);

    void setEventAddress(String eventAddress);

    void setEventDate(String eventDate);

    void setEventGenre(String eventGenre);

    void setEventType(String eventType);

    void showTicketCategories();

    void showEmptyTicketCategories();

    void showTicketDiscounts();

    void showEmptyTicketDiscounts();

    void moveToSelectCategories();

    void moveToSelectDiscounts();

    void navigateToOrganizerHomePage(Integer organizerId);

    void showErrorMessage(String title, String message);

    void showEventCreatedMessage();

    void showEventUpdatedMessage();
}
