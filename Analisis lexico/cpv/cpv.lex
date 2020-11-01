

%%
%int
%%

[^a-zA-Z]+|[\n\s\r\t]+                                  { }

[a-zA-Z]*[aeiouAEIOU]{2}[a-zA-Z]*[aeiouAEIOU]           {
                                                            cpv.a++;
                                                        }
[a-zA-Z]*[aeiouAEIOU]{2}                                {
                                                            cpv.a++;
                                                        }
[a-zA-Z]*[aeiou]                                        {
                                                            cpv.b++;
                                                        }
[a-zA-Z]*[aeiouAEIOU]{2}[a-zA-Z]+                       {
                                                            cpv.c++;
                                                        }
[a-zA-Z]+                                               {
                                                            cpv.d++;
                                                        }
