package edu.fatec.blast;

import edu.fatec.dao.ComparacaoDAO;
import edu.fatec.dao.DAO;
import edu.fatec.dao.EspecieDAO;
import edu.fatec.dao.UsuarioDAO;
import edu.fatec.entidades.Comparacao;
import edu.fatec.entidades.Endereco;
import edu.fatec.entidades.Especie;
import edu.fatec.entidades.Telefone;
import edu.fatec.entidades.Usuario;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument;
import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument;
import gov.nih.nlm.ncbi.www.BlastWebServiceStub;
import gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery;
import gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply;
import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options;
import gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults;
import gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Date;

import org.apache.axis2.AxisFault;

public class TestaBlast2 {

	private static Especie esp;
	private static Usuario u;
	private static Comparacao com;
	private static BlastWebServiceStub stub;

	public static void main(String[] args) throws RemoteException {
		TestaBlast2 testa = new TestaBlast2();
		testa.vamos();
		// PegarResultado job = new PegarResultado(com,stub);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		testa.comparar();

		System.out.println("***COMPARAÇÃO***Ebaa");
		System.out.println(com.getId());
		System.out.println(com.getRid());
		System.out.println(com.getPorcentagem());
		System.out.println(com.getData());
		System.out.println(com.getAmostra());

		//testa.inserir();
	}

