package singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class Singleton {
	
	@Test
    public void shouldGetUser() {
		DatabaseConnection.getConnection().setUser("Usuário Padrão");
        assertEquals("Usuário Padrão", DatabaseConnection.getConnection().getUser());
    }
}
