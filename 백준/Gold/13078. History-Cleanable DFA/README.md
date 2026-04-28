# [Gold I] History-Cleanable DFA - 13078

[문제 링크](https://www.acmicpc.net/problem/13078)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13078/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-10%20%EC%98%A4%ED%9B%84%206.43.37.png" style="height:117px; width:250px" /></p>

<p>You have possibly heard of DFAs. In theory of computation, a deterministic finite automaton (DFA) is a finite state machine that accepts/rejects finite input strings. The figure on the right illustrates a DFA using a state diagram. In the automaton, there are three states: S<sub>0</sub>, S<sub>1</sub>, and S<sub>2</sub> (denoted graphically by circles).&nbsp;The automaton takes a finite sequence of 0s and 1s as input. For each state, there is a transition arrow leading out to a next state for both 0 and 1. Upon reading a symbol, a DFA jumps from a state to another by following the transition arrow. For example, if the automaton is currently in state S<sub>0</sub> and current input symbol is 1 then it jumps to state S<sub>1</sub>. This is formally written as&nbsp;&delta;(S<sub>0</sub>, 1) = S<sub>1</sub>. Inductively, we can generalize this notation to have propositions like &delta;(S<sub>0</sub>, 10) = S<sub>2</sub> and &delta;(S<sub>1,</sub> 011010) = S<sub>0</sub>. A DFA has a start state (denoted graphically by an arrow coming in from nowhere) where computations begin with, and a set of accept states (denoted graphically by a double circle) which help define when a computation is successful. So, an input string w is accepted by a DFA with starting state q<sub>0</sub> if and only if &delta;(q<sub>0</sub>, w) is an accepting state of that DFA. The state S<sub>0</sub> in the DFA depicted above is both the start state and an accept state. In fact, this DFA accepts only binary numbers that are multiples of 3 (including the empty string).</p>

<p>Given A DFA D with states S<sub>0</sub>, S<sub>1</sub>, &hellip; , S<sub>n-1</sub>, a string w is called history-cleaner for D if for all i,j &isin; {0, &hellip; , n-1}: &delta;(S<sub>i</sub>, w) = &delta;(S<sub>j</sub>, w). In other words, no matter which state the starting state is, the string w brings the DFA to a common final state. A DFA D is called history-cleanable if a history-cleaner string exists for D. Given a DFA whose input is a sequence of 0s and 1s, your job is to find out whether it is history-cleanable or not.</p>

### 입력

<p>The first line of the input contains the single integer t, the number of test cases (1 &le; t &le; 500). Each test case starts with a line&nbsp;containing a single integer n, the number of states in a DFA with states S<sub>0</sub>, S<sub>1</sub>, &hellip;, S<sub>n-1</sub>(2 &le; n &le; 500). The second line of each test case consists of n space-separated integers a<sub>0</sub>, a<sub>1</sub>, &hellip;, a<sub>n-1</sub> and finally, the third line of each test case has n space-separated integers b<sub>0</sub>, b<sub>1</sub>, &hellip;, b<sub>n-1</sub> (0 &le; a<sub>i</sub>, b<sub>i</sub> &lt; n) which means&nbsp;&delta;(S<sub>i</sub>, 0) =&nbsp;S<sub>ai</sub> and&nbsp;&delta;(S<sub>i</sub>, 1) = S<sub>bi</sub> (for 0 &le; i &lt; n).</p>

### 출력

<p>For each test case, print one line containing the answer for the given DFA. If it is history-cleanable, print &ldquo;YES&rdquo;, otherwise print &ldquo;NO&rdquo; (omit the quotes).</p>

<p>&nbsp;</p>