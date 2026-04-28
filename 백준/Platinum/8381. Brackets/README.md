# [Platinum V] Brackets - 8381

[문제 링크](https://www.acmicpc.net/problem/8381)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 13, 맞힌 사람: 8, 정답 비율: 23.529%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>By a correct bracketing we mean a string consisting of brackets&nbsp;<code>(</code>&nbsp;and&nbsp;<code>)</code>, in which the number of opening brackets is equal to the number of closing brackets and each prefix of the string contains at least as many opening brackets, as closing brackets. This way,&nbsp;<code>()()</code>&nbsp;is a correct bracketing, while&nbsp;<code>())(</code>&nbsp;is not, because prefix&nbsp;<code>())</code>&nbsp;contains more closing brackets than opening brackets.</p>

<p>For a given pair of bracketings of length 2<em>n</em>, we say that the earlier bracketing is the one which has an opening bracket in the first position, where these bracketings differ. Such an ordering is equivalent to lexicographical ordering, assuming that &#39;(&#39; &lt; &#39;)&#39;.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input numbers <em>n</em>&nbsp;and <em>k</em>,</li>
	<li>finds lexicographically <em>k</em>-th bracketing of length 2<em>n</em>&nbsp;(bracketings are numbered starting from one),</li>
	<li>writes result to the standard output.</li>
</ul>

### 입력

<p>Input contains exactly two integers <em>n</em>&nbsp;and <em>k</em>&nbsp;(1 &le; <em>n</em> &le; 4 000, 1 &le; <em>k</em> &le; 10<sup>18</sup>), separated by a single space.</p>

### 출력

<p>In the first and only line your program should output a bracketing of length 2<em>n</em>, which is the <em>k</em>-th bracketing among all correct bracketings of length 2<em>n</em>. Input data is prepared in such a way that the bracketing your program is supposed to find always exists.</p>