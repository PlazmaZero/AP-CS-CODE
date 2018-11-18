public class Gameboard
{
  public char board [][]=new char[8][8];;
  
  public Gameboard(boolean setup)
  {
    if (setup==false)
    {
      for (int i=0; i<board.length;i++)
      {
        for (int c=0;c<board[0].length;c++)
        {
         board[i][c]='-';
        } 
      }
    }
    else
    {
            for (int i=0; i<board.length;i++)
      {
        for (int c=0;c<board[0].length;c++)
        {
          if ((i%2==0)&&(c%2==1)&&(i<=2))
          {
           board[i][c]='r'; 
          }
          else if ((i%2==1)&&(c%2==0)&&(i<=2))
          {
           board[i][c]='r'; 
          }
            else if ((i%2==1)&&(c%2==0)&&(i>=5))
          {
           board[i][c]='w'; 
          }
            else if ((i%2==0)&&(c%2==1)&&(i>=5))
          {
           board[i][c]='w'; 
          }              
          else {
         board[i][c]='-';
          }
        } 
      }
    }
  }
  
 //-here it is --------------------

//check if jump is possible - see jump

//if left is true, move piece and return true if forward left is valid move

//if left is false, move piece return true if forward right is valid move

//if move isn't valid, return false

  public boolean move(int row, int col, boolean left) {

    boolean canJump = jump(row,col); //this actually calls jump

    if(canJump) {//jump has been done

      return true;

    }else {//couldn't jump

      char here = board[row][col]; //current character

      boolean red = false; //marker for direction

      if(here == 'r') {

        red = true;

      }else if(here == '-') {//not a piece

        return false;

      }

      boolean canMove = false; //marker if move allowed

      int tempCol = -1; //used to calculate if move allowed

      int tempRow = -1; //used to calculate if move allowed

//set new row

    

     

        if(red) {

        tempRow = row+1;

      }else {

        tempRow = row-1;

      }

//if new row not valid, no need to continue this method

      if(tempRow >=8 || tempRow < 0) {

        return false;

      }

      if(left) {

//test left move

        if(red) {

          tempCol = col +1;

        }else {

          tempCol = col - 1;

        }

        if(tempCol <0 || tempCol >=8) {//not valid location

          return false;

        }else if(board[tempRow][tempCol] != '-') {//there's something in the spot

          return false;

        }else {//move is valid

          canMove = true;

        }

      }

      if(!left) {

//test right

        if(red) {

          tempCol = col -1;

        }else {

          tempCol = col +1;

        }

        if(tempCol < 0 || tempCol >=8) { //out of bounds

          return false;

        }else if(board[tempRow][tempCol] != '-') {//spot occupied

          return false;

        }else {//move is good

          canMove = true;

        }

      }

      if(canMove) { //move was made

//actually move the piece

        board[tempRow][tempCol]= here;

        board[row][col] = '-';

        return true;

      }

      return canMove;

    }

  }


  public boolean jump(int y, int x)
  {
         boolean check=false;    
    int tempx;
    int tempy;
    if (board[y][x]=='w')
    {
      if ((x-2>=0)&&(y-2>=0)&&(board[y-1][x-1]=='r')&&(board[y-2][x-2]=='-'))//checks for if forward left ok, jumps and then runs jump again from new loaction
      {
        tempx=x-2;
        tempy=y-2;
        board[y-2][x-2]='w';
        board[y-1][x-1]='-';
        board[y][x]='-';
        check=true;
        jump (tempy,tempx);
        return check;
      }
      else if ((x+2<=7)&&(y-2>=0)&&(board[y-1][x+1]=='r')&&(board[y-2][x+2]=='-'))//checks for if forward right ok
      {
        tempx=x+2;
        tempy=y-2;
        board[y-2][x+2]='w';
        board[y-1][x+1]='-';
        board[y][x]='-';
        check=true;        
        jump (tempy,tempx);
                return check;
      }
      else
                return check;//returns check which is true for if jump ran once or more.
    }
    else if (board[y][x]=='r')
    {
         if ((x+2<=7)&&(y+2<=7)&&(board[y+1][x+1]=='w')&&(board[y+2][x+2]=='-'))//checks for if forward left ok
      {
        tempx=x+2;
        tempy=y+2;
        board[y+2][x+2]='r';
        board[y+1][x+1]='-';
        board[y][x]='-';
        check=true;
        jump (tempy,tempx);
                return check;
      }
      else if ((x-2>=0)&&(y+2<=7)&&(board[y+1][x-1]=='w')&&(board[y+2][x-2]=='-'))//checks for if forward right ok
      {
        tempx=x-2;
        tempy=y+2;
        board[y+2][x-2]='r';
        board[y+1][x-1]='-';
        board[y][x]='-';
        check=true;
        jump (tempy,tempx);
                return check;
    }
      else
                return check;      
  }
      else
        return check;    
  }
  
  public boolean kingMe(int y, int x)
  {

    if (board[y][x]=='r'&&(y==7))//makes sure right character and row
      {
      board[y][x]='R';
      return true;
      }
        else if (board[y][x]=='w'&&(y==0))
        {
      board[y][x]='W';  
      return true;
        }
        else 
          return false;
  }
  public String toString()
  {
    String s="";
    for (int i=0;i<board.length;i++)
    {
     for (int c=0;c<board[0].length;c++)
     {
       s+=board[i][c]+" ";
     }
     s+="\n";
    }
    return s;
  }
}