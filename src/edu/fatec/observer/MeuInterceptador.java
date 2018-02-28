package edu.fatec.observer;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import edu.fatec.managedBeans.UsuarioMB;


public class MeuInterceptador implements PhaseListener {

	
	private static final long serialVersionUID = -4040778940413271197L;

	@Override
	public void afterPhase(PhaseEvent e) {
	
		PhaseId fase = e.getPhaseId();

		FacesContext ctx = e.getFacesContext();
		String pagina = ctx.getViewRoot().getViewId();
		UsuarioMB uMB = ctx.getApplication().evaluateExpressionGet(ctx, "#{usuarioMB}",
				UsuarioMB.class);
		System.out.println(uMB.isLogado());

		System.out.println(pagina);
		System.out.println(fase);		
		
		if (pagina.equals("/load.xhtml") 
				||pagina.equals("/mostrarResultados.xhtml")
				||pagina.equals("/comparacao.xhtml")
				||pagina.equals("/editarPerfil.xhtml")
				||pagina.equals("/especie.xhtml")
				||pagina.equals("/menu.xhtml")
				||pagina.equals("/detalheUsu.xhtml")				
				||pagina.equals("/exportar.xhtml")
				||pagina.equals("/detalhe.xhtml")
				||pagina.equals("/menu.xhtml")
				||pagina.equals("/historico.xhtml")){
			UsuarioMB userMB = ctx.getApplication().evaluateExpressionGet(ctx, "#{usuarioMB}",
					UsuarioMB.class);
			System.out.println(userMB.isLogado());
			NavigationHandler nav = ctx.getApplication().getNavigationHandler();
			if (!userMB.isLogado()) {
				nav.handleNavigation(ctx, null, "login?faces-redirect=true");
				ctx.renderResponse();

			} 
			
		}
	}

	@Override
	public void beforePhase(PhaseEvent e) {
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

	

}
