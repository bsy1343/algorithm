# [Platinum IV] Clean Up! - 24640

[문제 링크](https://www.acmicpc.net/problem/24640)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 23, 맞힌 사람: 20, 정답 비율: 54.054%

### 분류

자료 구조, 다이나믹 프로그래밍, 문자열, 트리, 트라이

### 문제 설명

<p>Once Charlie decided to start a new life by deleting all files in his Downloads directory. It&#39;s easy to do that using <code>bash</code> shell! It has two useful features: the &quot;<code>rm</code>&quot; command, which removes all files given as arguments, and patterns, which are replaced with the list of files matching them before executing the command.</p>

<p>Charlie ran &quot;<code>rm *</code>&quot;, but received an &quot;<code>Argument list too long</code>&quot; response. Unfortunately, after <code>bash</code> replaced &quot;<code>*</code>&quot; with the names of all files in the Downloads directory, it failed to run the command because it had too many arguments.</p>

<p>After some experiments, Charlie realized he can execute &quot;<code>rm abc*</code>&quot; to delete all files with names starting with &quot;<code>abc</code>&quot; if there are at most $k$ such files. If more than $k$ files match this pattern, none of them will be deleted. Of course, he can replace &quot;<code>abc</code>&quot; with any string.</p>

<p>Help Charlie to find the smallest number of &quot;<code>rm</code>&quot; commands needed to delete all files. Assume that he can only use the &quot;<code>rm</code>&quot; command as &quot;<code>rm &lt;prefix&gt;*</code>&quot;, where <code>&lt;prefix&gt;</code> consists of lowercase English letters (and can be empty).&nbsp;</p>

### 입력

<p>The first line contains two integers $n$ and $k$ --- the number of files to delete, and the maximum number of files that can be deleted by one &quot;<code>rm</code>&quot; command ($1 \le n, k \le 3 \cdot 10^5$).</p>

<p>Each of the next $n$ lines contains a single string, denoting a file name. All file names are distinct, non-empty, and consist of lowercase English letters. The total length of all file names doesn&#39;t exceed $3 \cdot 10^5$.</p>

### 출력

<p>Print a single integer --- the smallest number of &quot;<code>rm</code>&quot; commands needed to delete all files.</p>

### 힌트

<p>In the first example test, Charlie can execute &quot;<code>rm ab*</code>&quot; to delete files &quot;<code>abc</code>&quot; and &quot;<code>abd</code>&quot;, and then execute &quot;<code>rm *</code>&quot; to delete files &quot;<code>a</code>&quot; and &quot;<code>b</code>&quot;. Note that he can&#39;t just run &quot;<code>rm *</code>&quot; immediately, because initially all four files match an empty prefix.</p>