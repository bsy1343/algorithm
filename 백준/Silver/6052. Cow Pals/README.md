# [Silver V] Cow Pals - 6052

[문제 링크](https://www.acmicpc.net/problem/6052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 490, 정답: 180, 맞힌 사람: 157, 정답 비율: 34.967%

### 분류

수학, 구현, 브루트포스 알고리즘, 정수론, 소수 판정

### 문제 설명

<p>Bessie and all the other cows have an RFID serial number tag in their ear so FJ can mechanically tally them. Many cows have a &#39;cowpal&#39; whose serial number is equal to the sum of the divisors (that are not the number itself) of their own serial number. Some cows don&#39;t have a cowpal because no cow&#39;s serial number matches their divisor sum.</p>

<p>Some cows have a superpal. Cows are superpals when their serial numbers make each of them a pal of the other. Cows that are superpals of themselves are shunned; do not consider them!</p>

<p>Given a serial number S (6 &lt;= S &lt;= 18,000), find the first cow with serial number at least S who has a super pal.</p>

<p>By way of example, consider serial number 220 whose divisors are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, and 110. Their sum is 284. Similarly, the divisors of 284 are 1, 2, 4, 71, and 142. Their sum is 220.</p>

### 입력

<ul>
	<li>Line 1: A single integer: S</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with two space-separated integers that are the serial number of the first superpal whose serial number is no smaller than S and the serial number of her pal.</li>
</ul>

<p>&nbsp;</p>