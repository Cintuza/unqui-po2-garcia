package ar.edu.unq.po2.tp9.parcelasDeCultivo;

import java.util.*;

public class ParcelaMixta implements IParcela {
	
	private List<IParcela> parcelas;
	private IParcela parcelaMadre;
	
	public ParcelaMixta(IParcela parcela1, IParcela parcela2, IParcela parcela3, IParcela parcela4) {
		this.parcelas = new ArrayList<IParcela>();
		agregarParcela(parcela1);
		agregarParcela(parcela2);
		agregarParcela(parcela3);
		agregarParcela(parcela4);
		this.parcelaMadre = null;
	}

	@Override
	public Double gananciasAnualesTotales() {
		Double gananciasAnuales = 0d;
		for (IParcela iParcela : parcelas) {
			gananciasAnuales = gananciasAnuales + iParcela.gananciasAnualesTotales();
		}
		if (getParcelaMadre() == null) {
			return gananciasAnuales;
		}
		else {
			return gananciasAnuales / 4;
		}
	}

	@Override
	public void agregarParcela(IParcela parcela) {
		parcelas.add(parcela);
		parcela.setParcelaMadre(this);
	}

	@Override
	public void eliminarParcela(IParcela parcela) {
		parcelas.remove(parcela);
		parcela.eliminarParcelaMadre();
	}

	@Override
	public IParcela getParcelaHija(Integer posParcela) {
		return parcelas.get(posParcela);
	}

	@Override
	public void setParcelaMadre(IParcela parcela) {
		parcelaMadre = parcela;
	}

	@Override
	public IParcela getParcelaMadre() {
		return parcelaMadre;
	}

	@Override
	public void eliminarParcelaMadre() {
		parcelaMadre = null;
	}

}
