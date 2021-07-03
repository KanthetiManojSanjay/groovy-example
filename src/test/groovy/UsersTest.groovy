import org.junit.Test

class UsersTest {

    @Test
    void 'should test users pojo'() {
        Users users = new Users(id: 1, name: "Barry", salary: 9000L);
        users.id = 1
        users.name = "harry"
        users.salary = 300L
    }
}
