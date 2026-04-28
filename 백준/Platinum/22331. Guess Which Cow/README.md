# [Platinum II] Guess Which Cow - 22331

[문제 링크](https://www.acmicpc.net/problem/22331)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 3, 맞힌 사람: 2, 정답 비율: 13.333%

### 분류

백트래킹, 비트마스킹, 해 구성하기, 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>The N (1 &le; N &le; 50) cows in Farmer John&#39;s herd look very much alike and are numbered 1&hellip;N. When Farmer John puts a cow to bed in her stall, he must determine which cow he is putting to bed so he can put her in the correct stall.</p>

<p>Cows are distinguished using P (1 &le; P &le; 8) properties, numbered 1&hellip;P, each of which has three possible values. For example, the color of a cow&#39;s ear tag might be yellow, green, or red. For simplicity, the values of every property are represented as the letters &lsquo;<code>X</code>&rsquo;, &lsquo;<code>Y</code>&rsquo;, and &lsquo;<code>Z</code>&rsquo;. Any pair of Farmer John&rsquo;s cows will differ in at least one property.</p>

<p>Write a program that, given the properties of the cows in Farmer John&#39;s herd, helps Farmer John determine which cow he is putting to bed. Your program can ask Farmer John no more than 100 questions of the form: Is the cow&rsquo;s value for some property T in some set S? Try to ask as few questions as possible to determine the cow.</p>

### 입력

<ul>
	<li>The first line of the input file contains two space-separated integers, N and P.</li>
	<li>Each of the next N lines describes a cow&rsquo;s properties using P space-separated letters. The first letter on each line is the value of property 1, and so on. The second line in the input file describes cow 1, the third line describes cow 2, etc.</li>
</ul>

### 출력

