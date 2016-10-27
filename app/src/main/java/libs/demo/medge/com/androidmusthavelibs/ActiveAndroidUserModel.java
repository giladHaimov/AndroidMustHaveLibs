package libs.demo.medge.com.androidmusthavelibs;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Categories")
public class ActiveAndroidUserModel extends Model {

    @Column(name = "Name", index = true)
    String name;
    @Column(name = "ID", index = true)
    String ID;
    @Column(name = "Address")
    String address;
    @Column(name = "Age")
    int age;


    public ActiveAndroidUserModel(String name, String ID, String address, int age) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
