# [Gold II] Build Dependencies - 35070

[문제 링크](https://www.acmicpc.net/problem/35070)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬, 자료 구조, 집합과 맵

### 문제 설명

<p>A Makefile is a file that specifies dependencies between different source code files. When one source code file changes, this file needs to be recompiled, and when one or more dependencies of another file are recompiled, that file needs to be recompiled as well. Given the Makefile and a changed file, output the set of files that need to be recompiled, in an order that satisfies the dependencies (i.e., when a file $X$ and its dependency $Y$ both need to be recompiled, $Y$ should come before $X$ in the list).</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n \leq 10^5$), the number of Makefile rules.</li>
<li>$n$ lines, each with a Makefile rule. Such a rule starts with "$f$<code>:</code>" where $f$ is a filename, and is then followed by a list of the filenames of the dependencies of $f$. Each file has at most $5$ dependencies.</li>
<li>One line with one string $c$, the filename of the changed file.</li>
</ul>

<p>Filenames are strings consisting of between $1$ and $10$ English lowercase letters (<code>a-z</code>). Exactly $n$ different filenames appear in the input file, each appearing exactly once as $f$ in a Makefile rule. The rules are such that no two files depend (directly or indirectly) on each other.</p>

### 출력

<p>Output the list of files that need to be recompiled, in an order such that all dependencies are satisfied.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>