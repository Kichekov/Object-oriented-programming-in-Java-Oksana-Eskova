package Elements;

public class Mouse implements CompItem{
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
