# [Gold II] Arbitrage? - 6623

[문제 링크](https://www.acmicpc.net/problem/6623)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 16, 맞힌 사람: 11, 정답 비율: 47.826%

### 분류

자료 구조, 플로이드–워셜, 그래프 이론, 해시를 사용한 집합과 맵, 파싱, 문자열, 최단 경로, 집합과 맵

### 문제 설명

<p>If you are going to travel to the World Finals, you cannot rely on Czech Crowns. You would have to exchange your money for various foreign currencies. This problem deals with multiple currencies and their exchange rates. Your task is to verify that some set of exchange rates is safe, namely detect a possibility of so-called arbitrage.</p>

<p>An arbitrage<sup>&lowast;</sup> is a risk-free combination of buy and sell operations that gains profit from imbalance in market prices. The prices may apply to various things, typically stock exchange but also currencies.</p>

<p><sup>&lowast;</sup>Be careful and do not confuse &ldquo;arbitrage&rdquo; with &ldquo;arbitration&rdquo;, which is something completely different; although the Czech language uses the same word for both.</p>

### 입력

<p>The input consists of several test cases. Each case begins with a line containing one positive integer number C, 1 &le; C &le; 200, the number of currencies.</p>

<p>The second line of each test case contains C currency codes separated by a space. Each code is composed of 3 uppercase letters and all codes in one test case are different.</p>

<p>The third line contains one integer number R, 0 &le; R &le; C &middot; (C &minus; 1), the number of exchange rates available. Each of the following R lines contains one exchange rate in the following format: first currency code, space, second currency code, space, integer number A<sub>i</sub>, colon (&ldquo;:&rdquo;), and integer number B<sub>i</sub>. The meaning is as follows: If you pay A<sub>i</sub> units of the first currency, you will get B<sub>i</sub> units of the second currency. You may assume that 1 &le; A<sub>i</sub>, B<sub>i</sub> &le; 100 and that the two currencies are different.</p>

### 출력

<p>For each test case, print one line of output. If there exists any possible sequence of currency exchange operations that would result in a profit, the line should contain the word &ldquo;Arbitrage&rdquo;. Otherwise, simply print &ldquo;Ok&rdquo;.</p>

<p>The word profit in this case means that you start with any amount of any currency and after performing any number of exchanges you will have strictly higher amount of the same currency</p>