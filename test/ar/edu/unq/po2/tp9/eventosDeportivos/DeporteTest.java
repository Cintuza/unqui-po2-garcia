package ar.edu.unq.po2.tp9.eventosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class DeporteTest {
	
	private Servidor servidor1;
	private Servidor servidor2;
	private Partido atlantaVsChacarita;
	private Deporte futbol;

	@Test
	void testServidoresSonAvisadosAnteAgregadoDePartido() {
		servidor1 = mock(Servidor.class);
		servidor2 = mock(Servidor.class);
		atlantaVsChacarita = mock(Partido.class);
		futbol = new Deporte("Futbol");
		
		futbol.agregarServidor(servidor1);
		futbol.agregarServidor(servidor2);
		
		futbol.agregarPartido(atlantaVsChacarita);

		verify(servidor1).updateServidores(atlantaVsChacarita);
		verify(servidor2).updateServidores(atlantaVsChacarita);
	}

}
