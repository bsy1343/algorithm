# [Silver II] Inazuma Cube Device - 35371

[문제 링크](https://www.acmicpc.net/problem/35371)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>E.T. the gray alien loves playing Genshin Impact but he is not very good at the game. He is currently trying to solve a cube device puzzle in the Inazuma region but has been stuck for several hours. He is now requesting your help to solve it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35371.%E2%80%85Inazuma%E2%80%85Cube%E2%80%85Device/558c41bc.png" data-original-src="https://boja.mercury.kr/assets/problem/35371-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 122px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: (a) A cube device puzzle. (b) A player striking a cube device.</p>

<p>There are $n$ cubes scattered across the puzzle ground, numbered from $1$ to $n$. Each cube has a flower with $k$ petals. At any time, a cube can have anywhere from $1$ to $k$ of its petals lit. When the player strikes a cube, the number of lit petals increases by one – unless all $k$ petals are already lit, in which case the cube resets to having only one lit petal. The puzzle is solved when every cube has all $k$ of its petals lit.</p>

<p>Some pairs of cubes have a one-directional chain reaction from one cube to another: striking one cube also increases the number of lit petals on the other cube, but not vice versa. For any such chain reaction from cube $a$ to cube $b$ (where striking cube $a$ increases the number of lit petals on both cube $a$ and cube $b$), the cube numbers must satisfy $a &lt; b$, meaning that all chain reactions go from a smaller-numbered cube to a larger-numbered cube. Note that if there is a chain reaction from cube $a$ to cube $b$, and another chain reaction from cube $b$ to cube $c$, striking cube $a$ does not affect cube $c$ (unless there is another chain reaction from cube $a$ to cube $c$ directly).</p>

<p>E.T. would like to know the minimum number of times he must strike the cubes to solve the puzzle.</p>

### 입력

<p>The first line of input contains three integers $n$, $m$, and $k$ ($1 \le n \le 2 \cdot 10^5$, $0 \le m \le 5 \cdot 10^5$, $m \le \frac{n(n-1)}{2}$, $1 \le k \le 10^9$), the number of cubes, the number of directed relations, and the number of petals per cube.</p>

<p>The next $n$ lines each contain a single integer. The integer on the $i$th line is the initial number of lit petals on cube $i$. All those integers are between $1$ and $k$, inclusive.</p>

<p>Each of the next $m$ lines contains two integers $a$ and $b$ ($1 \le a &lt; b \le n$), describing a one-directional chain reaction from cube $a$ to cube $b$. All chain reactions are unique.</p>

### 출력

<p>Output a single integer, the minimum number of times E.T. the alien must strike the cubes, or $-1$ if this puzzle is impossible to solve.</p>