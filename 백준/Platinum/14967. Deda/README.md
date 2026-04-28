# [Platinum III] Deda - 14967

[문제 링크](https://www.acmicpc.net/problem/14967)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 70, 정답: 45, 맞힌 사람: 41, 정답 비율: 68.333%

### 분류

이분 탐색, 자료 구조, 세그먼트 트리

### 문제 설명

<p>Little Marica is making up a <s>nonsensical</s> unusual fairy tale and is telling to her grandfather who keeps interrupting her and asking her stupid intriguing questions.</p>

<p>In Marica&rsquo;s fairy tale, N children, denoted with numbers from 1 to N by their age (from the youngest denoted with 1, to the oldest denoted with N), embarked on a train ride. The train leaves from the station 0 and stops in order at stations 1, 2, 3 &hellip; to infinity.</p>

<p>Each of the following Marica&rsquo;s statements is of the form: &ldquo;At stop ​X​, child ​A got out&rdquo;​, where the order of these statements is completely arbitrary. In other words, it does not depend on the station order. Her grandfather sometimes asks a question of the form: &ldquo;Based on the statements so far, of the children denoted with a number greater than or equal to ​B​, who is the youngest child that rode for ​Y or less stops?&rdquo; If at the moment the grandfather asks the question it hasn&rsquo;t been said so far that a child is getting off the train, we assume that the child is riding for an infinite amount of stops.</p>

<p>Marica must give a correct answer to each of her grandfather&rsquo;s questions, otherwise the grandfather will get mad and go to sleep. The answer must be correct in the moment when the grandfather asks the question, while it can change later given Marica&rsquo;s new statements, but that doesn&rsquo;t matter. Write a program that tracks Marica&rsquo;s statements and answers her grandfather&rsquo;s questions.</p>

### 입력

<p>The first line of input contains the positive integers N and Q (2 &le; N, Q &le; 200 000), the number of children and the number of statements. Each of the following Q lines describes:</p>

<ul>
	<li>either Marica&rsquo;s statement of the form &ldquo;M&rdquo; X A, where &ldquo;M&rdquo; denotes Marica, and X and A are positive integers (1 &le; X &le; 1 000 000 000, 1 &le; A &le; N) from the task,</li>
	<li>or her grandfather&rsquo;s question of the form &ldquo;D&rdquo; Y B, where &ldquo;D&rdquo; denotes the grandfather, and Y and B are positive integers (1 &le; Y &le; 1 000 000 000, 1 &le; B &le; N) from the task.</li>
</ul>

<p>All of Marica&rsquo;s statements correspond to different children and at least one line in the input is her grandfather&rsquo;s question.</p>

### 출력

<p>For each grandfather&rsquo;s question, output the number of the required child in its own line. If no such child exists, output -1.</p>