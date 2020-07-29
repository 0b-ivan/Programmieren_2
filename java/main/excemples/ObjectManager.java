package main.excemples;

import java.io.FileNotFoundException;
import java.util.List;

interface ObjectMangager <T>{

        public void serialize ( List <T > object ) throws Throwable;
        public  List<T > deserialize () ;
 }


