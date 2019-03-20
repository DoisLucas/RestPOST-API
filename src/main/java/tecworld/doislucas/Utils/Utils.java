package tecworld.doislucas.Utils;

import javax.validation.constraints.NotNull;
import java.text.Normalizer;

public class Utils {

    @NotNull
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }

}
