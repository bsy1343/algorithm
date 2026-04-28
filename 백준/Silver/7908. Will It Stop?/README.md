# [Silver III] Will It Stop? - 7908

[문제 링크](https://www.acmicpc.net/problem/7908)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 64 MB

### 통계

제출: 185, 정답: 118, 맞힌 사람: 93, 정답 비율: 64.583%

### 분류

수학

### 문제 설명

<p>Byteasar was wandering around the library of the University of Warsaw and at one of its facades he noticed a piece of a program with an inscription &ldquo;Will it stop?&rdquo;. The question seemed interesting, so Byteasar tried to tackle it after returning home. Unfortunately, when he was writing down the piece of code he made a mistake and noted:</p>

<pre>
while n &gt; 1 do
  if n mod 2 = 0 then
    n := n / 2
  else
    n := 3 &middot; n + 3</pre>

<p>Byteasar is now trying to figure out, for which initial values of the variable n the program he wrote down stops. We assume that the variable n has an unbounded size, i.e., it may attain arbitrarily large values.</p>

### 입력

<p>The first and only line of input contains one integer n (2 &le; n &le; 10<sup>14</sup>).</p>

### 출력

<p>In the first and only line of output you should write a single word TAK (i.e., yes in Polish), if the program stops for the given value of n, or NIE (no in Polish) otherwise.</p>