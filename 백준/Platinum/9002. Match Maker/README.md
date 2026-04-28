# [Platinum I] Match Maker - 9002

[문제 링크](https://www.acmicpc.net/problem/9002)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 148, 정답: 100, 맞힌 사람: 91, 정답 비율: 69.466%

### 분류

그래프 이론, 안정 결혼 문제

### 문제 설명

<p>You are a manager of a match maker company ACM(Amazing Coupling Marriage) whose main role is to&nbsp;make happy matches between men and women.</p>

<p>N men and N women who are register ed to the company want to marry as soon as possible. Each man and&nbsp;each woman have a list of preferences for all the people of the opposite sex. The most preferable person will&nbsp;come at the first position in the list, the second preferable person will come a t the next, and so on. The table&nbsp;below shows a set of preference lists that might exist among 4 men and 4 women.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9002.%E2%80%85Match%E2%80%85Maker/f4b18cc4.png" data-original-src="https://upload.acmicpc.net/79c99e45-92d3-42cc-8f93-62965545ae26/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 384px; height: 81px;" /></p>

<p>Your task is to make matches of all the men to all the women in such a way as to respect all their preferences&nbsp;as much as possible. However, you must assume that anyone assigned to someone other than their first choice&nbsp;will be disappointed and will always prefer anyone higher up on the list. If the N matches are chosen such&nbsp;that there exist a man and a woman who are not married on each other, but who would both prefer each other&nbsp;to their actual marriage partners, then the matches are said to be unstable. If no such pair exists, it is called&nbsp;stable. For example, a match &ldquo; M<sub>1</sub>W<sub>3</sub> M<sub>2</sub>W<sub>1</sub> M<sub>3</sub>W<sub>4</sub> M<sub>4</sub>W<sub>2</sub>&rdquo; is unstable because M<sub>1</sub>&nbsp;prefers W<sub>1&nbsp;</sub>to W<sub>3</sub>, and&nbsp;W<sub>1&nbsp;</sub>prefers M<sub>1</sub>&nbsp;to M<sub>2</sub>. The unstable couples might be separated easily after marriage; this is a definitely bad&nbsp;situation that you want to avoid.</p>

<p>In general, there are many different stable matches for a given set of preference lists. Your task is to print just&nbsp;one stable match among them.</p>

### 입력

<p>The input consists of T test cases. The number of test cases (T) is given in the first li ne of the input file.&nbsp;Each test case begins with a line containing an integer N less than 100 , indicating that N men and N&nbsp;women are given. The following N lines represent the men&#39;s preferences for the women, where the i-th line&nbsp;contains the preference list of a man with id i in order of preferences of the N women; he prefers a woman&nbsp;X to another woman Y if X precedes Y in the list. The following N lines represent the women&#39;s&nbsp;preferences for the N men. Assume that all men and all women have consecutive id-numbers from 1 to N .</p>

### 출력

<p>Print exactly one line for each test case . The line should contain a stable match for the test case. Each match&nbsp;should be represented as a sequence of the women&rsquo;s id, according to the increasing order of men &rsquo;s id. The woman with the first id in the match is a&nbsp;partner of the man with id &lsquo;1&rsquo;, the woman with the second id in the&nbsp;match is a partner of the man with id &lsquo;2&rsquo;, and the woman with the i-th id in the match is a partner of the man&nbsp;with id &lsquo;i &rsquo;. The consecutive women&rsquo;s id in the match should be separated by a single space.</p>