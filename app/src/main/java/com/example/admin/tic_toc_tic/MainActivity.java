package com.example.admin.tic_toc_tic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bb[][]=new Button[3][3];
    Button new_game;
    TextView result;
    boolean ch=true;
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int ii,jj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bb[0][0]=(Button)findViewById(R.id.a1);
        bb[0][1]=(Button)findViewById(R.id.a2);
        bb[0][2]=(Button)findViewById(R.id.a3);
        bb[1][0]=(Button)findViewById(R.id.b1);
        bb[1][1]=(Button)findViewById(R.id.b2);
        bb[1][2]=(Button)findViewById(R.id.b3);
        bb[2][0]=(Button)findViewById(R.id.c1);
        bb[2][1]=(Button)findViewById(R.id.c2);
        bb[2][2]=(Button)findViewById(R.id.c3);
        result=(TextView)findViewById(R.id.result);
        new_game=(Button)findViewById(R.id.new_game);

        reset();

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        bb[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[0][0].setText("O");
                    a[0][0]=1;
                }
                else
                {
                    bb[0][0].setText("X");
                    b[0][0]=1;
                }
                ch=!ch;
                bb[0][0].setEnabled(false);
                isWon();
            }});

        bb[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[0][1].setText("O");
                    a[0][1]=1;
                }
                else
                {
                    bb[0][1].setText("X");
                    b[0][1]=1;
                }
                ch=!ch;
                bb[0][1].setEnabled(false);
                isWon();
            }});

        bb[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[0][2].setText("O");
                    a[0][2]=1;
                }
                else
                {
                    bb[0][2].setText("X");
                    b[0][2]=1;
                }
                ch=!ch;
                bb[0][2].setEnabled(false);
                isWon();
            }});

        bb[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[1][0].setText("O");
                    a[1][0]=1;
                }
                else
                {
                    bb[1][0].setText("X");
                    b[1][0]=1;
                }
                ch=!ch;
                bb[1][0].setEnabled(false);
                isWon();
            }});

        bb[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[1][1].setText("O");
                    a[1][1]=1;
                }
                else
                {
                    bb[1][1].setText("X");
                    b[1][1]=1;
                }
                ch=!ch;
                bb[1][1].setEnabled(false);
                isWon();
            }});

        bb[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[1][2].setText("O");
                    a[1][2]=1;
                }
                else
                {
                    bb[1][2].setText("X");
                    b[1][2]=1;
                }
                ch=!ch;
                bb[1][2].setEnabled(false);
                isWon();
            }});

        bb[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[2][0].setText("O");
                    a[2][0]=1;
                }
                else
                {
                    bb[2][0].setText("X");
                    b[2][0]=1;
                }
                ch=!ch;
                bb[2][0].setEnabled(false);
                isWon();
            }});

        bb[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[2][1].setText("O");
                    a[2][1]=1;
                }
                else
                {
                    bb[2][1].setText("X");
                    b[2][1]=1;
                }
                ch=!ch;
                bb[2][1].setEnabled(false);
                isWon();
            }});

        bb[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch)
                {
                    bb[2][2].setText("O");
                    a[2][2]=1;
                }
                else
                {
                    bb[2][2].setText("X");
                    b[2][2]=1;
                }
                ch=!ch;
                bb[2][2].setEnabled(false);
                isWon();
            }});





    }








    public void reset()
    {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                a[i][j]=0;
                b[i][j]=0;
                bb[i][j].setEnabled(true);
                bb[i][j].setText("");
                bb[i][j].setBackgroundColor(Color.GRAY);
            }
        new_game.setText("New Game");
        result.setText("New Game");
        result.setBackgroundColor(Color.GRAY);

    }

    public boolean isWon()
    {
        boolean isWin=false;
        if(a[0][0]==1&&a[0][1]==1&&a[0][2]==1)
        {
            bb[0][0].setBackgroundColor(Color.CYAN);
            bb[0][1].setBackgroundColor(Color.CYAN);
            bb[0][2].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[1][0]==1&&a[1][1]==1&&a[1][2]==1)
        {
            bb[1][0].setBackgroundColor(Color.CYAN);
            bb[1][1].setBackgroundColor(Color.CYAN);
            bb[1][2].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[2][0]==1&&a[2][1]==1&&a[2][2]==1)
        {
            bb[2][0].setBackgroundColor(Color.CYAN);
            bb[2][1].setBackgroundColor(Color.CYAN);
            bb[2][2].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[0][0]==1&&a[1][0]==1&&a[2][0]==1)
        {
            bb[0][0].setBackgroundColor(Color.CYAN);
            bb[1][0].setBackgroundColor(Color.CYAN);
            bb[2][0].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[0][1]==1&&a[1][1]==1&&a[2][1]==1)
        {
            bb[0][1].setBackgroundColor(Color.CYAN);
            bb[1][1].setBackgroundColor(Color.CYAN);
            bb[2][1].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[0][2]==1&&a[1][2]==1&&a[2][2]==1)
        {
            bb[0][2].setBackgroundColor(Color.CYAN);
            bb[1][2].setBackgroundColor(Color.CYAN);
            bb[2][2].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[0][0]==1&&a[1][1]==1&&a[2][2]==1)
        {
            bb[0][0].setBackgroundColor(Color.CYAN);
            bb[1][1].setBackgroundColor(Color.CYAN);
            bb[2][2].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        else if(a[0][2]==1&&a[1][1]==1&&a[2][0]==1)
        {
            bb[0][2].setBackgroundColor(Color.CYAN);
            bb[1][1].setBackgroundColor(Color.CYAN);
            bb[2][0].setBackgroundColor(Color.CYAN);
            result.setText("Player O win");
            result.setBackgroundColor(Color.CYAN);
            isWin=true;
        }
        //---------------------------------------------------------------------

        else if(b[0][0]==1&&b[0][1]==1&&b[0][2]==1)
        {
            bb[0][0].setBackgroundColor(Color.BLUE);
            bb[0][1].setBackgroundColor(Color.BLUE);
            bb[0][2].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[1][0]==1&&b[1][1]==1&&b[1][2]==1)
        {
            bb[1][0].setBackgroundColor(Color.BLUE);
            bb[1][1].setBackgroundColor(Color.BLUE);
            bb[1][2].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[2][0]==1&&b[2][1]==1&&b[2][2]==1)
        {
            bb[2][0].setBackgroundColor(Color.BLUE);
            bb[2][1].setBackgroundColor(Color.BLUE);
            bb[2][2].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[0][0]==1&&b[1][0]==1&&b[2][0]==1)
        {
            bb[0][0].setBackgroundColor(Color.BLUE);
            bb[1][0].setBackgroundColor(Color.BLUE);
            bb[2][0].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[0][1]==1&&b[1][1]==1&&b[2][1]==1)
        {
            bb[0][1].setBackgroundColor(Color.BLUE);
            bb[1][1].setBackgroundColor(Color.BLUE);
            bb[2][1].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[0][2]==1&&b[1][2]==1&&b[2][2]==1)
        {
            bb[0][2].setBackgroundColor(Color.BLUE);
            bb[1][2].setBackgroundColor(Color.BLUE);
            bb[2][2].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[0][0]==1&&b[1][1]==1&&b[2][2]==1)
        {
            bb[0][0].setBackgroundColor(Color.BLUE);
            bb[1][1].setBackgroundColor(Color.BLUE);
            bb[2][2].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }
        else if(b[0][2]==1&&b[1][1]==1&&b[2][0]==1)
        {
            bb[0][2].setBackgroundColor(Color.BLUE);
            bb[1][1].setBackgroundColor(Color.BLUE);
            bb[2][0].setBackgroundColor(Color.BLUE);
            result.setText("Player X win");
            result.setBackgroundColor(Color.BLUE);
            isWin=true;
        }

        if(isWin)
            gameOver();



        return isWin;
    }


    public void gameOver()
    {
        new_game.setText("Play Again");

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                bb[i][j].setEnabled(false);
    }




}
