# [Silver I] spam - 3218

[문제 링크](https://www.acmicpc.net/problem/3218)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 25, 맞힌 사람: 22, 정답 비율: 29.333%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 많은 조건 분기, 파싱

### 문제 설명

<p>Unfortunately , junk messages are very widespread today.</p>

<p>One method of protecting ourselves from spam is to scramble our address when publishing it on the web (or anywhere else) so that programs that automatically search for e-mail addresses won&#39;t notice ours.</p>

<p>For this problem, the following holds for valid e-mail addresses:</p>

<ol>
	<li>an e-mail adrress is a string of lowercase letters of the English alphabet (&#39;a&#39;...&#39;z&#39;), as well as a number of full stop characters (&#39;.&#39;) and exactly one character &#39;@&#39;.</li>
	<li>there has to be a letter to the immediate left and the immediate right of the &#39;@&#39; character, and the first and last characters in the address may not be a full stop.</li>
</ol>

<p>For example, the addresses &#39;mama@ta..ta&#39;, &#39;m.am.a@t..a.t..a&#39; and &#39;m@t&#39; are all valid, while &#39;ma@&#39;, &#39;.@ma.ma&#39;, &#39;.mama@tata&#39; i &#39;ma.ma@tata.tata.&#39; aren&#39;t.</p>

<p>We will scramble our address as follows:</p>

<ol>
	<li>we will first replace the &#39;@&#39; character with the string &#39;at&#39;</li>
	<li>we will then add the string &#39;nospam&#39; exactly once or zero times anywhere in the address (the beginning and the end included)</li>
</ol>

<p>Write a program that will, given a scrambled e-mail address, determine all different valid addresses it could have originated from.&nbsp;</p>

### 입력

<p>The only line of the input will contain a string of at most 100 characters, the scrambled address.</p>

### 출력

<p>You should write all different valid e-mail address (in any order) that, when scrambled, can give the given scrambled address. Write every address in a separate line.</p>