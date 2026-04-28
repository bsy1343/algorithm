# [Gold III] Collecting Bugs - 7461

[문제 링크](https://www.acmicpc.net/problem/7461)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Ivan is fond of collecting. Unlike other people who collect post stamps, coins or other material stuff, he collects software bugs. When Ivan gets a new program, he classifies all possible bugs into n categories. Each day he discovers exactly one bug in the program and adds information about it and its category into a spreadsheet. When he finds bugs in all bug categories, he calls the program disgusting, publishes this spreadsheet on his home page, and forgets completely about the program.</p>

<p>Two companies, Macrosoft and Microhard are in tight competition. Microhard wants to decrease sales of one Macrosoft program. They hire Ivan to prove that the program in question is disgusting. However, Ivan has a complicated problem. This new program has s subcomponents, and finding bugs of all types in each subcomponent would take too long before the target could be reached. So Ivan and Microhard agreed to use a simpler criteria &mdash; Ivan should find at least one bug in each subsystem and at least one bug of each category.</p>

<p>Macrosoft knows about these plans and it wants to estimate the time that is required for Ivan to call its program disgusting. It&rsquo;s important because the company releases a new version soon, so it can correct its plans and release it quicker. Nobody would be interested in Ivan&rsquo;s opinion about the reliability of the obsolete version.</p>

<p>A bug found in the program can be of any category with equal probability. Similarly, the bug can be found in any given subsystem with equal probability. Any particular bug cannot belong to two different categories or happen simultaneously in two different subsystems. The number of bugs in the program is almost infinite, so the probability of finding a new bug of some category in some subsystem does not reduce after finding any number of bugs of that category in that subsystem.</p>

<p>Find an average time (in days of Ivan&rsquo;s work) required to name the program disgusting.</p>

### 입력

<p>Input file contains two integer numbers, n and s (0 &lt; n, s &le; 1 000).</p>

### 출력

<p>Output the expectation of the Ivan&rsquo;s working days needed to call the program disgusting, accurate to 4 digits after the decimal point.</p>