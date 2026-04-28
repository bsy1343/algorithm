# [Platinum I] Physics - 31389

[문제 링크](https://www.acmicpc.net/problem/31389)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 2, 맞힌 사람: 2, 정답 비율: 14.286%

### 분류

자료 구조, 기하학, 집합과 맵, 해 구성하기, 두 포인터, 중간에서 만나기, 물리학

### 문제 설명

<p>Android Vasya reads the book &quot;Amusing physics for the smallest children&quot;. Recently he has read a chapter about uniformly accelerated motion and decided to set up some experiments. For this purpose, Vasya made a mechanical turtle, that could be provided with a different acceleration by a remote control.</p>

<p>Vasya launched his turtle into the lobby, changing its acceleration several times. After plotting a graph of a piecewise linear velocity function $v_1(t)$ he repeated the experiment. Then he has got a piecewise linear continuous function $v_2(t)$ and plotted its graph too.</p>

<p>Before the third try Vasya has realized that it was a bad idea to plot $v_1(t)$ and $v_2(t)$ on the same graph. Because of this, it was not clear which segments belong to which function. Help Vasya to restore graphs, keeping in mind that both experiments lasted the same time $T$ and both times the turtle covered the same distance, which is the length of the lobby.</p>

### 입력

<p>The first line contains an integer $T$ that is the duration of each of the experiments ($2 \leq T \leq 10^6$). Then the description of functions $h(t) = \max(v_1(t), v_2(t))$ and $g(t) = \min(v_1(t), v_2(t))$ follows. The second line contains an integer $n$ that is the number of kink points of the function $h(t)$. The next $n$ lines contain pairs of integers $t_i$ and $h(t_i)$ that are kink points of the function $h(t)$ ($0 = t_1 &lt; t_2 &lt; \dots &lt; t_{n-1} &lt; t_n = T$; $0 \leq h(t_i) \leq 10^6$). Any three consecutive kink points don&#39;t lie on the same straight line. In the following lines the function $g(t)$ is described in the same format. For any $x \in [0; T]$ $g(t) \leq h(t)$ and he equality $g(t) = h(t)$ holds for no more than 30 points (in particular, the graphs don&#39;t have common segments). The number of kink points of each function is from $2$ to $100\,000$.</p>

### 출력

<p>Output functions $v_1(t)$ and $v_2(t)$ in a similar format as $h(t)$ and $g(t)$, including the fact that no three consecutive kink points lie on the same straight line. All numbers in the output should be integers. If this problem has several solutions, output any of them. It&#39;s guaranteed that at least one solution exists.</p>