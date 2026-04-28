# [Platinum V] Present10 - 24280

[문제 링크](https://www.acmicpc.net/problem/24280)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

수학

### 문제 설명

<p>Let us consider a sequence of alternatively changing zeroes and ones, starting with one. This sequence can be seen as a binary representation of a positive integer. We want to present it as a sum of different binary numbers, composed only of ones (i.e. 1, 11, 111 and etc). For some sequences such presentation is possible, for others not.</p>

<p>For example: 1010<sub>2</sub>=11<sub>2</sub>+111<sub>2</sub>; 1010101<sub>2</sub>=111<sub>2</sub>+1111<sub>2</sub>+111111<sub>2</sub>; 10101010101<sub>2</sub> cannot be presented as desired.</p>

<p>Write a program to find for a given sequence of zeros and ones the number of summands in one presentation as a sum of different binary numbers, composed only of ones, or determines that there is no such presentation.</p>

### 입력

<p>The first line of the standard input contains only one positive integer n &ndash; the length of the considered sequence.</p>

### 출력

<p>The only line of the standard output should only contain one non-negative integer: the number of different summands of the desired presentation or 0, if there is no such presentation.</p>

<p>If there is more than one possible solution, output the number of summands in any of them.</p>

### 제한

<ul>
	<li>1 &le; n &le; 2&middot;10<sup>9</sup></li>
</ul>