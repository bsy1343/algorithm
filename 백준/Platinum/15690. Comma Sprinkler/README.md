# [Platinum V] Comma Sprinkler - 15690

[문제 링크](https://www.acmicpc.net/problem/15690)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 62, 맞힌 사람: 59, 정답 비율: 73.750%

### 분류

구현, 그래프 이론, 자료 구조, 그래프 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>As practice will tell you, the English rules for comma placement are complex, frustrating, and often ambiguous. Many people, even the English, will, in practice, ignore them, and, apply custom rules, or, no rules, at all.</p>

<p>Doctor Comma Sprinkler solved this issue by developing a set of rules that sprinkles commas in a sentence with no ambiguity and little simplicity. In this problem you will help Dr. Sprinkler by producing an algorithm to automatically apply her rules.</p>

<p>Dr. Sprinkler&rsquo;s rules for adding commas to an existing piece of text are as follows:</p>

<ol>
	<li>If a word anywhere in the text is preceded by a comma, find all occurrences of that word in the text, and put a comma before each of those occurrences, except in the case where such an occurrence is the first word of a sentence or already preceded by a comma.</li>
	<li>If a word anywhere in the text is succeeded by a comma, find all occurrences of that word in the text, and put a comma after each of those occurrences, except in the case where such an occurrence is the last word of a sentence or already succeeded by a comma.</li>
	<li>Apply rules 1 and 2 repeatedly until no new commas can be added using either of them.</li>
</ol>

<p>As an example, consider the text</p>

<pre>
please sit spot. sit spot, sit. spot here now here.</pre>

<p>Because there is a comma after <code>spot</code> in the second sentence, a comma should be added after <code>spot</code> in the third sentence as well (but not the first sentence, since it is the last word of that sentence). Also, because there is a comma before the word <code>sit</code> in the second sentence, one should be added before that word in the first sentence (but no comma is added before the word <code>sit</code> beginning the second sentence because it is the first word of that sentence). Finally, notice that once a comma is added after <code>spot</code> in the third sentence, there exists a comma before the first occurrence of the word <code>here</code>. Therefore, a comma is also added before the other occurrence of the word <code>here</code>. There are no more commas to be added so the final result is</p>

<pre>
please, sit spot. sit spot, sit. spot, here now, here.</pre>

### 입력

<p>The input contains one line of text, containing at least 2 characters and at most 1 000 000 characters. Each character is either a lowercase letter, a comma, a period, or a space. We define a word to be a maximal sequence of letters within the text. The text adheres to the following constraints:</p>

<ul>
	<li>The text begins with a word.</li>
	<li>Between every two words in the text, there is either a single space, a comma followed by a space, or a period followed by a space (denoting the end of a sentence and the beginning of a new one).</li>
	<li>The last word of the text is followed by a period with no trailing space.</li>
</ul>

### 출력

<p>Display the result after applying Dr. Sprinkler&rsquo;s algorithm to the original text.</p>