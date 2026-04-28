# [Platinum I] Fund Management - 3587

[문제 링크](https://www.acmicpc.net/problem/3587)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 구현

### 문제 설명

<p>Frank is a portfolio manager of a closed-end fund for Advanced Commercial Markets (ACM ). Fund collects money (cash) from individual investors for a certain period of time and invests cash into various securities in accordance with fund&rsquo;s investment strategy. At the end of the period all assets are sold out and cash is distributed among individual investors of the fund proportionally to their share of original investment.</p>

<p>Frank manages equity fund that invests money into stock market. His strategy is explained below.</p>

<p>Frank&rsquo;s fund has collected c US Dollars (USD) from individual investors to manage them for m days. Management is performed on a day by day basis. Frank has selected n stocks to invest into. Depending on the overall price range and availability of each stock, a lot size was chosen for each stock &mdash; the number of shares of the stock Frank can buy or sell per day without affecting the market too much by his trades. So, if the price of the stock is p<sub>i</sub> USD per share and the lot size of the corresponding stock is s<sub>i</sub>, then Frank can spend p<sub>i</sub>s<sub>i</sub> USD to buy one lot of the corresponding stock for his fund if the fund has enough cash left, thus decreasing available cash in the fund. This trade is completely performed in one day.</p>

<p>When price of the stock changes to p&#39;<sub>i</sub> later, then Frank can sell this lot for p&#39;<sub>i</sub>s<sub>i</sub> USD, thus increasing available cash for further trading. This trade is also completely performed in one day. All lots of stocks that are held by the fund must be sold by the end of the fund&rsquo;s period, so that at the end (like at the beginning) the fund is holding only cash.</p>

<p>Each stock has its own volatility and risks, so to minimize the overall risk of the fund, for each stock there is the maximum number of lots k<sub>i</sub> that can be held by the fund at any given day. There is also the overall limit k on the number of lots of all stocks that the fund can hold at any given day.</p>

<p>Any trade to buy or sell one lot of stock completely occupies Frank&rsquo;s day, and thus he can perform at most one such trade per day. Frank is not allowed to buy partial lots if there is not enough cash in the fund for a whole lot at the time of purchase.</p>

<p>Now, when fund&rsquo;s period has ended, Frank wants to know what is the maximum profit he could have made with this strategy having known the prices of each stock in advance. Your task is to write a program to find it out.</p>

<p>It is assumed that there is a single price for each stock for each day that Frank could have bought or sold shares of the stock at. Any overheads such as fees and commissions are ignored, and thus cash spent to buy or gained on a sell of one lot of stock is exactly equal to its price on this day multiplied by the number of shares in a lot.</p>

### 입력

<p>The first line of the input file contains four numbers &mdash; c, m, n, and k. Here c (0.01 &le; c &le; 100 000 000.00) is the amount of cash collected from individual investors up to a cent (up to two digits after decimal point); m (1 &le; m &le; 100) is the number of days in the fund&rsquo;s lifetime; n (1 &le; n &le; 8) is the number of stocks selected by Frank for trading; k (1 &le; k &le; 8) is the overall limit on the number of lots the fund can hold at any time.</p>

<p>The following 2n lines describe stocks and their prices with two lines per stock.</p>

<p>The first line for each stock contains the stock name followed by two integer numbers s<sub>i</sub> and k<sub>i</sub>. Here s<sub>i</sub> (1 &le; s<sub>i</sub> &le; 1 000 000) is the lot size of the given stock, and k<sub>i</sub> (1 &le; k<sub>i</sub> &le; k) is the number of lots of this stock the fund can hold at any time. Stock name consists of 1 to 5 capital Latin letters from &ldquo;A&rdquo; to &ldquo;Z&rdquo;. All stock names in the input file are distinct.</p>

<p>The second line for each stock contains m decimal numbers separated by spaces that denote prices of the corresponding stock for each day in the fund&rsquo;s lifetime. Stock prices are in range from 0.01 to 999.99&nbsp;(inclusive) given up to a cent (up to two digits after decimal point).</p>

<p>Cash and prices in the input file are formatted as a string of decimal digits, optionally followed by a dot with one or two digits after a dot.</p>

### 출력

<p>Write to the output file m + 1 lines.</p>

<p>On the first line write a single decimal number &mdash; the precise value for the maximal amount of cash that can be collected in the fund by the end of its period. The answer will not exceed 1 000 000 000.00. Cash must be formatted as a string of decimal digits, optionally followed by a dot with one or two digits after a dot.</p>

<p>On the following m lines write the description of Frank&rsquo;s actions for each day that he should have made in order to realize this profit. Write <code>BUY</code> followed by a space and a stock name for buying a stock. Write <code>SELL</code> followed by a space and a stock name for selling a stock. Write <code>HOLD</code> if nothing should have been done on that day.</p>