package ar.edu.unq.po2.tp9.parcelasDeCultivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SistemaGananciasParcelaTest {

	@Test
	void testSeCalculanGananciasAnualesTotales() {
		Cultivo soja = new Soja();
		Cultivo trigo = new Trigo();
		ParcelaMixta parcelaMixta = new ParcelaMixta(soja, soja, trigo, trigo);
		ParcelaMixta parcelaMixtaComp = new ParcelaMixta(soja, trigo, trigo, parcelaMixta);
		SistemaGananciasParcela sistema = new SistemaGananciasParcela(parcelaMixtaComp);
		
		assertEquals(1500, sistema.getGananciasAnuales());
	}

}
