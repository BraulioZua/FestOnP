package com.example.FestOn.view.Account.Register.TermsAndConditions;

import com.example.FestOn.memorydao.CustomerDAOMemory;
import com.example.FestOn.memorydao.OrganizerDAOMemory;
import com.example.FestOn.memorydao.UserDAOMemory;

/**
 * ViewModel class for the Terms and Conditions screen during user registration.
 * It manages the interaction between the view and the presenter.
 */
public class TermsAndConditionsViewModel {

    private TermsAndConditionsPresenter presenter;

    /**
     * Constructs a new TermsAndConditionsViewModel and initializes the presenter.
     */
    public TermsAndConditionsViewModel() {
        presenter = new TermsAndConditionsPresenter(new UserDAOMemory(), new CustomerDAOMemory(), new OrganizerDAOMemory());
    }

    /**
     * Get the presenter associated with this ViewModel.
     *
     * @return The TermsAndConditionsPresenter instance.
     */
    public TermsAndConditionsPresenter getPresenter() {
        return presenter;
    }
}

