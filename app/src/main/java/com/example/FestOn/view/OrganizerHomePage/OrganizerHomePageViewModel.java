package com.example.FestOn.view.OrganizerHomePage;

import androidx.lifecycle.ViewModel;

import com.example.FestOn.memorydao.EventDAOMemory;
import com.example.FestOn.memorydao.OrganizerDAOMemory;

public class OrganizerHomePageViewModel extends ViewModel {
    private OrganizerHomePagePresenter presenter;

    public OrganizerHomePageViewModel() {
        presenter = new OrganizerHomePagePresenter(new OrganizerDAOMemory(), new EventDAOMemory());
    }

    public OrganizerHomePagePresenter getPresenter() {
        return presenter;
    }
}
