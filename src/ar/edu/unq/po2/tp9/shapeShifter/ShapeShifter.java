package ar.edu.unq.po2.tp9.shapeShifter;

import java.util.*;
import java.util.stream.Collectors;

public class ShapeShifter implements IShapeShifter {
	
	private List<IShapeShifter> listaDeIShapeShifter = new ArrayList<IShapeShifter>();
	private Integer valor;
	
	public ShapeShifter(Integer valor) {
		this.valor = valor;
	}

	public ShapeShifter(IShapeShifter unShapeShifter, IShapeShifter otroShapeShifter) {
		this.listaDeIShapeShifter.add(unShapeShifter);
		this.listaDeIShapeShifter.add(otroShapeShifter);
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		return new ShapeShifter(this, shapeShifter);
	}

	@Override
	public int deepest() {
		Integer profundidad = 0;
		if (!this.listaDeIShapeShifter.isEmpty()) {
			profundidad =+ 1;
			List<Integer> profundidades = listaDeIShapeShifter.stream().map(iShapeShifter -> iShapeShifter.deepest()).collect(Collectors.toList());
			int profundidadMayor = Collections.max(profundidades);
			profundidad = profundidad + profundidadMayor;
		}
		return profundidad;
	}

	@Override
	public IShapeShifter flat() {
		IShapeShifter shapeShifterFlat = this;
		if (!this.listaDeIShapeShifter.isEmpty()) {
			List<IShapeShifter> shapeShiftersFlat = new ArrayList<IShapeShifter>();
			for (IShapeShifter shapeShifter : listaDeIShapeShifter) {
				if (shapeShifter.deepest() == 0) {
					shapeShiftersFlat.add(shapeShifter);
				}
				else {
					shapeShiftersFlat.add(shapeShifter.flat());
				}
			}// agregar padre
			// si no tiene hijes ni padre se devuelve a si misme
			// si no tiene hijes pero si padre
			//profundidad =+ 1;
			this.listaDeIShapeShifter.removeAll(listaDeIShapeShifter);
			for (IShapeShifter iShapeShifter : shapeShiftersFlat) {
				this.listaDeIShapeShifter.add(iShapeShifter);
			}			
		}
		return shapeShifterFlat;
	}

	@Override
	public List<Integer> values() {
		List<Integer> listaDeValores = new ArrayList<Integer>();
		if (this.deepest() == 0) {
			listaDeValores.add(this.valor);
		}
		else {
			for (IShapeShifter iShapeShifter : listaDeIShapeShifter) {
				listaDeValores.addAll(iShapeShifter.values());
			}
		}
		return listaDeValores;
	}

}
