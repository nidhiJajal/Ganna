%{
    int op =0,i;
    float a,b;
%}
dig [0-9]+|(\.[0-9]+)?

add "+"
sub "-"
mul "*"
ln \n

{dig} {digi();}

{add} {op = 1;}

{sub} {op = 2;} 
{mul} {op = 3;}

{ln} {printf("answer is:%f",a);}

%%
digi()
{
    if(op==0) 
        a= atof(yytext);

    else
    { 
        b= atof(yytext);

        switch(op)
        {

            case 1 : a = a + b break;

            case 2 : a = a - b break;

            case 3 : a=a*b; break;

        }
    op = 0
    }
}
    
main(int argv, char *argc[]) 
{
    yylex();
}

yywrap()
{
    return 1;
}

