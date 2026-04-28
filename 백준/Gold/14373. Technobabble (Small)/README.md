# [Gold IV] Technobabble (Small) - 14373

[문제 링크](https://www.acmicpc.net/problem/14373)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 45, 맞힌 사람: 38, 정답 비율: 50.000%

### 분류

구현, 자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 백트래킹

### 문제 설명

<p>Every year, your professor posts a blank sign-up sheet for a prestigious scientific research conference on her door. If a student wants to give a lecture at the conference, they choose a two-word topic that is not already on the sheet and write it on the sheet. Once the deadline has passed, the professor has one of her grad students put the topics in a random order, to avoid biasing for or against students who signed up earlier. Then she presents the topics to you for review.</p>

<p>Since the snacks at the conference are excellent, some students try to fake their way into the conference. They choose the first word of some topic already on the sheet and the second word of some topic already on the sheet, and combine them (putting the first word first, and the second word second) to create a new &quot;topic&quot; (as long as it isn&#39;t already on the sheet). Since your professor is open-minded, sometimes this strategy actually works!</p>

<p>The fakers are completely unoriginal and can&#39;t come up with any new first or second words on their own; they must use existing ones from the sheet. Moreover, they won&#39;t try to use an existing first word as their own second word (unless the word also already exists on the sheet as a second word), or vice versa.</p>

<p>You have a list of all&nbsp;N&nbsp;of the submitted topics, in some arbitrary order; you don&#39;t know the order in which they were actually written on the sheet. What&#39;s the largest number of them that could have been faked?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with an integer&nbsp;N, followed by&nbsp;N&nbsp;lines, each of which represents a different topic and has two strings of uppercase English letters: the two words of the topic, in order.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le; length of each word &le; 20.</li>
	<li>No topic is repeated within a case.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 16.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is an integer: the largest number of topics that could have possibly been faked.</p>

### 힌트

<p>In sample case #1, one possibility is that the topics were added to the sheet in this order:</p>

<p><code>QUAIL BEHAVIOR</code>&nbsp;(real)<br />
<code>HYDROCARBON COMBUSTION</code>&nbsp;(real)<br />
<code>QUAIL COMBUSTION</code>&nbsp;(fake)</p>

<p>There is no scenario in which more than one of the topics can be fake.</p>

<p>In sample case #2, all of the topics must be real. Whatever order they were written in, at no point would it have been possible to use existing words to create a new topic that was not already on the list.</p>

<p>In sample case #3, neither topic can be fake. For example, if&nbsp;<code>INTERGALACTIC PLANETARY</code>&nbsp;had been the first and only topic written on the sheet, a faker could only have used&nbsp;<code>INTERGALACTIC</code>&nbsp;as the first word of a new topic and could only have used&nbsp;<code>PLANETARY</code>&nbsp;as the second word of a new topic... but the only topic that the faker could have formed would have been&nbsp;<code>INTERGALACTIC PLANETARY</code>, which would have been off limits since it was already on the sheet. So&nbsp;<code>PLANETARY INTERGALACTIC</code>&nbsp;must have also been a real topic.</p>