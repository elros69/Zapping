public class Zapping {

    public Zapping() {
    }

    public int zappingMethod(int canalOrigen, int canalDestino) {
        int clics = canalDestino - canalOrigen;
        if (clics > 50) {
            clics = canalOrigen - 1 + (100 - canalDestino);
            return clics;
        } else {
            return clics;
        }
    }

}
