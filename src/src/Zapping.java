public class Zapping {

    public Zapping() {
    }

    public int zappingMethod(int canalOrigen, int canalDestino) {
        int clics = canalDestino - canalOrigen;
        if (clics > 50) {
            clics = canalOrigen - 1 + (100 - canalDestino);
        } else if (clics < -50) {
            clics = canalDestino - 1 + (100 - canalOrigen);
        } else if (clics == 50) {
            return 49;
        }
        return clics;
    }

}
