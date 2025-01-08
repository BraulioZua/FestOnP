package com.example.FestOn.memorydao;

import com.example.FestOn.dao.CustomerDAO;
import com.example.FestOn.dao.EventDAO;
import com.example.FestOn.dao.Initializer;
import com.example.FestOn.dao.OrganizerDAO;
import com.example.FestOn.dao.PurchaseDAO;
import com.example.FestOn.dao.ReviewDAO;
import com.example.FestOn.dao.TicketCategoryDAO;
import com.example.FestOn.dao.TicketDAO;
import com.example.FestOn.dao.TicketDiscountDAO;
import com.example.FestOn.dao.UserDAO;
import com.example.FestOn.domain.Customer;
import com.example.FestOn.domain.Event;
import com.example.FestOn.domain.Organizer;
import com.example.FestOn.domain.Purchase;
import com.example.FestOn.domain.Review;
import com.example.FestOn.domain.Ticket;
import com.example.FestOn.domain.TicketCategory;
import com.example.FestOn.domain.TicketDiscount;
import com.example.FestOn.domain.User;

public class MemoryInitializer extends Initializer {
    @Override
    public void eraseAll() {
        for(User user : getUserDAO().findAll()) {
            getUserDAO().delete(user);
        }

        for(Organizer organizer : getOrganizerDAO().findAll()) {
            getOrganizerDAO().delete(organizer);
        }

        for(Customer customer : getCustomerDAO().findAll()) {
            getCustomerDAO().delete(customer);
        }

        for(Event event : getEventDAO().findAll()) {
            getEventDAO().delete(event);
        }

        for(Review review : getReviewDAO().findAll()) {
            getReviewDAO().delete(review);
        }

        for(TicketCategory ticketCategory : getTicketCategoryDAO().findAll()) {
            getTicketCategoryDAO().delete(ticketCategory);
        }

        for(TicketDiscount ticketDiscount : getTicketDiscountDAO().findAll()) {
            getTicketDiscountDAO().delete(ticketDiscount);
        }

        for(Ticket ticket : getTicketDAO().findAll()) {
            getTicketDAO().delete(ticket);
        }

        for(Purchase purchase : getPurchaseDAO().findAll()) {
            getPurchaseDAO().delete(purchase);
        }
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOMemory();
    }

    @Override
    public OrganizerDAO getOrganizerDAO() {
        return new OrganizerDAOMemory();
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return new CustomerDAOMemory();
    }

    @Override
    public EventDAO getEventDAO() {
        return new EventDAOMemory();
    }

    @Override
    public ReviewDAO getReviewDAO() {
        return new ReviewDAOMemory();
    }

    @Override
    public TicketDAO getTicketDAO() {
        return new TicketDAOMemory();
    }

    @Override
    public PurchaseDAO getPurchaseDAO() {
        return new PurchaseDAOMemory();
    }

    @Override
    public TicketCategoryDAO getTicketCategoryDAO() {
        return new TicketCategoryDAOMemory();
    }

    @Override
    public TicketDiscountDAO getTicketDiscountDAO() {
        return new TicketDiscountDAOMemory();
    }
}
