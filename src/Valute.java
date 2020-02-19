class Valute {

    private String ID;

    private String CharCode;
    private String Name;
    private double Value;

    public Valute() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCharCode(String charCode) {
        CharCode = charCode;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setValue(double value) {
        Value = value;
    }

    public String getID() {
        return ID;
    }

    public String getCharCode() {
        return CharCode;
    }

    public String getName() {
        return Name;
    }

    public double getValue() {
        return Value;
    }

    public Valute(String ID) {
        this.ID = ID;
    }

    public Valute(String CharCode, String name, double value) {
        Name = name;
        Value = value;
    }

    public Valute(String ID, String charCode, String name, double value) {
        this.ID = ID;
        CharCode = charCode;
        Name = name;
        Value = value;
    }

    @Override
    public String toString() {
        return "Валюта "+ Name + " стоит "+ Value+ " рублей";
    }
}
