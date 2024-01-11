package br.com.borges;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteDAOTest.class, ClienteServiceTest.class, ProdutoDAOTest.class, ProdutoServiceTest.class})
public class AllTest {

}
