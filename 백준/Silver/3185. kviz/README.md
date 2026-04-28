# [Silver III] kviz - 3185

[문제 링크](https://www.acmicpc.net/problem/3185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 50, 맞힌 사람: 43, 정답 비율: 46.739%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>In one very popular internet quiz, player has to give the answer to one very hard question. If player does not give the answer after some period of time, the quiz software will give him the first hint, after that the second hint, and in the end the third hint.</p>

<p>The only characters that appear in the answer are letters and the following characters: &#39;.&#39; (dot), &#39;,&#39; (comma), &#39;:&#39; (colon), &#39;;&#39; (semi-colon), &#39;!&#39; (exclamation mark), &#39;?&#39; (question mark), &#39;-&#39; (dash) and space (there will be no leading or trailing spaces however). By LETTERS, we mean all letters of English alphabet &#39;a&#39;-&#39;z&#39; and &#39;A&#39;-&#39;Z&#39;, and by VOWELS we mean letters &#39;aeiouAEIOU&#39;.</p>

<p>How do we generate hints?</p>

<ul>
	<li>First hint is generated from the correct answer - we simply replace the letters with the character &#39;.&#39; (dot).</li>
	<li>Second hint is generated from the first hint - we reveal the first third of all the letters (if the number of letters is not divisible by 3, quotient should be rounded to the nearest integer).</li>
	<li>Third hint is generated from the second hint - we reveal all the remaining vowels. If there are no unrevealed vowels, then the third hint is generated from the first hint - we reveal first two-thirds of all the letters (if number of letters is not divisible by 3, quotient should be rounded to the nearest integer).</li>
</ul>

<p>Write a program that will generate all three hints from the given answer.</p>

### 입력

<p>First and only line of input contains the correct answer from which we have to generate hints. The total number of characters will be at most 50.</p>

### 출력

<p>First line of output should contain the first hint, second line should contain the second hint, and the third line should contain the third hint.</p>