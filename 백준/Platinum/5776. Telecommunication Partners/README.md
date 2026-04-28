# [Platinum I] Telecommunication Partners - 5776

[문제 링크](https://www.acmicpc.net/problem/5776)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

그래프 이론

### 문제 설명

<p>ICPC, an international telecommunication company, wants to improve its relationship with business subscribers, offering a discount on calls made to a fixed set of telephone numbers selected by the client company. To help ICPC decide on the cost for this new service, they searched their database and produced a list of calls made last year by one company to another. If a company communicated with another company (making or receiving a call) during last year, we will say they are Business Partners.</p>

<p>You have been hired by ICPC to process the list of calls from last year and determine the size (in number of companies) of the largest set of companies that are Business Partners of at least K other companies in the same set. That is, you must find a set S of companies such that every company in S has at least K business partners that are also in S (and possibly partners that are outside S), where K is a parameter chosen by the ICPC.</p>

### 입력

<p>Your program should process several test cases. The first line of a test case contains three integers N, P and K. N represents the total number of companies subscribed to ICPC (1 &le; N &le; 1000); companies are identified by numbers between 1 and N. P represents the total number of business partner pairs, produced from last year calls; and K is the minimum number of business partners a company must have in the final set (1&le; K &le; N&ndash;1), as described above. The next P lines describe each a business partner pair, represented as two integers X and Y, where X and Y are companies (1 &le; X &le; N, 1 &le; Y &le; N and X &ne; Y). The value N = 0 indicates the end of input.</p>

### 출력

<p>For each test case from the input, your program should print a single line, containing the size of the largest set of companies found by your program.&nbsp;</p>