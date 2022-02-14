public class NumberFactory {
    public NumberList getNumberList(String list)
    {
        // Check for existence of '.'
        int i = list.indexOf('.');
        if (i != -1)
        {
            return new DoubleList(list);
        }
        else if (i == -1)
        {
            return new IntList(list);
        }
        else
        {
            return new HexList(list);
        }
    }
}
