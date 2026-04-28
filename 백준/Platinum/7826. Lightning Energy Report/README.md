# [Platinum III] Lightning Energy Report - 7826

[문제 링크](https://www.acmicpc.net/problem/7826)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 46, 정답: 38, 맞힌 사람: 25, 정답 비율: 78.125%

### 분류

자료 구조, 트리, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 최소 공통 조상, Heavy-light 분할

### 문제 설명

<p>The city of Thunder has many houses and they are powered by lightning. Two houses may be interconnected by a wire. The wires connect the houses such that there is exactly one path from one house to any other house in the city. Each house has a large battery that can store infinite electrical energy.</p>

<p>Everyday, several lightnings strike several houses. These lightnings are very unusual, when it strikes, it strikes two houses simultaneously: one house (A) with a red lightning and the other house (B) with a blue lightning. After the strikes, every house along the path from A to B (inclusive) will receive a certain amount of electrical energy which is then added to the house&#39;s battery.</p>

<p>The mayor of Thunder city wants a report on the stored electrical energy for every house at the end of the month and the owner of each house has to pay taxes for that. To prevent the owners report invalid energy stored in their house battery (because they want less tax to pay), you are asked to produce a correct report based on the observed lightnings of the current month. At the beginning of the month, the energy reading on the battery of each house is 0.</p>

### 입력

<p>The first line of input contains an integer T (T &le; 10), the number of cases. Each case begins with an integer N (2 &le; N &le; 50,000), the number of houses in the Thunder city. The next N-1 lines contain the wire connections where each line will consist of two integers X and Y which means house X is connected with house Y. The house number is from 0 to N-1. The next line will contain a number Q (1 &le; Q &le; 50,000) which denotes the number of observed lightning strikes. The next Q lines describe the unusual lightnings happened during the month. Each line will consist of three integers A, B, C which tells that a red lightning strikes house A and a blue lightning strikes house B and the power transferred is C (at most 100) based on the reading of a special lightning instrument.</p>

### 출력

<p>For each case, output &ldquo;Case #X:&rdquo; (without quote) where X is the case number and N lines where each line is the electrical energy reading on the battery of each house from house 0 to house N-1 at the end of the month.</p>