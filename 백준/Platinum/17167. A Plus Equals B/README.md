# [Platinum II] A Plus Equals B - 17167

[문제 링크](https://www.acmicpc.net/problem/17167)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 901, 정답: 394, 맞힌 사람: 321, 정답 비율: 48.126%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>$A+B$ is a problem used to test one&#39;s basic knowledge for competitive programming. Here is yet another boring variation of it.</p>

<p>You have two integers, $A$ and $B$. You want to make them equal. To do so, you can perform several steps, where each step is one of the following:</p>

<ul>
	<li>$A$ += $A$</li>
	<li>$A$ += $B$</li>
	<li>$B$ += $A$</li>
	<li>$B$ += $B$</li>
</ul>

<p>Unfortunately, $A+B$ is a hard problem for us, so you are allowed to make at most 5000 steps.</p>

### 입력

<p>In the first line, two space-separated integers $A$ and $B$ are given. These are the initial values of the variables $A$ and $B$.</p>

### 출력

<p>In the first line, print a single integer $n$ ($0 \le n \le 5\,000$) denoting the number of steps.</p>

<p>In the next $n$ lines, print one of the following strings to denote your desired operation: <kbd>A+=A</kbd>,&nbsp;<kbd>A+=B</kbd>,&nbsp;<kbd>B+=A</kbd>,&nbsp;<kbd>B+=B</kbd>.</p>

<p>Any sequence of steps that yields the desired result will be judged correct.</p>

### 제한

<ul>
	<li>$1 \le A,\ B \le 10^{18}$</li>
</ul>