package base.models;

public class BankTransactionPojo {

    //@JsonProperty("id")
    private String id;
    //@JsonProperty("name")
    private String name;
    //@JsonProperty("lastname")
    private String lastname;
    //@JsonProperty("accountNumber")
    private String accountNumber;
    //@JsonProperty("amount")
    public String amount;
    //@JsonProperty("transactionType")
    public String transactionType;
    //@JsonProperty("email")
    public String email;
    //@JsonProperty("active")
    public Boolean active;
    //@JsonProperty("country")
    public String country;
    //@JsonProperty("telephone")
    public String telephone;

    public BankTransactionPojo(String id, String name, String lastname, String accountNumber, String amount, String transactionType, String email, Boolean active, String country, String telephone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.email = email;
        this.active = active;
        this.country = country;
        this.telephone = telephone;
    }

    public BankTransactionPojo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
