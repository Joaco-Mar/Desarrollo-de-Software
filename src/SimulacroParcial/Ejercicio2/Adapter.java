package SimulacroParcial.Ejercicio2;

public class Adapter implements Reproductor {
    @Override
    public String reproducir(AudioExterno audioOriginal) {
        String audioViejo= audioOriginal.playAudioFile();
        String audioTransformado=audioViejo.replace("Antiguo","Adaptado");
        return audioTransformado;
    }
}
