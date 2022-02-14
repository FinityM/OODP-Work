import java.util.StringTokenizer;

public class HexList extends NumberList{
    int size;

    HexList(String list)
    {
        size = 0;

        StringTokenizer token = new StringTokenizer(list);

        size = token.countTokens();

        hex_list = new int[size];

        for(int i = 0; i < size; i++)
        {
            hex_list[i] = Integer.parseInt(token.nextToken());
        }
    }

    public Number sum()
    {
        int n = 0;

        for(int i = 0; i < size; i++)
        {
            n = n + hex_list[i];
        }
        return n;
    }

    public void display()
    {
        System.out.println("Hex List");
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "]" + hex_list[i]);

        }
    }

}
