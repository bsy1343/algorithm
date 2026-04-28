# [Gold II] Ones - 30250

[문제 링크](https://www.acmicpc.net/problem/30250)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

수학, 정수론, 많은 조건 분기

### 문제 설명

<p>Ugnė and Jūratė enjoy collecting mascots with various numbers on them. Jūratė only collects mascots with numbers composed of the same same digits. Ugnė, however, collects mascots with numbers coposed of ones.</p>

<p>One day, while studying division, the girls noticed that if they divide some Ugnė&rsquo;s numbers by Jūratė&rsquo;s numbers, it is possible to obtain numbers of an interesting shape. For example, 111 111 111/9 = 12 345 679.</p>

<p>Girls wondered: What other sequences of numbers can be produced and what are the sums of their digits? Unfortunately, the numbers may be very big and it is too complicated for the girls to perform the division themselves. Therefore, they are asking you for help.</p>

<p>You are given the numbers of Ugnė and Jūratė. Divide the Ugnė&rsquo;s number by the Jūratė&rsquo;s number, calculate the result of division and find the sum of digits of the division result.</p>

### 입력

<p>On the first line, there is given one integer N: the amount of digits in the Ugnė&rsquo;s number. On the second line, there are given integers M and d. They indicate that Jūratė&rsquo;s number is made from the digit d, repeated M times.</p>

### 출력

<p>Output the only number &ndash; the sum of the digits of the division result. If the division result is not an integer, output <code>NESIDALO</code> (Lithuanian for not divisible).</p>

### 제한

<ul>
	<li>1 &le; N &le; 500 000 000</li>
	<li>1 &le; M &le; 1 000 000</li>
	<li>1 &le; d &le; 9</li>
</ul>