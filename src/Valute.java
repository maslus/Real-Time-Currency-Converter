class Valute {

    public String ID;

    public String NumCode;
    public String CharCode;
    public short Nominal;
    public String Name;
    public float Value;

    public Valute() {
    }

    public Valute(String ID) {
        this.ID = ID;
    }

    public Valute(String numCode, String name, float value) {
        NumCode = numCode;
        Name = name;
        Value = value;
    }

    public Valute(String ID, String numCode, String charCode, short nominal, String name, float value) {
        this.ID = ID;
        NumCode = numCode;
        CharCode = charCode;
        Nominal = nominal;
        Name = name;
        Value = value;
    }

    @Override
    public String toString() {
        return "Валюта "+ Name + " стоит "+ Value+ " рублей";
    }
}
