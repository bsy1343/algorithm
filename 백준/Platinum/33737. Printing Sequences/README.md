# [Platinum IV] Printing Sequences - 33737

[문제 링크](https://www.acmicpc.net/problem/33737)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 78, 정답: 41, 맞힌 사람: 38, 정답 비율: 60.317%

### 분류

다이나믹 프로그래밍, 많은 조건 분기, 브루트포스 알고리즘

### 문제 설명

<p>Bessie is learning to code using a simple programming language. She first defines a valid program, then executes it to produce some output sequence.</p>

<p><strong>Defining:</strong></p>

<ul>
	<li>A <em>program</em> is a nonempty sequence of <em>statements</em>.</li>
	<li>A statement is either of the form "PRINT $c$" where $c$ is an integer, or "REP $o$", followed by a program, followed by "END," where $o$ is an integer that is at least 1.</li>
</ul>

<p><strong>Executing:</strong></p>

<ul>
	<li>Executing a program executes its statements in sequence.</li>
	<li>Executing the statement "PRINT $c$" appends $c$ to the output sequence.</li>
	<li>Executing a statement starting with "REP $o$" executes the inner program a total of $o$ times in sequence.</li>
</ul>

<p>An example of a program that Bessie knows how to write is as follows.</p>

<pre>REP 3
    PRINT 1
    REP 2
        PRINT 2
    END
END
</pre>

<p>The program outputs the sequence $[1,2,2,1,2,2,1,2,2]$.</p>

<p>Bessie wants to output a sequence of $N$ ($1 \le N \le 100$) positive integers. Elsie challenges her to use no more than $K$ ($1 \le K \le 3$) "PRINT" statements. Note that Bessie can use as many "REP" statements as she wants. Also note that each positive integer in the sequence is no greater than $K$.</p>

<p>For each of $T$ ($1 \le T \le 100$) independent test cases, determine whether Bessie can write a program that outputs some given sequence using at most $K$ "PRINT" statements.</p>

### 입력

<p>The first line contains $T$.</p>

<p>The first line of each test case contains two space-separated integers, $N$ and $K$.</p>

<p>The second line of each test case contains a sequence of $N$ space-separated positive integers, each at most $K$, which is the sequence that Bessie wants to produce.</p>

### 출력

<p>For each test case, output "YES" or "NO" (case sensitive) on a separate line.</p>