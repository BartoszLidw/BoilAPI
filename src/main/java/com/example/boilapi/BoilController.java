package com.example.boilapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoilController {
    @PostMapping("/boil")
    public Boil_wyj boilWyj(@RequestBody Boil_wej input)
    {
        Boil_wyj response = new Boil_wyj(input.odbiorca, input.dostawca, input.ceny_transportu, input.ceny_zakupu, input.ceny_sprzedazy);
        return response;
    }

}
