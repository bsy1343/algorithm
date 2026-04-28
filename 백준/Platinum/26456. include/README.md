# [Platinum IV] include - 26456

[문제 링크](https://www.acmicpc.net/problem/26456)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 32, 맞힌 사람: 28, 정답 비율: 60.870%

### 분류

그래프 이론, 강한 연결 요소

### 문제 설명

<p>Short code is cool, reasonable, beautiful, and elegant. You love short code. Hence you want to make your code as short as possible. Several techniques are known to make your code shorter. Today, you focus on &quot;includes&quot; in your code.</p>

<p>There are $N$ files you must include to your code. The $N$ files are numbered as $1$ through $N$. Some of them also include others. If file $a$ includes file $b$ and file $b$ includes file $c$, including $a$ into your code implies including $b$ and $c$ into your code. But including $c$ does not necessarily imply including $a$ or $b$ unless $c$ (indirectly) includes $a$ or $b$.</p>

<p>You are given information about dependencies of $N$ files, $i$-th of which describes file $a_i$ includes $b_i$. From this information, your task is to determine the set of the minimum number of files you have to directly include in order to include all $N$ files indirectly, and output file numbers in the minimum set in ascending order. If such a set is not uniquely determined, output a set with the minimum sum of the file numbers in a set.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$N$ $M$</p>

<p>$a_1$ $b_1$</p>

<p>$\vdots$</p>

<p>$a_M$ $b_M$</p>
</blockquote>

<p>The first line consists of two integers $N$ and $M$, where $N$ is the number of files ($1 &le; N &le; 30\,000$) and $M$ is the number of dependency information ($0 \le M \le 5 \times 10^5$). The following $M$ lines represents each dependency, the $i$-th of which contains two integers $a_i$ and $b_i$, which means file $a_i$ includes file $b_i$ ($1 &le; a_i &le; N$, $1 &le; b_i &le; N$). There is no duplicate dependency information, i.e. $a_i \ne a_j$ or $b_i \ne b_j$ hold for $1 &le; i &lt; j &le; M$.</p>

### 출력

<p>Determine the minimum number of files that must be directly included in your code to include all files indirectly, and print file numbers in such a file set in ascending order. If there are multiple sets with the minimum size, output a set with the minimum sum of file numbers.</p>