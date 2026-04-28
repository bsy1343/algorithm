# [Platinum II] Autumn Cleaning (16 MiB ML!) - 18903

[문제 링크](https://www.acmicpc.net/problem/18903)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 16 MB

### 통계

제출: 344, 정답: 62, 맞힌 사람: 20, 정답 비율: 8.403%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조합론, 모듈로 곱셈 역원, 고속 푸리에 변환, 페르마의 소정리

### 문제 설명

<p>Autumn is coming and Sophie wants to prepare for it by emptying her grandparents&#39; basement. She wants to sell unused items and she already put a price tag (non-negotiable!) on all of them and put the offer on the web; note that some items may have the same price. She was quickly contacted by a junk dealer, who wants to buy exactly $k$ items, no matter which (junk is junk). Unfortunately, he visited the ATM only a moment ago and he has only a lot of $r$-zloty bills (&#39;zloty&#39; is the Polish currency). In how many different ways they can make a trade?</p>

### 입력

<p>First line of the input contains three positive integers $n, k$ and $r$ ($1\leq n \leq 10^6$, $1\leq k \leq 3\,000$, $1\leq r \leq 10$), denoting: the number of items Sophie wants to sell, the number of items that the junk dealer wants to buy and the face value of the bills he has. The second and last line of the input contains $n$ positive integers $a_i$ ($1 \le a_i \le 10^6$). These are the prices of the items that Sophie wants to sell.</p>

### 출력

<p>You should write a single positive integer: remainder modulo $10^6+3$ of the number of sets of $k$ items whose total price is divisible by $r$.</p>

### 힌트

<p>The junk dealer can buy first, second and fifth item, with a total price $8+1+3 = 12$ or first, third and fourth, paying $8+2+2=12$.</p>