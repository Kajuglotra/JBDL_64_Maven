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


}
