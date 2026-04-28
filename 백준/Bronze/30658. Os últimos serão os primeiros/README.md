# [Bronze IV] Os últimos serão os primeiros - 30658

[문제 링크](https://www.acmicpc.net/problem/30658)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 977, 정답: 647, 맞힌 사람: 570, 정답 비율: 67.938%

### 분류

구현

### 문제 설명

<p>Eric Ruiz Irrigado, o famoso Erí, é conhecido entre seus amigos por querer fazer previsões. Em &acute; todo tipo de competição ou evento esportivo ele sempre tenta adivinhar os vencedores, os perdedores, artilheiros e coisas similares. Apesar das brincadeiras e deboches de seus amigos, Erí nunca desistiu e sempre busca padrões onde os outros vêem apenas coincidências.</p>

<p>Acompanhando os times da Maratona de Programação, Erí percebeu que a colocação dos times de seu estado na primeira fase sempre se invertiam na segunda fase, ainda que outros times de outras regiões do país estivessem entre eles. Assim, se o time da Uni1 ficar na frente da Uni2 na primeira fase, Erí imagina que o time da Uni2 ficará na frente do time da Uni1 na segunda fase.</p>

<p>Para validar sua hipótese, ele quer desenvolver um programa que, dada uma lista de colocação dos times na primeira fase, mostre qual será a posição relativa destes mesmos times na segunda fase.</p>

### 입력

<p>A entrada é composta por diferentes casos de teste. A primeira linha de cada caso de teste contém n &le; 100, o número de times do estado de Erí. As n linhas seguintes conterão n inteiros distintos entre 1 e n, inclusive, um por linha, cada inteiro representando um time.</p>

<p>A entrada termina com n = 0. Essa linha não deve ser processada.</p>

### 출력

<p>Para cada caso de teste, seu programa deve imprimir a posição relativa de cada um dos times de acordo com a previsão de Erí, com um número por linha. Após a lista de times, deve ser impressa uma linha contendo um único &ldquo;0&rdquo;. Veja o exemplo abaixo.</p>