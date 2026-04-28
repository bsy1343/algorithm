# [Gold IV] Plate Parity - 16592

[문제 링크](https://www.acmicpc.net/problem/16592)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 24, 맞힌 사람: 20, 정답 비율: 52.632%

### 분류

수학, 재귀

### 문제 설명

<p>Odd-even rationing is a common method to restrict resource consumption to half population on any given day. For example, a private vehicle is allowed to drive, park, or buy gasoline only on alternating days depends on whether its license plate is odd or even. This policy is enforced in Jakarta to reduce traffic jam during the Asian Games 2018, i.e. odd plate private vehicles are allowed to drive on some restricted roads and certain hours only on odd dates; similarly, even plate private vehicles are allowed only on even dates.</p>

<p>Despite its effectiveness, some people are unaware of the fact that zero (0) is an even number, and this might cause confusion. That&rsquo;s why we need to investigate a variant of odd-even rationing.</p>

<p>In this problem, whether a license plate is even or odd is determined by its rightmost non-zero digit: If it is odd, then the license plate is considered odd; otherwise, the license plate is considered even. For example:</p>

<ul>
	<li>License plate of 701038 is even because 8 is even.</li>
	<li>License plate of 701803 is odd because 3 is odd.</li>
	<li>License plate of 801350 is odd because 5 is odd.</li>
	<li>License plate of 3800 is even because 8 is even.</li>
</ul>

<p>Notice that the smallest license plate number is 1, e.g. in our presidential plate, &ldquo;RI 1&rdquo;.</p>

<p>Your task is to investigate how many integers between A and B (inclusive) are odd plates, and how many of them are even plates.</p>

### 입력

<p>Input contains two integers: A B (1 &le; A &le; B &le; 10<sup>16</sup>) representing the interval [A, B] in which plates you should investigate.</p>

### 출력

<p>Output in a line two integers: O E (separated by a single space) representing the number of odd plates and the number of even plates, respectively.</p>