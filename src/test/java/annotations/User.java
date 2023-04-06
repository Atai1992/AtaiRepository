package annotations;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Data//----> includes all data above

public class User {

private String name;
private int age;

public void sayHi(){
    System.out.println("Hello from"+name);
}
public void User(String name, int age){


}

}
