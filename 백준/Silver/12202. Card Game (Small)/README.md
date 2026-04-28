# [Silver III] Card Game (Small) - 12202

[문제 링크](https://www.acmicpc.net/problem/12202)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 36, 맞힌 사람: 32, 정답 비율: 91.429%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Bob is fond of playing cards. On his birthday party, his best friend Alice gave him a set of cards.</p>

<p>There are <strong>N</strong> cards and each card contains an integer number. He put the cards from left to right on a desk and wants to discard some of them. Before he discards any cards, he will choose a number <strong>K</strong>. At each time, he always chooses 3 <strong>adjacent</strong> cards to discard, and we assume that the numbers on each card from left to right are <strong>a</strong>, <strong>b</strong> and <strong>c</strong>. Bob guarantees that</p>

<p>c - b = b - a = K</p>

<p>Bob want to know what is the smallest number of cards he can be left with at the end. If he ever has a choice of which cards to discard, he chooses the cards and will leave the fewest cards at the end.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow.</p>

<p>Each test cases contains two lines. The first line of each test case contains two integers: the number of cards <strong>N</strong> and the number <strong>K</strong> Bob chooses. The second line contains <strong>N</strong> integers <strong>a</strong><strong><sub>1</sub></strong>, <strong>a</strong><strong><sub>2</sub></strong>, ..., <strong>a</strong><strong><sub>N</sub></strong> the numbers on the cards from left to right.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>a</strong><strong><sub>i</sub></strong> &le; 10<sup>6</sup>(1 &le; i &le; <strong>N</strong>).</li>
	<li>1 &le; <strong>N</strong> &le; 100.</li>
	<li><strong style="line-height:1.6em">K</strong><span style="line-height:1.6em"> = 0.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the smallest number of cards Bob can be left with after he has discarded everything he can.</p>