import java.util.List;

public class Clazz {
    private List<Clazz> subClazzs;
    private String id;
    private String pId;

    public Clazz( String id, String pId) {
        this.id = id;
        this.pId = pId;
    }

    public List<Clazz> getSubClazzs() {
        return subClazzs;
    }

    public void setSubClazzs(List<Clazz> subClazzs) {
        this.subClazzs = subClazzs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "subClazzs=" + subClazzs +
                ", id='" + id + '\'' +
                ", pId='" + pId + '\'' +
                '}';
    }
}
