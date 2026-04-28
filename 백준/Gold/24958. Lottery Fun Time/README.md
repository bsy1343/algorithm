# [Gold II] Lottery Fun Time - 24958

[문제 링크](https://www.acmicpc.net/problem/24958)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 122, 정답: 59, 맞힌 사람: 56, 정답 비율: 52.830%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24958.%E2%80%85Lottery%E2%80%85Fun%E2%80%85Time/7f866eed.png" data-original-src="https://upload.acmicpc.net/4d6c5722-da6f-4090-8ba1-d1813401431e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 227px; height: 119px; float: right;" />The biggest fun of lottery is not in receiving the (usually a tiny amount of) prize money, but in dreaming of the big fortune you may possibly (that is, virtually never) receive.</p>

<p>You have a number of lottery tickets at hand, each with a six-digit number. All the numbers are different, of course. Tomorrow is the drawing day and the prizes are the following.</p>

<ul>
	<li>The first prize of 300,000 yen is won by the ticket with exact match of all the six digits with the six-digit first prize winning number.</li>
	<li>The second prizes of&nbsp;4,000 yen are won by all of the tickets with their last four digits matching the four-digit second prize winning number.</li>
	<li>The third prizes of 500&nbsp;yen are won by all of the tickets with their last two digits matching any of the three two-digit third prize winning numbers.</li>
</ul>

<p>The six digits on the lottery tickets and all of the winning numbers may start with zeros.</p>

<p>The last two digits of all the prize winning numbers are made different so that tickets winning the third prize cannot also win the first nor the second prizes. Note that this rule also made the last two digits of the first and the second prize winning numbers different.</p>

<p>To enjoy the climax of the lottery fun time, you decided to calculate the possible maximum amount you may win with your tickets. You have too many tickets to hand-calculate it, but it should also be your joy to write a program for making the calculation.</p>

### 입력

<p>The first line of the input has a positive integer $n$ ($n &le; 10^5$), which is the number of tickets you have at hand. Each of the following $n$ lines has the six-digit number on one of your tickets. All the $n$ numbers are different from one another.</p>

### 출력

<p>Output in a line a single integer, which is the maximum possible total of winning prizes with the tickets you have.</p>

### 힌트

<p>For the first sample, the following combination of prize winners allows the maximum total amount of 309500 yen.</p>

<ul>
	<li>The first prize winner of 382947 makes one ticket with that number win 300000 yen.</li>
	<li>The second prize winner of 4837 makes two tickets, 924837 and 294837, win 4000 yen each.</li>
	<li>The third prize winners 07 and 45 make three tickets, 034207, 083907, and 372745, win 500 yen each. 37 cannot be a third prize winner, as the second prize winner, 4837, has the final two digits of 37. The ticket 274637, thus, wins nothing. You have no more tickets to win whatever the remaining third prize winner may be.</li>
</ul>

<p>For the second sample, nine out of the ten tickets have the same last two digits, 89, and thus the third prize winner of 89 allows nine third prizes, totaling 4500 yen. This is more than the second prize of 4000 yen possibly won by one of these nine tickets. The only remaining ticket 263784 should, of course, win the first prize.</p>