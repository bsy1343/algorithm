# [Gold II] Pitch Performance - 20731

[문제 링크](https://www.acmicpc.net/problem/20731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

수학, 다이나믹 프로그래밍, 미적분학

### 문제 설명

<p>After a recent disaster at the Easter party karaoke, you are working on improving your singing. To gauge how well you are doing, you would like to measure how much the pitch and timing of your singing differs from the target melody you were trying to perform.</p>

<p>We model the melody in a simplified manner as a piecewise-constant function $f$, where at time $x$ the melody has pitch $f(x)$. In other words from time $0$ up to some time $x_1$, $f(x)$ is some constant value $y_1$, and then at time $x_1$ it changes to some other value $y_2$ and remains at that value until some time $x_2 &gt; x_1$, and so on.</p>

<p>Your voice, on the other hand, is of a more wavering nature, and you may generally not be able to hold an exact constant pitch for any period of time, sometimes breaking off into an unwelcome falsetto and sometimes croaking on those low tones. &nbsp;The pitch of your voice can be modeled in a highly simplistic way as a piecewise-quadratic function $g$. In other words from time $0$ up to $x_1$ (not necessarily the same $x_1$ as for the function $f$), your pitch $g(x)$ agrees with some quadratic polynomial, and then from time $x_1$ to $x_2$ with some other quadratic polynomial, and so on.</p>

<p>The difference between your performance $g$ and the target melody $f$ is the area between these two functions. &nbsp;See Figure \ref{fig:pitch} for an example. &nbsp;Given the melody $f$ and your performance $g$, compute their difference.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20731.%E2%80%85Pitch%E2%80%85Performance/058d392b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20731.%E2%80%85Pitch%E2%80%85Performance/058d392b.png" data-original-src="https://upload.acmicpc.net/e0870663-f85a-4ad2-a52d-44f464b9bdec/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 392px; height: 300px;" /></p>

<p style="text-align: center;">Illustration of Sample Input 1. &nbsp;The difference between $f$ and $g$ is the area of the shaded region in the figure.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 500$), the number of pieces in the target melody function $f$. &nbsp;Then follow $n$ lines describing $f$. &nbsp;The $i$&#39;th such line contains two integers $x_i$ and $y_i$ ($x_{i-1} &lt; x_i \le 10^4$ and $0 \le y_i \le 10^4$). &nbsp;For all $x$ in the half-open interval $[x_{i-1}, x_i)$, the value of $f(x)$ equals $y_i$. &nbsp;For the first interval we define $x_0 = 0$.</p>

<p>Then follows a line containing an integer $m$ ($1 \le m \le 500$), the number of pieces in the function $g$ describing your performance. &nbsp;The next $m$ lines contain the description of $g$. &nbsp;The $i$&#39;th such line contains four integers $x&#39;_i$, $a_i$, $b_i$ and $c_i$ ($x&#39;_{i-1} &lt; x&#39;_i \le 10^4$ and $-10^{7} \le a_i, b_i, c_i \le 10^{7}$). For all $x$ in the half-open interval $[x&#39;_{i-1}, x&#39;_i)$, the value of $g(x)$ equals $a_ix^2 + b_ix + c_i$. &nbsp;For the first interval we define $x&#39;_0 = 0$.</p>

<p>You may assume that $0 \le g(x) \le 10^4$ for all $x&#39;_0 \le x \le x&#39;_m$ and that the two functions end at the same time (i.e., $x_n = x&#39;_m$).</p>

### 출력

<p>Output the difference between $f$ and $g$. &nbsp;Your output should be correct to within an absolute or relative error of at most $10^{-6}$.</p>