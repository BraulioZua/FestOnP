package com.example.FestOn.view.Account.Register.ChooseRegistration;

public class ChooseRegistrationViewStub implements ChooseRegistrationView {
    private Integer organizerRegistrationCount, customerRegistrationCount;

    public ChooseRegistrationViewStub() {
        organizerRegistrationCount = customerRegistrationCount = 0;
    }

    @Override
    public void organizerRegistration() {
        organizerRegistrationCount++;
    }

    @Override
    public void customerRegistration() {
        customerRegistrationCount++;
    }

    public Integer getOrganizerRegistrationCount() {
        return organizerRegistrationCount;
    }

    public Integer getCustomerRegistrationCount() {
        return customerRegistrationCount;
    }
}
