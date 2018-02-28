package edu.fatec.blast;

import edu.fatec.entidades.Comparacao;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument;
import gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply;
import gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults;
import gov.nih.nlm.ncbi.www.BlastWebServiceStub;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;

public class PegarResultado implements Runnable{

 	Comparacao comparacao;
 	BlastWebServiceStub stub;
	
	public PegarResultado(Comparacao com, BlastWebServiceStub stub){
		this.comparacao=com;
		this.stub=stub;
		
	}
	
	@Override
	public void run() {
		
			try {
				go();
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}
	private void go() throws RemoteException{
		
		try {
			Thread.sleep(50000);		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		comparar();
		
	}
	
	private synchronized void comparar() throws RemoteException{
		Blast4GetSearchResultsRequestDocument resultadoDoc =  Blast4GetSearchResultsRequestDocument.Factory.newInstance();
		 Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest  resultado =resultadoDoc.addNewBlast4GetSearchResultsRequest();	
		 resultado.setRequestId(comparacao.getRid());
		 resultado.setResultTypes(new BigInteger("40287"));
		 
		 resultadoDoc.setBlast4GetSearchResultsRequest(resultado);
		 Blast4GetSearchResultsReplyDocument replyResultDoc = stub.getSearchResults(resultadoDoc);	 
		 Blast4GetSearchResultsReply replyResult = replyResultDoc.getBlast4GetSearchResultsReply();
		 
		 
		 System.out.println( replyResultDoc.getBlast4GetSearchResultsReply().isSetAlignments());
		 System.out.println( replyResult.isSetKaBlocks());
		 System.out.println( replyResult.isSetMasks());
		 System.out.println( replyResult.isSetPhiAlignments());
		 System.out.println( replyResult.isSetPssm());
		 System.out.println( replyResult.isSetSimpleResults());
		 
		Blast4SimpleResults simple =replyResultDoc.getBlast4GetSearchResultsReply().getSimpleResults().getBlast4SimpleResults();
		 System.out.println(simple.getAllAlignments().sizeOfBlast4AlignmentsForQueryArray());
		 
		 
		 Blast4AlignmentsForQuery blast4query =  simple.getAllAlignments().getBlast4AlignmentsForQueryArray(0);
		
		 for(int i = 0; i < blast4query.getAlignments().sizeOfBlast4SimpleAlignmentArray();i++){ 
		 
		
	 if((blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getSubjectId().trim().equalsIgnoreCase(comparacao.getEspecie().getGi()))){	 
		 
		 System.out.println("Indexado:"+i);	
		 System.out.println(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getBitScore());
		 System.out.println(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getEValue());
		 System.out.println(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getSubjectId());
		 System.out.println(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).isSetNumIdentities());
		 System.out.println("Num identies:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIdentities());
		 System.out.println(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIndels());
		 System.out.println("Query start:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullQueryRange().getBlast4Range().getStart());
		 System.out.println("Query StRand:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullQueryRange().getBlast4Range().getStrand());
		 System.out.println("Query end:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullQueryRange().getBlast4Range().getEnd());
		 System.out.println("Subject start:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStart());
		 System.out.println("Subject Strand:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStrand());
		 System.out.println("Subject end:"+blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getEnd());
		
		
		 
		 double razao =blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getEnd().doubleValue()
		 - blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStart().doubleValue();
		 
		 double ident =blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIdentities().doubleValue() / razao;
		 
		 double porcentagem = ident * 100;
		 
		 BigDecimal porc = new BigDecimal(porcentagem); 
		 porc = porc.setScale(0, BigDecimal.ROUND_HALF_EVEN); 
		 comparacao.setPorcentagem(porc.intValue());
		 
		 System.out.println("Porcentagem:"+porc+"%");
		 System.out.println("***COMPARAÇÃO***Ebaa");
			System.out.println(comparacao.getId());
			System.out.println(comparacao.getRid());
			System.out.println(comparacao.getPorcentagem());
			System.out.println(comparacao.getData());
			System.out.println(comparacao.getAmostra());	
	 
	 }
	

	}
		
		 
		 }

    public Comparacao pegarComparacao(){
	Thread t = new Thread(this);
	t.start();	
	return comparacao;
	
}

}
