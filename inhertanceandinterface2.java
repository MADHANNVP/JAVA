class Customer {
    int customerId;
    String name;
    String address;
    String phone;

    public Customer(int customerId, String name, String address, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getCompany() {
        return null;
    }

    public String getIndividual() {
        return null;
    }
}
class Company extends Customer {
    String contact;
    int discount;

    public Company(int customerId, String name, String address, String phone, String contact, int discount) {
       super(customerId, name, address, phone);
        this.contact = contact;
        this.discount = discount;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
     public String getCompany() {
        return "Company";
    }
}

class Individual extends Customer {
    String licNumber;

    public Individual(int customerId, String name, String address, String phone, String licNumber) {
        super(customerId, name, address, phone);
        this.licNumber = licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    public String getLicNumber() {
        return licNumber;
    }

    public String getIndividual() {
        return "Individual";
    }
}

class Inhertaceandinterface2 {
    public static void main(String[] args) {
        Company company = new Company(1, "ABC Corp", "123 Main St", "555-1234", "John Doe", 10);
        Individual individual = new Individual(2, "Jane Smith", "456 Oak Ave", "555-5678", "A1234567");

        System.out.println("Company Name: " + company.name);
        System.out.println("Company Contact: " + company.getContact());
        System.out.println("Company Discount: " + company.getDiscount());
        System.out.println("Type: " + company.getCompany());

        System.out.println("\nIndividual Name: " + individual.name);
        System.out.println("Individual License Number: " + individual.getLicNumber());
        System.out.println("Type: " + individual.getIndividual());
    }
}