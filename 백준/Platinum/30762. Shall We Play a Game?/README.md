# [Platinum II] Shall We Play a Game? - 30762

[문제 링크](https://www.acmicpc.net/problem/30762)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 4, 정답 비율: 25.000%

### 분류

수학, 애드 혹, 정수론, 매개 변수 탐색

### 문제 설명

<p>This is an <strong>interactive</strong> problem.</p>

<p>1804. Vice-president of the United States of America Aaron Burr challenged gubernatorial race candidate Alexander Hamilton for writing several offending pamphlets.</p>

<p>But Burr is sane enough to understand that, even if he kills Hamilton, he will lose his reputation and ruin his career. So, the enemies decided to simply play a game. To make everything more fair they decided to play it $g$ times.</p>

<p>Each game starts with Hamilton thinking up a positive integer $n$, and after that Burr tries to guess it. For any positive integer $x$ Burr may ask Hamilton about fraction of numbers between $1$ and $n$ inclusive that are divisible by $x$. In the other words, when asks a question about $x$, he receives the value of $$\frac{\left\lfloor\frac{n}{x}\right\rfloor}{n}.$$ Important detail is that Hamilton reports the answer to Burr as an <strong>irreducible</strong> fraction (here $\left\lfloor r \right\rfloor$ denotes the integral part of $r$).</p>

<p>Help Burr find the answer using some certain number of queries.</p>

### 입력



### 출력



### 힌트

<p>In the first sample case $g = 2$. The example queries are listed above, using results of these queries player may understand that in the first game the answer is $10$, and in the second game the answer is $1$.</p>

<p>Strictly follow the output format. After printing anything make sure to print a new line and to flush the output buffer, in order to do that you may use <code>flush(output)</code> for Pascal/Delphi, <code>fflush(stdout)</code> or <code>cout.flush()</code> for C/C++, <code>sys.stdout.flush()</code> for Python, <code>System.out.flush()</code> for Java.</p>