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
		if (this.deepest() > 1) {
			List<IShapeShifter> shapeShifters = new ArrayList<IShapeShifter>();
			for (Integer value : this.values()) {
				shapeShifters.add(new ShapeShifter(value));
			}
			listaDeIShapeShifter = shapeShifters;
		}
		return this;
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
