# [Platinum IV] Enemy Division - 5020

[문제 링크](https://www.acmicpc.net/problem/5020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 17, 맞힌 사람: 10, 정답 비율: 27.027%

### 분류

해 구성하기, 그리디 알고리즘

### 문제 설명

<p>Captain Keram has to make a difficult decision. It is year 2147 and there is a big war in the world. His soldiers have been together since the war started, two years ago, and some of them have become enemies. Luckily, each soldier has at most 3 enemies.</p>

<p>They need to attack another country soon, and Keram is worried that soldiers who are enemies might not cooperate well during the battle. He has decided to divide them into groups such that every soldier has at most one enemy in his group. He also wants to make it simple, so he wants to use as few groups as possible. Can you divide the soldiers into groups for him?</p>

### 입력

<p>On the first line there are two integers n and m, 2 &le; n &le; 100 000, 0 &le; m &le; 3n/2, where n is the number of soldiers and m is the number of enemy pairs. Then follow m lines, each containing two space separated integers a<sub>i</sub>, b<sub>i</sub>, denoting that soldiers a<sub>i</sub> and b<sub>i</sub> are enemies, where 1 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; n. You can assume that all soldiers have at most 3 enemies.</p>

### 출력

<p>The first line of output contains the minimal number of groups of soldiers k. Each of the next k lines contains a space separated list of a soldiers in a unique group.</p>