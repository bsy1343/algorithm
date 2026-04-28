# [Bronze II] Distinct Digits - 30167

[문제 링크](https://www.acmicpc.net/problem/30167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 226, 정답: 192, 맞힌 사람: 166, 정답 비율: 87.368%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>You have two integers $l$ and $r$. Find an integer $x$ which satisfies the conditions below:</p>

<ul>
	<li>$l \le x \le r$.</li>
	<li>All digits of $x$ are different.</li>
</ul>

<p>If there are multiple answers, print any of them.</p>

### 입력

<p>The first line contains two integers $l$ and $r$ ($1 \le l \le r \le 10^{5}$).</p>

### 출력

<p>If an answer exists, print any of them. Otherwise, print $-1$.</p>

### 힌트

<p>In the first example, $123$ is one of the possible answers. However, $121$ can&#39;t be the answer, because there are multiple $1$s on different digits.</p>

<p>In the second example, there is no valid answer.</p>