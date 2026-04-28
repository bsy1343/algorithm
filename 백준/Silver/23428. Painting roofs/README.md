# [Silver V] Painting roofs - 23428

[문제 링크](https://www.acmicpc.net/problem/23428)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 80, 정답: 59, 맞힌 사람: 36, 정답 비율: 70.588%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>The King of Berland loves order in everything. For instance, the capital of Berland as seen on the map is a rectangular field of cells, that correspond to city quarters.&nbsp;&nbsp; &nbsp;&nbsp;</p>

<p>He recently has issued a decree stating that all roofs in a quarter must be painted the same color --- either red or blue. The capital of Berland is expecting a commission which will check the whole city for compliance, moving from one quarter to an adjacent by a side quarter. For a successful check, the commission must be able to reach any quarter from any other.</p>

<p>The Minister of Finance found out that the commission has a curious demand. They cannot move to an adjacent quarter if its roofs have the same color as roofs of the quarter they are currently in. Consequently, some quarters will have to repaint all their roofs to pass the check. The Minister of Finance wants to save money. He&#39;s asking you to find the minimal number of quarters where all roofs must be repainted.</p>

### 입력

<p>The first line of the input file contains two integers $m$ and $n$ --- the number of lines and columns in the city map ($1\le m, n\le 1000$). Next come $m$ lines consisting of $n$ symbols, with each symbol being either &#39;1&#39;, or &#39;2&#39;. The symbol &#39;1&#39; means that all roofs in the corresponding quarters are blue, and the symbol &#39;2&#39; means that the roofs are red.</p>

### 출력

<p>In the output file, print a single integer --- the minimal number of quarters where roofs must be repainted.</p>