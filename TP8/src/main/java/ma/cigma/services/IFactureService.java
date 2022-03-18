package ma.cigma.services;

import java.util.List;

import ma.cigma.models.Facture;

public interface IFactureService {
		
	boolean save(Facture c) ;
	Facture modify(Facture c);
	boolean deleteById(long id);
	Facture getById(long id);
	List<Facture> findAll();

}


