# [Silver V] A Cat on a Keyboard - 8345

[문제 링크](https://www.acmicpc.net/problem/8345)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 208, 정답: 103, 맞힌 사람: 88, 정답 비율: 50.867%

### 분류

구현, 문자열

### 문제 설명

<p>A cat is walking on Ann&#39;s computer&#39;s keyboard. Ann&#39;s keyboard looks as follows:<sup>1</sup></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8345.%E2%80%85A%E2%80%85Cat%E2%80%85on%E2%80%85a%E2%80%85Keyboard/84e414e3.png" data-original-src="https://upload.acmicpc.net/6fa795e2-36ba-4cdd-8f70-8a1c2cd86b08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Ann is quite sure that the text created by the cat contains a deeper meaning, so she is willing to decode it in order to understand this meaning. She is got an idea to number the rows of the keys on the keyboard with digits from 1 to 5 (the topmost row gets number 1 and the bottommost - number 5) and to change each character in the cat&#39;s text with the number of row of the key corresponding to it. There is a chance that some interesting number will be a result of such transformation and that Ann&#39;s mathematical skills will help her understand the text&#39;s meaning more easily.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the cat&#39;s text from the standard input,</li>
	<li>transforms the cat&#39;s text to the digital form,</li>
	<li>writes the result to the standard output.</li>
</ul>

<p><sup>1</sup>A picture taken from&nbsp;<code>http://acm.uva.es/p</code>.</p>

### 입력

<p>The first and only line of input contains one sequence of at least 1&nbsp;and at most 500 000&nbsp;characters. You can assume that the cat did not step on any of the keys: Alt, BackSpace, Control, Enter, Tab.</p>

### 출력

<p>The first and only line of output should contain a sequence consisting of digits 1, 2, 3, 4, 5, representing the decoded version of the cat&#39;s text.</p>