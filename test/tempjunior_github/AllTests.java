package tempjunior_github;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tempjunior_github.fase1.FirstTest;
import tempjunior_github.fase1.SecondTest;

//Suite de teste - Pode testar varias classes e metodos anotados com @Test de uma
//só vez. Chama-se 'Suite de testes'
@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class, SecondTest.class})
public class AllTests {
}
