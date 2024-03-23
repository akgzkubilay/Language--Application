package kodlama.io.Kodlama.io.Devs.business.abstracts.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class LanguageManager implements LanguageService{
    private LanguageService languageService;
    public LanguageManager(LanguageService languageService){
        this.languageService = languageService;
    }

    @Override
    public List<Language> getAll() {
        return this.languageService.getAll();
    }

    @Override
    public Language getById(int id) throws Exception {
        if(id == 0){
            throw new Exception("Id boş olamaz");

        }
        return this.languageService.getById(id);
    }

    @Override
    public void delete(int id) {
    
        this.languageService.delete(id);
        
    }

    @Override
    public void add(Language language) throws Exception {
        if( language.getName().isEmpty()){
            throw new Exception("Dil adı boş olamaz");
        }
        this.languageService.add(language);
    }

    @Override
    public void uptade(Language language, int id) {
        this.languageService.uptade(language, id);
        
    }

    

}
