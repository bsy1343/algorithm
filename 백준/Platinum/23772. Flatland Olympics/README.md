# [Platinum II] Flatland Olympics - 23772

[문제 링크](https://www.acmicpc.net/problem/23772)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 149, 정답: 37, 맞힌 사람: 33, 정답 비율: 45.205%

### 분류

자료 구조, 정렬, 기하학, 세그먼트 트리, 스위핑, 각도 정렬

### 문제 설명

<p>It is the day after Olympia, and you---as the organizer---are happy that <em>everything</em> worked well in these troublesome times. Well, not everything$\dots$.</p>

<p>Since this morning e-mails have been filling up your inbox, containing complaints about obscured views during the most important race: the $100$-meter dash. They demand their money back, or threaten exposing you on social media. To make things worse, spectators have not just complained once, but they have sent you a separate e-mail for every person that blocked their view at some point during the race! They even wrote multiple e-mails when two or more people blocked their view at the same time. And not only that, some visitors complained to the main sponsor <em>Dy &amp; Son</em>&nbsp;who in turn has urged you to improve the situation.&nbsp;</p>

<p>Since you expect that a greater number of visitors will be allowed to spectate at the next Olympic games, you assume that there will be even more complaints if you do not address this issue. If the situation will be too bad, you may even lose your sponsor Dy &amp; Son. Therefore, you decide to count the number of complaints beforehand. To do this, you model the running track as a straight line segment, and count the maximal number of complaints you could get based on the seating of the visitors. Depending on the number of complaints you expect, you will determine if you need to rework the seating or just reconfigure your spam blocker and try to find a new sponsor.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing four integers $x_s$, $y_s$, $x_e$ and $y_e$ $(|x_s|, |y_s|, |x_e|, |y_e| \leq10^9)$, where $s=(x_s, y_s)$ is the starting point of the running track and $e=(x_e, y_e)$ is the end point of the running track. Both $s$ and $e$ belong to the running track.</li>
	<li>One line containing an integer $n$ $(1 \leq n \leq 10^5)$, the number of visitors.</li>
	<li>$n$ lines, each containing two integers $x$ and $y$ $(|x|,|y|\leq10^9)$, where $(x,y)$ is the location of the seat of a visitor.</li>
</ul>

<p>It is guaranteed that the track has a positive length, i.e. $s\neq e$. Further, you can assume that all visitors are seated at distinct locations and that no visitor is seated on the track.</p>

### 출력

<p>Output the total number of complaints that you would receive for the given seating.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23772.%E2%80%85Flatland%E2%80%85Olympics/93b4e232.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23772.%E2%80%85Flatland%E2%80%85Olympics/93b4e232.png" data-original-src="https://upload.acmicpc.net/fc0d36eb-b9b0-4f77-b224-e3c3c4ac30ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 675px; height: 300px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Illustration of Sample Input 2. The running track is drawn as a red line and the seats of the visitors are highlighted in blue. The second visitor will complain about the first visitor and the fourth visitor will complain about the third visitor.</p>