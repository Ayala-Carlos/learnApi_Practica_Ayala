package IntegracionBackFront.backfront.Config.Crypto;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2Password {

    //Configuración recomendada para Argon2id
    private static final int ITERATIONS = 10;
    private static final int MEMORY = 32768;
    private static final int PARALLELISM = 2;

    //Crear una instantcia de Argon2id
    private Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

    public String EncryptPassword(String password){
        return argon2.hash(ITERATIONS, MEMORY, PARALLELISM, password);

    }

    public boolean VerifyPassword(String passwordBO, String password){
        return argon2.verify(passwordBO, password);
    }
}
