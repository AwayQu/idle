prologues:=3;
verbatimtex
%&latex
\documentclass{article}
\usepackage{graphics}
\usepackage{color}
\definecolor{dgreen}{rgb}{0.1,0.5,0.1}
\begin{document}
etex
input expressg;
beginfig(1);
z0=(0,0);
drawovalbox(0,40,17)(btex \tt start etex);
z1c=z0c-(0,30);
drawENT(1,40,17)(btex \tt  y=10;
 etex);
drawnormalCA(0bm,1tm);
z2c=z1c-(0,30);
drawENT(2,35,17)(btex \tt  x=5;
 etex);
drawnormalCA(1bm,2tm);
z3=z2c-(0,30);
drawdiamondbox(3,50,25)(btex \tt 1-y<=-x etex);
drawnormalCA(2bm,3tm);
z4bm=z3  shifted (60,0);
z4c=z4bm;
label(btex {\color{dgreen}\tt yes} etex,z4c);
drawnormal(3mr,4bm);
z5c=z4c-(0,30);
drawENT(5,70,17)(btex \tt  y=x*(-y+5);
 etex);
drawnormalCA(4bm,5tm);
z6=z5c shifted (-70,0);
drawnormalthreeCA(5ml,6,3bm);
z7bm=z3 shifted (-50,0);
z7c=z7bm;
drawnormal(3ml,7bm);
label(btex {\color{red}\tt no} etex,z7c);
z8=z7c-(0,30);
drawovalbox(8,40,17)(btex \tt stop etex);
drawnormalCA(7bm,8tm);
endfig;
end;
