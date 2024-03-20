

package kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
      List<Language> getAll();
      Language getById(int id);
      void add( Language language);
      void uptade( Language language);
      void delete( Language language);



}
