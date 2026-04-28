# [Silver I] Gregory and Bank - 12804

[문제 링크](https://www.acmicpc.net/problem/12804)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 24, 맞힌 사람: 21, 정답 비율: 52.500%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Gregory is working in the accountant office of one big corporation. He gets money via wire transfers from company clients and sends money via wire transfers to company suppliers.</p>

<p>All transfers are processed using the only bank office in the city. The office has very strange schedule. Each day the bank allows just one type of operations: send wire transfers, or receive wire transfers. Additionally, Gregory can only do at most one operation each day: either send one transfer, or receive one transfer (depending on the operation type allowed on the corresponding day). The other party of the transfer can be chosen arbitrarily. Gregory&#39;s boss doesn&#39;t like Gregory to do nothing, so he insists that each day he goes to the bank and attempts to make some operations.</p>

<p>Gregory must process n requests of receiving money from clients and m request of sending money to suppliers. Gregory knows the schedule of the bank office. For each client or supplier he can set the day of the transfer.</p>

<p>Initially the bank account managed by Gregory has no money. Each day Gregory comes to the bank and either receives money to the account, or sends money from the account. Unfortunately it is possible that there are less money at the account than he needs to send. In such case he cannot pay to the supplier, so the transfer is cancelled, no money is sent, and Gregory gets a rebuke. The supplier refuses to continue operations with Gregory&#39;s company, so the transaction cannot be performed later.</p>

<p>Gregory wants to arrange wire transfers from clients and to suppliers in such way that the number of suppliers that he cannot actually send money was minimal. Help him!</p>

### 입력

<p>Input data contains several test cases. The first line of the input data contains the number of test cases t (1 &le; t &le; 1000).</p>

<p>Each test is described in the following way: the first line contains two integers: n and m (1 &le; n, m &le; 100) &mdash; the number of clients and the number of suppliers. The second line contains n integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 1000) &mdash; the amounts that the i-th client must send to Gregory&#39;s company. The third line contains m integers b<sub>j</sub> (1 &le; b<sub>j</sub> &le; 1000) &mdash; the amount that must be sent to the j-th supplier. The following line contains a string s (length of s is n + m, it contains n characters &quot;+&quot; and m characters &quot;-&quot;). The character s[k] is &quot;+&quot; if on the k-th day the bank allows to receive money, and &quot;-&quot; if on the k-th day the bank allows to send money.</p>

### 출력

<p>For each test case print one integer: the minimal number of suppliers that Gregory would not send money to.</p>