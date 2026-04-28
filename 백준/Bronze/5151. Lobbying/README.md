# [Bronze II] Lobbying - 5151

[문제 링크](https://www.acmicpc.net/problem/5151)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 218, 정답: 129, 맞힌 사람: 92, 정답 비율: 56.790%

### 분류

구현

### 문제 설명

<p>As you are probably aware, any major legislation &mdash; and certainly anything on the scale of a complete reform of the US health care system &mdash; is accompanied by massive lobbying from a number of constituencies, in particular the companies that stand to profit or lose heavily depending on the outcome. Lobbying in itself need not be a bad thing: for instance, if a law about universities is debated, you would want universities, faculty, and students to get their voices heard, since many lawmakers might be unfamiliar with the particular issues at hand. It also feels at least somewhat legitimate that companies or institutions might support candidates who they think will represent them better. It gets a little more dicey when there is an element of quid pro quo: that concrete concessions are expected in return for financial or other support.</p>

<p>Perhaps one way to deal with this issue would be to allow lawmakers to accept arbitrary donations from arbitrary sources, but use knowledge of these donations to adjust their votes. If a lawmaker has heavy support from a particular constituency, then a vote in favor of the constituency is downweighted accordingly. Here, we will explore the outcome of such weighted votes.</p>

<p>For simplicity, we will assume that there will be a vote with two options: the status quo (which the health industry prefers), or a new health care system. You will be given, for each lawmaker, a list of all financial contributions from the health industry, with the times at which they were made. The relevant ones are the ones within the 1000 days preceding the vote. If D is the total amount of donations (in \$) the lawmaker received in that time, and he/she votes against the new system, then the vote counts as 1/(1+(D/10000)) votes against the new system. Any vote in favor of the new system counts fully. You are to calculate the total &ldquo;amount&rdquo; of vote for and against the new system.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains three integers n,m,T. n is the number of lawmakers (1 &le; n &le; 1000), m the number of donations (0 &le; m &le; 100000), and T the time of the vote (in days). This is followed by m lines, each describing one donation. Each donation is described by two integers i,t and a floating point number d. 1 &le; i &le; n is the number of the lawmaker who got the donation, t the day on which it happened, and d the amount of money of the donation. A donation is relevant if 0 &le; T &minus; t &lt; 1000.</p>

<p>Next come n lines, each describing the vote of one lawmaker. Each line contains a single character &lsquo;Y&rsquo; or &lsquo;N&rsquo;. The character &lsquo;Y&rsquo; means that the lawmaker voted for the reform, and the character &lsquo;N&rsquo; that he or she voted against the reform.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a separate line, output the total number of fractional votes for and against the new health care system, rounded to two decimals. Each data set should be followed by an empty line.</p>