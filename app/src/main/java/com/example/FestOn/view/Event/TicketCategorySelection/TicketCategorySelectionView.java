package com.example.FestOn.view.Event.TicketCategorySelection;

import com.example.FestOn.domain.Event;
import com.example.FestOn.domain.TicketCategory;

import java.util.ArrayList;
import java.util.HashMap;

public interface TicketCategorySelectionView {
    Integer getAttachedOrganizerId();

    Event getAttachedEvent();

    void setPageTitleToEdit(String title);

    void setButtonLabelToEdit(String label);

    void setTextEventCapacity(String capacity);

    HashMap<String, String> getTicketCategoryInfo();

    String getTicketCategoryName();

    String getTicketCategoryPrice();

    String getTicketCategoryDescription();

    String getTicketCategoryQuantity();

    void setTicketCategoryName(String name);

    void setTicketCategoryPrice(String price);

    void setTicketCategoryDescription(String description);

    void setTicketCategoryQuantity(String quantity);

    void showTicketCategories();

    void resetInputFields();

    void moveToTicketDiscountSelection(ArrayList<TicketCategory> ticketCategoriesList);

    void showErrorMessage(String title, String message);

}
