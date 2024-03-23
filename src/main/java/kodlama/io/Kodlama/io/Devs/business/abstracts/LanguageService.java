package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
       
      List<Language> getAll();
        Language getById(int id)  throws Exception;
        void add( Language language)    throws Exception;
        void uptade( Language language ,int id);
        void delete( int id);
        





}
