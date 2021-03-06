import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean{
    public String[] favNumber4;
    public String[] getFavNumber4() {
        return favNumber4;
    }
    public void setFavNumber4(String[] favNumber4) {
        this.favNumber4 = favNumber4;
    }
    public static class Number{
        public String numberLabel;
        public String numberValue;

        public Number(String numberLabel, String numberValue){
            this.numberLabel = numberLabel;
            this.numberValue = numberValue;
        }
        public String getNumberLabel(){
            return numberLabel;
        }
        public String getNumberValue(){
            return numberValue;
        }
    }
    public Number[] number4List;

    public Number[] getFavNumber4Value() {

        number4List = new Number[5];
        number4List[0] = new Number("Number4 - 1", "1");
        number4List[1] = new Number("Number4 - 2", "2");
        number4List[2] = new Number("Number4 - 3", "3");
        number4List[3] = new Number("Number4 - 4", "4");
        number4List[4] = new Number("Number4 - 5", "5");

        return number4List;
    }

    public String getFavNumber4InString() {
        return Arrays.toString(favNumber4);
    }

}