package SpringDemo.myfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person> {

    private String personInfo;

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    public Person getObject() throws Exception {
        Person person =  new  Person () ;
        String []  infos =  personInfo.split ( "," ) ;
        person.setName(infos[0]);
        person.setAddress(infos[1]);
        person.setAge(infos[2]);
        return person;

    }

    public Class<?> getObjectType() {
        return Person.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
