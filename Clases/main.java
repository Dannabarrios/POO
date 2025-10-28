public class main {
    public static void main(String[] args) {

        System.out.println("---Aire Acondicioanado---");

        aireAcondicionado aire1 = new aireAcondicionado();
        aireAcondicionado aire2 = new aireAcondicionado();
        aireAcondicionado aire3 = new aireAcondicionado();
        aireAcondicionado aire4 = new aireAcondicionado();
        aireAcondicionado aire5 = new aireAcondicionado();

        aire1.encender();
        aire2.apagar();
        aire3.cambiarTemperatura(20);
        aire4.cambiarModo("Frío");
        aire5.encender();

        System.out.println("---Mesa---");

        mesa mesa1 = new mesa();
        mesa mesa2 = new mesa();
        mesa mesa3 = new mesa();
        mesa mesa4 = new mesa();
        mesa mesa5 = new mesa();

        mesa1.usar();
        mesa2.dejarDeUsar();
        mesa3.cambiarColor("Rojo");
        mesa4.cambiarTamaño("Grande");
        mesa5.usar();

        System.out.println("---Escoba---");
        escoba escoba1 = new escoba();
        escoba escoba2 = new escoba();
        escoba escoba3 = new escoba();
        escoba escoba4 = new escoba();
        escoba escoba5 = new escoba();

        escoba1.usar();
        escoba2.dejarDeUsar();
        escoba3.cambiarColor("Azul");
        escoba4.cambiarTamaño("Pequeña");
        escoba5.usar();

        System.out.println("---Recogedor---");
        recogedor recogedor1 = new recogedor();
        recogedor recogedor2 = new recogedor();
        recogedor recogedor3 = new recogedor();
        recogedor recogedor4 = new recogedor();
        recogedor recogedor5 = new recogedor();

        recogedor1.usar();
        recogedor2.dejarDeUsar();
        recogedor3.cambiarColor("Verde");
        recogedor4.cambiarTamaño("Mediano");
        recogedor5.usar();

        System.out.println("---Computador---");
        computador computador1 = new computador();
        computador computador2 = new computador();
        computador computador3 = new computador();
        computador computador4 = new computador();
        computador computador5 = new computador();

        computador1.encender();
        computador2.apagar();
        computador3.cambiarColor("Negro");
        computador4.cambiarTamaño(15.6);
        computador5.encender();

        System.out.println("---Mouse---");
        mouse mouse1 = new mouse();
        mouse mouse2 = new mouse();
        mouse mouse3 = new mouse();
        mouse mouse4 = new mouse();
        mouse mouse5 = new mouse();

        mouse1.encender();
        mouse2.apagar();
        mouse3.cambiarColor("Blanco");
        mouse4.cambiarTamaño(1600);
        mouse5.encender();

        System.out.println("---Cargador---");
        cargador cargador1 = new cargador();
        cargador cargador2 = new cargador();
        cargador cargador3 = new cargador();
        cargador cargador4 = new cargador();
        cargador cargador5 = new cargador();

        cargador1.conectar();
        cargador2.desconectar();
        cargador3.cambiarColor("Gris");
        cargador4.cambiarVoltaje(1.5);
        cargador5.conectar();

        System.out.println("---Televisor---");
        televisor televisor1 = new televisor();
        televisor televisor2 = new televisor();
        televisor televisor3 = new televisor();
        televisor televisor4 = new televisor();
        televisor televisor5 = new televisor();

        televisor1.encender();
        televisor2.apagar();
        televisor3.cambiarColor("Plateado");
        televisor4.cambiarTamaño(55.0);
        televisor5.encender();

        System.out.println("---Llave---");
        llave llave1 = new llave();
        llave llave2 = new llave();
        llave llave3 = new llave();
        llave llave4 = new llave();
        llave llave5 = new llave();

        llave1.insertar();
        llave2.retirar();
        llave3.cambiarColor("Dorado");
        llave4.cambiarMaterial("Acero");
        llave5.insertar();

        System.out.println("---Puerta---");
        puerta puerta1 = new puerta();
        puerta puerta2 = new puerta();
        puerta puerta3 = new puerta();
        puerta puerta4 = new puerta();
        puerta puerta5 = new puerta();

        puerta1.abrir();
        puerta2.cerrar();
        puerta3.cambiarColor("Marrón");
        puerta4.cambiarMaterial("Madera");
        puerta5.abrir();

        System.out.println("---Pulsera---");
        pulsera pulsera1 = new pulsera();
        pulsera pulsera2 = new pulsera();
        pulsera pulsera3 = new pulsera();
        pulsera pulsera4 = new pulsera();
        pulsera pulsera5 = new pulsera();

        pulsera1.poner();
        pulsera2.quitar();
        pulsera3.cambiarColor("Rosa");
        pulsera4.cambiarMaterial("Cuero");
        pulsera5.poner();

        System.out.println("---Sillas---");
        sillas sillas1 = new sillas();
        sillas sillas2 = new sillas();
        sillas sillas3 = new sillas();
        sillas sillas4 = new sillas();
        sillas sillas5 = new sillas();

        sillas1.sentarse();
        sillas2.levantarse();
        sillas3.cambiarColor("Amarillo");
        sillas4.cambiarMaterial("Plástico");
        sillas5.sentarse();

        System.out.println("---Audifonos---");
        audifonos audifonos1 = new audifonos();
        audifonos audifonos2 = new audifonos();
        audifonos audifonos3 = new audifonos();
        audifonos audifonos4 = new audifonos();
        audifonos audifonos5 = new audifonos();

        audifonos1.encender();
        audifonos2.apagar();
        audifonos3.cambiarColor("Morado");
        audifonos4.cambiarTamaño(10.0);
        audifonos5.encender();

        System.out.println("---Uniforme---");
        uniforme uniforme1 = new uniforme();
        uniforme uniforme2 = new uniforme();
        uniforme uniforme3 = new uniforme();
        uniforme uniforme4 = new uniforme();
        uniforme uniforme5 = new uniforme();

        uniforme1.poner();
        uniforme2.quitar();
        uniforme3.cambiarColor("Blanco");
        uniforme4.cambiarTamaño("Mediano");
        uniforme5.poner();

        System.out.println("---Celular---");
        celular celular1 = new celular();
        celular celular2 = new celular();
        celular celular3 = new celular();
        celular celular4 = new celular();
        celular celular5 = new celular();

        celular1.marca();
        celular2.apagar();
        celular3.cambiarColor("Azul");
        celular4.cambiarTamaño(6.5);
        celular5.encender();

        System.out.println("---Gel Antibacterial---");
        gelAntibacterial gel1 = new gelAntibacterial();
        gelAntibacterial gel2 = new gelAntibacterial();
        gelAntibacterial gel3 = new gelAntibacterial();
        gelAntibacterial gel4 = new gelAntibacterial();
        gelAntibacterial gel5 = new gelAntibacterial();

        gel1.abrir();
        gel2.cerrar();
        gel3.cambiarColor("Transparente");
        gel4.cambiarTamaño(250);
        gel5.cambiarAroma("Lavanda");

        System.out.println("---Luz---");
        luz luz1 = new luz();
        luz luz2 = new luz();
        luz luz3 = new luz();
        luz luz4 = new luz();
        luz luz5 = new luz();

        luz1.encender();
        luz2.apagar();
        luz3.cambiarColor("Amarillo");
        luz4.cambiarIntensidad(75);
        luz5.encender();

        System.out.println("---Tapabocas---");
        tapabocas tapabocas1 = new tapabocas();
        tapabocas tapabocas2 = new tapabocas();
        tapabocas tapabocas3 = new tapabocas();
        tapabocas tapabocas4 = new tapabocas();
        tapabocas tapabocas5 = new tapabocas();

        tapabocas1.poner();
        tapabocas2.quitar();
        tapabocas3.cambiarColor("Blanco");
        tapabocas4.cambiarTamaño("Grande");
        tapabocas5.poner();

        System.out.println("---Libro---");
        libro libro1 = new libro();
        libro libro2 = new libro();
        libro libro3 = new libro();
        libro libro4 = new libro();
        libro libro5 = new libro();

        libro1.abrir();
        libro2.cerrar();
        libro3.cambiarColor("Rojo");
        libro4.cambiarTamaño("Mediano");
        libro5.abrir();

        System.out.println("---Toma Corriente---");
        tomaCorriente toma1 = new tomaCorriente();
        tomaCorriente toma2 = new tomaCorriente();
        tomaCorriente toma3 = new tomaCorriente();
        tomaCorriente toma4 = new tomaCorriente();
        tomaCorriente toma5 = new tomaCorriente();

        toma1.conectar();
        toma2.desconectar();
        toma3.cambiarColor("Blanco");
        toma4.cambiarVoltaje(220);
        toma5.conectar();

        System.out.println("---Impresora---");
        impresora impresora1 = new impresora();
        impresora impresora2 = new impresora();
        impresora impresora3 = new impresora();
        impresora impresora4 = new impresora();
        impresora impresora5 = new impresora();

        impresora1.encender();
        impresora2.apagar();
        impresora3.cambiarColor("Negro");
        impresora4.cambiarTamaño(30.0);
        impresora5.encender();

        System.out.println("---Hojas---");
        hojas hojas1 = new hojas();
        hojas hojas2 = new hojas();
        hojas hojas3 = new hojas();
        hojas hojas4 = new hojas();
        hojas hojas5 = new hojas();

        hojas1.agregar();
        hojas2.quitar();
        hojas3.cambiarColor("Blanco");
        hojas4.cambiarTamaño("A4");
        hojas5.agregar();

        System.out.println("---Abrigos---");
        abrigos abrigos1 = new abrigos();
        abrigos abrigos2 = new abrigos();
        abrigos abrigos3 = new abrigos();
        abrigos abrigos4 = new abrigos();
        abrigos abrigos5 = new abrigos();

        abrigos1.poner();
        abrigos2.quitar();
        abrigos3.cambiarColor("Negro");
        abrigos4.cambiarTamaño("Grande");
        abrigos5.poner();

        System.out.println("---Profesor---");
        profesor profesor1 = new profesor();
        profesor profesor2 = new profesor();
        profesor profesor3 = new profesor();
        profesor profesor4 = new profesor();
        profesor profesor5 = new profesor();

        profesor1.enseñar();
        profesor2.descansar();
        profesor3.cambiarMateria("Matemáticas");
        profesor4.cambiarEdad(45);
        profesor5.enseñar();

        System.out.println("---Señalización---");
        señalizacion señalizacion1 = new señalizacion();
        señalizacion señalizacion2 = new señalizacion();
        señalizacion señalizacion3 = new señalizacion();
        señalizacion señalizacion4 = new señalizacion();
        señalizacion señalizacion5 = new señalizacion();

        señalizacion1.colocar();
        señalizacion2.retirar();
        señalizacion3.cambiarColor("Rojo");
        señalizacion4.cambiarTipo("Peligro");
        señalizacion5.colocar();

        System.out.println("---Gafas---");
        gafas gafas1 = new gafas();
        gafas gafas2 = new gafas();
        gafas gafas3 = new gafas();
        gafas gafas4 = new gafas();
        gafas gafas5 = new gafas();

        gafas1.poner();
        gafas2.quitar();
        gafas3.cambiarColor("Negro");
        gafas4.cambiarTamaño("Mediano");
        gafas5.poner();

        System.out.println("---Colores---");
        colores colores1 = new colores();
        colores colores2 = new colores();
        colores colores3 = new colores();
        colores colores4 = new colores();
        colores colores5 = new colores();

        colores1.usar();
        colores2.guardar();
        colores3.cambiarColor("Azul");
        colores4.cambiarTamaño("Grande");
        colores5.usar();

        System.out.println("---Collar---");
        collar collar1 = new collar();
        collar collar2 = new collar();
        collar collar3 = new collar();
        collar collar4 = new collar();
        collar collar5 = new collar();

        collar1.poner();
        collar2.quitar();
        collar3.cambiarColor("Dorado");
        collar4.cambiarMaterial("Plata");
        collar5.poner();

        System.out.println("---Humano---");
        humano humano1 = new humano();
        humano humano2 = new humano();
        humano humano3 = new humano();
        humano humano4 = new humano();
        humano humano5 = new humano();

        humano1.caminar();
        humano2.cambiarEdad(30);
        humano3.dormir();
        humano4.despertar();
        humano5.cambiarNombre("Carlos");

        System.out.println("---Corrector---");
        corrector corrector1 = new corrector();
        corrector corrector2 = new corrector();
        corrector corrector3 = new corrector();
        corrector corrector4 = new corrector();
        corrector corrector5 = new corrector();

        corrector1.guardar();
        corrector2.cambiarColor("Blanco");
        corrector3.cambiarTamaño("Pequeño");
        corrector4.usar();
        corrector5.guardar();

    }

}