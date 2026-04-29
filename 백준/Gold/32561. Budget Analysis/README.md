# [Gold IV] Budget Analysis - 32561

[문제 링크](https://www.acmicpc.net/problem/32561)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 18, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

누적 합, 수학

### 문제 설명

<p>You are an analyst, studying the relationship between advertisement budget spending (denoted by $x$) and sales (denoted by $y$) over the period of $n$ months. More specifically, for every month of time from 1 to n you have the value of spending $x_i$ and sales $y_i$.</p>

<p>To quantify the relationship you are using linear regression with regularisation, which means that you are modelling $y$ as $y=Kx+B$, where $K$ and $B$ are real numbers minimising the penalty function:</p>

<p style="text-align: center;">$p(K, B) = \sum \big( (K \cdot x_i + B - y_i)^2 \big) + \lambda \cdot (K^2 + B^2) $</p>

<p>(Note: this is the standard penalty function for L2 regularised linear regression.)</p>

<p>For the report requested by your manager, you need to make several predictions. More specifically, you have a list of prediction queries, each described by four numbers --- $L_j$, $R_j$, $\lambda_j$ and $X_j$. To process such a query you need to perform the following steps:</p>

<ul>
	<li>take the spending and sales values for the months from $L_j$ to $R_j$ inclusive;</li>
	<li>find the coefficients $K$ and $B$, which minimise the penalty function for the given regularisation coefficient $\lambda_j$;</li>
	<li>plug the $X_j$ into the resulting model and compute the prediction.</li>
</ul>

<p>You are given the ads spending and sales data, and the prediction queries descriptions. You are to process the queries and output the predictions.</p>

### 입력

<p>First line of the input file contains an integer number $n$ ($2 \le n \le 10^6$) denoting the number of months in the period you are studying.</p>

<p>Each of the following $n$ lines describes one month and contains two non-negative real numbers $x_i$ and $y_i$ not exceeding 10. They denote the budget spending and sales in the corresponding month.</p>

<p>The following line contains an integer number $m$ ($1 \le m \le 10^6$) denoting the number of predictions to be made. Each of the following $m$ lines contains four numbers: $L_j$, $R_j$, $lambda_j$ and $X_j$ ($1 \le L_j &lt; R_j \le n$, $0 \le \lambda_j, X_j \le 10$). First two of them are integers, the remaining are real.</p>

### 출력

<p>For each prediction query output one real number on a separate line --- the predicted sales assuming the advertisement spending is $X_j$ and the linear model has been fitted on months from $L_j$ to $R_j$ using L2-regularisation with $\lambda_j$ regularisation coefficient. The output must be accurate to an absolute or relative error of at most $10^{-6}$.</p>