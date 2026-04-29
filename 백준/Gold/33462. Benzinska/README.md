# [Gold II] Benzinska - 33462

[문제 링크](https://www.acmicpc.net/problem/33462)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

그리디 알고리즘, 우선순위 큐, 자료 구조, 정렬

### 문제 설명

<p>The camp in Čakovec has already started, but Mr. Malnar is still visiting Zagreb’s restaurants. Wanting to burn the calories he consumed, he decided to cycle to Čakovec.</p>

<p>Mr. Malnar starts his journey from Zagreb ($x = 0$) with an initial energy of $D$ and wants to reach Čakovec, which is $X$ meters away from Zagreb ($x = X$). Each meter of the journey requires one unit of energy. To avoid passing out, his energy must not become negative at any point during the trip.</p>

<p>There are $n$ restaurants along the way, with the $i$-th restaurant located at the $x_i$-th meter from the starting point. Multiple restaurants can be located at the same position. If Mr. Malnar decides to dine at the $i$-th restaurant, his energy increases by $y_i$. He may not eat at the same restaurant multiple times. Help him determine the minimum number of restaurants he must dine at to safely reach Čakovec.</p>

### 입력

<p>In the first line of input, there are three integers $n$, $D$, and $X$ ($1 ≤ n ≤ 2 \cdot 10^5$, $1 ≤ D, X ≤ 10^9$), representing the number of restaurants, the initial energy, and the distance between the cities.</p>

<p>In the second line of input, there are $n$ integers $x_i$ ($1 ≤ x_i &lt; X$), representing the positions of the restaurants.</p>

<p>In the third line of input, there are $n$ integers $y_i$ ($1 ≤ y_i ≤ 10^9 $), representing the energy Mr. Malnar gains by dining at each respective restaurant.</p>

### 출력

<p>In a single line of output, print the minimum number of restaurants Mr. Malnar must dine at to safely reach Čakovec. If it is not possible to reach Čakovec, print '<code>-1</code>' (without quotes).</p>

### 힌트

<p>Clarification of the first example:</p>

<p>At $x = 3$, Mr. Malnar will have $2$ energy units left. At the first restaurant, he will dine, and his energy will increase to $2 + 3 = 5$. At $x = 4$, he will have $4$ energy units left. At the second restaurant, he will dine, and his energy will increase to $4 + 2 = 6$. At $x = 8$, he will have $2$ energy units left. At the fourth restaurant, he will dine, and his energy will increase to $2 + 2 = 4$. In total, he dined at three restaurants.</p>