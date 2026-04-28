# [Bronze III] ID - 9907

[문제 링크](https://www.acmicpc.net/problem/9907)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 632, 정답: 482, 맞힌 사람: 436, 정답 비율: 77.305%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>The National Identity Card number of the city state of Eropagnis, NICE, consists of seven digits and a letter appended behind. &nbsp;This letter is calculated from the digits using the Modulo Eleven method.</p>

<p>The steps involved in the computation are as follows:</p>

<ol>
	<li>Multiply each digit in the NICE number by its weight. &nbsp;The weight of the first digit is 2, the weight of the second is 7, the third is 6, the fourth is 5, the fifth is 4, the sixth is 3, and the seventh is 2.</li>
	<li>Add all resulting products.</li>
	<li>Find the remainder of dividing the sum by 11.</li>
	<li>Map the remainder to a capital letter as follows: 0=J, 1=A, 2=B, 3=C, 4=D, 5=E, 6=F, 7=G, 8=H, 9=I, 10=Z.</li>
</ol>

<p>Example: Given the digits &ldquo;6830907&rdquo;, the sum is 2 &times; 6 + 7 &times; 8 + 6 &times; 3 + 5 &times; 0 + 4 &times; 9 + 3 &times; 0 + 2 &times; 7 = 12 + 56 + 18 + 0 + 36 + 0 + 14 = 136. &nbsp;The number 136 has a remainder of 4, when divided by 11, and 4 is mapped to the letter &ldquo;D&rdquo;. &nbsp;So, the actual NICE should be &ldquo;6830907D&rdquo;.</p>

<p>Write a program to read the seven digits of the NICE, and output the letter that needs to be appended.</p>

### 입력

<p>The input consists of seven digits of the NICE.</p>

### 출력

<p>The output contains a single capital character, which is the letter to be appended to form the correct NICE.&nbsp;</p>