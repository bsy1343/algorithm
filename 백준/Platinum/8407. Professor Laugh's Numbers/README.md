# [Platinum III] Professor Laugh's Numbers - 8407

[문제 링크](https://www.acmicpc.net/problem/8407)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 124, 정답: 32, 맞힌 사람: 21, 정답 비율: 25.926%

### 분류

수학, 정수론

### 문제 설명

<p>Professor Byteman Laugh has been given a unique chance. He has been told that he could get a million dollars for his research from Foundation for Helping Wicked Byteprofessors. The professor always does his best to make his research interesting. Now it is time for the society to grade the professor&#39;s work.</p>

<p>However, it is not so easy. The professor has only one week before he will have to present the results of his research. As every scientist, professor Laugh is a little bit absent-minded. He has lost the results somewhere, so he is asking you to write a program which reproduces them.</p>

<p>Professor Laugh does not like to bore his friends and colleagues. Therefore, he is not interested in ordinary integrals, but in thrilling and mind-blowing prime numbers.</p>

<p>For a prime number<sup>1</sup>&nbsp;<em>p</em>&nbsp;greater than 2, an integer <em>e</em>&nbsp;greater than 1 and an integer <em>n</em>&nbsp;less than <em>p</em>&nbsp;the professor says that&nbsp;<em>p</em>&nbsp;is (<em>p</em>, <em>e</em>)<i>-interesting</i>&nbsp;if there is a natural number <em>x</em>&nbsp;such that,&nbsp;<em>x<sup>e</sup></em>&nbsp;&equiv; <em>n</em> (mod <em>p</em>).&nbsp;In other words <em>x<sup>e</sup></em>&nbsp;and <em>n</em>&nbsp;give the same remainder when divided by <em>p</em>.</p>

<p>Write a program which:</p>

<ul>
	<li>reads a prime number <em>p</em>, an exponent <em>e</em>&nbsp;and a sequence of numbers;</li>
	<li>tests each number in this sequences if it is (<em>p</em>, <em>e</em>)-interesting;</li>
	<li>writes the result.</li>
</ul>

<p><sup>1</sup>We say that an integer is prime if it is greater than 1 and it has no positive integer divisors other than 1 and itself.</p>

### 입력

<p>The first line contains two integers separated by a single space: a prime number <em>p</em>&nbsp;and a number <em>e</em>&nbsp;(3 &le; <em>p</em> &le; 2<sup>32</sup>, 2 &le; <em>e</em> &lt; 2<sup>32</sup>). The second line contains one integer <em>k</em>, i.e. the number of cases (1 &le; <em>k</em> &le; 15). Each of next <em>k</em>&nbsp;lines contains one integer. The <em>i</em>-th of these lines contains a number <em>n<sub>i</sub></em>, 1 &le; <em>n<sub>i</sub></em> &le; <em>p</em> - 1.</p>

### 출력

<p>Your program should write exactly <em>k</em>&nbsp;lines. The line number <em>i</em>&nbsp;(1 &le; <em>i</em> &le; <em>k</em>) should contain one word:&nbsp;<code>TAK</code>&nbsp;(i.e.&nbsp;<i>yes</i>&nbsp;in Polish) if <em>n<sub>i</sub></em>&nbsp;is (<em>p</em>, <em>e</em>)-interesting, <code>NIE</code> (i.e.&nbsp;<i>no</i>&nbsp;in Polish) if it is not.</p>