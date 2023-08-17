class StudentClass extends Dirección{
    public int rollNum;
    public String nameStudy;
    Dirección direccion;

    public StudentClass(int street_number, String city, String department, String country, int rollNum, String nameStudy, Dirección direccion) {
        super(street_number, city, department, country);
        this.rollNum = rollNum;
        this.nameStudy = nameStudy;
        this.direccion = direccion;
    }
}

