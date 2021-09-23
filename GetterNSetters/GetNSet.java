package GetterNSetters;

public class GetNSet {

    int age;
    String name;
    String adress;
    
    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(final String adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "GetNSet [adress=" + adress + ", age=" + age + ", name=" + name + "]";
    }
    public GetNSet(final int age, final String name, final String adress) {
        this.age = age;
        this.name = name;
        this.adress = adress;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adress == null) ? 0 : adress.hashCode());
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GetNSet other = (GetNSet) obj;
        if (adress == null) {
            if (other.adress != null)
                return false;
        } else if (!adress.equals(other.adress))
            return false;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public String concat(String str) {
        return name.concat(str);
    }

    
    
}
