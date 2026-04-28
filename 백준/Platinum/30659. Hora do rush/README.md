# [Platinum III] Hora do rush - 30659

[문제 링크](https://www.acmicpc.net/problem/30659)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 11, 맞힌 사람: 10, 정답 비율: 32.258%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>Em toda cidade vemos que algumas vias são mais largas que outras. Isto é, algumas tem mais faixas de rolamento para veículos do que outras. Cada faixa de rolamento a mais numa via significa que mais carros podem ir de um extremo a outro desta via num mesmo intervalo de tempo.</p>

<p>&Eacute; comum termos a sensação de que, na hora do rush (aquele período em que a maior parte da população se desloca de casa para o trabalho ou vice-versa), nunca existem faixas de rolamento suficientes por conta do congestionamento que se forma.</p>

<p>Roberval, nosso herói trabalhador, trabalha na companhia de engenharia de tráfego da SBCity. Seu chefe está muito preocupado com as condições de trânsito da cidade, pois, com a instalação iminente de uma nova empresa na cidade, a Empresa de Reciclagem Insubstituível do Rio de Janeiro, ERI-RJ, o número de veículos circulando aumentará consideravelmente. Assim, ele quer fazer uma análise sobre a possibilidade de surgimento de novos engarrafamentos e Roberval, claro, foi eleito para descobrir se eles ocorrerão.</p>

<p>Sua idéia é bem simples: simular a situação do trânsito. Mais especificamente, o trânsito do local onde a ERI irá se instalar para alguns bairros de interesse, onde morarão os funcionários da empresa. A quantidade de funcionários morando em cada um desses bairros dependerá da facilidade de acesso a esses bairros. Portanto, você pode assumir que os funcionários são indiferentes ao bairro onde morarão.</p>

<p>Quando der a hora de saída do trabalho, todos os funcionário da ERI-RJ começarão a sair furiosamente em direção &#39;as suas casas num fluxo constante de veículos que levará algumas horas para cessar. Como o estacionamento da empresa é bem grande mas com apenas uma saída para cada rua, a quantidade de carros saindo da empresa por segundo é limitada.</p>

<p>Roberval fez uma modelagem simplificada da cidade e quer saber se existe capacidade para receber todos esses veículos sem criar gargalos nas ruas da cidade. Lembre-se que os motoristas de SBCity não se importam de percorrerem caminhos maiores desde que não encontrem gargalos pela frente nem de alterarem seus caminhos para que outros motoristas também possam chegar até suas casas sem trânsito.</p>

<p>Dado um mapa de ruas da SBCity e a quantidade de carros por segundo que cada via comporta, diga se é possível que os funcionários da empresa saiam do trabalho ao mesmo tempo sem enfrentar os desagradáveis congestionamentos do dia-a-dia.</p>

### 입력

<p>A entrada é composta por vários casos de teste.</p>

<p>A primeira linha de cada caso de teste contém três inteiros, p, n e m, (1 &le; p &le; 1000, 2 &le; n &le; 100, 1 &le; m &le; n(n &minus; 1)) representando a quantidade máxima de carros saindo da empresa por segundo, o número de interseções e o número de vias existentes na cidade, respectivamente. As interseções são numeradas de 1 a n, onde 1 representa o local onde a ERI-RJ irá se instalar. As interseções que não possuem vias levando a outras interseções representam os bairros de interesse.</p>

<p>Em seguida, seguem-se m linhas, cada uma contendo três inteiros u, v e w (1 &le; u, v &le; n, 1 &le; w &le; 10) representando uma via de mão única que leva da interseção u até a interseção v com capacidade para w veículos por segundo. Entre duas interseções existe, no máximo, uma única via em cada direção.</p>

<p>A entrada termina com p = n = m = 0. Este caso não deverá ser processado.</p>

### 출력

<p>Para cada caso de teste haverá uma linha na saída. Caso seja possível que todos os funcionários saiam ao mesmo tempo do trabalho sem encontrar gargalos até suas casas, imprima &ldquo;SEM GARGALOS&rdquo;. Caso contrário, imprima &ldquo;COM GARGALOS&rdquo;. Atenção, não utilize acentuação!</p>