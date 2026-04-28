# [Platinum IV] Mhocskian Languages - 6774

[문제 링크](https://www.acmicpc.net/problem/6774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍, 문자열, 비트마스킹, 파싱

### 문제 설명

<p>Linguists are currently studying Mhocskian, the language of the native inhabitants of Mhocsky island. The linguists have found a description of how the natives construct words in Mhocskian, and a list of words. The linguists would now like to know which of the words in the list are valid Mhocskian words.</p>

<p><strong>Rules</strong></p>

<p>Words in Mhocskian are constructed according to a set of rules. These rules involve two types of components: variables and terminals. A variable is an uppercase letter used in the description of the rules. A terminal is a lowercase letter that is part of a Mhocskian word.</p>

<p>There are two types of rules. The first type of rule allows you to replace a variable V by two variables V<sub>1</sub>V<sub>2</sub> in that order, and we write V &rarr; V<sub>1</sub>V<sub>2</sub> as a short form for this type of rule. The second type of rule allows you to replace a variable V by a terminal t, and we write V &rarr; t as a short form for this type of rule.</p>

<p>One of the variables is the start variable. A word w is composed of lowercase letters from the English alphabet. It is a valid Mhocskian word if, starting from the start variable, it is possible to follow a sequence of rules to obtain w.</p>

<p><strong>Example</strong></p>

<p>Suppose we have variables {S, A, B}, terminals {a, b}, and rules</p>

<p style="text-align: center;">{S &rarr; AB, S &rarr; a, A &rarr; a, B &rarr; b}.</p>

<p>The word &ldquo;ab&rdquo; is a valid Mhocskian word because it can be constructed in the following way: S &rarr; AB &rarr; aB &rarr; ab. The word &ldquo;a&rdquo; can be constructed simply by S &rarr; a. The word &ldquo;b&rdquo; cannot be constructed.</p>

### 입력

<p>On the first line, two integers V and T in that order.</p>

<p>On the second line, V space separated uppercase letters, the variables. The first variable on the line is always the start variable.</p>

<p>On the third line, T space separated lowercase letters, the terminals.</p>

<p>On the fourth line, there is an integer R<sub>1</sub>. R<sub>1</sub> lines follow, each of which is of the form V t, representing a rule V &rarr; t.</p>

<p>On the next line, there is an integer R<sub>2</sub>. R<sub>2</sub> lines follow, each of the form V V<sub>1</sub> V<sub>2</sub>, representing the rule V &rarr; V<sub>1</sub>V<sub>2</sub>.</p>

<p>On the next line, there is an integer W. W lines follow, each contains a single word made entirely of lowercase letters.</p>

### 출력

<p>The output must contain W lines. On line i, output a 1 if the ith word is a valid Mhocskian word, and 0 otherwise.</p>

### 제한

<ul>
	<li>1 &le; V, T &le; 26</li>
	<li>1 &le; R<sub>1</sub> + R<sub>2</sub> &le; 30</li>
	<li>1 &le; W &le; 20</li>
	<li>Each of the words in the linguists&rsquo; list will have length between 1 and 30.</li>
</ul>