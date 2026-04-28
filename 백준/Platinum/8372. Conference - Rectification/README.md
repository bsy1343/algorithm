# [Platinum V] Conference - Rectification - 8372

[문제 링크](https://www.acmicpc.net/problem/8372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

구현, 다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제, 비트 집합

### 문제 설명

<p>You must have heard about Great Bitonic Conference (if not, read the description of the &quot;<a href="/problem/8373">Conference</a>&quot; task). Organizers of the GBC are in trouble again and they are seeking your help. The original version of the registration system has a special mechanism for maximizing the income from the conference. It is achieved by canceling some of the booked tickets (it allows to reduce expenses on the renting of conference rooms). Such an approach is not acceptable however. People are dissatisfied with the fact that conference&#39;s organizers cancelled some of the tickets booked within a single reservation. You are asked to modify the registration system in such way, that the income from the conference is maximized, while cancellation of only whole reservations is allowed.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the prices of tickets, the size of a room, the cost of renting a room and the list of reservations,</li>
	<li>calculates maximal profit from the conference, that can be obtained by potentially cancelling some of the reservations,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there are four integers: <em>m</em>, <em>l</em>, <em>k</em>&nbsp;and <em>s</em>&nbsp;(1 &le; <em>m</em> &le; 100, 2 &le; <em>l</em> &le; 1 000 000, 2 &le; <em>k</em> &le; 400, 1 &le; <em>s</em> &le; 1 000), separated by single spaces. They represent: the number of presentations, the number of reservations, the size of a single room and the cost of renting a single room. The second line contains exactly <em>m</em>&nbsp;numbers <em>c<sub>i</sub></em>&nbsp;(<em>c<sub>i</sub></em>&nbsp;&middot;&nbsp;&lfloor;<em>k</em> / 2&rfloor; &ge; <em>s</em>, <em>c<sub>i</sub></em> &le; <em>s</em>), separated by single spaces (the lower limit on the value of&nbsp;<em>c<sub>i</sub></em>&nbsp;is due to profitability of renting a room for&nbsp;&lfloor;<em>k</em> / 2&rfloor;&nbsp;participants of a conference). They represent prices of tickets for the presentations (numbered from 1&nbsp;to <em>m</em>). Following <em>l</em>&nbsp;lines contain descriptions of reservations. Each reservation is represented by two integers <em>p<sub>i</sub></em>&nbsp;and <em>r<sub>i</sub></em>&nbsp;(1 &le; <em>p<sub>i</sub></em> &le; <em>m</em>, 1 &le; <em>r<sub>i</sub></em> &le; 1 000), separated by a single space. They represent the number of a presentation and the number of tickets booked for this presentation. It is only allowed to cancel all tickets reserved within the same reservation.</p>

### 출력

<p>The first and only line of the standard output should contain exactly one integer - the total income that can be obtained by potentially cancelling only whole reservations.</p>