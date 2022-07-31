public class CoffeeHouse {
    int volume;
    Preference preference;

    public CoffeeHouse(int volume, Preference preference) {
        this.volume = volume;
        this.preference = preference;
    }

    public void setPreference() {
        if (preference.equals(Preference.CAPPUCHINO) && volume >= 50 && volume <= 500) {
            System.out.println("Доброго дня и вот Ваш " + preference);
        }
        if (preference.equals(Preference.LATTE) && volume >= 50 && volume <= 500) {
            System.out.println("Доброго дня и вот Ваш " + preference);
        }
        if (preference.equals(Preference.AMERICANO) && volume >= 50 && volume <= 500) {
            System.out.println("Доброго дня и вот Ваш " + preference);
        } else if (volume > 500) {
            System.out.println("К сожалению, мы не располагаем стаканчиками объемом более 500 мл, " +
                    "но мы обязательно учтем Ваши предпочтения в будущем!");
        } else if (volume < 50) {
            System.out.println("К сожалению, мы не располагаем стаканчиками объемом менее 50 мл, " +
                    "но мы обязательно учтем Ваши предпочтения в будущем!");
        }
    }
}
