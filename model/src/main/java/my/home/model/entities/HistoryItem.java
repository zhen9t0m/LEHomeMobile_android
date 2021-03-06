package my.home.model.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table HISTORY_ITEM.
 */
public class HistoryItem {

    private Long id;
    /**
     * Not-null value.
     */
    private String from;
    /**
     * Not-null value.
     */
    private String to;

    public HistoryItem() {
    }

    public HistoryItem(Long id) {
        this.id = id;
    }

    public HistoryItem(Long id, String from, String to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Not-null value.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Not-null value.
     */
    public String getTo() {
        return to;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setTo(String to) {
        this.to = to;
    }

}
