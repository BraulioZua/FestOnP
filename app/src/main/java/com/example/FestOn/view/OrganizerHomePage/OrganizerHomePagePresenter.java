package com.example.FestOn.view.OrganizerHomePage;

import android.annotation.SuppressLint;

import com.example.FestOn.dao.EventDAO;
import com.example.FestOn.dao.OrganizerDAO;
import com.example.FestOn.domain.Event;
import com.example.FestOn.domain.Organizer;

import java.util.ArrayList;

public class OrganizerHomePagePresenter {
    OrganizerHomePageView view;

    private ArrayList<Event> organizedEvents;
    private OrganizerDAO organizerDAO;
    private EventDAO eventDAO;

    private Organizer organizer;

    public OrganizerHomePagePresenter(OrganizerDAO organizerDAO, EventDAO eventDAO) {
        this.organizerDAO = organizerDAO;
        this.eventDAO = eventDAO;
    }

    public void setView(OrganizerHomePageView view) {
        this.view = view;
    }

    public OrganizerHomePageView getView() {
        return view;
    }

    public OrganizerDAO getOrganizerDAO() {
        return organizerDAO;
    }

    public EventDAO getEventDAO() {
        return eventDAO;
    }

    public void setOrganizer(int organizerId) {
        organizer = organizerDAO.find(organizerId);
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    @SuppressLint("NewApi")
    public void setOrganizedEventList() {
        organizedEvents = organizer.getEvents();
        organizedEvents.sort((event1, event2) -> event2.getDate().compareTo(event1.getDate()));
    }

    public ArrayList<Event> getOrganizedEventList() {
        return organizedEvents;
    }

    public void onDisplayEvents() {
        if (organizedEvents.isEmpty()) {
            view.showEmptyEvents();
        } else {
            view.showOrganizedEvents();
        }
    }

    public void onCreateEvent() {
        view.createEvent();
    }

    public void onEditAccount() {
        view.editAccount();
    }

    public void onLogout() {
        view.logout();
    }
}
