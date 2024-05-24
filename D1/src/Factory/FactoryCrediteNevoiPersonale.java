package Factory;

public class FactoryCrediteNevoiPersonale implements IFactory {
    @Override
    public ICredite creareCredite() {
        return new CrediteNevoiPersonale();
    }
}
