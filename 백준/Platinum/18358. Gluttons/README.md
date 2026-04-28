# [Platinum III] Gluttons - 18358

[문제 링크](https://www.acmicpc.net/problem/18358)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 36, 맞힌 사람: 22, 정답 비율: 37.288%

### 분류

해 구성하기, 다이나믹 프로그래밍

### 문제 설명

<p>At the gala dinner at the end of this year&rsquo;s Byteotian Sweets Amateurs Get-Together, n gluttons sat at a round-table. Soon afterwards, n cakes were set on the table. The cakes differ in size, appearance, and flavor, but for the gourmands it is the caloric value (c<sub>i</sub> for the i-th cake) that is of utmost importance. The table has been set in such a way that there is a cake between every pair of adjacent gluttons. Each glutton can choose one of the two cakes next to them. A cake claimed by only one glutton is theirs alone. However, if a cake is claimed by two gluttons, they have to share it equally.</p>

<p>Each glutton wants to maximize the caloric value they receive from their chosen cake, which is halved if they only half the cake. A glutton would be dissatisfied, were they to choose wrong, i.e., if they would have more calories, had they chosen otherwise (assuming others do not change their decisions). Help the gluttons make their choices so that none of them is dissatisfied.</p>

### 입력

<p>The first line of the standard input contains a single integer, n (2 &le; n &le; 1 000 000), that specifies the number of gluttons (and cakes). The second line contains a sequence of n integers, c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>n</sub> (1 &le; c<sub>i</sub> &le; 1 000 000 000), separated by single spaces; the caloric value of the i-th cake is given by c<sub>i</sub>. We assume that the i-th glutton (for 1 &le; i &lt; n) can choose either the i-th or the (i + 1)-th cake, whereas the n-th glutton can choose either the n-th or the first one.</p>

<p>There is a set of tests worth 50% of the total score, in which n &le; 1000 holds, and a subset of these worth 20% of the total score, in which n &le; 20 holds.</p>

### 출력

<p>If the gluttons cannot choose their cakes so that each and every one of them is satisfied, then the first and only line of the standard output should hold the word NIE (Polish for no). Otherwise, the first and only line of the standard output should hold a sequence of n integers separated by single spaces; the i-th of these integers should specify the number of the cake to be chosen by the i-th glutton. If there is more than one correct answer, your program can pick one of them arbitrarily.</p>