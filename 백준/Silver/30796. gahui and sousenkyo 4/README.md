# [Silver IV] gahui and sousenkyo 4 - 30796

[문제 링크](https://www.acmicpc.net/problem/30796)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 241, 정답: 98, 맞힌 사람: 86, 정답 비율: 43.434%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Gahui is watching the annual character election. After the election, <strong>The top 16 characters</strong> receive enormous benefits for one year. For that reason, fans vote passionately to get their favorite characters into the top 16. Remarkably, at least one Cinderella appears in every election, achieving an outstanding outcome.</p>

<p>While watching the character&#39;s election, Gahui suddenly think about the following problem. There are the following four facts in the election:</p>

<ul>
	<li>There are no two characters with a difference in $k$ votes count.</li>
	<li>Every character has a different number of votes.</li>
	<li><strong>All character</strong> have <strong>at least one vote count.</strong></li>
	<li>The character that ranked 1st has $v$ votes count.</li>
</ul>

<p>She wants to know <strong>the maximum number of characters participating in the election.</strong> Help Gahui. </p>

### 입력

<p>$v$ and $k$ are given separated by spaces.</p>

### 출력

<p>Print $n$ in the first line. $n$ is <strong>the number of characters participating in the election.</strong></p>

<p>In the following $n$ lines, print the number of votes obtained by rank.</p>

<p>If there are multiple solutions, you may output any of them.</p>

### 제한

<ul>
	<li>$1 \le v \le 250\,000$</li>
	<li>$1 \le k \le 100\,000$</li>
</ul>