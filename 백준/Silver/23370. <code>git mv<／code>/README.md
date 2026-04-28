# [Silver I] <code>git mv</code> - 23370

[문제 링크](https://www.acmicpc.net/problem/23370)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 47, 맞힌 사람: 41, 정답 비율: 35.652%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>During development, you recently moved a file from one location to another. To keep your development team up to date with the change you made, you want to send them a short description of the change, without making use of any versioning software.</p>

<p>Both the source location and destination are valid Unix path names, that is, a nonempty string consisting of lowercase letters and &quot;<code>/</code>&quot; such that no &quot;<code>/</code>&quot; occurs at the begin or the end, nor does it contain two consecutive forward slashes.</p>

<p>You need to find the shortest string of the form &quot;<code>A{B =&gt; C}D</code>&quot; such that:</p>

<ul>
	<li>The source location is &quot;<code>ABD</code>&quot; and the destination is &quot;<code>ACD</code>&quot;, where double forward slashes should be read as one forward slash. For example, if a file is moved from &quot;<code>a/c</code>&quot; to &quot;<code>a/b/c</code>&quot;, we can describe this movement by &quot;<code>a/{ =&gt; b}/c</code>&quot;, meaning the source location was &quot;<code>a/c</code>&quot; and not &quot;<code>a//c</code>&quot;.</li>
	<li>The string $A$ is empty or ends with a forward slash, and similarly $D$ is empty or starts with a forward slash.</li>
	<li>Both $B$ and $C$ do not start or end with a forward slash.</li>
</ul>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing the source location.</li>
	<li>One line containing the destination location.</li>
</ul>

<p>Both lines will contain at most $10^6$ characters, will not begin or end with a forward slash and will not contain any directory name twice. The two strings are guaranteed to be different.</p>

### 출력

<p>Output the shortest replacement string that transforms the source location to the destination, satisfying the above constraints.</p>