package com.example.FestOn.memorydao;

import com.example.FestOn.dao.TicketCategoryDAO;
import com.example.FestOn.domain.TicketCategory;

import java.util.ArrayList;
import java.util.List;

public class TicketCategoryDAOMemory implements TicketCategoryDAO {
    protected static List<TicketCategory> ticketCategories = new ArrayList<TicketCategory>();

    @Override
    public void delete(TicketCategory ticketCategory) {
        ticketCategories.remove(ticketCategory);
    }

    @Override
    public List<TicketCategory> findAll() {
        ArrayList<TicketCategory> result = new ArrayList<TicketCategory>();
        result.addAll(ticketCategories);
        return result;
    }

    @Override
    public void save(TicketCategory ticketCategory) {
        ticketCategories.add(ticketCategory);
    }

    @Override
    public TicketCategory find(int id) {
        for(TicketCategory ticketCategory : ticketCategories) {
            if (ticketCategory.getTicketCategoryId() == id) {
                return ticketCategory;
            }
        }
        return null;
    }

    @Override
    public int nextId() {
        return ticketCategories.size() == 0 ? 1 : ticketCategories.get(ticketCategories.size() - 1).getTicketCategoryId() + 1;
    }

    @Override
    public void update(TicketCategory ticketCategory) {
        for (int i = 0; i < ticketCategories.size(); i++) {
            if (ticketCategories.get(i).getTicketCategoryId() == ticketCategory.getTicketCategoryId()) {
                ticketCategories.set(i, ticketCategory);
                break;
            }
        }
    }
}
