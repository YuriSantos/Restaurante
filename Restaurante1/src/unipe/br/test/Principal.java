package unipe.br.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import unipe.br.entities.Cliente;

public class Principal {

`	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("cadastroCliente");
		
		EntityManager manager = fac.createEntityManager();
		
//		PessoaFisica pf = new PessoaFisica();
//		pf.setNome("Maria");
//		pf.setCpf("002.000.000-23");
//		Endereco endereco = new Endereco();
//		endereco.setBairro("Torre");
//		endereco.setCep("23323-233");
//		endereco.setRua("Fulano de Tal");
//		pf.setEndereco(endereco);
//		pf.setDataNascimento(new Date());
//		manager.getTransaction().begin();
//		try{
//			manager.persist(pf);
//			manager.getTransaction().commit();
//		}catch(Exception e){
//			manager.getTransaction().rollback();
//		}
//		finally{
//			manager.close();
//		}
		
		Cliente cliente = manager.find(Cliente.class, 1L);
		System.out.println(cliente.getNome());
		manager.close();	
		
	}

}

