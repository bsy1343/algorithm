# [Platinum IV] Cheap Gas - 6915

[문제 링크](https://www.acmicpc.net/problem/6915)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 107, 정답: 23, 맞힌 사람: 3, 정답 비율: 5.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 최단 경로, 데이크스트라

### 문제 설명

<p>Every day you drive to work through the city. Gas prices have become exorbitant as of late. You&#39;ve noticed that the gas prices differ throughout the city. Sometimes the cheapest gas is on the other side of the city, but you wonder if it&#39;s worth it to drive all the way there just to fill up on cheap gas. You obviously want to spend as little money on gas as possible, but you don&#39;t want to run out along the way (your gas tank has a finite size). You wonder if it&#39;s possible to calculate the minimum amount of money you need to spend to get to your office each day.</p>

<p>Lucky for you! You live and work in grid city. In grid city there are streets running east-west and avenues running north-south. The streets are sequentially numbered, with the avenue is numbered with $1$. Residents of the city often refer to their location with a pair of numbers, including indicating the street and avenue they&#39;re at: $(3,2)$ implies that they are at the intersection of the 3rd street and 2nd avenue.</p>

<p>After years of &quot;applied experiments&quot; you have discovered something very uncanny about the city: it takes exactly one litre of gas to move from any intersection to any neighbouring intersection (one block north, east, south, or west). It is acceptable to arrive at your office or a gas station with $0$ litres of gas in your tank.</p>

<p>When you get to an intersection with a gas station you can choose to fill up with as much or as little gas as you&#39;d like. You don&#39;t want to overfill the tank, though, as it would be wasted gas.</p>

### 입력

<p>Input begins with a number $t$, the number of test cases.</p>

<p>Each test case begins with a line with four integers $m$, $n$, $f$, and $k$. $m$ is the number of streets and $n$ is the number of avenues, $(1 \le m,n \le 100)$. $f$ is the maximum capacity of your gas tank, in litres. Your starting location is $(1,1)$ and your office is at $(m,n)$. You start at $(1,1)$ with a full tank of gas in your car.</p>

<p>Each of the next $k$ lines contains three numbers: $a, b, c$ : $a$ and $b$ are integers, $(a,b)$ being the location of a gas station, and $c$ is the price of gas at that gas station.</p>

### 출력

<p>For each test case output the minimum amount of money to be spent on gas, rounded to the nearest penny (with two decimal digits), or <code>Stranded on the shoulder</code> should it be impossible to get to your office without running out of gas.</p>