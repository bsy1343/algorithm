# [Gold IV] Road Trip - 9219

[문제 링크](https://www.acmicpc.net/problem/9219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>You are planning a road trip to visit your friends, each of whom live in different towns. Of course, you don&#39;t want to pay any more for fuel on the trip than you need to. However, the price of fuel in each of the towns is different, so you will need to carefully plan the trip to minimise the cost. For example, it might make sense to take on extra fuel at a town where the price is low so that you don&#39;t need to buy so much at a town where it is more expensive. Indeed, it may even make sense to sell excess fuel at some towns to recoup some of the costs. Of course, your car can only hold a certain amount of fuel, and you have to make sure you take on enough fuel at each town to reach the next (assume that it&#39;s OK to arrive with an empty tank).</p>

<p>Your task is to write a program to help you plan your trip.</p>

### 입력

<p>Input will consist of specifications for a series of journeys. Information for each journey will begin with a line containing an integer 0 &lt; c &lt; 100 that specifies the capacity of the car&#39;s fuel tank in litres and an integer 0 &lt; t &lt; 20 that specifies the number of towns to visit for that journey. A line containing two zeros indicates the end of input.</p>

<p>The following t lines contain information about successive stages on the journey: the price (in fixed point dollars-and-cents format, 0.01 &lt;= p &lt; 9.99) of one litre of fuel (either to buy or to sell) in the town at the beginning of the stage, and the number of litres of fuel (an integer, 1 &lt;= n &lt; 100) needed to reach the next town.</p>

### 출력

<p>Output should consist of one line for each journey comprising the journey number (formatted as shown) followed by a single space and the minimum cost of completing that journey, formatted as a fixed-point number with 2 decimal places.</p>