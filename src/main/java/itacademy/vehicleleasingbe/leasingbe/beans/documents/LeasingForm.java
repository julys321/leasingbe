package itacademy.vehicleleasingbe.leasingbe.beans.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Document(collection = "leasing-forms")
public class LeasingForm {


    @Id
    private String id;
    @NotNull
    private String customerType;
    @NotNull
    private String assetType;
    @NotNull
    private String brand;
    @NotNull
    private String model;
    @NotNull
    private BigDecimal year;
    @NotNull
    private BigDecimal enginePower;
    @NotNull
    private BigDecimal assetPrice;
    @NotNull
    private BigDecimal advancePaymentPercentage;
    @NotNull
    private BigDecimal advancePaymentAmount;
    @NotNull
    private BigDecimal leasePeriod;
    @NotNull
    private BigDecimal margin;
    @NotNull
    private BigDecimal contractFee;
    @NotNull
    private String paymentDate;
    @NotNull
    //Information bit
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String postCode;
    @NotNull
    private String country;
    //Business info
    private String companyName;
    private String companyCode;
    //Personal Info
    private String firstName;
    private String lastName;
    private String personalCode;
    //Other
    private String uniqueId;
    private Date date;
    private String applicationStatus;


    public LeasingForm() {
    }//default constructor

    public LeasingForm(LeasingForm leasingForm) {
        //id
        this.customerType = leasingForm.getCustomerType();
        this.assetType = leasingForm.getAssetType();
        this.brand = leasingForm.getBrand();
        this.model = leasingForm.getModel();
        this.year = leasingForm.getYear();
        this.enginePower = leasingForm.getEnginePower();
        this.assetPrice = leasingForm.getAssetPrice();
        this.advancePaymentPercentage = leasingForm.getAdvancePaymentPercentage();
        this.advancePaymentAmount = leasingForm.getAdvancePaymentAmount();
        this.leasePeriod = leasingForm.getLeasePeriod();
        this.margin = leasingForm.getMargin();
        this.contractFee = leasingForm.getContractFee();
        this.paymentDate = leasingForm.getPaymentDate();
        this.email = leasingForm.getEmail();
        this.phoneNumber = leasingForm.getPhoneNumber();
        this.street = leasingForm.getStreet();
        this.city = leasingForm.getCity();
        this.postCode = leasingForm.getPostCode();
        this.country = leasingForm.getCountry();
        this.companyName = leasingForm.getCompanyName();
        this.companyCode = leasingForm.getCompanyCode();
        this.firstName = leasingForm.getFirstName();
        this.lastName = leasingForm.getLastName();
        this.personalCode = leasingForm.getPersonalCode();
        this.uniqueId = leasingForm.getUniqueId();
        this.date = leasingForm.getDate();
        this.applicationStatus = leasingForm.getApplicationStatus();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getYear() {
        return year;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    public BigDecimal getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(BigDecimal enginePower) {
        this.enginePower = enginePower;
    }

    public BigDecimal getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(BigDecimal assetPrice) {
        this.assetPrice = assetPrice;
    }

    public BigDecimal getAdvancePaymentPercentage() {
        return advancePaymentPercentage;
    }

    public void setAdvancePaymentPercentage(BigDecimal advancePaymentPercentage) {
        this.advancePaymentPercentage = advancePaymentPercentage;
    }

    public BigDecimal getAdvancePaymentAmount() {
        return advancePaymentAmount;
    }

    public void setAdvancePaymentAmount(BigDecimal advancePaymentAmount) {
        this.advancePaymentAmount = advancePaymentAmount;
    }

    public BigDecimal getLeasePeriod() {
        return leasePeriod;
    }

    public void setLeasePeriod(BigDecimal leasePeriod) {
        this.leasePeriod = leasePeriod;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public BigDecimal getContractFee() {
        return contractFee;
    }

    public void setContractFee(BigDecimal contractFee) {
        this.contractFee = contractFee;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
