package kodlama.io.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
   LanguageService languageService;

   public LanguagesController(LanguageService languageService){
         this.languageService = languageService;
   }

   @RequestMapping("/getall")
    public List<Language> getAll(){
            return this.languageService.getAll();
    }
    @RequestMapping("/add")
    public void add(Language language) throws Exception{
        this.languageService.add(language) ;
    }
    @RequestMapping("/uptade")
    public void uptade(Language language ,int id) throws Exception{
        this.languageService.uptade(language ,id);
    }
    @RequestMapping("/delete")
    public void delete(int id ){
        this.languageService.delete(id);
    }
    @RequestMapping("/getbyid")
    public Language getbyid(int id)throws Exception{
        return this.languageService.getById(id);
    }

}
