# [Silver III] HAN - 11810

[문제 링크](https://www.acmicpc.net/problem/11810)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 145, 정답: 68, 맞힌 사람: 55, 정답 비율: 45.455%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Han didn&rsquo;t want to study solo so he invited his friend Dominik to come over. After an eventful evening that will be remembered for a record number of solved tasks from the field of electronics, Dominik went home. To his surprise, the police stopped him thinking he was drunk. It is known that in these situations sobriety is proven by solving a series of carefully crafted tasks that test a man&rsquo;s cognitive abilities. If we can trust Dominik, the conversation went something like this:</p>

<ul>
	<li>Policeman: Something easy to begin with. . . What is the complexity of bubble sort?</li>
	<li>Dominik: That is really easy, O(n<sup>2</sup>).</li>
	<li>Policeman: Say the English alphabet in reverse.</li>
	<li>Dominik: Trivial, zyxwvutsrqponmlkjihgfedcba</li>
	<li>Policeman: You learned that by heart. Now imagine that all the letters of the English alphabet from &lsquo;a&rsquo; to &lsquo;z&rsquo; are respectively written clockwise in a circle. Begin with the letter &lsquo;a&rsquo; and say the letters clockwise. After each spoken letter, I can tell you to continue saying the alphabet in reverse order or I can ask you how many times so far you&rsquo;ve said a certain letter. Are you ready? 3, 2, 1, Go!</li>
	<li>Dominik: Um... a, b, c...</li>
</ul>

<p>Write a programme that solves Dominik&rsquo;s problem</p>

### 입력

<p>The first line of input contains the integer Q (1 &le; Q &le; 100 000), the number of policeman&rsquo;s orders. Each of the following Q lines contains one of the policeman&rsquo;s order in the form of &ldquo;SMJER n&rdquo; (Croatian for direction) or &ldquo;UPIT n x&rdquo; (Croatian for query). The order in the form &ldquo;SMJER n&rdquo; means that, after the nth spoken letter, Dominik must start saying the alphabet in reverse, whereas the order in the form &ldquo;UPIT n x&rdquo; means that Dominik must say how many times so far he&rsquo;s said the letter x in the first n spoken letters.</p>

<p>The policeman&rsquo;s order will be given chronologically in the input, or, the numbers n (1 &le; n &le; 10<sup>9</sup>) from the orders will be strictly ascending. The character x from the order in the form of &ldquo;UPIT n x&rdquo; is a lowercase letter of the English alphabet.</p>

### 출력

<p>For each order in the form of &ldquo;UPIT n x&rdquo;, output how many times Dominik has said the letter x in the first n spoken letters. The answer to each query needs to be written in a separate line, and the queries need to be answered in the order given in the input.</p>

### 힌트

<p>Clarification of the first example: Dominik says the following letters: a, b, c, d, c, b, a, z, y, x.</p>

<p>Clarification of the second example: Dominik says the following letters: a, z, a, z, y, x, w.</p>