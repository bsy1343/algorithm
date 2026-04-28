# [Platinum I] Transportation Delegation - 11768

[문제 링크](https://www.acmicpc.net/problem/11768)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 91, 정답: 42, 맞힌 사람: 29, 정답 비율: 56.863%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>You have just been hired by Amalgamated, Inc. in the country of Acmania to oversee the transportation of raw materials to the company&rsquo;s factories. Each supplier of raw materials and each factory resides in one of Acmania&rsquo;s states. No state has both a factory and a supplier (and never more than one of either) and there are arcane laws governing which transportation companies can transport materials across state lines. Because of the fierce competition between factories and between suppliers each transportation company handles the output of at most one raw material site and delivers to at most one factory (or to another transportation company). Each supplier can produce enough material to contract with at most one factory and no factory will contract with more than one supplier. Your job is to determine the maximum number of factories that can be supplied with raw materials.</p>

<p>For example, suppose that there are three suppliers in states A, B and C, and three factories in states D, E and F. Let&rsquo;s say you contract three transportation firms: firm 1 can transport between states A, E and G; firm 2 can transport between states A, C and E; and firm 3 can transport between states B, D and F. In this case, you can supply at most two factories (for example, factory E can be supplied from supplier A using firm 1, and factory F can be supplied from supplier B using firm 3). If you find a fourth firm that transports between states G and F then you can supply all three factories: factory D can be supplied from B using firm 3, factory E can be supplied from C using firm 2, and factory F can be supplied from A using firms 1 and 4.</p>

### 입력

<p>The input will start with four positive integers s r f t indicating the number of states, raw material sites, factories and transportation companies, where 1 &le; r, f &le; 200, r + f &le; s &le; 600 and 1 &le; t &le; 1000.</p>

<p>Next will follow a line containing r state names, one for each raw material site.</p>

<p>The next line will contain f state names, one for each factory site.</p>

<p>Finally there will be t lines, one for each transportation company. Each of these lines will start with an integer n, 1 &le; n &le; s, indicating the number of states the company is allowed to work in, followed by n state names. No state will contain both a raw material site and a factory site.</p>

<p>All state names will be alphabetic strings with no blanks.</p>

### 출력

<p>Output the maximum number of factories that can be supplied with raw materials.</p>