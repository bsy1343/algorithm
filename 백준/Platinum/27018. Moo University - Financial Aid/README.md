# [Platinum III] Moo University - Financial Aid - 27018

[문제 링크](https://www.acmicpc.net/problem/27018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

구현, 자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵, 우선순위 큐

### 문제 설명

<p>Bessie noted that although humans have many universities they can attend, cows have none. To remedy this problem, she and her fellow cows formed a new university called The University of Wisconsin-Farmside,&quot;Moo U&quot; for short.</p>

<p>Not wishing to admit dumber-than-average cows, the founders created an incredibly precise admission exam called the Cow Scholastic Aptitude Test (CSAT) that yields scores in the range 1..2,000,000,000.</p>

<p>Moo U is very expensive to attend; not all calves can afford it.In fact, most calves need some sort of financial aid (0 &le; aid &le;100,000). The government does not provide scholarships to calves,so all the money must come from the university&#39;s limited fund (whose total money is F, 0 &le; F &le; 2,000,000,000).</p>

<p>Worse still, Moo U only has classrooms for an odd number N (1 &le; N &le; 19,999) of the C (N &le; C &le; 100,000) calves who have applied.Bessie wants to admit exactly N calves in order to maximize educational opportunity. She still wants the median CSAT score of the admitted calves to be as high as possible.</p>

<p>Recall that the median of a set of integers whose size is odd is the middle value when they are sorted. For example, the median of the set {3, 8, 9, 7, 5} is 7, as there are exactly two values above 7 and exactly two values below it.</p>

<p>Given the score and required financial aid for each calf that applies, the total number of calves to accept, and the total amount of money Bessie has for financial aid, determine the maximum median score Bessie can obtain by carefully admitting an optimal set of calves.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers N, C, and F</li>
	<li>Lines 2..C+1: Two space-separated integers per line. The first is the calf&#39;s CSAT score; the second integer is the required amount of financial aid the calf needs</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, the maximum median score that Bessie can achieve. If there is insufficient money to admit N calves,output -1.</li>
</ul>