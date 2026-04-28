# [Silver III] Small PhD Restaurant - 14011

[문제 링크](https://www.acmicpc.net/problem/14011)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 173, 정답: 124, 맞힌 사람: 113, 정답 비율: 72.903%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p><strong>&quot;There is probably a place where all waiters have a PhD in, I don&#39;t know, some stuff.&quot;</strong>&nbsp;- Dudu, 2014</p>

<p><strong>Note:</strong>&nbsp;This problem is identical to Large PhD Restaurant, but with smaller bounds.</p>

<p>Dudu is hungry. He sat down in a nice Thai restaurant. To his amazement, he realized that he is in the&nbsp;<em>PhD restaurant</em>, a wonderful place where every staff member has a PhD in&nbsp;<em>some stuff</em>.</p>

<p>Even more, each staff member has arranged a challenge related to his or her field of study for Dudu to attempt while he waits for his food. The challenge arranged by staff member i costs A<sub>i</sub>&nbsp;to attempt and will award Dudu B<sub>i</sub>when he completes it successfully.</p>

<p>Each challenge can be completed at most once and they can be attempted in any order. Dudu is very smart and can complete any challenge, but he must have enough money to pay A<sub>i</sub>&nbsp;before he attempts challenge i. If Dudu starts with M money, determine the maximum amount he can obtain.</p>

### 입력

<p>Input begins with a line containing two integers N and M, the number of challenges and the amount of money Dudu begins with, respectively.</p>

<p>The following line contains N numbers A<sub>1</sub>,A<sub>2</sub>, ..., A<sub>N</sub>, indicating the costs to attempt each challenge.</p>

<p>Finally, the last line contains the N numbers B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>N</sub>&nbsp;indicating the payoff from each challenge.</p>

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>0 &le; M, A<sub>i</sub>, B<sub>i</sub>&nbsp;&le; 10<sup>6</sup></li>
</ul>

### 출력

<p>Output a single integer indicating the maximum amount of money Dudu can obtain.</p>

### 힌트

<p>Dudu starts with 100 money. He can proceed in the following way:</p>

<ul>
	<li>Pay 80, get 90 back. Now Dudu has 110 money.</li>
	<li>Pay 50, get 70 back. Now Dudu has 130 money.</li>
	<li>Pay 110, get 150 back. Now Dudu has 170 money.</li>
</ul>