# [Gold III] Decent Sequence - 26405

[문제 링크](https://www.acmicpc.net/problem/26405)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>The array $a$ is <strong>decent</strong> if it can be split into two consecutive parts (possibly empty), such that the first one (the prefix) is non-decreasing, and the second (the suffix) is non-increasing. For example, $[1, 2, 3]$, $[1, 2, 2, 1]$ and $[3]$ are decent, while $[3, 2, 2, 8]$ is not.</p>

<p>There is an array $a$ consisting of $n$ integers, which is not given to you. You are, however, given $n$ integers $l_i$ and $n$ integers $r_i$. It is known that for all indices $i$ from $1$ to $n$ we have $l_i \leq a_i \leq r_i$. Is $a$ decent?</p>

<p>You have to give one of the three answers:</p>

<ol>
	<li>$a$ is definitely decent.</li>
	<li>$a$ is definitely not decent.</li>
	<li>Neither of the above is the case.</li>
</ol>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 10^6$), the length of $a$.</p>

<p>Each of the following $n$ lines contains two integers $l_i$ and $r_i$ ($1 \leq l_i \leq r_i \leq 10^9$) describing the range containing the element $a_i$.</p>

### 출력

<p>Output &quot;TAK&quot; (without quotes) if $a$ is definitely decent.</p>

<p>Output &quot;NEIN&quot; (without quotes) if $a$ is definitely not decent.</p>

<p>Output an arbitary string consisting of at least five but not more than 100 lowercase or capital english letters otherwise. <em>If you output something really inappropriate you might get Presentation Error. Both of the possible answers in the samples are not considered inappropriate.</em></p>