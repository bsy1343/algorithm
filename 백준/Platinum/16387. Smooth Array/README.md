# [Platinum I] Smooth Array - 16387

[문제 링크](https://www.acmicpc.net/problem/16387)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 16, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>We always hope things in our lives will run smoothly, and having smooth arrays may help. An array A of N non-negative integers is K<sub>S</sub>-smooth if the sum of every set of K consecutive integers is exactly S. Unfortunately, not all arrays are K<sub>S</sub>-smooth. In fact, all K<sub>S</sub>-smooth arrays must contain a repeating pattern of length K. The image to the right shows an array of smoothies, and is totally unrelated to this problem, but may help you relax.</p>

<p>Any array can be made KS-smooth by changing its elements. In each change one element may be modified to any integer between 0 and S, inclusive. You want to make all of your arrays smooth, but you don&rsquo;t want to make any more changes than necessary. So the question is: What is the minimum number of changes you have to make so that a given array would become K<sub>S</sub>-smooth?</p>

### 입력

<p>The first line of input will consist of three integers of the form:</p>

<p style="text-align: center;">N K S</p>

<p>where N is the size of the array, The remainder of the file will consist of N integers, a<sub>n</sub> &isin; A, separated by white space (spaces or newlines).</p>

### 출력

<p>Your program must output a single integer specifying the minimum number of changes that must be made in order to make the array K<sub>S</sub> smooth.</p>

### 제한

<ul>
	<li>1 &le; K &le; N &le; 5000</li>
	<li>&forall;a<sub>n</sub> &isin; A, 0 &le; a<sub>n</sub> &le; S &le; 5000</li>
</ul>