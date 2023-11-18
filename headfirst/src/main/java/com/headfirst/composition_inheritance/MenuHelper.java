package com.headfirst.composition_inheritance;

public class MenuHelper implements IMenu {
    private String _menuTitle;
    private String[] _menuItems;

    public MenuHelper(String menuTitle, String[] menuItems) {
        _menuTitle = menuTitle;
        _menuItems = menuItems;
    }

    @Override
    public String getMenuTitle() {
        return _menuTitle;
    }

    @Override
    public String[] getMenuOptions() {
        return _menuItems;
    }

}