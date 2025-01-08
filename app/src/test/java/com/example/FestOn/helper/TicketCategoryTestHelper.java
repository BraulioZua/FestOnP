package com.example.FestOn.helper;

import com.example.FestOn.domain.CategoryName;
import com.example.FestOn.domain.TicketCategory;
import com.example.FestOn.util.Money;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;

public class TicketCategoryTestHelper {
    public static TicketCategory initTicketCategory1() {
        return new TicketCategory(1, CategoryName.GENERAL, new Money(new BigDecimal(50), Currency.getInstance("EUR")), "General Admission", 150);
    }

    public static TicketCategory initTicketCategory2() {
        return new TicketCategory(2, CategoryName.VIP, new Money(new BigDecimal(150), Currency.getInstance("EUR")), "VIP Admission", 50);
    }

    public static TicketCategory initTicketCategory3() {
        return new TicketCategory(3, CategoryName.FRONT, new Money(new BigDecimal(125), Currency.getInstance("EUR")), "Front admission", 80);
    }

    public static ArrayList<TicketCategory> initArrayOfTicketCategories() {
        ArrayList<TicketCategory> ticketCategories = new ArrayList<>();
        ticketCategories.add(TicketCategoryTestHelper.initTicketCategory1());
        ticketCategories.add(TicketCategoryTestHelper.initTicketCategory2());
        return ticketCategories;
    }
}
