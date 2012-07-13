package hiriko

import java.math.BigInteger

class User_gui {

    //BigInteger user_id
    String username
    String pasword
    BigInteger fecha_fin
    Integer zona
    String idioma
    Integer tiempo_refreco

    static mapping = {
        table 'user_gui'
        //user_id column:'id'
        username column:'USERNAME'
        password column:'PASSWORD'
        fecha_fin column:'DATE_END'
        fecha_fin column:'ID_TIME_ZONE'
        idioma column:'LANGUAGE_USER'
        tiempo_refresco column:'REFRESH_MAP_TIME'



    }

    static constraints = {
    }

    String toString(){ 
        return username 
    }
}
