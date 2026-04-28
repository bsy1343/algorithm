# [Gold IV] BOAT - 3799

[문제 링크](https://www.acmicpc.net/problem/3799)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 10, 맞힌 사람: 8, 정답 비율: 22.857%

### 분류

배낭 문제

### 문제 설명

<p>You are the owner of a very nice boat. You have many requests to rent your beautiful boat during the summer time and you decided to maximize your profit. For each client you know the number of days he wants to rent the boat and a list of choices, where a choice means an amount of money and a deadline. The deadline is the number of days counted from a time origin. You get the money for a given deadline (when the holiday must end) only if you are able to rent the boat before that deadline.</p>

<p>For example your friend Jack wants to travel on the Mediterranean Sea for 20 days and has the following choices:</p>

<ul>
	<li>if the holiday deadline is 60 days you can get 1000 EUR provided the boat is rented in between 0 and 41 (60days-20days+1) for 20 days;</li>
	<li>if the holiday deadline is 70 days you can get 800 EUR.</li>
</ul>

<p>If a client does not contribute to the maximization of your profit you can drop that client. You know all the clients and their choices and you must rent the boat according to the order in which the clients submit their requests.</p>

<p>Write a program that, given the clients, computes the largest profit you can get.</p>

### 입력

<p>The program input is from a text file. Each data set in the input has the following format:</p>

<ul>
	<li>n - the number of clients (n &le;100)</li>
	<li>on n separate lines the number of days (at most 100) each client wishes to rent the boat;</li>
	<li>the total number of choices for all clients;</li>
	<li>the list of choices in the format client_id, deadline, amount_of_money where the client id is a positive integer in the range 1..n and deadline &le;100.</li>
</ul>

<p>An empty line separates the input data sets.</p>

### 출력

<p>For each data set the program must print (from the beginning of a line) the maximum profit for that set. The results must be printed on the standard output. An empty line separates the results of different data sets. An example is given in the following table:</p>