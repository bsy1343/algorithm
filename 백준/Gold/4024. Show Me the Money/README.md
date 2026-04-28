# [Gold IV] Show Me the Money - 4024

[문제 링크](https://www.acmicpc.net/problem/4024)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 24, 맞힌 사람: 18, 정답 비율: 35.294%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 수학

### 문제 설명

<p>Frank Marks works at the Business Office of a large company. His company has customers all over the world and must deal with many different currencies. Employees often come to the Business Office with requisitions for certain amounts of money, such as 100 American dollars or 452 Euros. If Frank has the cash on hand, he gives the employee exactly what they need; if he does not have enough of the particular currency requested, he substitutes it with another one. This is sometimes difficult because he may have many different currencies to choose from and would like to pick the one which allows him to get as close to the original requisition as possible without going under (he must provide at least the value requested). For example, suppose Frank has six difference currencies &ndash; A, B, C, D, E and F &ndash; and he is aware of the following exchange rates:</p>

<pre style="text-align:center">
23 A = 17 B
16 C = 29 E
 5 B = 14 E
1 D = 7 F</pre>

<p>If a requisition for 100 A comes in but Frank has less than 100 A available, he can substitute with either 74 B (equivalent to about 100.12 A), 115 C (equivalent to about 100.72 A) or 207 E (equivalent to about 100.02 A). Thus, the best approximation available to him is 207 E. Note that Frank does not have enough information to find a relationship between currencies A and D or currencies A and F. Also, Frank only has at most 100,000 units of any one currency in stock, so he could not satisfy a request for 64,000 A using E currency and would need to use 73078 C instead.</p>

<p>Determining the ideal substitute currency to use when he has completely run out of the requested currency is time consuming, so Frank would like a program to do the calculations for him.</p>

### 입력

<p>Each test case begins with a positive integer n indicating the number of exchange rates. The next n lines will be of the form</p>

<pre>
val<sub>1</sub> name<sub>1</sub> = val<sub>2</sub> name<sub>2</sub></pre>

<p>where name<sub>1</sub> and name<sub>2</sub> are the names of two distinct currencies, and val<sub>1</sub> and val<sub>2</sub> are positive integers &le; 30 specifying the ratio between the two currencies. There will be no more than 8 distinct currency names, and any two currencies will be paired together at most once. Currency names will consist of up to ten alphabetic characters. There will be no inconsistencies in the input (such as 1A = 2B, 1B = 2C and 1C = 2A). Following these n lines will be a single line of the form</p>

<pre>
val name</pre>

<p>which specifies the amount (a positive integer not exceeding 100,000) and the name of the currency requested. A line containing 0 will follow the last test case.</p>

### 출력

<p>For each test case, print the case number and the closest approximation without going under the requested value assuming that Frank does not have any of the requested currency available but is fully in stock of all other currencies. There will be a unique answer for each problem instance.</p>