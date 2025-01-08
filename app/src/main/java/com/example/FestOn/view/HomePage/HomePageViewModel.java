package com.example.FestOn.view.HomePage;

import androidx.lifecycle.ViewModel;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.EventDAOMemory;
import com.example.FestOn.memorydao.OrganizerDAOMemory;
import com.example.FestOn.memorydao.UserDAOMemory;

/**
 * ViewModel class for the Home Page. Manages the interaction between the Home Page View and Presenter.
 */
public class HomePageViewModel extends ViewModel {

    private HomePagePresenter presenter;

    /**
     * Default constructor for the HomePageViewModel. Initializes the presenter with memory DAOs.
     */
    public HomePageViewModel() {
        presenter = new HomePagePresenter(new UserDAOMemory(), new OrganizerDAOMemory(), new CustomerDAOMemory(), new EventDAOMemory());
    }

    /**
     * Retrieves the presenter associated with the Home Page.
     *
     * @return The presenter instance.
     */
    public HomePagePresenter getPresenter() {
        return presenter;
    }
}