	public void vamos() throws RemoteException {

		try {
			u = new Usuario();
			u.setNome("Bruno Nascimento Lima");
			u.setEmail("bru2_no@hotmail.com");
			u.setPassword("1234");
			u.setUserId("bruno");

			esp = new Especie();
			esp.setDescricao("A lontra-neotropical (Lontra longicaudis), também conhecida como lontra-de-rio-sul-americana, é uma espécie de lontra que vive da América Central até o Uruguai, incluindo o Brasil."
					+ "Habita em rios, lagos e lagoas em vários ecossistemas, como pantanais, florestas tropicais e cerrados. A lontra-neotropical prefere viver em águas claras, onde alimenta-se principalmente de crustáceos e de peixes."
					+ "Esta lontra possui tanto hábitos noturnos quanto diurnos.");
			esp.setNome("Lontra-neotropical");
			esp.setNomeCientifico("Lontra longicaudis");
			esp.setGi("gi|304354".trim());

			com = new Comparacao();
			com.setAmostra("ACCGGAATCTTTCTAGCAATACACTACTCACCAGACATCTCCATAGCTTTTTCATCAATTGCTCACATCA"+
"CCCGAGATGTACAATACGGCTGACTTATCCGTAACATACATGCTAACGGCGCCTCCCTATTCTTCATATG"+
"TATCTACCTCCATATTGGACGAGGAATTTACTACGGTTCCTACCTATATAAAGAAACCTGAAACACTGGA"+
"ATCATCCTTCTACTATTAGTCATACGTACCGCATTCGTAGGCTACGTCCTACCATGAGGACAAATATCAT"+
"TTTGAGGGGCCACCGTCATCACAAACCTACTCTCAGCCATCCCATACATCGGCAACACACTAGTACAATG"+
"AATCTGAGGAGGGTTTTCAGTAGACAATGCAACCCTAACCCGATTCTTCACCTTCCACTTCCTATTACCA"+
"TTTGCCATTACCGGCCTTACAGGAGTACATCTATTATTCCTGCACGAAACAGGATCAAACAACCCAACAG"+
"GATTAAATTCAAA");
			com.setData(new Date(System.currentTimeMillis()));
			com.setEspecie(esp);
			com.setUsuario(u);
			stub = new BlastWebServiceStub();

			Blast4QueueSearchRequestLiteDocument blaDoc = Blast4QueueSearchRequestLiteDocument.Factory
					.newInstance();

			Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite blast = blaDoc
					.addNewBlast4QueueSearchRequestLite();

			blast.setQuery(com.getAmostra().trim());

			blast.setDatabaseName("nr");

			Options op = blast.addNewOptions();
			Blast4OptionsLite opLite = op.addNewBlast4OptionsLite();

			opLite.setTask("megablast");
			Blast4OptionsLiteDocument.Blast4OptionsLite.Options options = Blast4OptionsLiteDocument.Blast4OptionsLite.Options.Factory
					.newInstance();
			Blast4CommonOptions blaop = Blast4CommonOptions.Factory
					.newInstance();

			opLite.setOptions(options);
			op.setBlast4OptionsLite(opLite);
			blast.setOptions(op);
			blaDoc.setBlast4QueueSearchRequestLite(blast);
			Blast4QueueSearchReplyDocument reply = stub
					.submitSearchLite(blaDoc);

			System.out.println("RID:"
					+ reply.getBlast4QueueSearchReply().getRequestId());
			com.setRid(reply.getBlast4QueueSearchReply().getRequestId());

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private synchronized void comparar() throws RemoteException {
		Blast4GetSearchResultsRequestDocument resultadoDoc = Blast4GetSearchResultsRequestDocument.Factory
				.newInstance();
		Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest resultado = resultadoDoc
				.addNewBlast4GetSearchResultsRequest();
		resultado.setRequestId(com.getRid());
		resultado.setResultTypes(new BigInteger("40287"));

		resultadoDoc.setBlast4GetSearchResultsRequest(resultado);
		Blast4GetSearchResultsReplyDocument replyResultDoc = stub
				.getSearchResults(resultadoDoc);
		Blast4GetSearchResultsReply replyResult = replyResultDoc
				.getBlast4GetSearchResultsReply();

		System.out.println(replyResultDoc.getBlast4GetSearchResultsReply()
				.isSetAlignments());
		System.out.println(replyResult.isSetKaBlocks());
		System.out.println(replyResult.isSetMasks());
		System.out.println(replyResult.isSetPhiAlignments());
		System.out.println(replyResult.isSetPssm());
		System.out.println(replyResult.isSetSimpleResults());

		Blast4SimpleResults simple = replyResultDoc
				.getBlast4GetSearchResultsReply().getSimpleResults()
				.getBlast4SimpleResults();
		System.out.println(simple.getAllAlignments()
				.sizeOfBlast4AlignmentsForQueryArray());

		Blast4AlignmentsForQuery blast4query = simple.getAllAlignments()
				.getBlast4AlignmentsForQueryArray(0);

		for (int i = 0; i < blast4query.getAlignments()
				.sizeOfBlast4SimpleAlignmentArray(); i++) {

			if ((blast4query.getAlignments().getBlast4SimpleAlignmentArray(i)
					.getSubjectId().trim().equalsIgnoreCase(com.getEspecie()
					.getGi()))) {

				System.out.println("Indexado:" + i);
				System.out.println(blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getBitScore());
				System.out.println(blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getEValue());
				System.out.println(blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getSubjectId());
				System.out.println(blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).isSetNumIdentities());
				System.out.println("Num identies:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getNumIdentities());
				System.out.println(blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getNumIndels());
				System.out.println("Query start:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullQueryRange().getBlast4Range()
								.getStart());
				System.out.println("Query StRand:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullQueryRange().getBlast4Range()
								.getStrand());
				System.out.println("Query end:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullQueryRange().getBlast4Range().getEnd());
				System.out.println("Subject start:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullSubjectRange().getBlast4Range()
								.getStart());
				System.out.println("Subject Strand:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullSubjectRange().getBlast4Range()
								.getStrand());
				System.out.println("Subject end:"
						+ blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullSubjectRange().getBlast4Range()
								.getEnd());

				
				double razao = blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getFullSubjectRange()
						.getBlast4Range().getEnd().doubleValue()+1
						 - blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullSubjectRange().getBlast4Range()
								.getStart().doubleValue();

				double ident = blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getNumIdentities()
						.doubleValue()
						/razao ;
				
				
								
				double porcentagem = ident * 100;

				BigDecimal porc = new BigDecimal(porcentagem);
				porc = porc.setScale(0, BigDecimal.ROUND_HALF_EVEN);
				com.setPorcentagem(porc.intValue());
				// com.setEspecie(esp);
				// com.setUsuario(u);
				u.getComparacoes().add(com);
			}
		}

	}

	private void inserir() {
		DAO espDAO = new EspecieDAO();
		DAO uDAO = new UsuarioDAO();
		DAO comDAO = new ComparacaoDAO();

		try {
			//espDAO.inserir(esp);
			// uDAO.inserir(u);
			// especie tem que ser primeiro

			u = (Usuario) uDAO.pesquisarPorId(2);
			esp = (Especie) espDAO.pesquisarPorId(1);
			
			com.setUsuario(u);
			com.setEspecie(esp);
		
			comDAO.inserir(com);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inserirUsuario() {
		try {
			u = new Usuario();
			DAO uDAO = new UsuarioDAO();

			u = (Usuario) uDAO.pesquisarPorId(2);

			Telefone tel = new Telefone();
			Endereco end = new Endereco();

			tel.setDdd("11");
			tel.setNumero("7777-7777");
			tel.setOperadora("VIVO");

			end.setBairro("Lacerda campos");
			end.setCep("04256-040");
			end.setCidade("Rio grande da Serra");
			end.setComplemento("perto da estação");
			end.setEstado("SP");
			end.setLogradouro("");
			end.setNumero("474");
			end.setPais("Brasil");

			u.setEndereco(end);
			u.setTelefone(tel);

			uDAO.atualizar(2, u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}