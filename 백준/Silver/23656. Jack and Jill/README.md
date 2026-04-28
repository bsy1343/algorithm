# [Silver II] Jack and Jill - 23656

[문제 링크](https://www.acmicpc.net/problem/23656)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 1071, 정답: 210, 맞힌 사람: 183, 정답 비율: 20.516%

### 분류

그리디 알고리즘, 이분 탐색

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Jack and Jill play &quot;guess the number&quot;. Initially, Jill has to choose a secret number: an integer from $1$ to $10^{9}$. After that, Jack asks questions in the form &quot;is it the number $x$?&quot; with some integer $x$ from $1$ to $10^{9}$. For each question, Jill has to answer either &quot;yes&quot;, or &quot;no, my number is greater&quot;, or &quot;no, my number is less&quot;. The game ends when Jack correctly guesses the secret number, or after $100$ questions if it does not happen by then.</p>

<p>Despite Jack&#39;s best efforts, he was not able to guess the number in less than $30$ questions. He realized that Jill is cheating: instead of choosing a secret number in advance, she answers the questions in such a way that the game lasts long enough. Jack pondered: how does she do that?</p>

<p>This is an interactive problem: you play as Jill, and the jury plays as Jack. Your task is to answer the questions in such a way that Jack asks at least $30$ questions before the game ends. Keep in mind that your answers should not contradict each other: otherwise, Jack will immediately call you out on it!</p>

### 입력



### 출력



### 힌트

<p>In the first example, Jack says numbers $1$, $2$, $3$, and so on. In the second example, Jack says numbers $1000$, $999$, $998$, and so on. He is guaranteed to follow these two strategies in the first two tests.</p>

<p>In both examples, Jill just chose $30$ as the secret number in advance. Your solution may of course use any other strategy.</p>