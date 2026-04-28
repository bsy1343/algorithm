# [Platinum I] Bitwise Automaton - 18641

[문제 링크](https://www.acmicpc.net/problem/18641)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 12, 맞힌 사람: 9, 정답 비율: 42.857%

### 분류

백트래킹, 브루트포스 알고리즘, 구현

### 문제 설명

<p>A <em>bitwise automaton</em> is a directed acyclic graph with its vertices called <em>states</em>, which has two <em>terminal states</em>, called 0 and 1, and an arbitrary amount of other states numbered with consecutive integers starting from 2. The terminal states have no outgoing edges. Each non-terminal state has exactly two outgoing edges, one marked with 0 and one marked with 1. Additionally, each non-terminal state i has a <em>bit number</em> b<sub>i</sub> associated with it, and one of the states (either terminal or non-terminal) is denoted as the <em>starting state</em>.</p>

<p>A bitwise automaton can be evaluated on an integer input x in the following way: first, we put a token to the starting state. While the token is in a non-terminal state i, we do the following: check the b<sub>i</sub>-th bit of x, and move the token to a new state using the outgoing edge with the corresponding label. The bits are numbered from 0 from lowest to highest: the 0-th bit is the parity bit of x, and so on. Eventually the token will reach a terminal state, and the number of this state (either 0 or 1) is the output of the evaluation for the given x.</p>

<p>You are given the desired result of evaluation of an automaton for all inputs from 0 to n&minus;1, and need to construct an automaton with the smallest number of states that gives such evaluation results.</p>

### 입력

<p>The input contains multiple test cases. The first line of the input contains the number t of test cases, 1 &le; t &le; 510. Each test case is then described with two lines. The first of those lines contains one integer n, 1 &le; n &le; 8. The second of those lines contains n integers, each either 0 or 1 &mdash; the desired results of evaluation for inputs 0, 1, . . . , n &minus; 1.</p>

### 출력

<p>Print the outputs for all test cases in order. For each test case, first print the number m (m &ge; 2) of states in your automaton on a line of its own. It must be the minimum possible number of states for an automaton that produces the desired results.</p>

<p>In the next m &minus; 2 lines describe the states from 2 to m &minus; 1 in order. Describe a state with three integers: the bit number b<sub>i</sub> (0 &le; b<sub>i</sub> &le; 2), the number of the state where the 0 edge leads, and the number of the state where the 1 edge leads.</p>

<p>In the next line print the number of the starting state.</p>

<p>In case there are multiple possible solutions, output any.</p>