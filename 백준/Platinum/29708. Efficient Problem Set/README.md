# [Platinum IV] Efficient Problem Set - 29708

[문제 링크](https://www.acmicpc.net/problem/29708)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 114, 정답: 29, 맞힌 사람: 17, 정답 비율: 25.373%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트마스킹, 백트래킹, 배낭 문제, 비트 집합

### 문제 설명

<p>You are planning a problem set for the upcoming programming contest. The problem set should consist of one or more problems each allocated with a certain amount of points, which is a positive integer. The score of each contestant is the sum of the points of the problems that the contestant correctly answers.</p>

<p>The total of points of problems in the problem set must be equal to the full score given by the contest organizer. In addition, some of the contest sponsor companies want to give special prizes to the contestants first attaining prescribed scores exactly. Thus, you have to make the problem set so that every prize-obtaining score specified by a sponsor can possibly be the score of a contestant at some point of time.</p>

<p>You have not prepared any problems yet, as you are planning to start it after deciding the points of each problem in the set. Because it is troublesome to prepare many problems, you want to meet the above-described requirements with as few problems as possible. For example, when the full score is 7 and the prize-obtaining scores are 2 and 5, you can meet them by preparing two problems with points 2 and 5. When the full score is 7 and the prize-obtaining scores are 2 and 4, however, you have to prepare three problems, e.g., those with points 2, 2, and 3.</p>

<p>Find the minimum possible number of problems that meet the requirements.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset is in the following format.</p>

<blockquote>
<p><i>n</i></p>

<p><i>s</i></p>
</blockquote>

<p><i>n</i> is the full score of the contest (i.e., the total of points of problems), which is a positive integer not exceeding 100. <i>s</i> represents which values should have possibilities to be contestants&#39; scores. <i>s</i> is a string of length (<i>n</i> + 1) consisting of <code>o</code>&#39;s and <code>x</code>&#39;s, whose (<i>k</i> + 1)-st character being an <code>o</code> means &quot;contestants should have possibilities to get exactly <i>k</i> points as their scores&quot;, and being an <code>x</code> means it is not required, i.e., &quot;either is fine whether contestants can get exactly <i>k</i> points as their scores or not&quot;. The first and the last characters of <i>s</i> are always <code>o</code>&#39;s.</p>

<p>The end of the input is indicated by a line consisting of a zero. The input consists of at most 100 datasets.</p>

### 출력

<p>For each dataset, output in a line the minimum possible number of problems that meet the requirements.</p>