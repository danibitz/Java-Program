public class People {
    String namePerson;
    String surNamePerson;
    int year_of_birth;
    int month_of_birth;

    public People(String namePerson, String surNamePerson, int year_of_birth, int month_of_birth){
        this.namePerson = namePerson;
        this.surNamePerson = surNamePerson;
        this.year_of_birth = year_of_birth;
        this.month_of_birth = month_of_birth;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getSurNamePerson() {
        return surNamePerson;
    }

    public void setSurNamePerson(String surNamePerson) {
        this.surNamePerson = surNamePerson;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        this.month_of_birth = month_of_birth;
    }
    @Override
    public String toString() {
        return "" + namePerson + "\t" + surNamePerson + "\t" + "\t"
                + year_of_birth + "\t" + month_of_birth;
    }
}