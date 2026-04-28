# [Silver III] Dial Key - 22637

[문제 링크](https://www.acmicpc.net/problem/22637)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 196, 정답: 47, 맞힌 사람: 26, 정답 비율: 15.569%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>You are a secret agent from the Intelligence Center of Peacemaking Committee. You&#39;ve just sneaked into a secret laboratory of an evil company, Automated Crime Machines.</p>

<p>Your mission is to get a confidential document kept in the laboratory. To reach the document, you need to unlock the door to the safe where it is kept. You have to unlock the door in a correct way and with a great care; otherwise an alarm would ring and you would be caught by the secret police.</p>

<p>The lock has a circular dial with&nbsp;<i>N</i>&nbsp;lights around it and a hand pointing to one of them. The lock also has&nbsp;<i>M</i>&nbsp;buttons to control the hand. Each button has a number&nbsp;<i>L<sub>i</sub></i>&nbsp;printed on it.</p>

<p>Initially, all the lights around the dial are turned off. When the&nbsp;<i>i</i>-th button is pressed, the hand revolves clockwise by&nbsp;<i>L<sub>i</sub></i>&nbsp;lights, and the pointed light is turned on. You are allowed to press the buttons exactly&nbsp;<i>N</i>&nbsp;times. The lock opens only when you make all the lights turned on.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22637.%E2%80%85Dial%E2%80%85Key/d934ed16.png" data-original-src="https://upload.acmicpc.net/7e043edb-e4f1-42a9-8663-8e2722e54c55/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 446px; height: 340px;" /></p>

<p>For example, in the case with&nbsp;<i>N</i>&nbsp;= 6,&nbsp;<i>M</i>&nbsp;= 2,&nbsp;<i>L</i><sub>1</sub>&nbsp;= 2 and&nbsp;<i>L</i><sub>2</sub>&nbsp;= 5, you can unlock the door by pressing buttons 2, 2, 2, 5, 2 and 2 in this order.</p>

<p>There are a number of doors in the laboratory, and some of them don&rsquo;t seem to be unlockable. Figure out which lock can be opened, given the values&nbsp;<i>N</i>,&nbsp;<i>M</i>, and&nbsp;<i>L<sub>i</sub></i>&#39;s.</p>

### 입력

<p>The input starts with a line containing two integers, which represent&nbsp;<i>N</i>&nbsp;and&nbsp;<i>M</i>&nbsp;respectively.&nbsp;<i>M</i>&nbsp;lines follow, each of which contains an integer representing&nbsp;<i>L<sub>i</sub></i>.</p>

<p>It is guaranteed that 1 &le;&nbsp;<i>N</i>&nbsp;&le; 10<sup>9</sup>, 1 &le;&nbsp;<i>M</i>&nbsp;&le; 10<sup>5</sup>, and 1 &le;&nbsp;<i>L<sub>i</sub></i>&nbsp;&le;&nbsp;<i>N</i>&nbsp;for each&nbsp;<i>i</i>&nbsp;= 1, 2, ...&nbsp;<i>N</i>.</p>

### 출력

<p>Output a line with &quot;Yes&quot; (without quotes) if the lock can be opened, and &quot;No&quot; otherwise.</p>