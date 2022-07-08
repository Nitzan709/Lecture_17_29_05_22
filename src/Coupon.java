import java.sql.Date;

public class Coupon {
    private long id;
    private long copmanyId;
    private String title;
    private int category;
    private int amount;
    private double price;
    private String description;
    private Date startData;
    private Date endData;
    private String imageUrl;

    public Coupon(long id, long copmanyId, String title, int category, int amount, double price, String description, Date startData, Date endData, String imageUrl) {
        this.id = id;
        this.copmanyId = copmanyId;
        this.title = title;
        this.category = category;
        this.amount = amount;
        this.price = price;
        this.description = description;
        this.startData = startData;
        this.endData = endData;
        this.imageUrl = imageUrl;
    }
}
