package com.demo.app.constants;


public enum PizzaToppings {
    MANGOS("Diced Mango"),
    OLIVES("Olives"),
    MUSHROOMS("Mushrooms"),
    ONIONS("Caramelized onions"),
    ITALIANHAM("Italian Ham"),
    PEPPERONI("Classic Pepperoni"),
    SALAMI("Salami"),
    PROVOLNE("Provolone cheese"),
    EXTRACHEESE("Extra cheese"),
    MOZZARELLA("Mozzarella cheese"),
    PARMASAN("Parmesan cheese")

    ;

    private final String displayName;

    private PizzaToppings(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
