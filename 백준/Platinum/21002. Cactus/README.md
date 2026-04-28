# [Platinum II] Cactus - 21002

[문제 링크](https://www.acmicpc.net/problem/21002)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 32, 맞힌 사람: 26, 정답 비율: 49.057%

### 분류

선인장, 조합론, 그래프 이론, 수학

### 문제 설명

<p>Let me be upfront about this: things are not going well. What was supposed to be a relaxing evening with friends has taken a turn for the worse: you got assaulted by a walking advertisement of cheap cologne, and your Priceless Argentinian Cactus -- the only thing you hold dear -- was thrown out of the window.</p>

<p>Right after the deed -- or, shall I say, as soon as was physically possible -- you ran down the stairs to assess losses. And there it was, your priceless cactus, alive! With a few scratches here and there, but alive nonetheless. How did this happen? Did it land on something soft? Overwhelmed with joy, you decide not to seek answers. Did I say things are not going well? Scratch that, everything is great -- and it&#39;s time to celebrate! Of course, at the heart of this celebration will be your green stinging friend.</p>

<p>Those less acquainted with botany may now appreciate a refresher: a cactus is a connected graph, where each vertex lies on at most one cycle. To add to the festive mood, you decide to color every vertex of your cactus with one of $k$ colors. You would like to give yourself lots of freedom here, but you do want to adhere to the golden rule of cactus coloring: no two adjacent vertices should be assigned the same color.</p>

<p>One coloring seems not enough, so you decide that after the colors fade, you will recolor the cactus again and again, using a different coloring each time. But how long will you be able to keep this going? Given the description of your cactus and the number $k$, count the number of correct $k$-colorings of the cactus&#39; vertices. Since the answer may be very large, it&#39;s enough if you compute its remainder modulo $10^9 + 7$.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 50\,000$). The descriptions of the test cases follow.</p>

<p>The first line of a test case contains three integers $n$, $m$ and $k$ ($1 \leq n \leq 300\,000$, $0 \leq m \leq 400\,000$, $2 \leq k \leq 10^9$) -- the number of vertices and edges of your cactus, and the number of colors.</p>

<p>The next $m$ lines contain two integers $u_i$, $v_i$ ($1 \leq u_i \neq v_i \leq n$) each, corresponding to the cactus edges. It is guaranteed that the given graph is a cactus and that every two vertices are connected by at most one edge.</p>

<p>The total number of vertices and edges in all test cases does not exceed $3 \cdot 10^6$ and $4 \cdot 10^6$, respectively.</p>

### 출력

<p>For each test case output a single integer: the number of proper colorings of the vertices of the cactus with $k$ colors, taken modulo $10^9 + 7$.</p>