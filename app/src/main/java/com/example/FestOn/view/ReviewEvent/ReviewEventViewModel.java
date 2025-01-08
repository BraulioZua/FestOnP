package com.example.FestOn.view.ReviewEvent;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.EventDAOMemory;
import com.example.FestOn.memorydao.ReviewDAOMemory;

/**
 * ViewModel class responsible for managing the data related to reviewing an event.
 * Instantiates and provides access to the ReviewEventPresenter.
 */
public class ReviewEventViewModel extends androidx.lifecycle.ViewModel {

    private ReviewEventPresenter presenter;

    /**
     * Initializes the ReviewEventViewModel by creating an instance of ReviewEventPresenter.
     */
    public ReviewEventViewModel() {
        this.presenter = new ReviewEventPresenter(new CustomerDAOMemory(), new EventDAOMemory(), new ReviewDAOMemory());
    }

    /**
     * Retrieves the associated ReviewEventPresenter instance.
     *
     * @return The ReviewEventPresenter instance.
     */
    public ReviewEventPresenter getPresenter() {
        return presenter;
    }
}

