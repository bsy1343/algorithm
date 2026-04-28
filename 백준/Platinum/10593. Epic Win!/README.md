# [Platinum II] Epic Win! - 10593

[문제 링크](https://www.acmicpc.net/problem/10593)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 97, 정답: 29, 맞힌 사람: 19, 정답 비율: 32.203%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>A game of rock-paper-scissors is played by two players who simultaneously show out their moves: Rock, Paper , or Scissors. If their moves are the same, it&rsquo;s a draw. Otherwise, Rock beats Scissors, Paper beats Rock, and Scissors beat Paper .</p>

<p>The described procedure can be repeated many times. In this problem, two Finite State Machines (FSMs) will compete in a series of rounds. (Formally speaking, by FSMs we mean Moore machines in this problem.)</p>

<p>An FSM for playing rock-paper-scissors has finitely many states. Each state is described by the following: what move the FSM will make in the upcoming round, and what will be the new state in case of its opponent playing Rock, Paper , and Scissors.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10593.%E2%80%85Epic%E2%80%85Win!/e344d952.png" data-original-src="https://www.acmicpc.net/upload/images2/epic.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:106px; width:625px" /></p>

<p>Fortunately, you know your opponent FSM &mdash; the entire scheme except for one thing: you do not know the initial state of that FSM.</p>

<p>Your task is to design your own FSM to fight the given one. Your FSM must beat the opponent in at least 99% of the first 1 billion rounds. That&rsquo;s what we call an epic win!</p>

### 입력

<p>The input file contains a description of the opponent FSM in the following format.</p>

<p>The first line contains an integer n (1 &le; n &le; 100) &mdash; the number of states in the FSM. States are numbered from 1 to n. Each of the following n lines contains a description of the state: a character c<sub>i</sub> denoting the move made by FSM and integers r<sub>i</sub>, p<sub>i</sub>, s<sub>i</sub> denoting the next state in case of seeing Rock, Paper, or Scissors respectively (c<sub>i</sub> can be &rdquo;R&rdquo;, &rdquo;P&rdquo;, or &rdquo;S&rdquo;; 1 &le; r<sub>i</sub>, p<sub>i</sub>, s<sub>i</sub> &le; n</p>

### 출력

<p>Write to the output the description of your FSM in the same format.</p>

<p>The initial state of your FSM is the first state.</p>

<p>The number of states may not exceed 50 000.</p>

### 힌트

<p>The picture in the problem statement illustrates the opponent FSM given in the above sample input and a possible solution of yours given in the sample output.</p>

<p>Opponent FSM keeps playing Rock or Paper (depending on its initial state) until it sees Scissors &mdash; seeing Scissors triggers a change in its behaviour.</p>

<p>One way to beat such FSM is to play Paper . If your opponent keeps playing Rock, just continue playing Paper and thus win. If the opponent FSM is playing Paper , trigger it to playing Rock by playing Scissors once, and then it&rsquo;ll keep playing Rock and you&rsquo;ll keep beating it with your Paper .</p>