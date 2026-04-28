# [Silver I] Angry Cows (Silver) - 11973

[문제 링크](https://www.acmicpc.net/problem/11973)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 702, 정답: 435, 맞힌 사람: 362, 정답 비율: 61.670%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Bessie the cow has designed what she thinks will be the next big hit video game: &quot;Angry Cows&quot;. The premise, which she believes is completely original, is that the player shoots cows with a slingshot into a one-dimensional scene consisting of a set of hay bales located at various points on a number line. Each cow lands with sufficient force to detonate the hay bales in close proximity to her landing site. The goal is to use a set of cows to detonate all the hay bales.</p>

<p>There are \(N\) hay bales located at distinct integer positions \(x_1, x_2, \ldots, x_N\) on the number line. If a cow is launched with power \(R\) landing at position \(x\), this will cause&nbsp;a blast of &quot;radius \(R\)&quot;, destroying all hay bales within the range \(x-R \ldots x+R\).</p>

<p>A total of \(K\) cows are available to shoot, each with the same power \(R\). Please determine the minimum integer value of \(R\) such that it is possible to use the \(K\) cows to detonate every single hay bale in the scene.</p>

### 입력

<p>The first line of input contains \(N\) (\(1 \leq N \leq 50,000\)) and \(K\) (\(1 \leq K \leq 10\)). The remaining \(N\) lines all contain integers \(x_1 \ldots x_N\) (each in the range \(0 \ldots 1,000,000,000\)).</p>

### 출력

<p>Please output the minimum power \(R\) with which each cow must be launched in order to detonate all the hay bales.</p>