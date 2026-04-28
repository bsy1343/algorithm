# [Platinum III] Cakes - 8332

[문제 링크](https://www.acmicpc.net/problem/8332)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 9, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

그래프 이론

### 문제 설명

<p>Masters of baking from all over the country have come to this year&#39;s Bytean confectioners&#39; convention. During the convention there will be a competition for the best cake baked by a team of three confectioners. Each three confectioners may submit at most one cake. However, each contestant can be a member of multiple teams. Unfortunately, some confectioners do not like each other and would not like to bake cakes together.</p>

<p>For each contestant it is known how many decagrams of flour she requires to bake a cake. A three-person team needs as much flour as its member with highest requirements. How much flour will be used during the competition, provided that each three confectioners that all like each other will bake exactly one cake?</p>

### 입력

<p>The first line of the standard input contains two integers n&nbsp;and m&nbsp;(1 &le; n &le; 100,000, 1 &le; m &le; 250,000) separated by a single space and denoting the number of confectioners at the convention and the number of pairs of them that like each other. The participants of the convention are numbered from 1&nbsp;to n. The second line contains n&nbsp;integers p<sub>i</sub>&nbsp;(1 &le; p<sub>i</sub> &le; 1,000,000) separated by single spaces and denoting the requirements of respective confectioners for flour (in decagrams). The following&nbsp;<img src="https://main.mimuw.edu.pl/en/images/PA2009/cia-en-tex.10.png" />&nbsp;lines contain data about pairs of contestants that like each other. Each of these lines contains two integers a<sub>i</sub> and b<sub>i</sub>&nbsp;(1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>) separated by a single space. They denote that confectioners a<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;like each other. We assume that all pairs of participants of the convention apart from the ones listed in the input would not like to bake cakes together. Each pair of confectioners appears at most once in the input.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer - the quantity of flour that will be used by all teams in total, in decagrams.</p>

### 힌트

<p>The following three-person teams: (1, 2, 3), (1, 2, 5)&nbsp;and (1, 3, 4)&nbsp;require 5, 5 and 4 decagrams of flour to bake the cakes. In total 5 + 5 + 4 = 14&nbsp;decagrams of flour are required.</p>