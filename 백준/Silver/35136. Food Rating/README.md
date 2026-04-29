# [Silver II] Food Rating - 35136

[문제 링크](https://www.acmicpc.net/problem/35136)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

수학, 유클리드 호제법, 정수론, 해 구성하기

### 문제 설명

<p>In the new food delivery app <em>Touch</em>, customers are able to rate the driver with integer scores from $L$ to $R$ inclusive. Drivers will get a bonus based on how high their average rating is. However, some drivers may abuse this system. A driver delivering food to $1$ customer may get $5.0$ average rating, while another driver delivering food to $5$ customers may get $4.8$ average rating.</p>

<p>As the owner of the app, you need to ensure fairness in the bonus system. To do that, you need to know: for a driver to have an average rating of exactly $X$, what is the minimum number of delivery $k$, such that there exists a scenario where the average rating given by $k$ customers is exactly $X$. In addition to that, output any list of $k$ integers within $L$ to $R$ such that the average of the list is exactly $X$.</p>

### 입력

<p>The first line contains a real number $X$ ($0 \le X \le 1000$). The number $X$ contains at most $6$ digits, including both digits before and after the decimal separator (if any).</p>

<p>The second line contains two integers $L$ and $R$ ($1 \le L \le R \le 1000$).</p>

### 출력

<p>If there exists a scenario where a driver can get an average rating exactly $X$, output in the first line, the minimum integer $k$ representing the minimum number of customers giving the rating. In the next line, output $k$ integers between $L$ and $R$ representing the rating given by the customers.</p>

<p>If there is no such scenario, output $-1$ in a single line.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> The average of $[10, 9, 10, 7, 7]$ is exactly $8.6$. It can be proven such that there is no valid list with four or less integers.</p>