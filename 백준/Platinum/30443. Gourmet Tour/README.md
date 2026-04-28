# [Platinum V] Gourmet Tour - 30443

[문제 링크](https://www.acmicpc.net/problem/30443)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 169, 정답: 59, 맞힌 사람: 52, 정답 비율: 42.975%

### 분류

트리, 해 구성하기

### 문제 설명

<p>Minsu, who is attending university in Seoul, is planning a gourmet trip to Busan by train for the summer vacation. After researching all the restaurants along the way from Seoul to Busan, he finds that most of them are located in cities with stations on the Gyeongbu(GB) train line, and there are occasionally restaurants in cities a bit far from the GB train line stations. Minsu decides to visit the restaurants by getting off at the cities with stations while traveling from Seoul to Busan on the GB train line. In the case that a restaurant is in a city a bit far from a station on the GB train line, he plans to get off at the station, takes a taxi to the restaurant, visits it, and then returns to the station to catch the train again. Note that each city has one restaurant where he wants to visit. After successfully completing the trip, Minsu ranks the restaurants he has visited and discovers a curious fact. When he collects the values of the differences in the rankings of the restaurants that are in adjacent cities on his travel route, all the difference values are different. What can have been the rankings of the restaurants that Minsu gives?</p>

<p>Let us represent Minsu&rsquo;s travel route in the form of a graph. The cities with stations on the GB train line or a bit far from that line where he visits restaurants are represented as nodes. Two nodes corresponding to consecutive cities on the GB train line are connected as an edge and two nodes corresponding to a city $X$ on the GB train line and a city $Y$ a bit far from $X$ are also connected as an edge. When the total number of cities where Minsu visits restaurants is $n$, the graph has $n$ nodes and $n - 1$ edges. Nodes are numbered as distinct integers between $1$ and $n$. For example, the figure below represents Minsu&#39;s travel route in the form of an undirected graph with $10$ nodes ($10$ restaurants in $10$ cities).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/01e45e70-7f2c-4070-a6e3-a8b30c1ca3fe/-/preview/" style="width: 368px; height: 190px;" /></p>

<p>The rankings of restaurants assigned by Minsu are integers from $1$ to $n$ without duplication. It can be considered as an assignment of rankings to nodes in the graph. The curious fact that Minsu discovers is that the differences of rankings assigned to any two adjacent nodes are all different. For example, the figure below represents the assigned rankings (blue numbers) and the differences (red numbers) of rankings between adjacent nodes. Note that the differences of rankings are integers from $1$ to $n - 1$ without duplication.</p>

<p>Given a travel route graph for $n$ cities, write a program to compute the rankings of $n$ restaurants in the cities satisfying the condition explained above.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/189c6bcd-855f-4c73-9e1c-7f3ef9525dd6/-/preview/" style="width: 355px; height: 190px;" /></p>

### 입력

<p>Your program is to read from standard input. The first line of input contains the integer $n$ ($3 &le; n &le; 50\,000$), representing the total number of nodes corresponding to the cities (restaurants) to be visited in the travel route graph. The nodes are numbered as $1$ to $n$. Each of the following $n - 1$ lines contains two integers $u$ and $v$ ($1 &le; u \ne v &le; n$), separated by a space, representing an edge connecting two nodes $u$ and $v$ of the travel route graph.</p>

### 출력

<p>The first line should contain $n$ integers $a_1, a_2, \dots , a_n$, separated by spaces, where $a_i$ represents the ranking of city $i$ and must satisfy the condition mentioned above. Note that $a_i$ is an integer between $1$ and $n$ and there is no duplication among $a_i$&rsquo;s. If there are multiple combinations of rankings that satisfy the condition, output any of them.</p>