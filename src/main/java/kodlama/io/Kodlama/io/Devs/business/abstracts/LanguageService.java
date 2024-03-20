package kodlama.io.Kodlama.io.Devs.business.abstracts;

public interface LanguageService {
    void addLanguage(String name ,int level)  throws Exception;
    void uptadeLanguage(int id , String name , int level) throws Exception;
    void deleteLanguage(int id);
    void getAllLanguage();
    void getByIdLanguage(int id);



}
