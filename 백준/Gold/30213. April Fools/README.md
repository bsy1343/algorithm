# [Gold IV] April Fools - 30213

[문제 링크](https://www.acmicpc.net/problem/30213)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 10, 맞힌 사람: 8, 정답 비율: 17.021%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>On April Fools Day newspapers like to fool their readers by publishing false and usually absurd facts. For example, a fact stating that today Vilnius television tower was brought down by wind.</p>

<p>You are given a range of facts which were published by each of the N different newspapers. These facts are denoted by natural numbers from 1 to F. For example:</p>

<ul>
	<li>Newspaper 1: 1, 2, 5</li>
	<li>Newspaper 2: 2, 3, 4</li>
	<li>Newspaper 3: 1, 6</li>
</ul>

<p>You also know that this April Fools Day each of the newspapers published exactly one false fact.</p>

<p>Find the smallest and the biggest number of false facts that could have been published today.</p>

### 입력

<p>The first line of the input contains two integer numbers separated by a space: the number of newspapers N and the number of facts F.</p>

<p>Facts published by each of the newspapers are described on the remaining 2N lines.</p>

<p>On the 2ith line there is given the number k<sub>i</sub> &ndash; it is the number of facts published by the ith newspaper (1 &le; k<sub>i</sub> &le; F).</p>

<p>On the (2i+ 1)th line there are given k<sub>i</sub> integer numbers f<sub>ij</sub> separated by spaces, 1 &le; f<sub>ij</sub> &le; F, f<sub>ij</sub> &lt; f<sub>i(j+1)</sub>. All of the facts from 1 to F are published at least once by at least one of the newspapers.</p>

### 출력

<p>On the first and only line, output two numbers separated by space: the smallest and the biggest number of false facts that could have been published that day.</p>

### 제한

<ul>
	<li>1 &le; N &le; 200</li>
	<li>1 &le; F &le; 20</li>
</ul>