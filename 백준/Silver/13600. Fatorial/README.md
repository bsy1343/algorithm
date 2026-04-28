# [Silver II] Fatorial - 13600

[문제 링크](https://www.acmicpc.net/problem/13600)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 165, 정답: 124, 맞힌 사람: 105, 정답 비율: 75.000%

### 분류

수학, 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>O fatorial de um n&uacute;mero inteiro positivo N, denotado por N!, &eacute; definido como o produto dos inteiros positivos menores do que ou iguais a N. Por exemplo 4! = 4 &times; 3 &times; 2 &times; 1 = 24.</p>

<p>Dado um inteiro positivo N, voc&ecirc; deve escrever um programa para determinar o menor n&uacute;mero k tal que N = a<sub>1</sub>! + a<sub>2</sub>! + ... + a<sub>k</sub>!, onde cada a<sub>i</sub>, para 1 &le; i &le; k, &eacute; um n&uacute;mero inteiro positivo.</p>

<p>Por exemplo, para N = 10 a resposta &eacute; 3, pois &eacute; poss&iacute;vel escrever N como a soma de tr&ecirc;s n&uacute;meros fatoriais: 10 = 3! + 2! + 2!. Para N = 25 a resposta &eacute; 2, pois &eacute; poss&iacute;vel escrever N como a soma de dois n&uacute;meros fatoriais: 25 = 4! + 1!.</p>

### 입력

<p>A entrada consiste de uma &uacute;nica linha que cont&eacute;m um inteiro N (1 &le; N &le; 10<sup>5</sup>).</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando a menor quantidade de n&uacute;meros fatoriais cuja soma &eacute; igual ao valor de N.</p>