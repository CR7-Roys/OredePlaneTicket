public class Order {
    private  String id;
    private  float jpjg;//机票价格
    private  float airPortTax;//机场税
    private  float ryf;//燃油费
    private  float hkzhx;//航空综合险
    private  float jptgx;//机票退该险
    private  float yhp;//优惠券
    private  float hszj;//含税总价
    private  Customer customers[];

    public Order(String id, float jpjg, float airPortTax, float ryf, float hkzhx, float jptgx, float yhp, float hszj, Customer[] customers) {
        this.id = id;
        this.jpjg = jpjg;
        this.airPortTax = airPortTax;
        this.ryf = ryf;
        this.hkzhx = hkzhx;
        this.jptgx = jptgx;
        this.yhp = yhp;
        this.hszj = hszj;
        this.customers = customers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhp() {
        return yhp;
    }

    public void setYhp(float yhp) {
        this.yhp = yhp;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
