package edu.fatec.validate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "minhaValidacao")
public class MinhaValidacao implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		
		String fasta =(String)arg2;
			
		fasta = fasta.replaceAll("\r", ""); 
		fasta = fasta.replaceAll("\t", ""); 
		fasta = fasta.replaceAll("\n", ""); 
		fasta = fasta.replaceAll(" ", "");
	
		int i= 0;	
		
		while(i < fasta.trim().length()){	
			
		   if( ! (fasta.charAt(i)=='a' || fasta.charAt(i)=='A' || fasta.charAt(i)=='c'
				|| fasta.charAt(i)=='C' ||fasta.charAt(i)=='g'||fasta.charAt(i)=='G'
				|| fasta.charAt(i)=='t' || fasta.charAt(i)=='T')){
		
			
			     throw new ValidatorException (
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Sequência inválida!", "Sequência necessita estar no formato FASTA")
					);
		     } else
			       i++;
			
		
	     }

	}
}
