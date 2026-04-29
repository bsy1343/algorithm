# [Silver III] It's Mooin' Time IV - 35338

[문제 링크](https://www.acmicpc.net/problem/35338)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 48, 정답: 43, 맞힌 사람: 22, 정답 비율: 81.481%

### 분류

문자열, 해 구성하기

### 문제 설명

<p>Bessie has a computer with a keyboard that only has two letters, M and O.</p>

<p>Bessie wants to type her favorite moo $S$ consisting of $N$ letters, each of which is either an M or an O. However, her computer has been hit with a virus. Every time she tries to type the letter O, every letter that she has typed so far flips, either from M to O or from O to M, before the O appears.</p>

<p>Is it possible for Bessie to type out her favorite moo?</p>

<p>Additionally, Bessie is given a parameter $k$ which is either $0$ or $1$.</p>

<ul>
<li>If $k = 0$, then Bessie only needs to determine whether it is possible to type out her favorite moo.</li>
<li>If $k = 1$, then Bessie also needs to give an example of a sequence of keystrokes to type so she can type out her favorite moo.</li>
</ul>

### 입력

<p>The first line contains $T$, the number of independent test cases ($1\le T\le 10^4$) and $k$ ($0 \le k \le 1$).</p>

<p>The first line of each test case has $N$ ($1 \le N \le 2 \cdot 10^5$).</p>

<p>The second line of each test case has $S$. It is guaranteed that no characters will appear in $S$ besides <code>M</code> and <code>O</code>.</p>

<p>The sum of $N$ across all test cases will not exceed $4 \cdot 10^5$.</p>

### 출력

<p>For each test case, output either one or two lines using the following procedure.</p>

<p>If it is impossible for Bessie to type out $S$, print <code>NO</code> on a single line.</p>

<p>Otherwise, on the first line print <code>YES</code>. Furthermore, if $k=1$, on the second line, print a string of length $N$, the characters in order that Bessie needs to type in order to type out her favorite moo. If there are multiple such strings, any will be accepted.</p>