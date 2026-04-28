# [Platinum III] A Pie for a Pie - 15457

[문제 링크](https://www.acmicpc.net/problem/15457)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 613, 정답: 162, 맞힌 사람: 119, 정답 비율: 32.603%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 트리를 사용한 집합과 맵

### 문제 설명

<p>Bessie and Elsie have each baked $N$ pies ($1 \leq N \leq 10^5$). Each of the $2N$ pies has a tastiness value according to Bessie and a (possibly different) tastiness value according to Elsie.</p>

<p>Bessie is thinking about giving one of her pies to Elsie. If Elsie receives a pie from Bessie, she will feel obligated to give one of her pies to Bessie. So as to not appear stingy nor flamboyant, Elsie will try to pick a pie that is at least as tasty (in Elsie&#39;s eyes) as the pie she received, but no more than $D$ units tastier ($0 \leq D \leq 10^9$). Such a pie may not exist, in which case Elsie will adopt a pseudonym and exile herself to Japan.</p>

<p>But if Elsie does give Bessie a pie in return, Bessie will similarly try to give Elsie a pie which is at least as tasty but no more than $D$ units tastier (in Bessie&#39;s eyes) as the pie Elsie just gave her. Should this be impossible, Bessie too will exile herself. Otherwise she will give her chosen pie to Elsie. This cycle will continue until one of the cows is exiled, an unhappy outcome, or one of the cows receives a pie which she accords a tastiness value of $0$, in which case the gift exchange will end and both cows will be happy.</p>

<p>Note that a pie may not be gifted twice, nor can either cow return a pie gifted to her.</p>

<p>For each of the $N$ pies Bessie could select as her initial gift to Elsie, determine the minimum number of pies that could possibly be gifted in the resulting exchange before the cows are happy.</p>

### 입력

<p>The first line contains the two integers $N$ and $D$.</p>

<p>The next $2N$ lines contain two space-separated integers each, respectively denoting the value of a particular pie according to Bessie, and the value of that pie according to Elsie.</p>

<p>The first $N$ lines refer to Bessie&#39;s pies, and the remaining $N$ lines refer to Elsie&#39;s pies.</p>

<p>It is guaranteed that all tastiness values are in the range $[0,10^9]$.</p>

### 출력

<p>There should be $N$ lines in the output. Line $i$ should contain a single integer: the minimum number of pies that could be gifted in a happy gift exchange started with Bessie&#39;s pie $i$. If no gift exchange starting with pie $i$ is happy, then line $i$ should contain the single integer $-1$ instead.</p>