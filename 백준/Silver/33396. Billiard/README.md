# [Silver IV] Billiard - 33396

[문제 링크](https://www.acmicpc.net/problem/33396)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 83, 정답: 48, 맞힌 사람: 31, 정답 비율: 52.542%

### 분류

수학, 유클리드 호제법, 정수론

### 문제 설명

<p>There is a table with length $n$ and width $m$.</p>

<p>A billiard ball begins to move from one corner with an angle of $45$ degrees.</p>

<p>When will the ball bounce back to where it starts?</p>

<p>Formally, you are given $n$ and $m$, and you need to calculate the return value of the following function.</p>

<pre>int64_t check(int n, int m) {
  int x = 0, y = 0;
  int dx = 1, dy = 1;
  int64_t t = 0;
  while (1) {
    if (x + dx &lt; 0) dx *= -1;
    if (x + dx &gt; n) dx *= -1;
    if (y + dy &lt; 0) dy *= -1;
    if (y + dy &gt; m) dy *= -1;
    x += dx;
    y += dy;
    ++t;
    if (x == 0 &amp;&amp; y == 0) break;
  }
  return t;
}
</pre>

### 입력

<p>The first line contains an integer $t$, the number of test cases ($1 \le t \le 10^5$). The test cases follow.</p>

<p>Each test case is described by a single line containing two integers $n$ and $m$ ($2 \le n, m \le 10^9$).</p>

### 출력

<p>For each test case, output a line containing one integer: the answer to the problem.</p>