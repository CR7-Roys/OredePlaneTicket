import java.util.Date;

public class Customer {
    private  String id;//没有业务意义
    private  String name;//乘客姓名
    private  String phone;//乘客手机号
    private  String cardId;//航班号
    private String birthDate;//出生日期

    public Customer(String id, String name, String phone, String cardId, String birthDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cardId = cardId;
        this.birthDate = birthDate;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
