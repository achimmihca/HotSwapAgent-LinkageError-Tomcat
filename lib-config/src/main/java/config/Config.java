package config;

public class Config
{
    private String defaultGreeting = "Hello";

    public String getDefaultGreeting()
    {
        // FIXME: Change here the additional String to break hot-swap
        return defaultGreeting + "Y";
    }

    public void setDefaultGreeting(String defaultGreeting)
    {
        this.defaultGreeting = defaultGreeting;
    }
}
