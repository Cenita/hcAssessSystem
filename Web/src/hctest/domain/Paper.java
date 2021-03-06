package hctest.domain;

import net.sf.json.JSONObject;
import java.util.Date;

public class Paper {
    private String id;
    private String title;
    private String number;
    private String direction;
    private int grade;
    private int permit;
    private Date createtime;
    private Date updatetime;
    private Date starttime;
    private Date endtime;

    public JSONObject toJson()
    {
        JSONObject jo = new JSONObject();
        jo.put("id",id);
        jo.put("title",title);
        jo.put("number",number);
        jo.put("direction",direction);
        jo.put("permit",permit);
        jo.put("grade",grade);
        jo.put("createtime",createtime.toString());
        jo.put("updatetime",updatetime.toString());
        jo.put("starttime",starttime.toString());
        jo.put("endtime",endtime.toString());
        jo.put("starttimeInt",starttime.getTime());
        jo.put("endtimeInt",endtime.getTime());

        return jo;
    }







    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPermit() {
        return permit;
    }

    public void setPermit(int permit) {
        this.permit = permit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}
