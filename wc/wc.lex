

%%
%int
%%
[^\t\n\r\ ]+        { 
                    wc.np++;
                    wc.nc +=yylength(); //
                    }
\                   |
\t                  { 
                    wc.nc++;
                    }  
\r\n                |
\n                  |
\r                  { 
                    wc.nl++;
                    wc.nc += yylength();
                    }