# [Platinum I] Infiltration Route - 35405

[문제 링크](https://www.acmicpc.net/problem/35405)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Tomás is a secret agent attempting to infiltrate the super-secure headquarters of the International Competitive Programming Consortium (ICPC). The building has $2N$ floors, numbered from $1$ to $2N$. Starting at floor $1$, he must reach floor $2N$ to steal classified algorithms, and then make a dramatic parachute escape from the roof.</p>

<p>He has obtained $M$ stolen elevator access codes. Each access code connects two specific floors $S$ and $T$ ($S &lt; T$) and can be used to force the elevator to move upward from floor $S$ to floor $T$.</p>

<p>The building has an advanced security system composed of $N$ sensors. Sensor $i$ monitors floors $i$ and $i+N$ (for $1 \le i \le N$). When Tomás uses an elevator code to leave a floor, the monitoring sensor detects the intrusion and permanently seals both floors it monitors. Sealed floors cannot be entered, and codes cannot be used from sealed floors. Thus, he can enter at most one floor from each monitored pair.</p>

<p>Tomás needs your help to guarantee the success of the mission. Your task is to determine an infiltration route, which is a sequence of floors $f_1, f_2, \ldots, f_k$, such that</p>

<ul>
<li>$f_1 = 1$,</li>
<li>$f_k = 2N$,</li>
<li>there is an access code that allows moving from floor $f_i$ to floor $f_{i+1}$ for $1 \le i \le k-1$, and</li>
<li>no two floors $f_i$ and $f_j$ in the sequence (with $i \ne j$) are monitored by the same sensor.</li>
</ul>

<p>If such an infiltration route exists, output it. Otherwise, indicate that the mission is impossible.</p>

### 입력

<p>The first line contains two integers $N$ ($1 \le N \le 500$) and $M$ ($1 \le M \le 1000$), indicating respectively that the building has $2N$ floors and that Tomás has $M$ access codes. Floors are identified by distinct integers from $1$ to $2N$.</p>

<p>Each of the next $M$ lines describes an access code with two integers $S$ and $T$ ($1 \le S &lt; T \le 2N$), representing that the access code allows movement from floor $S$ to floor $T$.</p>

### 출력

<p>If an infiltration route exists, output two lines. The first line must contain an integer $k$ indicating the number of floors in the route. The second line must contain $k$ integers $f_1, f_2, \ldots, f_k$ representing the floors included in the route. If there are multiple solutions, output any of them.</p>

<p>If the mission is impossible, output a line with the character “<code>*</code>” (asterisk) instead.</p>