# [Platinum III] 거북이 대결 - 34663

[문제 링크](https://www.acmicpc.net/problem/34663)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 25, 맞힌 사람: 21, 정답 비율: 52.500%

### 분류

게임 이론, 많은 조건 분기

### 문제 설명

<p>$2 \times N$ 크기의 격자가 있다. 격자의 각 칸은 장애물이 있거나 비어 있다. <span style="color:#8e44ad;"><strong>카오린</strong></span>과 <span style="color:#16a085;"><strong>터틀</strong></span>이 격자 위에서 다음 규칙에 따라 게임을 한다.</p>

<ol>
<li>시작할 때 빈칸 중 하나를 골라 말을 배치한다.</li>
<li><strong><span style="color:#8e44ad;">카오린</span></strong>부터 번갈아 가며 다음과 같은 움직임을 한다.
<ul>
<li>상하좌우 중 한 방향을 골라 말을 그 방향으로 원하는 만큼 이동시킨다. 단, 장애물이 있는 칸 또는 이전에 한 번이라도 말이 지나간 칸(말이 멈춘 칸 포함)을 지나갈 순 없다.</li>
</ul>
</li>
<li>더이상 움직일 수 없는 쪽이 지게된다.</li>
</ol>

<p>이제 다음 쿼리를 처리해 보자.</p>

<ul>
<li>$1$ $y$ $x$: 격자의 $y$행 $x$열의 상태를 반전시킨다. 즉, 장애물이 있는 칸이라면 빈칸으로 만들고 빈칸이라면 장애물이 있는 칸으로 만든다.</li>
<li>$2$ $y$ $x$: 격자의 $y$행 $x$열에서 말을 배치해 게임을 시작할 때 어느 쪽이 이길지 출력한다. 이 때 둘 모두 이기기 위한 최선의 전략을 사용한다고 가정한다.</li>
</ul>

### 입력

<p>첫째 줄에 격자의 크기를 나타내는 정수 $N$과 쿼리의 개수를 나타내는 정수 $Q$가 공백으로 구분되어 주어진다. $(1\leq N,Q \leq 300\ 000)$</p>

<p>둘째 줄부터 $2$개의 줄에 걸쳐 길이가 $N$인 문자열이 한 줄에 하나씩 주어진다. 문자열은 <code><span style="color:#e74c3c;">.</span></code> 또는 <code><span style="color:#e74c3c;">#</span></code>로만 이뤄져 있으며 $i$번째 줄 $j$번째 문자가 <code><span style="color:#e74c3c;">.</span></code>인 경우 $i$행 $j$열에 있는 칸이 비어 있음을, <span style="color:#e74c3c;"><code>#</code></span>이라면 장애물이 있음을 나타낸다.</p>

<p>넷째 줄부터 $Q$개의 줄에 걸쳐 $op$ $y$ $x$의 형식으로 쿼리가 주어진다. $(op\in \{1,2\}; 1\leq y \leq 2; 1 \leq x \leq N)$</p>

<p>$2$번 쿼리는 하나 이상 주어지며, $2$번 쿼리가 주어졌을 때 격자의 $y$행 $x$열은 항상 빈칸임이 보장된다.</p>

### 출력

<p>$2$번 쿼리가 주어질 때마다 <strong><span style="color:#8e44ad;">카오린</span></strong>이 이긴다면 <span style="color:#e74c3c;"><code>Kaorin</code></span>, <strong><span style="color:#16a085;">터틀</span></strong>이 이긴다면 <code><span style="color:#e74c3c;">Turtle</span></code>을 출력한다.</p>