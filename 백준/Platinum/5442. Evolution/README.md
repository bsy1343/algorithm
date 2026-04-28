# [Platinum II] Evolution - 5442

[문제 링크](https://www.acmicpc.net/problem/5442)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Dr. Beverly has been experimenting with an interesting kind of organism. This organism&rsquo;s DNA consists of a single string of k letters over some alphabet of size d. One hour after its birth, an individual gives birth to one offspring, after which it happily lives on for another 15 minutes or so. This process repeats until there is no cold pizza left to feed on.</p>

<p>A mutation is a replacement of a character in the string with any character from the alphabet, possibly with itself. Mutations may occur from one generation to the next. The probability of a mutation is the same for each of the characters of the alphabet and is denoted by p.</p>

<p>Unfortunately, after Dr. Beverly started an experiment with one such creature, she got so caught up in a computer game of some kind that she forgot all about her experiment. When she came back a while later, she found the remains of N creatures. She sampled their DNA, hoping she would be able to figure out which of the corpses belongs to the creature she started the experiment with. Oh if only she had made notes! Anyway, given N strings of DNA, can you compute the probability for each individual that it was the original creature? We may assume that each of the N strings is (a priori) equally likely to serve as the initial string. The order in which the N strings are given is random.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with three integers N, k and d, satisfying 1 &le; N &le; 15, 1 &le; k &le; 8, 1 &le; d &le; 4 and a real number p, satisfying 0.2 &le; p &le; 0.5. The numbers are separated by single spaces.</li>
	<li>N lines, each with a string of length k over some alphabet of size d. This alphabet is a subset of { A, B, C, . . . , Z } and is the same for all N strings. The string on the i-th line represents the DNA of the i-th creature.</li>
</ul>

### 출력

<p>For every test case in the input, the output should contain N lines, each with a real number, rounded and displayed to six digits after the decimal point. The number on the i-th line should be the probability that the i-th creature in the input was the original creature.</p>