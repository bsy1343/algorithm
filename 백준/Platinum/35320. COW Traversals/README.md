# [Platinum II] COW Traversals - 35320

[문제 링크](https://www.acmicpc.net/problem/35320)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 12, 맞힌 사람: 9, 정답 비율: 40.909%

### 분류

그래프 이론, 분리 집합, 오프라인 쿼리, 자료 구조, 함수형 그래프

### 문제 설명

<p>There are $N$ ($1\le N\le 2\cdot 10^5$) cows labeled $1\dots N$ on Farmer John's farm, where each cow lives in its own barn. Each cow $i$ has a best friend $a_i$ ($1\le a_i\le N$). Cows can be best friends with themselves, and multiple cows can have the same best friend. The cows love to party, so they have decided to throw a party for $M$ ($1\le M\le 2\cdot 10^5$) consecutive nights.</p>

<p>On night $i$, cow $c_i$ will decide to throw a party of type $t_i$ at its barn, where $t_i\in $<code>"COW"</code>. This party will exist for all future nights as well, until cow $c_i$ decides to throw a party of a different type.</p>

<p>Every night, each cow will attempt to go to a party. If a cow is not hosting a party, they will check their best friend's barn, and if there is no party there, will follow their best friend to wherever they are going (who might also follow their best friend and so on). It is possible that a cow might never find a party and will then give up for the night.</p>

<p>Compute for each night, the number of cows that end up at a party of type $C$, $O$, and $W$ respectively.</p>

### 입력

<p>The first line contains $N$, the number of cows.</p>

<p>The second line contains $a_1,\dots, a_N$, where $a_i$ is cow $i$'s best friend.</p>

<p>The third line contains $M$, the number of nights.</p>

<p>The next $M$ lines each contain an integer $c_i$ ($1\le c_i\le N$) and a character $v_i$, representing the cow that is throwing the party and the party type respectively.</p>

### 출력

<p>Output $M$ lines, where the $i$th consists of $3$ space-separated integers, the number of cows going to parties of type $C$, $O$, and $W$ on the $i$th night, respectively.</p>