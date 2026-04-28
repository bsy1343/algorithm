# [Silver V] samba - 5263

[문제 링크](https://www.acmicpc.net/problem/5263)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 233, 정답: 161, 맞힌 사람: 137, 정답 비율: 75.275%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Every year Rio de Janeiro is the host of The Rio samba dance festival. In this year&rsquo;s edition the n dancers representing the samba schools around the world will dance on the streets trying to impress the public by both dance and clothes. Each samba school is represented by a single group of dancers and has a unique identification number (ID) which will be worn by all of its members. Within a group, all members are wearing the same suits, with the identification number attached, when moving in formation on the streets of Rio.</p>

<p>For everything to go well, the organizers require each group to arrange its members on multiple rows, each formed exactly of k dancers.</p>

<p>Knowing that only one samba school couldn&rsquo;t organize its dancers according to the conditions, your task is to find its ID.</p>

### 입력

<p>The first line of the input contains the space-separated numbers n and k. The following n lines contain the IDs (C1,C2,...,Cn) of the n dancers.</p>

### 출력

<p>The first line of the output contains a single value, representing the answer to the task.</p>

### 제한

<ul>
	<li>1 &le; n &le; 1 000 000</li>
	<li>2 &le; k &le; 1 000</li>
	<li>0 &le; C<sub>i</sub> &le; 1 000 000 000, 1 &le; i &le; n</li>
</ul>

### 힌트

<p>There are 11 dancers which belong to the samba schools identified by the IDs 123, 1678 and 43. Dancers of each samba school have to arrange on rows formed of exactly 2 persons. One samba school has the 123 ID and 6 dancers which can be arranged on 3 rows, each consisting of 2 persons. Another samba school, with the 1678 ID, has 2 dancers which can be arranged on a single row.</p>

<p>The school with the ID 43 has 3 dancers which cannot be organized according to the conditions.</p>