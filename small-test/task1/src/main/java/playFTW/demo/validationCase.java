package playFTW.demo;

import java.util.Arrays;

public class validationCase {
    private String key = "";
    private String[] followers ;
    private Boolean canBeFinal = false;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String[] getFollowers() {
        return followers;
    }

    public void setFollowers(String[] followers) {
        this.followers = followers;
    }

    public Boolean getCanBeFinal() {
        return canBeFinal;
    }

    public void setCanBeFinal(Boolean canBeFinal) {
        this.canBeFinal = canBeFinal;
    }

    public validationCase(String key, String[] followers, Boolean canBeLast)
    {
        this.key = key;
        this.followers = followers;
        this.canBeFinal = canBeLast;
    }
    public String validateFollowers(String[] inFollowers) {
        for (String letter : inFollowers){
            if(Arrays.asList(followers).indexOf(letter) == -1){
                return letter;
            };
        }
        return null;
    }
}
