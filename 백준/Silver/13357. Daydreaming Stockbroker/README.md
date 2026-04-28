# [Silver III] Daydreaming Stockbroker - 13357

[문제 링크](https://www.acmicpc.net/problem/13357)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 71, 맞힌 사람: 63, 정답 비율: 46.667%

### 분류

그리디 알고리즘

### 문제 설명

<p>Gina Reed, the famous stockbroker, is having a slow&nbsp;day at work, and between rounds of solitaire she is daydreaming.&nbsp;Foretelling the future is hard, but imagine if&nbsp;you could just go back in time and use your knowledge&nbsp;of stock price history in order to maximize your profits!</p>

<p>Now Gina starts to wonder: if she were to go back in&nbsp;time a few days and bring a measly \$100 with her, how&nbsp;much money could she make by just buying and selling&nbsp;stock in Rollercoaster Inc. (the most volatile stock in&nbsp;existence) at the right times? Would she earn enough&nbsp;to retire comfortably in a mansion on Tenerife?</p>

<p>Note that Gina can not buy fractional shares, she must buy whole shares in Rollercoaster&nbsp;Inc. The total number of shares in Rollercoaster Inc. is 100 000, so Gina can not own more than&nbsp;100 000 shares at any time. In Gina&rsquo;s daydream, the world is nice and simple: there are no fees&nbsp;for buying and selling stocks, stock prices change only once per day, and her trading does not&nbsp;influence the valuation of the stock.</p>

### 입력

<p>The first line of input contains an integer d (1 &le; d &le; 365), the number of days that Gina goes&nbsp;back in time in her daydream. Then follow d lines, the i&rsquo;th of which contains an integer p<sub>i&nbsp;</sub>(1 &le; p<sub>i</sub> &le; 500) giving the price at which Gina can buy or sell stock in Rollercoaster Inc. on day&nbsp;i. Days are ordered from oldest to newest.</p>

### 출력

<p>Output the maximum possible amount of money Gina can have on the last day. Note that the&nbsp;answer may exceed 2<sup>32</sup>.</p>