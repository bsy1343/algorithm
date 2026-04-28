# [Gold V] GMO - 9665

[문제 링크](https://www.acmicpc.net/problem/9665)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 176, 정답: 80, 맞힌 사람: 71, 정답 비율: 49.650%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>A multinational company is asking you to help them genetically modify an apple. In order for the apples to grow faster, to get more of them, to make them bigger and make them look nicer and more simmetrical, the apple&#39;s DNA requires an insertion of a certain swine gene.&nbsp;</p>

<p>The apple&#39;s DNA is represented by a series of characters from the set {A, C, G, T}. The required swine gene is also comprised of charaters from this set. The apple&#39;s DNA should be injected with some characters into some places, so that the resulting sequence contains a swine gene somewhere (in successive locations). To make things a bit more complicated, inserting each of the characters A, C, G, T has its own cost.</p>

<p>Help this multinational company in achieving their goal with the lowest possible total cost. As a reward, you get a ton of their apples.&nbsp;</p>

### 입력

<p>The first line of input contains a sequence of N (1 &le; N &le; 10 000) characters which represent the apple&#39;s DNA.&nbsp;</p>

<p>The second line of input contains a sequence of M (1 &le; M &le; 5 000) characters which represent the swine gene that we want to insert into the apple&#39;s DNA.&nbsp;</p>

<p>Both the sequences are comprised only of characters from the set {A, C, G, T}.&nbsp;</p>

<p>The third line of input contains four integers from the interval [0, 1000]: the cost of inserting one character A, C, G, T, in that order.&nbsp;</p>

### 출력

<p>The first and only line of output must contains the minimal total cost.&nbsp;</p>

### 힌트

<p>Clarification of the first example: Some of the possible solutions are GCATA and GTCAT (the inserted characters are bolded), the first solution costs 7 + 5, the second 7 + 3.</p>