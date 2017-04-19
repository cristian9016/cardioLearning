package proyecto.com.cardio;

import java.util.UUID;

/**
 * Created by root on 18/04/17.
 */

public class Data {
    private Integer id;
    private String title;
    private String text;
    private Integer image;

    public Data(Integer id,String title, String text, Integer image) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
