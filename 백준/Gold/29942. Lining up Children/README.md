# [Gold IV] Lining up Children - 29942

[문제 링크](https://www.acmicpc.net/problem/29942)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 29, 맞힌 사람: 23, 정답 비율: 26.437%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>After a field trip, the teacher needs to line up all children in order to count them and verify that none are missing. Anyone who has ever had to deal with children knows how difficult this can be. A child absolutely <em>must</em> stand next to each of their friends, otherwise a riot will soon occur.</p>

<p>Find one possible way to order the children such that all children are satisfied.</p>

### 입력

<p>The first line of input contains two space-separated integers $N$ and $M$---the number of children and the number of pairs who are friends ($1 \le N \le 10^5$, $1 \le M \le 3 \cdot 10^5$).</p>

<p>The next line contains $N$ space-separated strings---the names of the children. Names are at most 10 symbols long and consist of only uppercase and lowercase Latin letters and dashes. It is guaranteed that each child has a name different from the rest.</p>

<p>Then follow $M$ lines, each containing two space-separated names, denoting a pair of friends.</p>

### 출력

<p>The first line of output should contain <code>SAAB</code> if a solution is possible, or <code>EI SAA</code>, if it is not. If a solution is possible, output on the second line the list of names in an order that would satisfy all children.</p>