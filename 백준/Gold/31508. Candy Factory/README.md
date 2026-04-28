# [Gold III] Candy Factory - 31508

[문제 링크](https://www.acmicpc.net/problem/31508)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 201, 정답: 55, 맞힌 사람: 47, 정답 비율: 33.099%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>The International Consortium of Popular Candies (ICPC) is hosting a prestigious candy festival for candy lovers worldwide. The consortium has asked $n$ candy factories to produce candies for the event. Each of the $n$ factories has produced some quantity of a unique type of candy.</p>

<p>Packs of candies will be given to the participants at the festival. A candy pack must consist of exactly $k$ candies of different types. Two candy packs may contain different sets of $k$ candies.</p>

<p>There may be unavoidably some leftover candies given the quantities of candies that the $n$ factories have already produced. The ICPC does not want to waste any of the candies produced, and is willing to create extra packs of candy to ensure this. The ICPC can order any of the $n$ factories to produce additional candies. What is the minimum quantity of additional candies that must be ordered, so that there will be no leftover candies after packing?</p>

### 입력

<p>The first line of input has two integers $n$ and $k$ ($1 \leq k \leq n \leq 5\,000$).</p>

<p>The next $n$ lines each have a single integer between $1$ and $10^9$. The integer on the $i^{\text{th}}$ line is the quantity of candies that the $i^{\text{th}}$ factory has produced.</p>

### 출력

<p>Output a single integer, the minimum quantity of additional candies that must be ordered.</p>