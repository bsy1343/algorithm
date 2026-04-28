# [Platinum I] Duck, Duck, Geese - 25296

[문제 링크](https://www.acmicpc.net/problem/25296)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 75, 정답: 27, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 수학, 세그먼트 트리

### 문제 설명

<p>In the game &quot;Duck, Duck, Goose&quot;, all players but one sit on the floor and form a circle. The remaining player walks around the circle calling each player &quot;duck&quot; until they select one sitting player and, while touching their head, call them &quot;goose&quot; instead. At that point, the goose chases the selecting player and our interest in the game fades.</p>

<p>In the new game &quot;Duck, Duck, Geese&quot;, the walking player instead chooses a contiguous subset of at least two (but not all) sitting players to be &quot;geese&quot;! Furthermore, each sitting player is wearing a hat. Each hat is one of $\mathbf{C}$ possible colors, numbered $1$ through $\mathbf{C}$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9e87e8af-6b58-40aa-8017-072113e55246/-/preview/" /></p>

<p>For each color $i$, the quantity of selected geese wearing a hat of color $i$ must be either $0$ or between $\mathbf{A_i}$ and $\mathbf{B_i}$, inclusive.</p>

<p>Can you help count the number of choices that fulfill these requirements? Two choices are considered different if there is some player that is included in one choice but not the other.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case starts with a line containing two integers $\mathbf{N}$ and $\mathbf{C}$: the number of sitting players and hat colors, respectively. Then, $\mathbf{C}$ lines follow. The $i$-th of these lines contains two integers $\mathbf{A_i}$ and $\mathbf{B_i}$, as explained above. The last line of a test case contains $\mathbf{N}$ integers $\mathbf{P_1}, \mathbf{P_2}, \dots, \mathbf{P_N}$ representing that the $j$-th sitting player in clockwise order (starting from an arbitrary one) is wearing a hat of color $\mathbf{P_j}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of sets of at least $2$ and at most $\mathbf{N}-1$ contiguously sitting players that fulfill all the color requirements.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$2 \le \mathbf{C} \le \mathbf{N}$.</li>
	<li>$0 \le \mathbf{A_i} \le \mathbf{B_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$1 \le \mathbf{P_j} \le \mathbf{C}$, for all $j$.</li>
</ul>

### 힌트

<p>In Sample Case #1, the total number of players chosen as geese must be $2$. There are only three possible ways to select $2$ players. The following color configurations are possible: $[1, 1]$, $[1, 2]$, and $[2, 1]$. The first one has two players wearing hats of color $1$, so it is not valid, but the other two are valid. Therefore the answer is $2$.</p>

<p>Sample Case #2 is the one illustrated in the statement, with color $1$ being yellow and color $2$ being blue. The total number of players chosen as geese in this case must be between $2$ and $3$, because selecting $4$ geese would require at least one color to be out of bounds. For cases with $2$ geese, the only requirement is that we do not select $2$ geese both wearing hats of color $1$; all $5$ such selections are valid. If choosing $3$ geese, the options are $[1, 2, 1]$, $[2, 1, 2]$, $[1, 2, 2]$, $[2, 2, 1]$, or $[2, 1, 2]$. All but the first one are valid, adding another $4$ valid options, for a total of $9$.</p>

<p>In Sample Case #3, notice that there can be hat colors that nobody is wearing. In this case, since there is only $1$ player wearing hat color $3$ and $1$ is not in range, the only valid way is to pick $0$ players wearing that hat color.</p>