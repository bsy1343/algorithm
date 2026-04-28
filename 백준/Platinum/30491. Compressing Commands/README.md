# [Platinum IV] Compressing Commands - 30491

[문제 링크](https://www.acmicpc.net/problem/30491)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 32, 맞힌 사람: 26, 정답 비율: 76.471%

### 분류

구현, 다이나믹 프로그래밍, 자료 구조, 문자열, 트리, 트리에서의 다이나믹 프로그래밍, 파싱, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>Unlike your friends, you live in a terminal. You are cool. Your terminal is everything to you: you have optimized the font, colour scheme, keyboard shortcuts, and what not.</p>

<p>Once thing still annoys you though: all these commands you&#39;re typing involve so many file paths and are so long! Then it occurs to you: all this time you have been working from the <em>root directory</em> of the file system, but in fact you can <em>change directory</em> to anywhere you like! This should simplify your life a lot!</p>

<p>This way, if your <em>working directory</em> is <code>/a/b</code>, you can refer to the absolute file path <code>/a/b/x</code> using simply <code>x</code>. To <em>go up</em> a level, you can use <code>..</code>, so that you can refer to <code>/a/y/z</code> as <code>../y/z</code>, and to <code>/some/other/directory</code> as <code>../../some/other/directory</code>.</p>

<p>You being you, of course you overdo this and will now use relative paths <em>everywhere</em>!</p>

<p>Given the $n$ absolute file paths in the command you want to run, find the working directory that minimizes the total number of relative path components. For example, <code>a/a/b/c</code>, and <code>../../a/b</code> both contain $4$ path components. Note that you can only change the working directory to a directory and not to a file path. Filenames will never coincide with directory names in the same directory.</p>

<p>In the first sample it is best to set the working directory to <code>/home/jury/compressingcommands</code>, leading to $6$ components: <code>secret</code>, <code>solutions</code>, and <code>../../hackerman/answers</code>.</p>

<p>In the second sample it is best to set the working directory to <code>/a</code>, leading to $19$ path components: <code>b/a/a/b</code>, <code>a/a</code>, <code>../b</code>, <code>a/b</code>, <code>b/a/a/a</code>, <code>../c</code>, and <code>b/a/b</code>.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 10^5$), the number of absolute file paths.</li>
	<li>$n$ lines, each with a string $s$, an absolute file path. Each path contains only lowercase English letters (<code>a-z</code>) and slashes (&#39;<code>/</code>&#39;), starts with &#39;<code>/</code>&#39;, does not end with &#39;<code>/</code>&#39;, and does not contain consecutive slashes (&quot;<code>//</code>&quot;).</li>
</ul>

<p>The total number of characters in the $n$ strings is at most $10^6$.</p>

### 출력

<p>Output the minimal number of relative path components that can be achieved by changing to a different working directory.</p>