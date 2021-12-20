/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.java.activity.satu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author asus
 */
@Controller
public class DataKTP {
    
    @RequestMapping("/TableKTP")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        data.add(Arrays.asList("701", "1401434020404301", "budi", "bandung"));
        data.add(Arrays.asList("702", "1401434020404302", "udin", "Yogyakarta"));
        data.add(Arrays.asList("703", "1401434020404303", "maya", "NTT"));
        data.add(Arrays.asList("704", "1401434020404304", "yuyun", "bandung"));
        data.add(Arrays.asList("705", "1401434020404305", "tupil", "Yogyakarta"));
        data.add(Arrays.asList("706", "1401434020404306", "wahyu", "NTT"));
        data.add(Arrays.asList("707", "1401434020404307", "robert", "Yogyakarta"));
        data.add(Arrays.asList("708", "1401434020404308", "edi", "NTT"));
        data.add(Arrays.asList("709", "1401434020404309", "una", "Yogyakarta"));
        data.add(Arrays.asList("710", "1401434020404310", "popo", "NTB"));
        data.add(Arrays.asList("711", "1401434020404311", "queen", "bandung"));
        data.add(Arrays.asList("712", "1401434020404312", "yusuf", "Aceh"));
        data.add(Arrays.asList("713", "1401434020404313", "putu", "Aceh"));
        data.add(Arrays.asList("714", "1401434020404314", "dendi", "bandung"));
        data.add(Arrays.asList("715", "1401434020404315", "ipul", "Padang"));
        data.add(Arrays.asList("716", "1401434020404316", "popi", "Jakarta"));
        data.add(Arrays.asList("717", "1401434020404317", "rossy", "bandung"));
        data.add(Arrays.asList("718", "1401434020404318", "puni", "NTT"));
        data.add(Arrays.asList("719", "1401434020404319", "wan", "Yogyakarta"));
        data.add(Arrays.asList("720", "1401434020404320", "bayu", "Medan"));
        
        Data.addAttribute("table", data);
        
        
        return "table.Viewer";
    }
    
}
