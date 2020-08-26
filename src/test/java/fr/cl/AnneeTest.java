
package fr.cl;

// doc Junit5: https://www.baeldung.com/junit-5


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AnneeTest {

    @DisplayName("Test passant: l'année 2020 est bien bissextile")
    @Test
    @Order(1)
    public final void test2020bisextOK() throws Exception {
        Annee annee = new Annee(2020);
        assertEquals(annee.isBissextile(), true);
    }


    @DisplayName("Test passant: l'année 2021 n'est pas bissextile")
    @Test
    @Order(2)
    public final void test2021nonbisextOK() throws Exception {
        Annee annee = new Annee(2021);
        assertEquals(annee.isBissextile(), false);
    }

    @DisplayName("Test non passant: l'année -3 n'est pas prévue")
    @Test
    @Order(3)
    public final void testanneenagativeKO() {


        Assertions.assertThrows(Exception.class, () -> {
            new Annee(-3);
        });
    }

}

