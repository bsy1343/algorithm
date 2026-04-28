# [Gold IV] Joy of Flight - 10381

[문제 링크](https://www.acmicpc.net/problem/10381)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 75, 정답: 22, 맞힌 사람: 22, 정답 비율: 33.333%

### 분류

수학, 기하학, 해 구성하기

### 문제 설명

<p>Jacob likes to play with his radio-controlled aircraft. The weather today is pretty windy and Jacob has to plan flight carefully. He has a weather forecast &mdash; the speed and direction of the wind for every second of the planned flight.</p>

<p>The plane may have airspeed up to \(v_{max}\) units per second in any direction. The wind blows away plane in the following way: if airspeed speed of the plane is (\(v_x\), \(v_y\)) and the wind speed is (\(w_x\), \(w_y\)), the plane moves by (\(v_x + w_x\), \(v_y + w_y\)) each second.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/jof.png" style="height:135px; width:486px" /></p>

<p>Jacob has a fuel for exactly \(k\) seconds, and he wants to learn, whether the plane is able to fly from start to finish in this time. If it is possible he needs to know the flight plan: the position of the plane after every second of flight.</p>

### 입력

<p>The first line of the input file contains four integers \(S_x\), \(S_y\), \(F_x\), \(F_y\) &mdash; coordinates of start and finish (&minus;10 000 &le; \(S_x\), \(S_y\), \(F_x\), \(F_y\) &le; 10 000).</p>

<p>The second line contains three integers \(n\), \(k\) and \(v_{max}\) &mdash; the number of wind condition changes, duration of Jacob&rsquo;s flight in seconds and maximum aircraft speed (1 &le; \(n\), \(k\), \(v_{max}\) &le; 10 000).</p>

<p>The following \(n\) lines contain the wind conditions description. The \(i\)-th of these lines contains integers \(t_i\), \(w_{x_i}\) and \(w_{y_i}\) &mdash; starting at time \(t_i\) the wind will blow by vector (\(w_{x_i}\), \(w_{y_i}\)) each second (0 = \(t_1\) &lt; &middot;&middot;&middot; &lt; \(t_i\) &lt; \(t_{i+1}\) &lt; &middot;&middot;&middot; &lt; \(k\); \(\sqrt{w_{x_i}^2 + w_{y_i}^2}\) &le; \(v_{max}\)).</p>

### 출력

<p>The first line must contain &ldquo;Yes&rdquo; if Jacob&rsquo;s plane is able to fly from start to finish in \(k\) seconds, and &ldquo;No&rdquo; otherwise.</p>

<p>If it can to do that, the following \(k\) lines must contain the flight plan. The i-th of these lines must contain two floating point numbers \(x\) and \(y\) &mdash; the coordinates of the position (\(P_i\)) of the plane after \(i\)-th second of the flight.</p>

<p>The plan is correct if for every 1 &le; \(i\) &le; \(k\) it is possible to fly in one second from \(P_{i-1}\) to some point \(Q_i\), such that distance between \(Q_i\) and \(P_i\) doesn&rsquo;t exceed 10<sup>&minus;5</sup>, where \(P_0\) = \(S\). Moreover the distance between \(P_k\) and \(F\) should not exceed 10<sup>-5</sup> as well.</p>