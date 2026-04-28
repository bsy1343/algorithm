# [Silver III] Pod starim krovovima - 18325

[문제 링크](https://www.acmicpc.net/problem/18325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 36, 맞힌 사람: 33, 정답 비율: 60.000%

### 분류

그리디 알고리즘, 구현, 정렬

### 문제 설명

<p><strong>Setting</strong>: Legendary Zagrebian Inn called Kod Žnidar&scaron;ića.</p>

<p><strong>Time</strong>: The year 1936.</p>

<p><strong>Plot summary</strong>: Franjo and his friends are discussing the current events in Abyssinia while enjoying a couple of drinks at the bar. His son, little Perica, is sitting at a small table in the corner of the bar. In front of Perica there are N glasses conveniently numbered from 1 to N. The volume (in nanoliters) of each glass is known as well as the amount of liquid that is currently inside it.</p>

<p><strong>Problem</strong>: Little Perica wants to know what is the largest possible number of glasses that can be emptied by pouring the liquid between glasses. He can freely pour any integer number of nanoliters from one glass to another, as many times as he wants, as long as no liquid is spilled over.</p>

<p>Your task is to output the number of empty glasses along with one possible configuration of liquid in all glasses. If there are multiple configurations that yield the same number of empty glasses, output any of them. Note that it is not necessary to minimize the number of times liquid was poured between two glasses.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 1 000) from the task description.</p>

<p>Each of the next N lines contains two integers T<sub>i</sub> (0 &le; T<sub>i</sub> &le; 10<sup>9</sup>) and Z<sub>i</sub> (1 &le; Z<sub>i</sub> &le; 10<sup>9</sup>) which, in that order, represent the current amount of liquid in the i-th glass and its volume. Both quantities are given in nanoliters and the current amount of liquid cannot be greater than the volume of the glass, i.e. T<sub>i</sub> &le; Z<sub>i</sub> holds.</p>

### 출력

<p>In the first line you should output the largest number of glasses that can be emptied by pouring the liquid between glasses.</p>

<p>In the second line you should output the amount of liquid in each of the glasses after Perica has performed the necessary pourings. The glasses should be ordered from glass numbered 1 to glass numbered N.</p>

### 힌트

<p>Clarification of the second example: One of the possible pouring configurations is the following:</p>

<ol>
	<li>pour everything from glass 1 into glass 2.</li>
	<li>pour everything from glass 2 into glass 4.</li>
	<li>pour four nanoliters from glass 3 into glass 4.</li>
	<li>pour one nanoliter from glass 3 into glass 5.</li>
</ol>

<p>Glasses numbered 1, 2 and 3 are now empty.</p>