# [Platinum II] Queue - 3334

[문제 링크](https://www.acmicpc.net/problem/3334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 32 MB

### 통계

제출: 46, 정답: 13, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

(분류 없음)

### 문제 설명

<p>If you are an average football fan, you probably know that obtaining tickets for this year&#39;s World Cup in Germany was an almost impossible task. Greedy organizers and football federations grabbed the majority of available tickets and divided them among sponsors, friends and family members. As a result, jet setters have flooded the venues, while die-hard fans sit at home enjoying the games between advertisements featuring crappy beer and sugar-free chewing gum.</p>

<p>A couple of tickets are left for the final game and a huge queue has formed in front of the ticket office. As fans were arriving, they were labeled with successive integers. The first person in queue was labeled with number one, the second with number two, etc.</p>

<p>Since the fans arrived the night before, they had to wait for a long time before the ticket counter was open and, naturally, some of them had to use the restroom. Each time a person needs to use the restroom, he/she steps out of the queue and, after completing the task, steps back into the queue, though not necessarily at the same position as before. Since there is only one restroom available, no person leaves the queue before the previous person has returned (hence, at any moment there is at most one person missing from the queue).</p>

<p>During the course of the night, a total of N restroom visits have occurred. Each visit is described by two positive integers A and B, denoting that the person labeled A stepped out of the queue and then stepped back into the queue immediately in front of the person labeled B. Now that all the visits have completed, the officials have to answer a series of questions. Each question is either of the form &#39;P X&#39;, asking for the position of the person labeled X, or of the form &#39;L X&#39;, asking for the label of the person at position X.</p>

<p>The first person in queue is considered to be at position one, the second at position two, etc.</p>

<p>Write a program that, given the description of the visits and a number of questions, answers all of the questions.</p>

### 입력

<p>The first line of input contains an integer N (2 &le; N &le; 50 000) &ndash; the total number of restroom visits.</p>

<p>Each of the following N lines contains two different integers A and B (1 &le; A, B &le; 10<sup>9</sup>), describing one restroom visit. The next line contains an integer Q (1 &le; Q &le; 50 000) &ndash; the total number of questions.</p>

<p>Each of the following Q lines contains a single character (either the uppercase letter &#39;P&#39; or the uppercase letter &#39;L&#39;) and an integer X (1 &le; X &le; 10<sup>9</sup>), describing one question.</p>

### 출력

<p>The output should consist of a total of Q lines.</p>

<p>The ith line of output should contain a single integer R &ndash; the answer to the ith question.</p>

<p>If the corresponding question is of the form &#39;P X<sub>i</sub>&#39; then R should be the final position of the person labeled X<sub>i</sub>.</p>

<p>If the corresponding question is of the form &#39;L X<sub>i</sub>&#39; then R should be the label of the person at position X<sub>i</sub>.</p>