%% Limpando Ambiente
clear all;
clc;
close all;
pkg load symbolic;

%% Sinal
g1 = @(t) (t+1);
g2 = @(t) (-t+1);

A = 1; % amplitude maxima
T0 = 2;
T1 = -1;
T2 = 1;

w = 2*pi/T0;

R = 1000; % resolucao
tempo  = [-1: abs(T0/R) : 1];
tempo1 = [-1: abs(T1/R) : 0];
tempo2 = [0 : abs(T2/R) : 1];

N = 2;
n = [-N:1:N];
f0 = 1/T0;
f = n/T0;

% Grafico do sinal original g(t)
figure(1);
plot(tempo1, g1(tempo1), tempo2, g2(tempo2));
grid;
title("Sinal original: g(t)");
xlabel("tempo [s]");
ylabel("Amplitude [V]");

syms n t

Pg = 1/T0 * (int((t+1)^2, t, T1, 0) + int((1-t)^2, t, 0, T2));

n = [-N:1:N];

Pg = eval(Pg);
Py = .95 * Pg;

% Potencia do sinal original e minima necessaria
figure(2);
bar([1 2], [Pg Py]);
xlim([0 3]);
xlabel("Pg e Py=0.95Pg");
grid;

Dn = 1/T0 * (int(g1 .* exp(-j*w*n*t), t, T1, 0) + int(g2 .*exp(-j*n*w*t), t, 0, T2));
D0 = 1/T0 * (int(g1, t, T1, 0) + int(g2, t, 0, T2));

n = [-N:1:N];

D0 = eval(D0);
Dn = eval(Dn);
Dn(N+1) = D0;

% Grafico da decomposicao das harmonicas Dn
figure(3);
stem(f, abs(Dn));
grid;


n=[-N:1:N];
aux  = 0;             


for k = 0 : 2*N      
  
  aux = aux + Dn(k+1)*exp(j*n(k+1)*w*tempo);
  
end

gy = aux;

% Grafico da sintetizacao do sinal
figure(4)
plot(tempo,gy);
grid;










































