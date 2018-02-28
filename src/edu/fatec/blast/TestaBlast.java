package edu.fatec.blast;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument;

import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest;


import gov.nih.nlm.ncbi.www.BioseqSetDocument;
import gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery;
import gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply;
import gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument;
import gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite;
import gov.nih.nlm.ncbi.www.Blast4QueriesDocument;
import gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries;
import gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument;
import gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options;
import gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults;
import gov.nih.nlm.ncbi.www.BlastWebServiceStub;
import gov.nih.nlm.ncbi.www.SeqIdDocument;
import gov.nih.nlm.ncbi.www.SeqLocDocument;

public class TestaBlast {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
	try {
		BlastWebServiceStub stub = new BlastWebServiceStub();
		
		Blast4QueueSearchRequestLiteDocument blaDoc = Blast4QueueSearchRequestLiteDocument.Factory.newInstance();
    
		
	Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite blast =blaDoc.addNewBlast4QueueSearchRequestLite();
	
	blast.setQuery("CCACCTTCTTCGACCCAGACGGAGGAGGGGACCCTATTCTATACCAACACCTATTCTGATTTTTTGGCCACCCCGAAGTTTATATTCTTATCCTGCCAGGCTTCGGAATAATTTCCCATATTGTAACTTACTACTCCGGAAAAAAAGAACCATTCGGATA"+
"TATAGGTATGGTCTGAGCAATAATATCAATTGGTTTCTTAGGGTTTATTGTGTGAGCACACCATATATTTACAGTAGGAA"+
"TGGACGTAGACACACGAGCCTATTTCACCTGCGCTACCATAATCATCGCTATTCCCAACAGCGTCAAAGTATTTAGCTGA"+
"CTCGCTACACTCCACGGAAGCAATATGAAGTGATCTGCTGCAGTACTCTGAGCCCTAGGTTCATTTTCTTCTCACTGTAG"+
"GTGGCCTAACCGGCATTGTACTAGCAAACTCATCATTAGACATCGTACTACACGACACATACTACGTCGTAGCTCACTTC"+
"CATTACGTCCTATCAATAGGTGCTGTATTCGCCATCACAGGAGGTTTCATTCACTGATTTCCCCTGTTCTCAGGCTATAC"+
"CCTAGACCAAACCTACGCCAAAATCCATTTTGCTATCATATTCATTGGCGTAAACCTAACCTTCTTCCCACAACACTTTC"+
"TTGGCCTATCAGGAATACCCCGACGTTACTCGGAATAACCCGTTGCATACACCACATGAAATATCCTATCATCTGTAGGC"+
"TCATTCATTTCCCTAACGGCAGTAATATATTGAGGGGAATTAATCTAAAACACTCTTTACGCCGGTTTCTATTGACTTGG"+
"GTTACTCGTGTGACCGCGGTGGCAGGCACGAAATTGACCAACCCTGGAGTTAGTATAGCTTAGTTAAACTTTCGTTTATT"+
"GCTAAAGGTTTATCACTGCTGTCTCCCATCGGGGTGTCGCTAGGCTAAGCGTTTTGAGCCGCATTGCTGCGTGCTTGATA"+
"CTTGTTCCTTTTGATCGTGGTGATTTAGAGGCTGACTCACCGGGAC");

	blast.setDatabaseName("nr");
	  
	Options op = blast.addNewOptions();
	   Blast4OptionsLite opLite = op.addNewBlast4OptionsLite();
	
	   opLite.setTask("megablast");
	Blast4OptionsLiteDocument.Blast4OptionsLite.Options options = Blast4OptionsLiteDocument.Blast4OptionsLite.Options.Factory.newInstance();
	Blast4CommonOptions blaop = Blast4CommonOptions.Factory.newInstance();
	/*
	NuclQueryOptions nucQueOp = NuclQueryOptions.Factory.newInstance();
	Blast4CommonOptionsNucleotideQuery blaNucQueOp =Blast4CommonOptionsNucleotideQuery.Factory.newInstance();
	DiscoMegablastOptions disco = DiscoMegablastOptions.Factory.newInstance();
	Blast4CommonOptionsDiscontiguousMegablast discont =Blast4CommonOptionsDiscontiguousMegablast.Factory.newInstance();
	//	ProgramId program = ProgramId.Factory.newInstance();
    //	program.setName("eBlastn");
	*/  
    // QueryFiltering query =QueryFiltering.Factory.newInstance();
    // Blast4CommonOptionsQueryFiltering queryFil = Blast4CommonOptionsQueryFiltering.Factory.newInstance();  
	//GetSup
//   ProgramOptions pop = ProgramOptions.Factory.newInstance();
 //  Blast4Parameters blaps = Blast4Parameters.Factory.newInstance();
  // Blast4Parameter blap =  Blast4Parameter.Factory.newInstance();
   //blap.setName("eBlastn");
 
  //blaop.set
  // options.setBlast4CommonOptions(blaop);
  
	opLite.setOptions(options);
   op.setBlast4OptionsLite(opLite);
      blast.setOptions(op);
      blaDoc.setBlast4QueueSearchRequestLite(blast);
	 Blast4QueueSearchReplyDocument reply =stub.submitSearchLite(blaDoc);

	 System.out.println("RID:"+reply.getBlast4QueueSearchReply().getRequestId());
   String rid = reply.getBlast4QueueSearchReply().getRequestId();
	
	 Blast4GetSearchResultsRequestDocument resultadoDoc =  Blast4GetSearchResultsRequestDocument.Factory.newInstance();
	 Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest  resultado =resultadoDoc.addNewBlast4GetSearchResultsRequest();	
	  
	 String rid2="FFCU3CR7014";
	 String rid3="6KNEPMF7014";
	 resultado.setRequestId(rid2);
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
	 String gi= "gi|30864";
	
//	 if((blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getSubjectId().trim().equalsIgnoreCase(gi))){	 
	 if(i<10){
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
	
	 /*double porcentagem = ((blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIdentities().doubleValue()
			 / (Math.abs(blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStart().doubleValue() 
			 - blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getEnd().doubleValue())) 
			 + (blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIndels().doubleValue())
			 - blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStrand().doubleValue()) *100 ) ;
	  */
	 
	 double razao =blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getEnd().doubleValue()
	 - blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getFullSubjectRange().getBlast4Range().getStart().doubleValue();
	 
	 double ident =blast4query.getAlignments().getBlast4SimpleAlignmentArray(i).getNumIdentities().doubleValue() / razao;
	 
	 double porcentagem = ident * 100;
	 
	 BigDecimal porc = new BigDecimal(porcentagem); 
	 porc = porc.setScale(0, BigDecimal.ROUND_HALF_EVEN); 
	 
	 System.out.println("Porcentagem:"+porc+"%");
	 }
	//}
}
	 /* Blast4QueueSearchRequestDocument reqDoc = Blast4QueueSearchRequestDocument.Factory
				.newInstance();
	 Blast4QueueSearchRequest request = reqDoc
				.addNewBlast4QueueSearchRequest();
	
	 Blast4QueriesDocument querieDoc = Blast4QueriesDocument.Factory.newInstance();	 
	 Blast4Queries querie = querieDoc.addNewBlast4Queries();
	 
	 Blast4QueriesDocument.Blast4Queries.SeqLocList seqlocs = request
				.addNewQueries().addNewBlast4Queries().addNewSeqLocList();
	 SeqLocDocument.SeqLoc seqloc = seqlocs.addNewSeqLoc();
	 SeqIdDocument.SeqId seqid = seqloc.addNewWhole().addNewSeqId();
		seqid.setGi(new BigInteger("30864"));
		
		request.addNewSubject().addNewBlast4Subject().setDatabase("nr");
		Blast4QueueSearchReplyDocument replySDoc =stub.submitSearch(reqDoc);
		
		System.out.println("RID="+ reply.getBlast4QueueSearchReply().getRequestId());
		
		*/
	 
	 
	  
	  
	} catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
