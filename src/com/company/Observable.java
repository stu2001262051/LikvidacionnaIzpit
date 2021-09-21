package com.company;

public interface Observable {

    void setOwnership(Observer player);
    void removeOwnership();

    void notifyOwner();
}
