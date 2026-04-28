# [Gold II] Sequence Guessing - 31516

[문제 링크](https://www.acmicpc.net/problem/31516)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 131, 정답: 36, 맞힌 사람: 27, 정답 비율: 23.276%

### 분류

구현, 애드 혹

### 문제 설명

<p>You are tasked with creating a secret sequence of integers that is difficult to guess.</p>

<p>The sequence is subject to the following constraints:</p>

<ul>
	<li>The first number in the sequence must be $0$.</li>
	<li>The last number in the sequence must be $100\,000$.</li>
	<li>Each number in the sequence must be either $1$ or $2$ greater than the one preceding it.</li>
</ul>

<p>At first, all you need to reveal is the length of the sequence.</p>

<p>Then, an adversary will guess the numbers in the sequence one at a time.</p>

<ul>
	<li>If the guessed number is in your sequence, you must reveal exactly where in the sequence it appears.</li>
	<li>If the guessed number is not in your sequence, you must simply reveal that it is not in the sequence. This is considered a &quot;miss&quot;.</li>
</ul>

<p>Note that because you are not forced to write down the sequence in advance, you can &quot;cheat&quot; by changing the sequence you have in mind, so long as it does not contradict the information you have revealed so far. It turns out that under these conditions, you can always force the adversary to get $33\,333$ misses before they can guess every number in your sequence. Your job is to write a program that does so.</p>

### 입력



### 출력

