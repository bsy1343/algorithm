# [Gold IV] What’s Mine is Mine - 17979

[문제 링크](https://www.acmicpc.net/problem/17979)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 418, 정답: 256, 맞힌 사람: 219, 정답 비율: 68.438%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The hot new video game &ldquo;Mining Simulator&rdquo; has just been released. In the game, rare earth mineral ores appear at certain times and you can mine them when they appear. After mining, you can later turn in the minerals for money. The quantity of mineral available during an appearance is proportional to the duration of the appearance and the price per unit of each mineral is decided beforehand.</p>

<p>The game contains a geological sensor that determines times when mineral ores will appear during a given day and at the beginning of each day you have a price list for each mineral. Assuming you mine out the mineral in exactly the amount of time that it is available, you cannot partially mine minerals (you must either not mine any of a given occurrence or mine all of it) and you can only mine one ore occurrence at a time.</p>

<p>Given a list of the prices of <em>m</em> minerals and <em>n</em> ore occurrences during a day, write a program to output the maximum amount of money you can earn from mining on that day.The mineral amount is the appearance time (end time &ndash; start time). You can mine an ore right after finishing the previous mining. In other words, one mined-ore&rsquo;s end time can be same as another mined-ore&rsquo;s start time. In the case depicted in Figure L.1, if you choose the mineral of type 1 that appears at time 2 and disappears at time 5, then the mineral amount is 5 &minus; 2 = 3 and you earn 3 &times; 2 = 6. Next, if you choose the mineral of type 2 that appears at time 7 and disappears at time 11, then the mineral amount is 11 &minus; 7 = 4 and you earn 4 &times; 3 = 12. Therefore, you earn 18 in total.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17979.%E2%80%85What%E2%80%99s%E2%80%85Mine%E2%80%85is%E2%80%85Mine/d0eb468d.png" data-original-src="https://upload.acmicpc.net/40065d82-f7e4-4ee1-b944-e74d31b02144/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 451px; height: 296px;" /></p>

<p style="text-align: center;">Figure L.1: A mining example. For each mineral (<em>s</em>, <em>e</em>, <em>t</em>), <em>s</em> is the start time, <em>e</em> is the end time and <em>t</em> is the mineral type.&nbsp;Therefore, the mineral amount is <em>e</em> - <em>s</em> and the possible earning is (<em>e</em> - <em>s</em>) &times; <em>t</em>&#39;s price.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers, <em>m</em> and <em>n</em> (1 &le; <em>m</em> &le; 100, 1 &le; <em>n</em> &le; 10,000), where <em>m</em> is the number of types of minerals and <em>n</em> is the number of ore&nbsp;occurrences during the day. The mineral types are labeled from 1 to <em>m</em>.&nbsp;The following <em>m</em> lines&nbsp;contain a single integer corresponding to the price of one unit of the <em>i</em>-th&nbsp;mineral type on that day (the price is between 1 and 10,000). The following <em>n</em> lines&nbsp;represent ore occurrences. Each line contains three integers, <em>s</em>, <em>e</em>, <em>t</em> where <em>s</em> is&nbsp;the start time, <em>e</em> is the end time and <em>t</em> is the mineral type in each ore occurrence with 0 &lt; s &lt; e &lt; 15,000 and 1 &le; t &le; m. The amount of mineral at each occurrence is e - s.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the maximum amount of money that can be earned on that day</p>