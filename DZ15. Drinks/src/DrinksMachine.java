 enum DrinksMachine{
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    MINERAL("Минералка"),
    COCA_COLA("КокаКола");

    private final String name;

    DrinksMachine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
