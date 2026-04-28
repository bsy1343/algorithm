# [Gold I] Finding Bovine Roots - 26997

[문제 링크](https://www.acmicpc.net/problem/26997)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 13, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

브루트포스 알고리즘, 수학

### 문제 설명

<p>The cows are trying to find their roots. They are not so smart as humans when they find square roots, the cows lose the integer portion of their square root calculation. Thus, instead of calculating the square root of 2 to be 1.4142135623730950488016887242096980785696, they deduce that it is 0.4142135623730950488016887242096980785696. The square root of 16 is calculated to be 0 (obviously an error).</p>

<p>The erroneous ciphering does, however, lead to an interesting question. Given a string of digits of length L (1 &le; L &le; 9), what is the smallest integer whose bovine square root decimal part begins with those digits?</p>

<p>By way of example, consider the string &quot;123&quot;. The square root of 17 is approximately 4.1231056256176605498214098559740770251472 so the bovine square root is: 0.1231056256176605498214098559740770251472 whose decimal part (just after the period) starts with 123. It turns out that 17 is the smallest integer with this property.</p>

### 입력

<ul>
	<li>Line 1: A single integer, L</li>
	<li>Line 2: L digits (with no spaces)</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the smallest integer whose bovine square root starts with the supplied string</li>
</ul>