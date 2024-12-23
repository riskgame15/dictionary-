package vn.codegym.sprdictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    private String[] engWords = {"hello", "world", "apple", "banana", "orange"};
    private String[] vietWords = {"Xin chào", "Thế giới", "Quả táo", "Quả chuối", "Quả cam"};

    @RequestMapping("/dictionary")
    public String dictionary(@RequestParam("eng_word") String engWord, Model model) {
        boolean found = false;
        String vietWord = null;
        if (engWord == null) {
            engWord = "";
            model.addAttribute("eng_word", engWord);
            return "dictionary";
        }
        engWord = engWord.toLowerCase();
        for (int i = 0; i < engWords.length; i++) {
            if (engWords[i].equals(engWord)) {
                found = true;
                vietWord = vietWords[i];
                break;
            }
        }
        if (found) {
            model.addAttribute("viet_word", vietWord);
        } else {
            model.addAttribute("viet_word", "Word not found");
        }
        model.addAttribute("eng_word", engWord);
        return "dictionary";
    }
}
