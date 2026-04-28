# [Gold III] Sleeping Time - 22505

[문제 링크](https://www.acmicpc.net/problem/22505)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

이분 탐색, 분할 정복, 수학, 확률론, 재귀

### 문제 설명

<p>Miki is a high school student. She has a part time job, so she cannot take enough sleep on weekdays. She wants to take good sleep on holidays, but she doesn&#39;t know the best length of sleeping time for her. She is now trying to figure that out with the following algorithm:</p>

<ol>
	<li>Begin with the numbers&nbsp;<var><i>K</i></var>,&nbsp;<var><i>R</i></var>&nbsp;and&nbsp;<var><i>L</i></var>.</li>
	<li>She tries to sleep for&nbsp;<var><i>H</i>=(<i>R</i>+<i>L</i>)&frasl;2</var>&nbsp;hours.</li>
	<li>If she feels the time is longer than or equal to the optimal length, then update&nbsp;<var><i>L</i></var>&nbsp;with&nbsp;<var><i>H</i></var>. Otherwise, update&nbsp;<var><i>R</i></var>&nbsp;with&nbsp;<var><i>H</i></var>.</li>
	<li>After repeating step 2 and 3 for&nbsp;<var><i>K</i></var>&nbsp;nights, she decides her optimal sleeping time to be&nbsp;<var><i>T&#39;</i>=(<i>R</i>+<i>L</i>)&frasl;2</var>.</li>
</ol>

<p>If her feeling is always correct, the steps described above should give her a very accurate optimal sleeping time. But unfortunately, she makes mistake in step 3 with the probability&nbsp;<var><i>P</i></var>.</p>

<p>Assume you know the optimal sleeping time&nbsp;<var><i>T</i></var>&nbsp;for Miki. You have to calculate the probability&nbsp;<var><i>PP</i></var>&nbsp;that the absolute difference of&nbsp;<var><i>T&#39;</i></var>&nbsp;and&nbsp;<var><i>T</i></var>&nbsp;is smaller or equal to&nbsp;<var><i>E</i></var>. It is guaranteed that the answer remains unaffected by the change of&nbsp;<var><i>E</i></var>&nbsp;in&nbsp;<var>10<sup>&minus;10</sup></var>.</p>

### 입력

<p>The input follows the format shown below</p>

<pre>
<var><i>K</i></var> <var><i>R</i></var> <var><i>L</i></var>
<var><i>P</i></var>
<var><i>E</i></var>
<var><i>T</i></var></pre>

<p>Where the integers&nbsp;<var>0&le;<i>K</i>&le;30</var>,&nbsp;<var>0&le;<i>R</i>&le;<i>L</i>&le;12</var>&nbsp;are the parameters for the algorithm described above. The decimal numbers on the following three lines of the input gives the parameters for the estimation. You can assume&nbsp;<var>0&le;<i>P</i>&le;1</var>,&nbsp;<var>0&le;<i>E</i>&le;12</var>,&nbsp;<var>0&le;<i>T</i>&le;12</var>.</p>

### 출력

<p>Output&nbsp;<var><i>PP</i></var>&nbsp;in one line. The output should not contain an error greater than&nbsp;<var>10<sup>&minus;5</sup></var>.</p>