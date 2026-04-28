# [Gold V] Black Square - 3508

[문제 링크](https://www.acmicpc.net/problem/3508)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 107, 정답: 29, 맞힌 사람: 27, 정답 비율: 28.125%

### 분류

많은 조건 분기

### 문제 설명

<p>Inspired by Kazimir Malevich&rsquo;s masterpiece &ldquo;Black Square&rdquo;, Peter Palevich is planning to create his own version. He prepared a rectangular grid containing m &times; n white cells arranged in m rows of n cells each.</p>

<p>Peter painted some of the cells black, so that the black cells formed a square of size s &times; s cells. But later that day Peter became disappointed with his painting and destroyed it, cutting it to horizontal stripes of size 1 &times; n and burning them in the fireplace.</p>

<p>Next morning Peter changed his mind and decided to restore his painting. He tried to find its remains in the fireplace, and fortunately one of the stripes, namely the k-th from the top, survived the fire.</p>

<p>Now Peter wonders whether it is possible to restore the painting based on this stripe. Help him to do it.</p>

### 입력

<p>The first line of the input file contains four integer numbers: m, n, s and k (1 &le; m, n &le; 5000; 1 &le; s &le; min(m, n); 1 &le; k &le; m).</p>

<p>The second line contains n characters and describes the k-th line of the painting, &lsquo;.&rsquo; stands for a white cell, &lsquo;*&rsquo; stands for a black cell.</p>

### 출력

<p>If the initial painting can be uniquely restored, output &ldquo;Unique&rdquo;.</p>

<p>If there are several paintings that could have been painted by Peter, output &ldquo;Ambiguous&rdquo;.</p>

<p>If there are no possible paintings, output &ldquo;Impossible&rdquo;.</p>