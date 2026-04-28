# [Platinum V] Hockey Scores - 6898

[문제 링크](https://www.acmicpc.net/problem/6898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 81, 정답: 18, 맞힌 사람: 14, 정답 비율: 22.951%

### 분류

그리디 알고리즘, 가장 긴 증가하는 부분 수열 문제, 정렬

### 문제 설명

<p>Hugh Hockey is a very big hockey fan. Every Saturday night he sits and watches all the hockey games, never wanting to miss a moment. Every Canadian loves hockey.</p>

<p>Not this Saturday night though. Hugh Hockey has a date, so he trained his three year-old brother Billy to record the scores for him. He sits Billy in front of his TV, teaches him how to change the channels, and tells him to write down the hockey scores.</p>

<p>Hugh returns home, after his date, to a surprise: he discovers that even though Billy wrote down the scores, Billy didn&#39;t write down the names of the teams. He also discovered that Billy not only wrote down the final scores, but also the scores of games in progress. To make matters worse, Billy didn&#39;t follow any specific order when writing down the score of a game; A score of two-to-one could have been written down as <code>2-1</code> or <code>1-2</code>. There&#39;s no guarantee that Billy wrote down every score, some could be missed.</p>

<p>Help Hugh figure out, from Billy&#39;s list, the minimum number of hockey games that occurred, so Hugh knows, sadly, how much hockey he&#39;s missed.</p>

### 입력

<p>Input consists of a series of test cases. The first line consists of an integer $n$, the number of test cases.</p>

<p>For each test case, the first line consists of the integer $s$ $(1 \leq s \leq 1000)$, the number of hockey scores recorded by Billy. The next $s$ lines each contain a hockey score in the form <code>x-y</code>, where $x$ and $y$ are non-negative integers.</p>

### 출력

<p>For each test case, output on a single line the integer $m$, the minimum number of games that must have occurred such that each score Billy recorded occurs in a game sometime during the night. The next $m$ lines give a possible scenario for the hockey games, such that each score Billy recorded is used at least once (and scores that Billy did not record do not appear).</p>

<p>If there is more than one possible scenario for the hockey scores, any one will do.</p>

<p><em>Note: The same score can appear more than once in one game.</em></p>