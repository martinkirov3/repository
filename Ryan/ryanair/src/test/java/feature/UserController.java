package feature;

import com.intuit.karate.junit5.Karate;

class UserController {

    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions   
    @Karate.Test
    Karate testUser () {
        return Karate.run().relativeTo(getClass());
    }   
   
}

