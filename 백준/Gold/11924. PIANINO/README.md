# [Gold II] PIANINO - 11924

[문제 링크](https://www.acmicpc.net/problem/11924)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 125, 정답: 54, 맞힌 사람: 41, 정답 비율: 41.837%

### 분류

애드 혹, 자료 구조, 수학, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Young Mirka is an amateur musician. She plays the multi-piano. A multi-piano consists of an infinite number of multi-keys, denoted with integers that can be interpreted as the pitch. A multi-composition (a composition written for a multi-piano) can be represented with a finite array of integers, where integers denote the order of multi-keys to press in order to play the multi-composition.</p>

<p>Young Mirka has heard a multi-composition on the multi-radio and now she wants to play it. Unfortunately, she cannot hear exactly which key was pressed, but instead she can hear whether the pressed multi-key was higher, lower or equal to the previously played key (a higher key is denoted with a larger number). Therefore she has decided to play the composition in the following way:</p>

<ul>
	<li>before playing, she will choose one non-negative integer K</li>
	<li>in the beginning, she will play the correct multi-key (her multi-teacher told her which multi-key that is)</li>
	<li>when she hears that the multi-key played in the multi-composition is higher than the previous multi-key played in the multi-composition, she will play the multi-key denoted with the integer larger than the multi-key she played previously by K</li>
	<li>analogously, when she hears that the multi-key played in the multi-composition is lower than the previous multi-key played in the multi-composition, she will play the multi-key denoted with the integer smaller than the multi-key she played previously by K</li>
	<li>when she hears that the multi-key played in the multi-composition is equal to the previous multi-key played in the multi-composition, she will repeat the multi-key she played previously</li>
</ul>

<p>Notice that, when Mirka is playing, she does not compare the pitch of the keys she played to the pitch of the keys from the composition.</p>

<p>Help Mirka choose the integer K in order to hit as many correct pitches as possible.</p>

### 입력

<p>The first line of input contains the integer N (2 &le; N &le; 10<sup>6</sup>), the number of multi-keys in the multicomposition on the multi-radio.</p>

<p>The second line of input contains N integers a<sub>i</sub> (&minus;10<sup>9</sup> &le; a<sub>i</sub> &le; 10<sup>9</sup>), the multi-keys played in the multi-composition.</p>

### 출력

<p>The first line of output must contain the maximum number of multi-keys that Mirka can play correctly. The second line of output must contain the non-negative number K that Mirka must choose in order to hit as many correct pitches as possible. The number must be smaller than or equal to 2 &middot; 10<sup>9</sup>.</p>

<p>Please note: The required number does not have to be unique, but will surely exist within the given constraints.</p>

### 힌트

<p>Clarification of the first example: Mirka will play the following keys, respectively: <strong>1</strong>, 3, 0, <strong>3</strong>, <strong>1</strong>. Denoted in bold are the keys that she played correctly.</p>

<p>Clarification of the second example: Mirka will play the following keys, respectively: <strong>2</strong>, -2, <strong>-6</strong>, <strong>-2</strong>, 2, <strong>6</strong>, <strong>10</strong>.</p>