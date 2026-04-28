# [Silver V] Meditation - 21194

[문제 링크](https://www.acmicpc.net/problem/21194)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 304, 정답: 251, 맞힌 사람: 217, 정답 비율: 84.436%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Luna had a stressful day and she wants to do a meditation routine that relaxes her well. Luna&rsquo;s routines are more or less relaxing and to determine how relaxing a routine is, Luna computes its score: the higher the score, the more relaxing it is!</p>

<p>Luna has graded each of the n exercises with a positive integer and the score of a routine is simply the sum of the grades of its individual exercises. She gives you her list of graded exercises and asks you what is the maximal grade of a routine composed of k different exercises.</p>

### 입력

<p>The first line of the input contains two space-separated integers: n and k. The n following lines each contain a single integer, the i + 1-th line containing the grade g<sub>i</sub> of the i-th exercise.</p>

### 출력

<p>The output should contain a single line with a single integer: the maximal score of a routine composed of k different exercises.</p>

### 제한

<ul>
	<li>1 &le; k &le; n &le; 100 000</li>
	<li>for all 1 &le; i &le; n, we have 0 &le; g<sub>i</sub> &le; 10 000</li>
</ul>

### 힌트

<p>We select the exercises 1, 2 and 5 which gives a total score of 10 + 22 + 10 = 42.</p>