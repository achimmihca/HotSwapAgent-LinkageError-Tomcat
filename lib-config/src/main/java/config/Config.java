package config;

public class Config
{
    private String defaultGreeting = "Hello";

    public String getDefaultGreeting()
    {
        // FIXME: To break hot-swap:
        //  change the added String here,
        //  then perform "Build > Rebuild Project" in IntelliJ,
        //  and reload the webpage in your browser.
        return defaultGreeting + "Y";
    }

    public void setDefaultGreeting(String defaultGreeting)
    {
        this.defaultGreeting = defaultGreeting;
    }
}
