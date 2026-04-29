# [Gold III] Finding Treasure - 33089

[문제 링크](https://www.acmicpc.net/problem/33089)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

구현, 수학, 이분 탐색, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Morgan is designing a treasury for a treasure hunt event. The treasury can be represented as one dimensional grid with $N + 2$ cells, numbered from $0$ to $N + 1$. Each cell can be empty or contain a treasure. At first, cell $0$ and cell $N + 1$ contain a treasure, while the other cells are currently empty.</p>

<p>While experimenting with the treasury design, Morgan does $Q$ updates, numbered from $1$ to $Q$, to his treasury. In update $i$, he wants to change cell $A_i$. If cell $A_i$ is empty, he will put a treasure on cell $A_i$. If cell $A_i$ contains a treasure, he will remove the treasure from cell $A_i$ and the cell becomes empty. It is guaranteed that $1 ≤ A_i ≤ N$ for all $1 ≤ i ≤ Q$, which implies cell $0$ and cell $N + 1$ always contain a treasure.</p>

<p>After each change, Morgan wonders how difficult his treasure hunt is. He defines the <em>difficulty level</em> of standing on cell $x$ as the multiplication of two values:</p>

<ul>
	<li>the distance from $x$ to the closest treasure on cell $y ≤ x$, and</li>
	<li>the distance from $x$ to the closest treasure on cell $y ≥ x$.</li>
</ul>

<p>The distance between two cells can be calculated as the absolute difference between the cell numbers. Then, the <em>total difficulty level</em> of his treasure hunt is defined as the sum of difficulty level of standing on cell $x$ for all $0 ≤ x ≤ N + 1$.</p>

<p>Help Morgan to determine the total difficulty level of his treasure hunt after each update.</p>

### 입력

<p>Input begins with two integers $N$ $Q$ ($1 ≤ N ≤ 100\, 000$; $1 ≤ Q ≤ 100\, 000$) representing the size of the treasury room and the number of updates, respectively. Each of the next $Q$ lines contains an integer $A_i$ ($1 ≤ A_i ≤ N$) representing the cell that Morgan wants to change in update $i$.</p>

### 출력

<p>After each update that Morgan makes, output an integer in a single line representing the total difficulty level of his treasure hunts at that time.</p>