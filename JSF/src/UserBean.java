import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Arrays;

@ManagedBean(name="user")
@SessionScoped
public class UserBean {
    public String[] favNumber2;

    public String[] getFavNumber2() {
        return favNumber2;
    }

    public void setFavNumber2(String[] favNumber2) {
        this.favNumber2 = favNumber2;
    }

    public String[] getFavNumber2Value() {

        favNumber2 = new String[5];
        favNumber2[0] = "Number2 - 1";
        favNumber2[1] = "Number2 - 2";
        favNumber2[2] = "Number2 - 3";
        favNumber2[3] = "Number2 - 4";
        favNumber2[4] = "Number2 - 5";
        return favNumber2;
    }

    public String getFavNumber2InString() {
        return Arrays.toString(favNumber2);
    }
}