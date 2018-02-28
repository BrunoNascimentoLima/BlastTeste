package edu.fatec.serviceLocator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.apache.axis2.AxisFault;


import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument;
import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument;
import gov.nih.nlm.ncbi.www.BlastWebServiceStub;
import gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply;
import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options;
import gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults;

public class BlastImpl extends UnicastRemoteObject implements Blast {

  
	protected BlastImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	private static final long serialVersionUID = -8L;
    private static BlastWebServiceStub stub;
    private static Blast4QueueSearchReplyDocument reply;
   

   
   
   
   @Override
   public String submitSearchRequestLite(String amostra) throws RemoteException {
	  // Comparacao com = null;
		try {

			stub = new BlastWebServiceStub();

			gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument blaDoc = Blast4QueueSearchRequestLiteDocument.Factory
					.newInstance();

			gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite blast = blaDoc
					.addNewBlast4QueueSearchRequestLite();

			blast.setQuery(amostra.trim());

			blast.setDatabaseName("nr");

			Options op = blast.addNewOptions();
			Blast4OptionsLite opLite = op.addNewBlast4OptionsLite();

			opLite.setTask("megablast");
			Blast4OptionsLiteDocument.Blast4OptionsLite.Options options = Blast4OptionsLiteDocument.Blast4OptionsLite.Options.Factory
					.newInstance();

			opLite.setOptions(options);
			op.setBlast4OptionsLite(opLite);
			blast.setOptions(op);
			blaDoc.setBlast4QueueSearchRequestLite(blast);
			Blast4QueueSearchReplyDocument reply = stub
					.submitSearchLite(blaDoc);

		    //com= new Comparacao();
			//com.setRid(reply.getBlast4QueueSearchReply().getRequestId());
           System.out.println(reply.getBlast4QueueSearchReply().getRequestId());
			
           return reply.getBlast4QueueSearchReply().getRequestId();
           
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reply.getBlast4QueueSearchReply().getRequestId();
	}

	

	@Override
	public double getSearchResultsRequest(String rid,String gi)
			throws RemoteException {
		
		Blast4GetSearchResultsRequestDocument resultadoDoc = Blast4GetSearchResultsRequestDocument.Factory
				.newInstance();
		Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest resultado = resultadoDoc
				.addNewBlast4GetSearchResultsRequest();
		resultado.setRequestId(rid);
		resultado.setResultTypes(new BigInteger("1000000"));

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
					.getSubjectId().trim().equalsIgnoreCase(gi))) {

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
						.getBlast4Range().getEnd().doubleValue() + 1
						- blast4query.getAlignments()
								.getBlast4SimpleAlignmentArray(i)
								.getFullSubjectRange().getBlast4Range()
								.getStart().doubleValue();

				double ident = blast4query.getAlignments()
						.getBlast4SimpleAlignmentArray(i).getNumIdentities()
						.doubleValue()
						/ razao;

				double porcentagem = ident * 100;

				BigDecimal porc = new BigDecimal(porcentagem);
				porc = porc.setScale(0, BigDecimal.ROUND_HALF_EVEN);
				
			
			//		 com.setPorcentagem(porc.intValue());
				
				return porc.doubleValue();
			}
		}
		return 0;
	}


}


