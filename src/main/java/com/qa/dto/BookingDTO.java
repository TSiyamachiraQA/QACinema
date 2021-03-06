package com.qa.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class BookingDTO {

    private Long id;
    private String movieName;
    private String dateTime;
    private BigDecimal totalPrice;
    private String emailAddress;
    private String phoneNumber;
    private String customerName;
    private Integer adultNr;
    private Integer childNr;
    private Integer studentNr;

    public BookingDTO(Long id, String movieName, String dateTime, BigDecimal totalPrice, String emailAddress, String phoneNumber, String customerName, Integer adultNr, Integer childNr, Integer studentNr) {
        this.id = id;
        this.movieName = movieName;
        this.dateTime = dateTime;
        this.totalPrice = totalPrice;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.adultNr = adultNr;
        this.childNr = childNr;
        this.studentNr = studentNr;
    }

    public BookingDTO(String movieName, String dateTime, BigDecimal totalPrice, String emailAddress, String phoneNumber, String customerName, Integer adultNr, Integer childNr, Integer studentNr) {
        this.movieName = movieName;
        this.dateTime = dateTime;
        this.totalPrice = totalPrice;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.adultNr = adultNr;
        this.childNr = childNr;
        this.studentNr = studentNr;
    }

    public BookingDTO(){
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getAdultNr() {
        return adultNr;
    }

    public void setAdultNr(Integer adultNr) {
        this.adultNr = adultNr;
    }

    public Integer getChildNr() {
        return childNr;
    }

    public void setChildNr(Integer childNr) {
        this.childNr = childNr;
    }

    public Integer getStudentNr() {
        return studentNr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentNr(Integer studentNr) {
        this.studentNr = studentNr;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", totalPrice=" + totalPrice +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", adultNr=" + adultNr +
                ", childNr=" + childNr +
                ", studentNr=" + studentNr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingDTO that = (BookingDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(movieName, that.movieName) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(totalPrice, that.totalPrice) &&
                Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(adultNr, that.adultNr) &&
                Objects.equals(childNr, that.childNr) &&
                Objects.equals(studentNr, that.studentNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movieName, dateTime, totalPrice, emailAddress, phoneNumber, customerName, adultNr, childNr, studentNr);
    }
}
