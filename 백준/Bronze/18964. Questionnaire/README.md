# [Bronze III] Questionnaire - 18964

[문제 링크](https://www.acmicpc.net/problem/18964)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 721, 정답: 378, 맞힌 사람: 290, 정답 비율: 54.104%

### 분류

수학, 애드 혹, 홀짝성

### 문제 설명

<p>In order to get better results in official ACM ICPC contests, the team leader came up with a questionnaire. He asked every participant whether they want to have more training.</p>

<p>Obviously, many people don&#39;t want more training, so the clever leader didn&#39;t write down their words such as &quot;Yes&quot; or &quot;No&quot;. Instead, he let everyone choose a positive integer $a_i$ to represent their opinion. Amazingly, all the resulting numbers were distinct.</p>

<p>Now the leader wants to choose a pair of positive intergers $m$ ($1 &lt; m \le 10^9$) and $k$ ($0 \le k &lt; m$), and regard those people whose number is exactly $k$ modulo $m$ as &quot;Yes&quot;,&nbsp; and all others as &quot;No&quot;. If there are at least as many &quot;Yes&quot; answers as &quot;No&quot; answers, the leader can have a chance to offer more training.</p>

<p>Please help the team leader to find such pair of $m$ and $k$.</p>

### 입력

<p>The first line of the input contains an integer $n$: the number of ACM ICPC participants ($3 \leq n \leq 10^5$).</p>

<p>The next line contains $n$ distinct integers $a_1$, $a_2$, $\ldots$, $a_n$: the numbers chosen by the participants ($1 \leq a_i \leq 10^9$).</p>

### 출력

<p>Print a single line containing two integers $m$ and $k$. If there are several possible solutions, print any one of them.</p>