# [Silver II] Unlock My Safe - 9774

[문제 링크](https://www.acmicpc.net/problem/9774)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 24, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>I forgot the password to my safe. There is a lot of money in it! Please help me unlock the safe. The keypad looks like this.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8591603f-05d2-42c5-ad85-920b6c42f90c/-/preview/" style="width: 307px; height: 241px;" /></p>

<p>I do not remember how long my password is. Hence, you need to try a different length of the password. However, there are some hints that I can recall.</p>

<ul>
	<li>I never use characters *, #, 0 and 9 in my password.</li>
	<li>Each digit in the password is distinct. That is, they never appear more than once.</li>
	<li>My password is at most 8 digits (1 &le; N &le; 8, where N is a number of digits in the password).</li>
	<li>Each digit i in the password always has the value less than or equal to N (that is, a password 132 is valid for N = 3 but a password such as 124 is invalid because the 3rd digit exceeds 3).</li>
</ul>

<p>Use the information above and generate all possible permutations. One permutation corresponds to one guess of a password to unlock my safe. Importantly, the correct password is deliberately fixed at position L\3 in the sorted array of permutations, where L is a number of all possible permutations and &lsquo;\&rsquo; is an integer division. The sorted array of permutations is in ascending order and the starting index in the sorted array begins at 0 (not 1).</p>

<p>Write a program to find a correct password for a given length (a number of digits in the password).</p>

### 입력

<p>The first line of the input contains an integer T (1 &le; T &le; 6) denoting the number of test cases. After that T test cases follow. Each test case contains an integer N (1 &le; N &le; 8) denoting a number of digits in a password.</p>

### 출력

<p>Your program should output the N-digit password for each corresponding test case, one password per line.</p>

### 힌트

<p>There are 3 test cases above. In the second case, for example, the sorted permutations are {123, 132, 213, 231, 312, 321}. Password is located at the position 6\3 = 2 (integer division). When the starting index begins at 0, the password is, therefore, 213.</p>