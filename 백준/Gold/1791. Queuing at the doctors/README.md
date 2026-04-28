# [Gold III] Queuing at the doctors - 1791

[문제 링크](https://www.acmicpc.net/problem/1791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

구현, 자료 구조, 시뮬레이션, 우선순위 큐, 큐

### 문제 설명

<p>Due to the increasing number of weird viruses spreading around, all the members of the International Confederation of Revolver Enthusiasts (ICORE) are required by their boss to do quarterly physical checkups at General Hospital. All checkups are arranged by the boss and scheduled on the same day. Each member of ICORE gets instructions where they are given</p>

<ul>
	<li>their number from the set {1 ...&nbsp;<em>n</em>}</li>
	<li>the time of the day when they are supposed to show up at General Hospital</li>
	<li>a list of doctors&#39; offices that they are to visit in the listed order.</li>
</ul>

<p>Doctors&#39; offices in General Hospital are numbered with numbers from the set {1 ...&nbsp;<em>m</em>}.</p>

<p>All the members of ICORE have been convinced that the schedule of the checkups has been professionally prepared and that there would be no lining up and waiting at the doctors&#39; doors. However, since their boss was a political appointment their hopes for not wasting time had to be abandoned as soon as they started arriving at the hospital. The queues were forming rapidly despite the fact that the doctors were very efficient due to their usual sloppiness. The members of ICORE are all very disciplined and obey the following rules for visiting the doctors</p>

<ul>
	<li>if an ICORE member was supposed to show up at the hospital at time&nbsp;<em>t</em>, then at time&nbsp;<em>t</em>&nbsp;they show up at the first doctors&#39; office on their list;</li>
	<li>if several people show up a doctor&#39;s office at time&nbsp;<em>t</em>&nbsp;then they form a queue in increasing order of their numbers and join the end of the queue already formed by people who arrived earlier;</li>
	<li>if at time&nbsp;<em>t</em>&nbsp;in front of office&nbsp;<em>x</em>&nbsp;there is a queue of people who arrived earlier or at time&nbsp;<em>t</em>, then the first person from the queue enters office&nbsp;<em>x</em>. This person after a time unit (the doctors do a sloppy job, remember) exits the office and at time&nbsp;<em>t+1</em>&nbsp;appears at the next office from their list of offices to visit. At that time the first person from the queue enters office&nbsp;<em>x</em>;</li>
	<li>if a visit at office&nbsp;<em>x</em>&nbsp;at time&nbsp;<em>t</em>&nbsp;was for the given visitor the last visit on their list, then at time&nbsp;<em>t+1</em>&nbsp;this visitor leaves the hospital.</li>
</ul>

<p>Your task is to find the time when the last visitor leaves the hospital.</p>

### 입력

<p>The first line of input contains a natural number&nbsp;<em>c</em>&nbsp;giving the number of cases to handle. The following lines form the input for the&nbsp;<em>c</em>&nbsp;cases, each in the format described below. The first line of data for a case contains two natural numbers&nbsp;<em>n</em>&nbsp;and&nbsp;<em>m</em>, 1&nbsp;&le;&nbsp;<em>n</em>,&nbsp;<em>m</em>&nbsp;&le;&nbsp;1000, giving the number of the visitors and the number of doctors&#39; offices for the case. Each of the following&nbsp;<em>n</em>&nbsp;lines contains a sequence of natural numbers. Among these lines, line&nbsp;<em>i</em>&nbsp;(1 &nbsp;&le;&nbsp;<em>i</em>&nbsp;&le;&nbsp;<em>n</em>) has the following format</p>

<p style="text-align: center;"><em>t</em>&nbsp;&nbsp;<em>k</em>&nbsp;&nbsp;<em>g</em><sub>1</sub>&nbsp;&nbsp;<em>g</em><sub>2</sub>...&nbsp;<em>g</em><sub>k</sub></p>

<p>meaning that the&nbsp;<em>i</em>th visitor arrives at time&nbsp;<em>t</em>&nbsp;and has to visit&nbsp;<em>k</em>&nbsp;offices in the order given by&nbsp;<em>g</em><sub>1</sub>&nbsp;<em>g</em><sub>2</sub>&nbsp;...&nbsp;<em>g</em><sub>k</sub>&nbsp;where each&nbsp;<em>g</em><sub>j</sub>&nbsp;is a number of doctor&#39;s office, 1&nbsp;&le;&nbsp;<em>g</em><sub>j</sub>&nbsp;&le;&nbsp;<em>m</em>. We have that 0&nbsp;&le;&nbsp;<em>t</em>&nbsp;&le;&nbsp;1000000 and there is no more than 1000000 visits scheduled for a day at the hospital.</p>

### 출력

<p>For each of the&nbsp;<em>c</em>&nbsp;input cases print one line giving the time when the last visitor leaves the hospital.</p>