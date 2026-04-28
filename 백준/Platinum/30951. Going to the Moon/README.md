# [Platinum III] Going to the Moon - 30951

[문제 링크](https://www.acmicpc.net/problem/30951)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 252, 정답: 45, 맞힌 사람: 32, 정답 비율: 19.512%

### 분류

수학, 기하학, 삼분 탐색

### 문제 설명

<p>Alice and Bob are playing a game in the sand outside their mansion. A circle representing the Moon is drawn somewhere, and they each also pick a place to stand (inside, on the edge, or outside the Moon). The goal of the game is that one of the players runs to the other as fast as possible, while also touching the Moon during the run.</p>

<p>Given the positions of the Moon, Alice, and Bob, find the length of the shortest path that starts at one of the players, touches (or crosses) the edge or the interior of the Moon, and ends at the position of the other player.</p>

### 입력

<p>The first line contains an integer $T$, the number of test cases. It&#39;s followed by $T$ lines, each containing 7 space-separated integers $x_A$, $y_A$, $x_B$, $y_B$, $x_C$, $y_C$, $r$, representing coordinates of Alice, $A = (x_A, y_A)$, Bob, $B = (x_B, y_B)$, the center of the circle, $C = (x_C, y_C)$, and its radius $r$.</p>

### 출력

<p>For each test case output a single decimal number representing the length of the shortest path from $A$ to $B$ that also touches at least one point inside or on the edge of a circle with the center $C$ and radius $r$. The solution will be considered correct if the relative or absolute error compared to the official solution is within $10^{-6}$.</p>

### 제한

<ul>
	<li>$1 \leq T \leq 10^3$</li>
	<li>$-10^3 \leq x_A, y_A, x_B, y_B, x_C, y_C \leq 10^3$</li>
	<li>$0 \leq r \leq 10^3$</li>
</ul>

### 힌트

<p>The solution for the first test case is shown in the picture.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30951.%E2%80%85Going%E2%80%85to%E2%80%85the%E2%80%85Moon/e8efc659.png" data-original-src="https://upload.acmicpc.net/1db14e9f-deb0-4558-95ef-e59622217d38/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>