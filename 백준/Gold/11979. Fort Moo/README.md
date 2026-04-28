# [Gold II] Fort Moo - 11979

[문제 링크](https://www.acmicpc.net/problem/11979)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 61, 맞힌 사람: 59, 정답 비율: 59.000%

### 분류

누적 합

### 문제 설명

<p>Bessie is building a fort with her friend Elsie. Like any good fort, this one needs to start with a sturdy frame. Bessie wants to build a frame in the shape of a one-meter-wide rectangular outline, atop which she will build the fort.</p>

<p>Bessie has already chosen a site on which to build the fort -- a piece of land measuring \(N\) meters by \(M\) meters (\(1 \leq N, M \leq 200\)). Unfortunately, the site has some swampy areas that cannot be used to support the frame. Please help Bessie determine the largest area she can cover with her fort (the area of the rectangle supported by the frame), such that the frame avoids sitting on any of the swampy areas.</p>

### 입력

<p>Line 1 contains integers \(N\) and \(M\).</p>

<p>The next \(N\) lines each contain \(M\) characters, forming a grid describing the site. A character of &#39;.&#39; represents normal grass, while &#39;X&#39; represents a swampy spot.</p>

### 출력

<p>A single integer representing the maximum area that Bessie can cover with her fort.</p>

### 힌트

<p>In the example, the placement of the optimal frame is indicated by &#39;f&#39;s below:</p>

<pre>
.ffff.
.fX.fX
Xf.Xf.
.ffff.
..X...
</pre>