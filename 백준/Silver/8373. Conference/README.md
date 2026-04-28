# [Silver III] Conference - 8373

[문제 링크](https://www.acmicpc.net/problem/8373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 21, 맞힌 사람: 15, 정답 비율: 45.455%

### 분류

수학, 구현, 그리디 알고리즘

### 문제 설명

<p>In Bytetown preparations for the annual Great Bitonic Conference are taking place. There are going to be <em>m</em>&nbsp;presentations which - according to the tradition - must take place at exactly the same time. All presentations are organized in identical rooms. Each room can hold up to <em>k</em>&nbsp;persons. There are enough rooms to hold all participants of the conference. If there are more than <em>k</em>&nbsp;attendance of a presentation, organizers have to book more than one room for it (to be exact, for <em>n</em>&nbsp;participants there are&nbsp;&lceil;<em>n</em>&nbsp;/&nbsp;<em>k</em>&rceil;<sup>1</sup>&nbsp;rooms required).</p>

<p>Organizers of the conference would like to maximize their income - the amount of money obtained from selling tickets, decreased by the cost of renting rooms should be as great as possible. The cost of renting one room for <em>k</em>&nbsp;people is equal to <em>s</em>. A single ticket for the <em>i</em>-th presentation costs <em>c<sub>i</sub></em>. The prices of tickets were selected in such way that it is profitable to rent a room for&nbsp;&lfloor;<em>k</em>&nbsp;/ 2&rfloor;&nbsp;people (it is also possible - however not required - that it is profitable to rent a room for a smaller number of people), meaning that in this case the profit is non-negative. Organizers may cancel some reservations, so that their income is maximized. You implemented the original version of registration system, so it is your job to perform the cancellation process.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the prices of tickets, the size of a room, the cost of renting a room and the list of reservations,</li>
	<li>calculates maximal profit from the conference, that can be obtained by potentially cancelling some of the reserved tickets,</li>
	<li>writes the result to the standard output.</li>
</ul>

<p><sup>1</sup>Symbol&nbsp;&lceil;<em>x</em>&rceil;&nbsp;represents the smallest integer not smaller than <em>x</em>. Analogically,&nbsp;&lfloor;<em>x</em>&rfloor;&nbsp;represents the greatest integer not grater than <em>x</em>.</p>

### 입력

<p>In the first line of the standard input there are four integers: <em>m</em>, <em>l</em>, <em>k</em>&nbsp;and <em>s</em>&nbsp;(1 &le; <em>m</em> &le; 100, 2 &le; <em>l</em> &le; 1 000 000, 2 &le; <em>k</em> &le; 400, 1 &le; <em>s</em> &le; 1 000), separated by single spaces. They represent: the number of presentations, the number of reservations, the size of a single room and the cost of renting a single room. The second line contains exactly <em>m</em>&nbsp;numbers&nbsp;<em>c<sub>i</sub></em>&nbsp;(<em>c<sub>i</sub></em>&nbsp;&middot;&nbsp;&lfloor;<em>k</em> / 2&rfloor; &ge; <em>s</em>, <em>c<sub>i</sub></em> &le; <em>s</em>), separated by single spaces (the lower limit on the value of&nbsp;<em>c<sub>i</sub></em>&nbsp;is due to profitability of renting a room for&nbsp;&lfloor;<em>k</em> / 2&rfloor;&nbsp;participants of a conference). They represent prices of tickets for the presentations (numbered from 1&nbsp;to <em>m</em>). Following <em>l</em>&nbsp;lines contain descriptions of reservations. Each reservation is represented by two integers&nbsp;<em>p<sub>i</sub></em>&nbsp;and <em>r<sub>i</sub></em>&nbsp;(1 &le; <em>p<sub>i</sub></em> &le; <em>m</em>, 1 &le; <em>r<sub>i</sub></em> &le; 1 000), separated by a single space. They represent the number of a presentation and the number of tickets booked for this presentation. It is allowed to cancel any number of tickets within the same reservation, not only the whole reservation.</p>

### 출력

<p>The first and only line of standard output should contain exactly one integer - the total income that can be obtained.</p>

### 힌트

<p>For the example above, in order to maximize income, 3 tickets from the second reservation should be cancelled.</p>