# [Gold III] Elite Eating - 27038

[문제 링크](https://www.acmicpc.net/problem/27038)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 17, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

다이나믹 프로그래밍, 배낭 문제, 수학

### 문제 설명

<p>FJ has uniquely branded 1,000 cows, each with an integer in the range (1..1,000).</p>

<p>FJ has also created an elite eating program where exactly N (1 &le; N &le; 250) cows with specific brands get to enter the barn first.  The restriction on this elite group of cows is that the sum of the squares of the cows&#39; brands must be strictly less than a given integer S (1 &le; S &lt; = 10,100).</p>

<p>Determine the number of different groups of cows that can be selected for the elite eating program.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and S</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of different possible groups that can line up for elite eating.</li>
</ul>

### 힌트

<p>The sequences of length 3 with sum of squares &lt; 30 are:</p>

<ul>
	<li>1 2 3</li>
	<li>1 2 4</li>
	<li>2 3 4</li>
	<li>1 3 4</li>
</ul>

<p>The sequence of brands 1 2 5 is not valid since 1 + 4 + 25 = 30 and is not strictly less than 30.</p>