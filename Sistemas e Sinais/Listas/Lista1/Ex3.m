%% Limpando Ambiente
clear all;
clc;
close all;
pkg load symbolic;


%% Definindo sinal
g1 = @(t) (t+1);
g2 = @(t) (-t+1);


%% Simbolicas
syms n t w T0 T1 T2 

Pg = 1/T0 * (int((t+1)^2, t, T1, 0) + int((1-t)^2, t, 0, T2));

Dn = 1/T0 * (int(g1 .* exp(-j*w*n*t), t, T1, 0) + int(g2 .*exp(-j*n*w*t), t, 0, T2));
D0 = 1/T0 * (int(g1, t, T1, 0) + int(g2, t, 0, T2));


%% Avaliando integrais
T0 = 2;
T1 = -1;
T2 = 1;
w = 2*pi/T0; % --> w0
R = 1000; % resolucao
tempo  = [-1: abs(T0/R) : 1];
tempo1 = [-1: abs(T1/R) : 0];
tempo2 = [0 : abs(T2/R) : 1];

Pg = eval(Pg)
Py = .95 * Pg


%% Definindo quantas harm
PotAcum = abs(eval(D0))^2; % Potencia de D0
n = 1;

while PotAcum < Py
	Harm  = abs(eval(Dn)); % Harmonica
	Pn = 2 * Harm^2; % Potencia parcial
	
	n++;
	PotAcum += Pn; % Soma das potencias
end
n--;

if n == 0
  n = 1; %0Hz n tem sentido!
end

N = n
n = [-N:1:N];


D0 = eval(D0);
Dn = eval(Dn);
Dn(N+1) = D0;


%% Sintese do sinal
aux  = 0;
for k = 0 : 2*N
  aux += Dn(k+1)*exp(j*n(k+1)*w*tempo);
end
gy = aux;



%% Resposta
% A banda B deve possuir N Hertz
resolucao = PotAcum / Pg;
disp(cstrcat("A banda B deve possuir ", num2str(N), "Hz"));