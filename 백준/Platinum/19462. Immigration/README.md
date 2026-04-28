# [Platinum I] Immigration - 19462

[문제 링크](https://www.acmicpc.net/problem/19462)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 15, 맞힌 사람: 14, 정답 비율: 40.000%

### 분류

수학, 기하학, 미적분학, 물리학

### 문제 설명

<p>Peter the Pig is riding a tractor, starting at the origin at moment $0$ and moving along the $x$-axis with speed $u$. Since the road is infinite and not interesting enough, Peter is looking for entertainment. At moment $t_0$ he notices some object at point $(x_0, y_0)$ moving with velocity $v_0 = (v_{0x}, v_{0y})$. So, Peter starts to rotate his head always keeping his eyes fixed at the object. From time to time ($n$ times in total), the object changes its velocity. Namely, at moment $t_i$ the object instantly changes its velocity to $v_i = (v_{ix}, v_{iy})$ for $i = 1, 2, \ldots, n$. It is guaranteed that the object never collides with Peter.</p>

<p>Define $f(t)$ as the directed angle (measured in radians) between $x$-axis and the direction from Peter to the object at moment $t$. We allow $f(t)$ to differ from the actual angle by a multiple of $2 \pi$ as long as the function $f(t)$ is continuous. Define the <em>angular speed</em> of Peter&#39;s head as the derivative $f&#39;(t)$. You need to find the maximum of $|f&#39;(t)|$ from the moment $t_0$ to the infinity. In other words, you need to find the maximum of the absolute value of angular speed. It is guaranteed that the answer is finite.</p>

### 입력

<p>The first line contains four integers $u$, $x_0$, $y_0$, $n$ ($1 \le u \le 100$, $|x_0|, |y_0| \le 10^8$, $0 \le n \le 10^5$) --- the speed of Peter&#39;s tractor, the coordinates of the object when first observed by Peter, and the number of times the object changes its velocity.</p>

<p>Each of the next $(n + 1)$ lines contains three space-separated integers $t_i$, $v_{ix}$, $v_{iy}$ ($0 \le t_i \le 10^6$, $|v_{ix}|, |v_{iy}| \le 100$). It is guaranteed that $t_0 &lt; t_1 &lt; \ldots &lt; t_n$. Note that it is possible that $(v_{ix}, v_{iy}) = (0, 0)$. Also note that movement of the object after moment $t_n$ is infinite.</p>

### 출력

<p>In the only line print one real number with absolute or relative error not exceeding $10^{-6}$ --- the maximum absolute value of the angular speed of Peter&#39;s head during his observation of the object.</p>