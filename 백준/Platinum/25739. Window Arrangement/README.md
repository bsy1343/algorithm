# [Platinum I] Window Arrangement - 25739

[문제 링크](https://www.acmicpc.net/problem/25739)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 113, 정답: 42, 맞힌 사람: 35, 정답 비율: 44.872%

### 분류

최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p>KAIST is running out of budget &mdash; they need some money! They thought the dormitories were way too luxurious compared to the other buildings of KAIST; they planned to sell all the dormitory buildings and build a new completely non-aesthetic one.</p>

<p>The new dormitory will be of a grid-shape &mdash; it can&rsquo;t be more boring than this &mdash; of size $N\times M$, each cell being the room for the students. We are going to add some windows, because we want students to get some sunlight during the daytime!</p>

<p>We plan to have exactly $w_{i,j}$ windows for the room $(i,j)$. A window can be built on the side of an edge of a grid, and at most one window can be built on each side of an edge. A window is one-sided: a window on the opposite side of an edge does not count as a window of the room.</p>

<p>Unfortunately, students will experience huge discomfort when their privacy is watched by someone else through the window. <strong>Total discomfort</strong> is the number of set of students $\{a,b\}$, such that $a$ and $b$ can see each other&rsquo;s privacy through the window.</p>

<p>Precisely, if an edge has windows on both sides, total discomfort increases by the product of the number of people living in two houses sharing the window.</p>

<p>You&rsquo;re given $w_{i,j}$, and $p_{i,j}$, the number of people living in the room $(i,j)$. Your task is to find the minimum total discomfort that can be achieved by arranging the windows properly.</p>

### 입력

<p>The first line contains the size of the grid, $N$ and $M$.</p>

<p>Following $N$ lines contains $M$ space-separated integers $p_{i,j}$.</p>

<p>Following $N$ lines contains $M$ space-separated integers $w_{i,j}$.</p>

### 출력

<p>Output the minimum total discomfort.</p>

### 제한

<ul>
	<li>$1\le N\le 50$</li>
	<li>$1\le M\le 50$</li>
	<li>$1\le p_{i,j}\le 1\, 000$ ($1\le i\le N,1\le j\le M$)</li>
	<li>$0\le w_{i,j}\le 4$ ($1\le i\le N,1\le j\le M$)</li>
</ul>