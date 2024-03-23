package kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.List;
import java.util.ArrayList;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class InMemoryLangugeReposty implements LanguageRepository{

   
    List<Language> languages;

    public InMemoryLangugeReposty() {

        languages = new ArrayList<Language>();
        languages.add(new Language(1, "Java", 3));
        languages.add(new Language(2, "C#", 2));
        languages.add(new Language(3, "Python", 1));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) {
        for (Language language : languages) {
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void uptade(Language language) {
        for ( Language Lang : languages){
            if(Lang.getId()==language.getId()){
                Lang.setName(language.getName());
                Lang.setLevel(language.getLevel());
            }   
        }

         
    }

    @Override
    public void delete(Language language) {
        for (Language Lang : languages){
            if(Lang.getId()==language.getId()){
                languages.remove(Lang);
            }
        }
    }

}
