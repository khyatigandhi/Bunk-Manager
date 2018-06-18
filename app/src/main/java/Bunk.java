import java.util.Calendar;
import java.util.UUID;

public class Bunk {
    private UUID mId;
    private String mTitle;
    private Calendar mDate;
    private  Calendar mDay;
    private Boolean mChecked;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Calendar getDate() {
        return mDate;
    }

    public void setDate(Calendar date) {
        mDate = date;
    }

    public Calendar getDay() {
        return mDay;
    }

    public void setDay(Calendar day) {
        mDay = day;
    }

    public Boolean getChecked() {
        return mChecked;
    }

    public void setChecked(Boolean checked) {
        mChecked = checked;
    }

    public Bunk()
    {
        mId = UUID.randomUUID();
        mDate = Calendar.getInstance();
    }
}
