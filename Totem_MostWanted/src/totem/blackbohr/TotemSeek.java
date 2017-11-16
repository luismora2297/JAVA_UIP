package totem.blackbohr;

public class TotemSeek
{
    private String seekname;
    private String crimes;
    private String date;
    private int age;
    private String lastseen;
    private String bounty;

    public TotemSeek(String seekname, String crimes, String date, int age, String lastseen, String bounty)
    {
        this.seekname = seekname;
        this.crimes = crimes;
        this.date = date;
        this.age = age;
        this.lastseen = lastseen;
        this.bounty = bounty;
        //this.nuts = mynuts; HA! GOT YOU!
    }

    public String getSeekname()
    {
        return seekname;
    }

    public String getCrimes()
    {
        return crimes;
    }

    public String getDate()
    {
        return date;
    }

    public int getAge()
    {
        return age;
    }

    public String getLastSeen() {
        return lastseen;
    }

    public String getBounty() {
        return bounty;
    }
}
