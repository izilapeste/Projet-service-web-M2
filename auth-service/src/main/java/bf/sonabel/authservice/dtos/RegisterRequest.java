package bf.sonabel.authservice.dtos;

import com.sonabel.sharedmodels.entites.Client;

public record RegisterRequest(
         String nom,

         String prenom,


         Client.Sexe sexe,

         String numTelephone,

         String ville,

         String secteur,

         String mail,

         String username,

         String password
) {
}
