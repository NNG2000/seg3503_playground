package src;

public class Tic{
    
    private int rows;
    private int cols;

    public Tic(){
        this(3,3);
    }
    public Tic(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
    }

    public int size(){
        return cols*rows;
    }

    public String to_String(Boolean show_index){
        String elem="";
        for (int n= 0;n<rows;n++){
            elem = elem + to_String_Column(n, cols, show_index);
            if(n!=rows-1){
                elem+="\n";
            }
            
        }
        return elem;
    }

    private String to_String_Column(int row_index, int num_columns, Boolean show_index){
        String e="";
        for (int i= 0;i<cols;i++){
            e= e + to_String_Cell(row_index * num_columns + i,show_index);
            if(i!=cols-1){
                e+="|";
            }
        }
        return e;
      
    }
    private String to_String_Cell(int index, Boolean show_index){
    
        if(show_index == true){
            return Integer.toString(index);
        }else{
            return "_";
        }

    
    }

}