package Factory;

public class FactoryCrediteIpotecare implements IFactory {
    @Override
    public ICredite creareCredite() {
        return new CrediteIpotecare();
    }
}
