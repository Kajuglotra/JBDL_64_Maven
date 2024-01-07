package springDemo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    private String name;

    private int id;

    private Address address;

    private void initMethod(){
        System.out.println("Here i am in init method");
    }
    private void destroyBean(){
        System.out.println("Here i am in destroey method");
    }


}
