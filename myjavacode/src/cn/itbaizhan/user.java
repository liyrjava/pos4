package cn.itbaizhan;

import java.util.Objects;

public class user {

    public user() {
    }

    String usid;
    int age;

    public String getUsid() {
        return usid;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return age == user.age &&
                Objects.equals(usid, user.usid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usid, age);
    }
}
