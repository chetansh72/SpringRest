

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;


public final class TestUser {

    private final String username;
    private final char[] password;
   
    public TestUser(String  username,  char[] password) {
        this.username = username;
        this.password = password;
    }

     public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TestUser that = (TestUser) o;
        return 
  		Objects.equals(username, that.username) &&
            Arrays.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(username);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }
}
