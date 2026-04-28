# [Gold II] Universal and Existential Quantifiers - 20638

[문제 링크](https://www.acmicpc.net/problem/20638)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 25, 맞힌 사람: 20, 정답 비율: 37.037%

### 분류

그리디 알고리즘, 정렬, 누적 합, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>You are given a list of $N$ intervals. The $i$-th interval is $[l_i,r_i)$, which denotes a range of numbers greater than or equal to $l_i$ and strictly less than $r_i$. In this task, you consider the following two numbers:</p>

<ul>
	<li>The minimum integer $x$ such that you can select $x$ intervals from the given $N$ intervals so that the union of the selected intervals is $[0,L)$.</li>
	<li>The minimum integer $y$ such that for all possible combinations of $y$ intervals from the given $N$ interval, it does cover $[0,L)$.</li>
</ul>

<p>We ask you to write a program to compute these two numbers.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<p>The first line contains two integers $N$ ($1 \le N \le 2 \cdot 10^5$) and $L$ ($1 \le L \le 10^{12}$), where $N$ is the number of intervals and $L$ is the length of range to be covered, respectively. The $i$-th of the following $N$ lines contains two integers $l_i$ and $r_i$ ($0 \le l_i &lt; r_ i \le L$), representing the range of the $i$-th interval $[l_i,r_i)$. You can assume that the union of all the $N$ intervals is $[0,L)$.</p>

### 출력

<p>Output two integers $x$ and $y$ mentioned in the problem statement, separated by a single space, in a line.</p>